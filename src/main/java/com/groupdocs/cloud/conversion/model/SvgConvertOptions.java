/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="SvgConvertOptions.java">
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
 * Svg convert options
 */
@ApiModel(description = "Svg convert options")
public class SvgConvertOptions extends ConvertOptions {
  @SerializedName("width")
  private Integer width = null;

  @SerializedName("height")
  private Integer height = null;

  @SerializedName("grayscale")
  private Boolean grayscale = null;

  @SerializedName("rotateAngle")
  private Integer rotateAngle = null;

  @SerializedName("usePdf")
  private Boolean usePdf = null;

  @SerializedName("watermarkOptions")
  private WatermarkOptions watermarkOptions = null;

  public SvgConvertOptions width(Integer width) {
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

  public SvgConvertOptions height(Integer height) {
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

  public SvgConvertOptions grayscale(Boolean grayscale) {
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

  public SvgConvertOptions rotateAngle(Integer rotateAngle) {
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

  public SvgConvertOptions usePdf(Boolean usePdf) {
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

  public SvgConvertOptions watermarkOptions(WatermarkOptions watermarkOptions) {
    this.watermarkOptions = watermarkOptions;
    return this;
  }

   /**
   * Watermark specific options
   * @return watermarkOptions
  **/
  @ApiModelProperty(value = "Watermark specific options")
  public WatermarkOptions getWatermarkOptions() {
    return watermarkOptions;
  }

  public void setWatermarkOptions(WatermarkOptions watermarkOptions) {
    this.watermarkOptions = watermarkOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SvgConvertOptions svgConvertOptions = (SvgConvertOptions) o;
    return Objects.equals(this.width, svgConvertOptions.width) &&
        Objects.equals(this.height, svgConvertOptions.height) &&
        Objects.equals(this.grayscale, svgConvertOptions.grayscale) &&
        Objects.equals(this.rotateAngle, svgConvertOptions.rotateAngle) &&
        Objects.equals(this.usePdf, svgConvertOptions.usePdf) &&
        Objects.equals(this.watermarkOptions, svgConvertOptions.watermarkOptions) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, height, grayscale, rotateAngle, usePdf, watermarkOptions, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SvgConvertOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    grayscale: ").append(toIndentedString(grayscale)).append("\n");
    sb.append("    rotateAngle: ").append(toIndentedString(rotateAngle)).append("\n");
    sb.append("    usePdf: ").append(toIndentedString(usePdf)).append("\n");
    sb.append("    watermarkOptions: ").append(toIndentedString(watermarkOptions)).append("\n");
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

