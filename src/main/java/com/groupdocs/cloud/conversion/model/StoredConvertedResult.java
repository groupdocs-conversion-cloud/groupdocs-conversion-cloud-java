/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="StoredConvertedResult.java">
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Contains single converted item. Result is provided as url to a storage
 */
@ApiModel(description = "Contains single converted item. Result is provided as url to a storage")
public class StoredConvertedResult {
  @SerializedName("name")
  private String name = null;

  @SerializedName("size")
  private Long size = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("url")
  private String url = null;

  public StoredConvertedResult name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of converted item
   * @return name
  **/
  @ApiModelProperty(value = "Name of converted item")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StoredConvertedResult size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * Size of converted item
   * @return size
  **/
  @ApiModelProperty(required = true, value = "Size of converted item")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public StoredConvertedResult path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Path of resource file in storage
   * @return path
  **/
  @ApiModelProperty(value = "Path of resource file in storage")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public StoredConvertedResult url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Uri in the storage of the converted item
   * @return url
  **/
  @ApiModelProperty(value = "Uri in the storage of the converted item")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoredConvertedResult storedConvertedResult = (StoredConvertedResult) o;
    return Objects.equals(this.name, storedConvertedResult.name) &&
        Objects.equals(this.size, storedConvertedResult.size) &&
        Objects.equals(this.path, storedConvertedResult.path) &&
        Objects.equals(this.url, storedConvertedResult.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, size, path, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoredConvertedResult {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

