/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="HtmlConvertOptions.java">
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
 * Options for to Html conversion
 */
@ApiModel(description = "Options for to Html conversion")
public class HtmlConvertOptions extends ConvertOptions {
  @SerializedName("usePdf")
  private Boolean usePdf = null;

  @SerializedName("fixedLayout")
  private Boolean fixedLayout = null;

  @SerializedName("fixedLayoutShowBorders")
  private Boolean fixedLayoutShowBorders = null;

  @SerializedName("zoom")
  private Integer zoom = null;

  @SerializedName("watermarkOptions")
  private WatermarkOptions watermarkOptions = null;

  public HtmlConvertOptions usePdf(Boolean usePdf) {
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

  public HtmlConvertOptions fixedLayout(Boolean fixedLayout) {
    this.fixedLayout = fixedLayout;
    return this;
  }

   /**
   * If true fixed layout will be used e.g. absolutely positioned html elements Default:  true
   * @return fixedLayout
  **/
  @ApiModelProperty(required = true, value = "If true fixed layout will be used e.g. absolutely positioned html elements Default:  true")
  public Boolean getFixedLayout() {
    return fixedLayout;
  }

  public void setFixedLayout(Boolean fixedLayout) {
    this.fixedLayout = fixedLayout;
  }

  public HtmlConvertOptions fixedLayoutShowBorders(Boolean fixedLayoutShowBorders) {
    this.fixedLayoutShowBorders = fixedLayoutShowBorders;
    return this;
  }

   /**
   * Show page borders when converting to fixed layout. Default is True
   * @return fixedLayoutShowBorders
  **/
  @ApiModelProperty(required = true, value = "Show page borders when converting to fixed layout. Default is True")
  public Boolean getFixedLayoutShowBorders() {
    return fixedLayoutShowBorders;
  }

  public void setFixedLayoutShowBorders(Boolean fixedLayoutShowBorders) {
    this.fixedLayoutShowBorders = fixedLayoutShowBorders;
  }

  public HtmlConvertOptions zoom(Integer zoom) {
    this.zoom = zoom;
    return this;
  }

   /**
   * Specifies the zoom level in percentage. Default is 100.
   * @return zoom
  **/
  @ApiModelProperty(required = true, value = "Specifies the zoom level in percentage. Default is 100.")
  public Integer getZoom() {
    return zoom;
  }

  public void setZoom(Integer zoom) {
    this.zoom = zoom;
  }

  public HtmlConvertOptions watermarkOptions(WatermarkOptions watermarkOptions) {
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
    HtmlConvertOptions htmlConvertOptions = (HtmlConvertOptions) o;
    return Objects.equals(this.usePdf, htmlConvertOptions.usePdf) &&
        Objects.equals(this.fixedLayout, htmlConvertOptions.fixedLayout) &&
        Objects.equals(this.fixedLayoutShowBorders, htmlConvertOptions.fixedLayoutShowBorders) &&
        Objects.equals(this.zoom, htmlConvertOptions.zoom) &&
        Objects.equals(this.watermarkOptions, htmlConvertOptions.watermarkOptions) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usePdf, fixedLayout, fixedLayoutShowBorders, zoom, watermarkOptions, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HtmlConvertOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    usePdf: ").append(toIndentedString(usePdf)).append("\n");
    sb.append("    fixedLayout: ").append(toIndentedString(fixedLayout)).append("\n");
    sb.append("    fixedLayoutShowBorders: ").append(toIndentedString(fixedLayoutShowBorders)).append("\n");
    sb.append("    zoom: ").append(toIndentedString(zoom)).append("\n");
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

