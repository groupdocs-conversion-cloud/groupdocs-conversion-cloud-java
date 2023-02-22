/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="WatermarkOptions.java">
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Options for settings watermark to the converted document
 */
@ApiModel(description = "Options for settings watermark to the converted document")
public class WatermarkOptions {
  @SerializedName("text")
  private String text = null;

  @SerializedName("fontName")
  private String fontName = null;

  @SerializedName("fontSize")
  private Integer fontSize = null;

  @SerializedName("bold")
  private Boolean bold = null;

  @SerializedName("italic")
  private Boolean italic = null;

  @SerializedName("color")
  private String color = null;

  @SerializedName("width")
  private Integer width = null;

  @SerializedName("height")
  private Integer height = null;

  @SerializedName("top")
  private Integer top = null;

  @SerializedName("left")
  private Integer left = null;

  @SerializedName("rotationAngle")
  private Integer rotationAngle = null;

  @SerializedName("transparency")
  private Double transparency = null;

  @SerializedName("background")
  private Boolean background = null;

  @SerializedName("image")
  private String image = null;

  @SerializedName("autoAlign")
  private Boolean autoAlign = null;

  public WatermarkOptions text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Watermark text
   * @return text
  **/
  @ApiModelProperty(value = "Watermark text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public WatermarkOptions fontName(String fontName) {
    this.fontName = fontName;
    return this;
  }

   /**
   * Watermark font name if text watermark is applied
   * @return fontName
  **/
  @ApiModelProperty(value = "Watermark font name if text watermark is applied")
  public String getFontName() {
    return fontName;
  }

  public void setFontName(String fontName) {
    this.fontName = fontName;
  }

  public WatermarkOptions fontSize(Integer fontSize) {
    this.fontSize = fontSize;
    return this;
  }

   /**
   * Watermark font name if text watermark is applied
   * @return fontSize
  **/
  @ApiModelProperty(required = true, value = "Watermark font name if text watermark is applied")
  public Integer getFontSize() {
    return fontSize;
  }

  public void setFontSize(Integer fontSize) {
    this.fontSize = fontSize;
  }

  public WatermarkOptions bold(Boolean bold) {
    this.bold = bold;
    return this;
  }

   /**
   * Watermark font bold style if text watermark is applied
   * @return bold
  **/
  @ApiModelProperty(required = true, value = "Watermark font bold style if text watermark is applied")
  public Boolean getBold() {
    return bold;
  }

  public void setBold(Boolean bold) {
    this.bold = bold;
  }

  public WatermarkOptions italic(Boolean italic) {
    this.italic = italic;
    return this;
  }

   /**
   * Watermark font italic style if text watermark is applied
   * @return italic
  **/
  @ApiModelProperty(required = true, value = "Watermark font italic style if text watermark is applied")
  public Boolean getItalic() {
    return italic;
  }

  public void setItalic(Boolean italic) {
    this.italic = italic;
  }

  public WatermarkOptions color(String color) {
    this.color = color;
    return this;
  }

   /**
   * Watermark font color if text watermark is applied
   * @return color
  **/
  @ApiModelProperty(value = "Watermark font color if text watermark is applied")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public WatermarkOptions width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Watermark width
   * @return width
  **/
  @ApiModelProperty(required = true, value = "Watermark width")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public WatermarkOptions height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Watermark height
   * @return height
  **/
  @ApiModelProperty(required = true, value = "Watermark height")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public WatermarkOptions top(Integer top) {
    this.top = top;
    return this;
  }

   /**
   * Watermark top position
   * @return top
  **/
  @ApiModelProperty(required = true, value = "Watermark top position")
  public Integer getTop() {
    return top;
  }

  public void setTop(Integer top) {
    this.top = top;
  }

  public WatermarkOptions left(Integer left) {
    this.left = left;
    return this;
  }

   /**
   * Watermark left position
   * @return left
  **/
  @ApiModelProperty(required = true, value = "Watermark left position")
  public Integer getLeft() {
    return left;
  }

  public void setLeft(Integer left) {
    this.left = left;
  }

  public WatermarkOptions rotationAngle(Integer rotationAngle) {
    this.rotationAngle = rotationAngle;
    return this;
  }

