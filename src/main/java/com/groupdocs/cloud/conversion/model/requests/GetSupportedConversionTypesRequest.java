/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="GetSupportedConversionTypesRequest.java">
 *   Copyright (c) 2003-2018 Aspose Pty Ltd
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

package com.groupdocs.cloud.conversion.model.requests;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.groupdocs.cloud.conversion.model.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.File;

/**
 * Request model for getSupportedConversionTypes method.
 */
public class GetSupportedConversionTypesRequest {
    
    /**
    * Initializes a new instance of the GetSupportedConversionTypesRequest class.
    */      
    public GetSupportedConversionTypesRequest()
    {
    }

    /**
    * Initializes a new instance of the GetSupportedConversionTypesRequest class.    
    * @param filePath Absolute path to a document in the storage
    * @param storageName StorageName which contains the document
    * @param format If provided only supported conversions for specified format will be returned
    */
    public GetSupportedConversionTypesRequest(String filePath, String storageName, String format)
    {
        this.filePath = filePath;
        this.storageName = storageName;
        this.format = format;
    }

  @SerializedName("filePath")
  private String filePath = null;

  @SerializedName("storageName")
  private String storageName = null;

  @SerializedName("format")
  private String format = null;

  /**
   * Absolute path to a document in the storage
   * @return Absolute path to a document in the storage
  **/
  @ApiModelProperty(example = "filePath_example", value = "Absolute path to a document in the storage")
  public String getFilePath() {
    return filePath;
  }

  public void setFilePath(String filePath) {
    this.filePath = filePath;
  }

  /**
   * StorageName which contains the document
   * @return StorageName which contains the document
  **/
  @ApiModelProperty(example = "storageName_example", value = "StorageName which contains the document")
  public String getStorageName() {
    return storageName;
  }

  public void setStorageName(String storageName) {
    this.storageName = storageName;
  }

  /**
   * If provided only supported conversions for specified format will be returned
   * @return If provided only supported conversions for specified format will be returned
  **/
  @ApiModelProperty(example = "format_example", value = "If provided only supported conversions for specified format will be returned")
  public String getformat() {
    return format;
  }

  public void setformat(String format) {
    this.format = format;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }

    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    
    GetSupportedConversionTypesRequest request = (GetSupportedConversionTypesRequest) o;
    return Objects.equals(this.filePath, request.filePath) &&
        Objects.equals(this.storageName, request.storageName) &&
        Objects.equals(this.format, request.format);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filePath, storageName, format);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSupportedConversionTypes {\n");
    sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
    sb.append("    storageName: ").append(toIndentedString(storageName)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
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

