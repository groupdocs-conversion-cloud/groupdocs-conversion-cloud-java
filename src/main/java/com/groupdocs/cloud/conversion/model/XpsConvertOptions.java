/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="XpsConvertOptions.java">
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
import com.groupdocs.cloud.conversion.model.ConvertOptions;
import com.groupdocs.cloud.conversion.model.WatermarkOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.List;

/**
 * Xps convert options
 */
@ApiModel(description = "Xps convert options")
public class XpsConvertOptions extends ConvertOptions {
  @SerializedName("width")
  private Integer width = null;

  @SerializedName("height")
  private Integer height = null;

  @SerializedName("dpi")
  private Double dpi = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("marginTop")
  private Integer marginTop = null;

  @SerializedName("marginBottom")
  private Integer marginBottom = null;

  @SerializedName("marginLeft")
  private Integer marginLeft = null;

  @SerializedName("marginRight")
  private Integer marginRight = null;

  @SerializedName("usePdf")
  private Boolean usePdf = null;

  @SerializedName("watermarkOptions")
  private WatermarkOptions watermarkOptions = null;

  public XpsConvertOptions width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Desired page width in pixels after conversion
   * @return width
  **/
  @ApiModelProperty(required = true, value = "Desired page width in pixels after conversion")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public XpsConvertOptions height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Desired page height in pixels after conversion
   * @return height
  **/
  @ApiModelProperty(required = true, value = "Desired page height in pixels after conversion")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public XpsConvertOptions dpi(Double dpi) {
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

  public XpsConvertOptions password(String password) {
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

  public XpsConvertOptions marginTop(Integer marginTop) {
    this.marginTop = marginTop;
    return this;
  }

   /**
   * Desired page top margin in pixels after conversion
   * @return marginTop
  **/
  @ApiModelProperty(required = true, value = "Desired page top margin in pixels after conversion")
  public Integer getMarginTop() {
    return marginTop;
  }

  public void setMarginTop(Integer marginTop) {
    this.marginTop = marginTop;
  }

  public XpsConvertOptions marginBottom(Integer marginBottom) {
    this.marginBottom = marginBottom;
    return this;
  }

   /**
   * Desired page bottom margin in pixels after conversion
   * @return marginBottom
  **/
  @ApiModelProperty(required = true, value = "Desired page bottom margin in pixels after conversion")
  public Integer getMarginBottom() {
    return marginBottom;
  }

  public void setMarginBottom(Integer marginBottom) {
    this.marginBottom = marginBottom;
  }

  public XpsConvertOptions marginLeft(Integer marginLeft) {
    this.marginLeft = marginLeft;
    return this;
  }

   /**
   * Desired page left margin in pixels after conversion
   * @return marginLeft
  **/
  @ApiModelProperty(required = true, value = "Desired page left margin in pixels after conversion")
  public Integer getMarginLeft() {
    return marginLeft;
  }

  public void setMarginLeft(Integer marginLeft) {
    this.marginLeft = marginLeft;
  }

  public XpsConvertOptions marginRight(Integer marginRight) {
    this.marginRight = marginRight;
    return this;
  }

   /**
   * Desired page right margin in pixels after conversion
   * @return marginRight
  **/
  @ApiModelProperty(required = true, value = "Desired page right margin in pixels after conversion")
  public Integer getMarginRight() {
    return marginRight;
  }

  public void setMarginRight(Integer marginRight) {
    this.marginRight = marginRight;
  }

  public XpsConvertOptions usePdf(Boolean usePdf) {
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

  public XpsConvertOptions watermarkOptions(WatermarkOptions watermarkOptions) {
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
    XpsConvertOptions xpsConvertOptions = (XpsConvertOptions) o;
    return Objects.equals(this.width, xpsConvertOptions.width) &&
        Objects.equals(this.height, xpsConvertOptions.height) &&
        Objects.equals(this.dpi, xpsConvertOptions.dpi) &&
        Objects.equals(this.password, xpsConvertOptions.password) &&
        Objects.equals(this.marginTop, xpsConvertOptions.marginTop) &&
        Objects.equals(this.marginBottom, xpsConvertOptions.marginBottom) &&
        Objects.equals(this.marginLeft, xpsConvertOptions.marginLeft) &&
        Objects.equals(this.marginRight, xpsConvertOptions.marginRight) &&
        Objects.equals(this.usePdf, xpsConvertOptions.usePdf) &&
        Objects.equals(this.watermarkOptions, xpsConvertOptions.watermarkOptions) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, height, dpi, password, marginTop, marginBottom, marginLeft, marginRight, usePdf, watermarkOptions, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XpsConvertOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    dpi: ").append(toIndentedString(dpi)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    marginTop: ").append(toIndentedString(marginTop)).append("\n");
    sb.append("    marginBottom: ").append(toIndentedString(marginBottom)).append("\n");
    sb.append("    marginLeft: ").append(toIndentedString(marginLeft)).append("\n");
    sb.append("    marginRight: ").append(toIndentedString(marginRight)).append("\n");
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