   /**
   * Watermark rotation angle
   * @return rotationAngle
  **/
  @ApiModelProperty(required = true, value = "Watermark rotation angle")
  public Integer getRotationAngle() {
    return rotationAngle;
  }

  public void setRotationAngle(Integer rotationAngle) {
    this.rotationAngle = rotationAngle;
  }

  public WatermarkOptions transparency(Double transparency) {
    this.transparency = transparency;
    return this;
  }

   /**
   * Watermark transparency. Value between 0 and 1. Value 0 is fully visible, value 1 is invisible.
   * @return transparency
  **/
  @ApiModelProperty(required = true, value = "Watermark transparency. Value between 0 and 1. Value 0 is fully visible, value 1 is invisible.")
  public Double getTransparency() {
    return transparency;
  }

  public void setTransparency(Double transparency) {
    this.transparency = transparency;
  }

  public WatermarkOptions background(Boolean background) {
    this.background = background;
    return this;
  }

   /**
   * Indicates that the watermark is stamped as background. If the value is true, the watermark is layed at the bottom. By default is false and the watermark is layed on top.
   * @return background
  **/
  @ApiModelProperty(required = true, value = "Indicates that the watermark is stamped as background. If the value is true, the watermark is layed at the bottom. By default is false and the watermark is layed on top.")
  public Boolean getBackground() {
    return background;
  }

  public void setBackground(Boolean background) {
    this.background = background;
  }

  public WatermarkOptions image(String image) {
    this.image = image;
    return this;
  }

   /**
   * Image watermark
   * @return image
  **/
  @ApiModelProperty(value = "Image watermark")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public WatermarkOptions autoAlign(Boolean autoAlign) {
    this.autoAlign = autoAlign;
    return this;
  }

   /**
   * Auto scale the watermark. If the value is true the font size and the position is automatically calculated to fit the page size.
   * @return autoAlign
  **/
  @ApiModelProperty(required = true, value = "Auto scale the watermark. If the value is true the font size and the position is automatically calculated to fit the page size.")
  public Boolean getAutoAlign() {
    return autoAlign;
  }

  public void setAutoAlign(Boolean autoAlign) {
    this.autoAlign = autoAlign;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WatermarkOptions watermarkOptions = (WatermarkOptions) o;
    return Objects.equals(this.text, watermarkOptions.text) &&
        Objects.equals(this.fontName, watermarkOptions.fontName) &&
        Objects.equals(this.fontSize, watermarkOptions.fontSize) &&
        Objects.equals(this.bold, watermarkOptions.bold) &&
        Objects.equals(this.italic, watermarkOptions.italic) &&
        Objects.equals(this.color, watermarkOptions.color) &&
        Objects.equals(this.width, watermarkOptions.width) &&
        Objects.equals(this.height, watermarkOptions.height) &&
        Objects.equals(this.top, watermarkOptions.top) &&
        Objects.equals(this.left, watermarkOptions.left) &&
        Objects.equals(this.rotationAngle, watermarkOptions.rotationAngle) &&
        Objects.equals(this.transparency, watermarkOptions.transparency) &&
        Objects.equals(this.background, watermarkOptions.background) &&
        Objects.equals(this.image, watermarkOptions.image) &&
        Objects.equals(this.autoAlign, watermarkOptions.autoAlign);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, fontName, fontSize, bold, italic, color, width, height, top, left, rotationAngle, transparency, background, image, autoAlign);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WatermarkOptions {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    fontName: ").append(toIndentedString(fontName)).append("\n");
    sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
    sb.append("    bold: ").append(toIndentedString(bold)).append("\n");
    sb.append("    italic: ").append(toIndentedString(italic)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    top: ").append(toIndentedString(top)).append("\n");
    sb.append("    left: ").append(toIndentedString(left)).append("\n");
    sb.append("    rotationAngle: ").append(toIndentedString(rotationAngle)).append("\n");
    sb.append("    transparency: ").append(toIndentedString(transparency)).append("\n");
    sb.append("    background: ").append(toIndentedString(background)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    autoAlign: ").append(toIndentedString(autoAlign)).append("\n");
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

