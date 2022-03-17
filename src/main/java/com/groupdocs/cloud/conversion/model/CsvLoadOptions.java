/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="CsvLoadOptions.java">
 *   Copyright (c) 2003-2022 Aspose Pty Ltd
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
 * Csv document load options
 */
@ApiModel(description = "Csv document load options")
public class CsvLoadOptions extends LoadOptions {
  @SerializedName("separator")
  private String separator = null;

  @SerializedName("isMultiEncoded")
  private Boolean isMultiEncoded = null;

  @SerializedName("hasFormula")
  private Boolean hasFormula = null;

  @SerializedName("convertNumericData")
  private Boolean convertNumericData = null;

  @SerializedName("convertDateTimeData")
  private Boolean convertDateTimeData = null;

  @SerializedName("encoding")
  private String encoding = null;

  public CsvLoadOptions separator(String separator) {
    this.separator = separator;
    return this;
  }

   /**
   * Delimiter of a Csv file
   * @return separator
  **/
  @ApiModelProperty(required = true, value = "Delimiter of a Csv file")
  public String getSeparator() {
    return separator;
  }

  public void setSeparator(String separator) {
    this.separator = separator;
  }

  public CsvLoadOptions isMultiEncoded(Boolean isMultiEncoded) {
    this.isMultiEncoded = isMultiEncoded;
    return this;
  }

   /**
   * True means the file contains several encodings
   * @return isMultiEncoded
  **/
  @ApiModelProperty(required = true, value = "True means the file contains several encodings")
  public Boolean getIsMultiEncoded() {
    return isMultiEncoded;
  }

  public void setIsMultiEncoded(Boolean isMultiEncoded) {
    this.isMultiEncoded = isMultiEncoded;
  }

  public CsvLoadOptions hasFormula(Boolean hasFormula) {
    this.hasFormula = hasFormula;
    return this;
  }

   /**
   * Indicates whether text is formula if it starts with \&quot;&#x3D;\&quot;
   * @return hasFormula
  **/
  @ApiModelProperty(required = true, value = "Indicates whether text is formula if it starts with \"=\"")
  public Boolean getHasFormula() {
    return hasFormula;
  }

  public void setHasFormula(Boolean hasFormula) {
    this.hasFormula = hasFormula;
  }

  public CsvLoadOptions convertNumericData(Boolean convertNumericData) {
    this.convertNumericData = convertNumericData;
    return this;
  }

   /**
   * Indicates whether the string in the file is converted to numeric. Default is True
   * @return convertNumericData
  **/
  @ApiModelProperty(required = true, value = "Indicates whether the string in the file is converted to numeric. Default is True")
  public Boolean getConvertNumericData() {
    return convertNumericData;
  }

  public void setConvertNumericData(Boolean convertNumericData) {
    this.convertNumericData = convertNumericData;
  }

  public CsvLoadOptions convertDateTimeData(Boolean convertDateTimeData) {
    this.convertDateTimeData = convertDateTimeData;
    return this;
  }

   /**
   * Indicates whether the string in the file is converted to date. Default is True
   * @return convertDateTimeData
  **/
  @ApiModelProperty(required = true, value = "Indicates whether the string in the file is converted to date. Default is True")
  public Boolean getConvertDateTimeData() {
    return convertDateTimeData;
  }

  public void setConvertDateTimeData(Boolean convertDateTimeData) {
    this.convertDateTimeData = convertDateTimeData;
  }

  public CsvLoadOptions encoding(String encoding) {
    this.encoding = encoding;
    return this;
  }

   /**
   * File encoding
   * @return encoding
  **/
  @ApiModelProperty(value = "File encoding")
  public String getEncoding() {
    return encoding;
  }

  public void setEncoding(String encoding) {
    this.encoding = encoding;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CsvLoadOptions csvLoadOptions = (CsvLoadOptions) o;
    return Objects.equals(this.separator, csvLoadOptions.separator) &&
        Objects.equals(this.isMultiEncoded, csvLoadOptions.isMultiEncoded) &&
        Objects.equals(this.hasFormula, csvLoadOptions.hasFormula) &&
        Objects.equals(this.convertNumericData, csvLoadOptions.convertNumericData) &&
        Objects.equals(this.convertDateTimeData, csvLoadOptions.convertDateTimeData) &&
        Objects.equals(this.encoding, csvLoadOptions.encoding) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(separator, isMultiEncoded, hasFormula, convertNumericData, convertDateTimeData, encoding, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsvLoadOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    separator: ").append(toIndentedString(separator)).append("\n");
    sb.append("    isMultiEncoded: ").append(toIndentedString(isMultiEncoded)).append("\n");
    sb.append("    hasFormula: ").append(toIndentedString(hasFormula)).append("\n");
    sb.append("    convertNumericData: ").append(toIndentedString(convertNumericData)).append("\n");
    sb.append("    convertDateTimeData: ").append(toIndentedString(convertDateTimeData)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
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

