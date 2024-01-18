/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="EBookConvertOptions.java">
 *   Copyright (c) 2003-2024 Aspose Pty Ltd
 * </copyright>
 * <summary>
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------------------------------------------
 */

package com.groupdocs.cloud.conversion.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.groupdocs.cloud.conversion.model.ConvertOptions;
import com.groupdocs.cloud.conversion.model.WatermarkOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.List;

/**
 * Ebook convert options
 */
@ApiModel(description = "Ebook convert options")
public class EBookConvertOptions extends ConvertOptions {
  /**
   * Specifies page size
   */
  @JsonAdapter(PageSizeEnum.Adapter.class)
  public enum PageSizeEnum {
    DEFAULT("Default"),
    
    A3("A3"),
    
    STATEMENT("Statement"),
    
    QUARTO("Quarto"),
    
    PAPER11X17("Paper11x17"),
    
    PAPER10X14("Paper10x14"),
    
    LETTER("Letter"),
    
    LEGAL("Legal"),
    
    LEDGER("Ledger"),
    
    FOLIO("Folio"),
    
    EXECUTIVE("Executive"),
    
    ENVELOPEDL("EnvelopeDL"),
    
    CUSTOM("Custom"),
    
    B5("B5"),
    
    B4("B4"),
    
    A5("A5"),
    
    A4("A4"),
    
    TABLOID("Tabloid");

    private String value;

    PageSizeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PageSizeEnum fromValue(String text) {
      for (PageSizeEnum b : PageSizeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PageSizeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PageSizeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PageSizeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PageSizeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("pageSize")
  private PageSizeEnum pageSize = null;

  /**
   * Specifies page orientation
   */
  @JsonAdapter(PageOrientationEnum.Adapter.class)
  public enum PageOrientationEnum {
    DEFAULT("Default"),
    
    LANDSCAPE("Landscape"),
    
    PORTRAIT("Portrait");

    private String value;

    PageOrientationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PageOrientationEnum fromValue(String text) {
      for (PageOrientationEnum b : PageOrientationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PageOrientationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PageOrientationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PageOrientationEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PageOrientationEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("pageOrientation")
  private PageOrientationEnum pageOrientation = null;

  public EBookConvertOptions pageSize(PageSizeEnum pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Specifies page size
   * @return pageSize
  **/
  @ApiModelProperty(required = true, value = "Specifies page size")
  public PageSizeEnum getPageSize() {
    return pageSize;
  }

  public void setPageSize(PageSizeEnum pageSize) {
    this.pageSize = pageSize;
  }

  public EBookConvertOptions pageOrientation(PageOrientationEnum pageOrientation) {
    this.pageOrientation = pageOrientation;
    return this;
  }

   /**
   * Specifies page orientation
   * @return pageOrientation
  **/
  @ApiModelProperty(required = true, value = "Specifies page orientation")
  public PageOrientationEnum getPageOrientation() {
    return pageOrientation;
  }

  public void setPageOrientation(PageOrientationEnum pageOrientation) {
    this.pageOrientation = pageOrientation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EBookConvertOptions ebookConvertOptions = (EBookConvertOptions) o;
    return Objects.equals(this.pageSize, ebookConvertOptions.pageSize) &&
        Objects.equals(this.pageOrientation, ebookConvertOptions.pageOrientation) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageOrientation, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EBookConvertOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageOrientation: ").append(toIndentedString(pageOrientation)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

