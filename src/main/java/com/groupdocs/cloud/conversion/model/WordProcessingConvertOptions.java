/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="WordProcessingConvertOptions.java">
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
import com.groupdocs.cloud.conversion.model.ConvertOptions;
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
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, height, dpi, password, zoom, super.hashCode());
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

