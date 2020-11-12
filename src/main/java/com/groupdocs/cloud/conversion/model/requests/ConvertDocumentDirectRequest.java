/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="ConvertDocumentDirectRequest.java">
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
 * Request model for convertDocumentDirect method.
 */
public class ConvertDocumentDirectRequest {
    
    /**
    * Initializes a new instance of the ConvertDocumentDirectRequest class.
    */      
    public ConvertDocumentDirectRequest()
    {
    }

    /**
    * Initializes a new instance of the ConvertDocumentDirectRequest class.    
    * @param format Requested conversion format
    * @param file Input file to convert
    * @param fromPage Page start conversion from
    * @param pagesCount Number of pages to convert
    */
    public ConvertDocumentDirectRequest(String format, File file, Integer fromPage, Integer pagesCount)
    {
        this.format = format;
        this.file = file;
        this.fromPage = fromPage;
        this.pagesCount = pagesCount;
    }

  @SerializedName("format")
  private String format = null;

  @SerializedName("file")
  private File file = null;

  @SerializedName("fromPage")
  private Integer fromPage = null;

  @SerializedName("pagesCount")
  private Integer pagesCount = null;

  /**
   * Requested conversion format
   * @return Requested conversion format
  **/
  @ApiModelProperty(example = "format_example", required = true, value = "Requested conversion format")
  public String getformat() {
    return format;
  }

  public void setformat(String format) {
    this.format = format;
  }

  /**
   * Input file to convert
   * @return Input file to convert
  **/
  @ApiModelProperty(example = "new File(&quot;/path/to/file.txt&quot;)", required = true, value = "Input file to convert")
  public File getFile() {
    return file;
  }

  public void setFile(File file) {
    this.file = file;
  }

  /**
   * Page start conversion from
   * @return Page start conversion from
  **/
  @ApiModelProperty(example = "1", value = "Page start conversion from")
  public Integer getfromPage() {
    return fromPage;
  }

  public void setfromPage(Integer fromPage) {
    this.fromPage = fromPage;
  }

  /**
   * Number of pages to convert
   * @return Number of pages to convert
  **/
  @ApiModelProperty(example = "0", value = "Number of pages to convert")
  public Integer getpagesCount() {
    return pagesCount;
  }

  public void setpagesCount(Integer pagesCount) {
    this.pagesCount = pagesCount;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }

    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    
    ConvertDocumentDirectRequest request = (ConvertDocumentDirectRequest) o;
    return Objects.equals(this.format, request.format) &&
        Objects.equals(this.file, request.file) &&
        Objects.equals(this.fromPage, request.fromPage) &&
        Objects.equals(this.pagesCount, request.pagesCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, file, fromPage, pagesCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConvertDocumentDirect {\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    fromPage: ").append(toIndentedString(fromPage)).append("\n");
    sb.append("    pagesCount: ").append(toIndentedString(pagesCount)).append("\n");
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

