/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="SupportedFormat.java">
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents information about supported conversion for SourceFormat
 */
@ApiModel(description = "Represents information about supported conversion for SourceFormat")
public class SupportedFormat {
  @SerializedName("sourceFormat")
  private String sourceFormat = null;

  @SerializedName("targetFormats")
  private List<String> targetFormats = null;

  public SupportedFormat sourceFormat(String sourceFormat) {
    this.sourceFormat = sourceFormat;
    return this;
  }

   /**
   * Gets or sets source format
   * @return sourceFormat
  **/
  @ApiModelProperty(value = "Gets or sets source format")
  public String getSourceFormat() {
    return sourceFormat;
  }

  public void setSourceFormat(String sourceFormat) {
    this.sourceFormat = sourceFormat;
  }

  public SupportedFormat targetFormats(List<String> targetFormats) {
    this.targetFormats = targetFormats;
    return this;
  }

  public SupportedFormat addTargetFormatsItem(String targetFormatsItem) {
    if (this.targetFormats == null) {
      this.targetFormats = new ArrayList<String>();
    }
    this.targetFormats.add(targetFormatsItem);
    return this;
  }

   /**
   * Gets or sets target formats
   * @return targetFormats
  **/
  @ApiModelProperty(value = "Gets or sets target formats")
  public List<String> getTargetFormats() {
    return targetFormats;
  }

  public void setTargetFormats(List<String> targetFormats) {
    this.targetFormats = targetFormats;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupportedFormat supportedFormat = (SupportedFormat) o;
    return Objects.equals(this.sourceFormat, supportedFormat.sourceFormat) &&
        Objects.equals(this.targetFormats, supportedFormat.targetFormats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceFormat, targetFormats);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportedFormat {\n");
    
    sb.append("    sourceFormat: ").append(toIndentedString(sourceFormat)).append("\n");
    sb.append("    targetFormats: ").append(toIndentedString(targetFormats)).append("\n");
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

