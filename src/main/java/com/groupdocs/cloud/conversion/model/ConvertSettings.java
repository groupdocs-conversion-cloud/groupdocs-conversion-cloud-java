/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="ConvertSettings.java">
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
import com.groupdocs.cloud.conversion.model.LoadOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Defines conversion request
 */
@ApiModel(description = "Defines conversion request")
public class ConvertSettings {
  @SerializedName("storageName")
  private String storageName = null;

  @SerializedName("filePath")
  private String filePath = null;

  @SerializedName("format")
  private String format = null;

  @SerializedName("loadOptions")
  private LoadOptions loadOptions = null;

  @SerializedName("convertOptions")
  private ConvertOptions convertOptions = null;

  @SerializedName("outputPath")
  private String outputPath = null;

  @SerializedName("fontsPath")
  private String fontsPath = null;

  public ConvertSettings storageName(String storageName) {
    this.storageName = storageName;
    return this;
  }

   /**
   * StorageName which contains the file
   * @return storageName
  **/
  @ApiModelProperty(value = "StorageName which contains the file")
  public String getStorageName() {
    return storageName;
  }

  public void setStorageName(String storageName) {
    this.storageName = storageName;
  }

  public ConvertSettings filePath(String filePath) {
    this.filePath = filePath;
    return this;
  }

   /**
   * Gets or sets absolute path to a file in the storage
   * @return filePath
  **/
  @ApiModelProperty(required = true, value = "Gets or sets absolute path to a file in the storage")
  public String getFilePath() {
    return filePath;
  }

  public void setFilePath(String filePath) {
    this.filePath = filePath;
  }

  public ConvertSettings format(String format) {
    this.format = format;
    return this;
  }

   /**
   * Gets or sets requested conversion format
   * @return format
  **/
  @ApiModelProperty(required = true, value = "Gets or sets requested conversion format")
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public ConvertSettings loadOptions(LoadOptions loadOptions) {
    this.loadOptions = loadOptions;
    return this;
  }

   /**
   * Gets or sets format specific load options for source file
   * @return loadOptions
  **/
  @ApiModelProperty(value = "Gets or sets format specific load options for source file")
  public LoadOptions getLoadOptions() {
    return loadOptions;
  }

  public void setLoadOptions(LoadOptions loadOptions) {
    this.loadOptions = loadOptions;
  }

  public ConvertSettings convertOptions(ConvertOptions convertOptions) {
    this.convertOptions = convertOptions;
    return this;
  }

   /**
   * Gets or sets format specific convert options for output file
   * @return convertOptions
  **/
  @ApiModelProperty(value = "Gets or sets format specific convert options for output file")
  public ConvertOptions getConvertOptions() {
    return convertOptions;
  }

  public void setConvertOptions(ConvertOptions convertOptions) {
    this.convertOptions = convertOptions;
  }

  public ConvertSettings outputPath(String outputPath) {
    this.outputPath = outputPath;
    return this;
  }

   /**
   * Gets or sets converted file save path
   * @return outputPath
  **/
  @ApiModelProperty(value = "Gets or sets converted file save path")
  public String getOutputPath() {
    return outputPath;
  }

  public void setOutputPath(String outputPath) {
    this.outputPath = outputPath;
  }

  public ConvertSettings fontsPath(String fontsPath) {
    this.fontsPath = fontsPath;
    return this;
  }

   /**
   * The path to directory containing custom fonts in storage
   * @return fontsPath
  **/
  @ApiModelProperty(value = "The path to directory containing custom fonts in storage")
  public String getFontsPath() {
    return fontsPath;
  }

  public void setFontsPath(String fontsPath) {
    this.fontsPath = fontsPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConvertSettings convertSettings = (ConvertSettings) o;
    return Objects.equals(this.storageName, convertSettings.storageName) &&
        Objects.equals(this.filePath, convertSettings.filePath) &&
        Objects.equals(this.format, convertSettings.format) &&
        Objects.equals(this.loadOptions, convertSettings.loadOptions) &&
        Objects.equals(this.convertOptions, convertSettings.convertOptions) &&
        Objects.equals(this.outputPath, convertSettings.outputPath) &&
        Objects.equals(this.fontsPath, convertSettings.fontsPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storageName, filePath, format, loadOptions, convertOptions, outputPath, fontsPath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConvertSettings {\n");
    
    sb.append("    storageName: ").append(toIndentedString(storageName)).append("\n");
    sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    loadOptions: ").append(toIndentedString(loadOptions)).append("\n");
    sb.append("    convertOptions: ").append(toIndentedString(convertOptions)).append("\n");
    sb.append("    outputPath: ").append(toIndentedString(outputPath)).append("\n");
    sb.append("    fontsPath: ").append(toIndentedString(fontsPath)).append("\n");
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

