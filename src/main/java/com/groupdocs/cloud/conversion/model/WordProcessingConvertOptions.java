/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="WordProcessingConvertOptions.java">
 *   Copyright (c) 2003-2023 Aspose Pty Ltd
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
 * Options for to word processing conversion
 */
@ApiModel(description = "Options for to word processing conversion")
public class WordProcessingConvertOptions extends ConvertOptions {
  @SerializedName("width")
  private Integer width = null;

  @SerializedName("height")
  private Integer height = null;

  @SerializedName("dpi")
  private Double dpi = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("zoom")
  private Integer zoom = null;

  /**
   * Recognition mode when converting from pdf
   */
  @JsonAdapter(PdfRecognitionModeEnum.Adapter.class)
  public enum PdfRecognitionModeEnum {
    TEXTBOX("Textbox"),
    
    FLOW("Flow");

    private String value;

    PdfRecognitionModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PdfRecognitionModeEnum fromValue(String text) {
      for (PdfRecognitionModeEnum b : PdfRecognitionModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PdfRecognitionModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PdfRecognitionModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PdfRecognitionModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PdfRecognitionModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("pdfRecognitionMode")
  private PdfRecognitionModeEnum pdfRecognitionMode = null;

  /**
   * Page size
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

  public WordProcessingConvertOptions width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Desired page width after conversion
   * @return width
  **/
  @ApiModelProperty(required = true, value = "Desired page width after conversion")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public WordProcessingConvertOptions height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Desired page height after conversion
   * @return height
  **/
  @ApiModelProperty(required = true, value = "Desired page height after conversion")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public WordProcessingConvertOptions dpi(Double dpi) {
    this.dpi = dpi;
    return this;
  }

   /**
   * Desired page DPI after conversion. The default resolution is: 96dpi
   * @return dpi
  **/
  @ApiModelProperty(required = true, value = "Desired page DPI after conversion. The default resolution is: 96dpi")
  public Double getDpi() {
    return dpi;
  }

  public void setDpi(Double dpi) {
    this.dpi = dpi;
  }

  public WordProcessingConvertOptions password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Set this property if you want to protect the converted document with a password
   * @return password
  **/
  @ApiModelProperty(value = "Set this property if you want to protect the converted document with a password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public WordProcessingConvertOptions zoom(Integer zoom) {
    this.zoom = zoom;
    return this;
  }

   /**
   * Specifies the zoom level in percentage. Default is 100. Default zoom is supported till Microsoft Word 2010. Starting from Microsoft Word 2013 default zoom is no longer set to document, instead it appears to use the zoom factor of the last document that was opened.
   * @return zoom
  **/
  @ApiModelProperty(required = true, value = "Specifies the zoom level in percentage. Default is 100. Default zoom is supported till Microsoft Word 2010. Starting from Microsoft Word 2013 default zoom is no longer set to document, instead it appears to use the zoom factor of the last document that was opened.")
  public Integer getZoom() {
    return zoom;
  }

  public void setZoom(Integer zoom) {
    this.zoom = zoom;
  }

  public WordProcessingConvertOptions pdfRecognitionMode(PdfRecognitionModeEnum pdfRecognitionMode) {
    this.pdfRecognitionMode = pdfRecognitionMode;
    return this;
  }

   /**
   * Recognition mode when converting from pdf
   * @return pdfRecognitionMode
  **/
  @ApiModelProperty(required = true, value = "Recognition mode when converting from pdf")
  public PdfRecognitionModeEnum getPdfRecognitionMode() {
    return pdfRecognitionMode;
  }

  public void setPdfRecognitionMode(PdfRecognitionModeEnum pdfRecognitionMode) {
    this.pdfRecognitionMode = pdfRecognitionMode;
  }

  public WordProcessingConvertOptions pageSize(PageSizeEnum pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Page size
   * @return pageSize
  **/
  @ApiModelProperty(required = true, value = "Page size")
  public PageSizeEnum getPageSize() {
    return pageSize;
  }

  public void setPageSize(PageSizeEnum pageSize) {
    this.pageSize = pageSize;
  }

  public WordProcessingConvertOptions pageOrientation(PageOrientationEnum pageOrientation) {
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
    WordProcessingConvertOptions wordProcessingConvertOptions = (WordProcessingConvertOptions) o;
    return Objects.equals(this.width, wordProcessingConvertOptions.width) &&
        Objects.equals(this.height, wordProcessingConvertOptions.height) &&
        Objects.equals(this.dpi, wordProcessingConvertOptions.dpi) &&
        Objects.equals(this.password, wordProcessingConvertOptions.password) &&
        Objects.equals(this.zoom, wordProcessingConvertOptions.zoom) &&
        Objects.equals(this.pdfRecognitionMode, wordProcessingConvertOptions.pdfRecognitionMode) &&
        Objects.equals(this.pageSize, wordProcessingConvertOptions.pageSize) &&
        Objects.equals(this.pageOrientation, wordProcessingConvertOptions.pageOrientation) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, height, dpi, password, zoom, pdfRecognitionMode, pageSize, pageOrientation, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WordProcessingConvertOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    dpi: ").append(toIndentedString(dpi)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    zoom: ").append(toIndentedString(zoom)).append("\n");
    sb.append("    pdfRecognitionMode: ").append(toIndentedString(pdfRecognitionMode)).append("\n");
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

