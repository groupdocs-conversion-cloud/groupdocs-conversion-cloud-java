/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="ImageConvertOptions.java">
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
 * Options for to Image conversion
 */
@ApiModel(description = "Options for to Image conversion")
public class ImageConvertOptions extends ConvertOptions {
  @SerializedName("width")
  private Integer width = null;

  @SerializedName("height")
  private Integer height = null;

  @SerializedName("horizontalResolution")
  private Integer horizontalResolution = null;

  @SerializedName("verticalResolution")
  private Integer verticalResolution = null;

  @SerializedName("grayscale")
  private Boolean grayscale = null;

  @SerializedName("rotateAngle")
  private Integer rotateAngle = null;

  @SerializedName("usePdf")
  private Boolean usePdf = null;

  public ImageConvertOptions width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Desired image width after conversion
   * @return width
  **/
  @ApiModelProperty(required = true, value = "Desired image width after conversion")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public ImageConvertOptions height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Desired image height after conversion
   * @return height
  **/
  @ApiModelProperty(required = true, value = "Desired image height after conversion")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public ImageConvertOptions horizontalResolution(Integer horizontalResolution) {
    this.horizontalResolution = horizontalResolution;
    return this;
  }

   /**
   * Desired image horizontal resolution after conversion. The default resolution is the resolution of the input file or 96dpi
   * @return horizontalResolution
  **/
  @ApiModelProperty(required = true, value = "Desired image horizontal resolution after conversion. The default resolution is the resolution of the input file or 96dpi")
  public Integer getHorizontalResolution() {
    return horizontalResolution;
  }

  public void setHorizontalResolution(Integer horizontalResolution) {
    this.horizontalResolution = horizontalResolution;
  }

  public ImageConvertOptions verticalResolution(Integer verticalResolution) {
    this.verticalResolution = verticalResolution;
    return this;
  }

   /**
   * Desired image vertical resolution after conversion. The default resolution is the resolution of the input file or 96dpi
   * @return verticalResolution
  **/
  @ApiModelProperty(required = true, value = "Desired image vertical resolution after conversion. The default resolution is the resolution of the input file or 96dpi")
  public Integer getVerticalResolution() {
    return verticalResolution;
  }

  public void setVerticalResolution(Integer verticalResolution) {
    this.verticalResolution = verticalResolution;
  }

  public ImageConvertOptions grayscale(Boolean grayscale) {
    this.grayscale = grayscale;
    return this;
  }

   /**
   * Convert to grayscale image
   * @return grayscale
  **/
  @ApiModelProperty(required = true, value = "Convert to grayscale image")
  public Boolean getGrayscale() {
    return grayscale;
  }

  public void setGrayscale(Boolean grayscale) {
    this.grayscale = grayscale;
  }

  public ImageConvertOptions rotateAngle(Integer rotateAngle) {
    this.rotateAngle = rotateAngle;
    return this;
  }

   /**
   * Image rotation angle 
   * @return rotateAngle
  **/
  @ApiModelProperty(required = true, value = "Image rotation angle ")
  public Integer getRotateAngle() {
    return rotateAngle;
  }

  public void setRotateAngle(Integer rotateAngle) {
    this.rotateAngle = rotateAngle;
  }

  public ImageConvertOptions usePdf(Boolean usePdf) {
    this.usePdf = usePdf;
    return this;
  }

   /**
   * If true, the input firstly is converted to PDF and after that to desired format
   * @return usePdf
  **/
  @ApiModelProperty(required = true, value = "If true, the input firstly is converted to PDF and after that to desired format")
  public Boolean getUsePdf() {
    return usePdf;
  }

  public void setUsePdf(Boolean usePdf) {
    this.usePdf = usePdf;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageConvertOptions imageConvertOptions = (ImageConvertOptions) o;
    return Objects.equals(this.width, imageConvertOptions.width) &&
        Objects.equals(this.height, imageConvertOptions.height) &&
        Objects.equals(this.horizontalResolution, imageConvertOptions.horizontalResolution) &&
        Objects.equals(this.verticalResolution, imageConvertOptions.verticalResolution) &&
        Objects.equals(this.grayscale, imageConvertOptions.grayscale) &&
        Objects.equals(this.rotateAngle, imageConvertOptions.rotateAngle) &&
        Objects.equals(this.usePdf, imageConvertOptions.usePdf) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, height, horizontalResolution, verticalResolution, grayscale, rotateAngle, usePdf, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageConvertOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    horizontalResolution: ").append(toIndentedString(horizontalResolution)).append("\n");
    sb.append("    verticalResolution: ").append(toIndentedString(verticalResolution)).append("\n");
    sb.append("    grayscale: ").append(toIndentedString(grayscale)).append("\n");
    sb.append("    rotateAngle: ").append(toIndentedString(rotateAngle)).append("\n");
    sb.append("    usePdf: ").append(toIndentedString(usePdf)).append("\n");
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

