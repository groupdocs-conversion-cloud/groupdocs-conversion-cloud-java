/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="TxtLoadOptions.java">
 *   Copyright (c) 2003-2019 Aspose Pty Ltd
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
import com.groupdocs.cloud.conversion.model.LoadOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Txt document load options
 */
@ApiModel(description = "Txt document load options")
public class TxtLoadOptions extends LoadOptions {
  @SerializedName("detectNumberingWithWhitespaces")
  private Boolean detectNumberingWithWhitespaces = null;

  /**
   * Gets or sets preferred option of a trailing space handling. Default value is Trim.
   */
  @JsonAdapter(TrailingSpacesOptionsEnum.Adapter.class)
  public enum TrailingSpacesOptionsEnum {
    PRESERVE("Preserve"),
    
    TRIM("Trim");

    private String value;

    TrailingSpacesOptionsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TrailingSpacesOptionsEnum fromValue(String text) {
      for (TrailingSpacesOptionsEnum b : TrailingSpacesOptionsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TrailingSpacesOptionsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TrailingSpacesOptionsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TrailingSpacesOptionsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TrailingSpacesOptionsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("trailingSpacesOptions")
  private TrailingSpacesOptionsEnum trailingSpacesOptions = null;

  /**
   * Gets or sets preferred option of a leading space handling. Default value is ConvertToIndent.
   */
  @JsonAdapter(LeadingSpacesOptionsEnum.Adapter.class)
  public enum LeadingSpacesOptionsEnum {
    CONVERTTOINDENT("ConvertToIndent"),
    
    PRESERVE("Preserve"),
    
    TRIM("Trim");

    private String value;

    LeadingSpacesOptionsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LeadingSpacesOptionsEnum fromValue(String text) {
      for (LeadingSpacesOptionsEnum b : LeadingSpacesOptionsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<LeadingSpacesOptionsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LeadingSpacesOptionsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LeadingSpacesOptionsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return LeadingSpacesOptionsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("leadingSpacesOptions")
  private LeadingSpacesOptionsEnum leadingSpacesOptions = null;

  public TxtLoadOptions detectNumberingWithWhitespaces(Boolean detectNumberingWithWhitespaces) {
    this.detectNumberingWithWhitespaces = detectNumberingWithWhitespaces;
    return this;
  }

   /**
   * Allows to specify how numbered list items are recognized when plain text document is converted. The default value is true.
   * @return detectNumberingWithWhitespaces
  **/
  @ApiModelProperty(required = true, value = "Allows to specify how numbered list items are recognized when plain text document is converted. The default value is true.")
  public Boolean getDetectNumberingWithWhitespaces() {
    return detectNumberingWithWhitespaces;
  }

  public void setDetectNumberingWithWhitespaces(Boolean detectNumberingWithWhitespaces) {
    this.detectNumberingWithWhitespaces = detectNumberingWithWhitespaces;
  }

  public TxtLoadOptions trailingSpacesOptions(TrailingSpacesOptionsEnum trailingSpacesOptions) {
    this.trailingSpacesOptions = trailingSpacesOptions;
    return this;
  }

   /**
   * Gets or sets preferred option of a trailing space handling. Default value is Trim.
   * @return trailingSpacesOptions
  **/
  @ApiModelProperty(required = true, value = "Gets or sets preferred option of a trailing space handling. Default value is Trim.")
  public TrailingSpacesOptionsEnum getTrailingSpacesOptions() {
    return trailingSpacesOptions;
  }

  public void setTrailingSpacesOptions(TrailingSpacesOptionsEnum trailingSpacesOptions) {
    this.trailingSpacesOptions = trailingSpacesOptions;
  }

  public TxtLoadOptions leadingSpacesOptions(LeadingSpacesOptionsEnum leadingSpacesOptions) {
    this.leadingSpacesOptions = leadingSpacesOptions;
    return this;
  }

   /**
   * Gets or sets preferred option of a leading space handling. Default value is ConvertToIndent.
   * @return leadingSpacesOptions
  **/
  @ApiModelProperty(required = true, value = "Gets or sets preferred option of a leading space handling. Default value is ConvertToIndent.")
  public LeadingSpacesOptionsEnum getLeadingSpacesOptions() {
    return leadingSpacesOptions;
  }

  public void setLeadingSpacesOptions(LeadingSpacesOptionsEnum leadingSpacesOptions) {
    this.leadingSpacesOptions = leadingSpacesOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TxtLoadOptions txtLoadOptions = (TxtLoadOptions) o;
    return Objects.equals(this.detectNumberingWithWhitespaces, txtLoadOptions.detectNumberingWithWhitespaces) &&
        Objects.equals(this.trailingSpacesOptions, txtLoadOptions.trailingSpacesOptions) &&
        Objects.equals(this.leadingSpacesOptions, txtLoadOptions.leadingSpacesOptions) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detectNumberingWithWhitespaces, trailingSpacesOptions, leadingSpacesOptions, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TxtLoadOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    detectNumberingWithWhitespaces: ").append(toIndentedString(detectNumberingWithWhitespaces)).append("\n");
    sb.append("    trailingSpacesOptions: ").append(toIndentedString(trailingSpacesOptions)).append("\n");
    sb.append("    leadingSpacesOptions: ").append(toIndentedString(leadingSpacesOptions)).append("\n");
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

