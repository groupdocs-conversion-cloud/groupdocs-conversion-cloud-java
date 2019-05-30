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
import com.groupdocs.cloud.conversion.model.WatermarkOptions;
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

  @SerializedName("watermarkOptions")
  private WatermarkOptions watermarkOptions = null;

  @SerializedName("brightness")
  private Integer brightness = null;

  @SerializedName("contrast")
  private Integer contrast = null;

  @SerializedName("gamma")
  private Double gamma = null;

  /**
   * Image flip mode
   */
  @JsonAdapter(FlipModeEnum.Adapter.class)
  public enum FlipModeEnum {
    NONE("None"),
    
    FLIPX("FlipX"),
    
    FLIPY("FlipY"),
    
    FLIPXY("FlipXY");

    private String value;

    FlipModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FlipModeEnum fromValue(String text) {
      for (FlipModeEnum b : FlipModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FlipModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FlipModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FlipModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FlipModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("flipMode")
  private FlipModeEnum flipMode = null;

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

  public ImageConvertOptions watermarkOptions(WatermarkOptions watermarkOptions) {
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

  public ImageConvertOptions brightness(Integer brightness) {
    this.brightness = brightness;
    return this;
  }

   /**
   * Adjust image brightness
   * @return brightness
  **/
  @ApiModelProperty(required = true, value = "Adjust image brightness")
  public Integer getBrightness() {
    return brightness;
  }

  public void setBrightness(Integer brightness) {
    this.brightness = brightness;
  }

  public ImageConvertOptions contrast(Integer contrast) {
    this.contrast = contrast;
    return this;
  }

   /**
   * Adjust image contrast
   * @return contrast
  **/
  @ApiModelProperty(required = true, value = "Adjust image contrast")
  public Integer getContrast() {
    return contrast;
  }

  public void setContrast(Integer contrast) {
    this.contrast = contrast;
  }

  public ImageConvertOptions gamma(Double gamma) {
    this.gamma = gamma;
    return this;
  }

   /**
   * Adjust image gamma
   * @return gamma
  **/
  @ApiModelProperty(required = true, value = "Adjust image gamma")
  public Double getGamma() {
    return gamma;
  }

  public void setGamma(Double gamma) {
    this.gamma = gamma;
  }

  public ImageConvertOptions flipMode(FlipModeEnum flipMode) {
    this.flipMode = flipMode;
    return this;
  }

   /**
   * Image flip mode
   * @return flipMode
  **/
  @ApiModelProperty(required = true, value = "Image flip mode")
  public FlipModeEnum getFlipMode() {
    return flipMode;
  }

  public void setFlipMode(FlipModeEnum flipMode) {
    this.flipMode = flipMode;
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
        Objects.equals(this.watermarkOptions, imageConvertOptions.watermarkOptions) &&
        Objects.equals(this.brightness, imageConvertOptions.brightness) &&
        Objects.equals(this.contrast, imageConvertOptions.contrast) &&
        Objects.equals(this.gamma, imageConvertOptions.gamma) &&
        Objects.equals(this.flipMode, imageConvertOptions.flipMode) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, height, horizontalResolution, verticalResolution, grayscale, rotateAngle, usePdf, watermarkOptions, brightness, contrast, gamma, flipMode, super.hashCode());
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
    sb.append("    watermarkOptions: ").append(toIndentedString(watermarkOptions)).append("\n");
    sb.append("    brightness: ").append(toIndentedString(brightness)).append("\n");
    sb.append("    contrast: ").append(toIndentedString(contrast)).append("\n");
    sb.append("    gamma: ").append(toIndentedString(gamma)).append("\n");
    sb.append("    flipMode: ").append(toIndentedString(flipMode)).append("\n");
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

