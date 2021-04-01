/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="PsdConvertOptions.java">
 *   Copyright (c) 2003-2021 Aspose Pty Ltd
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
import com.groupdocs.cloud.conversion.model.ImageConvertOptions;
import com.groupdocs.cloud.conversion.model.WatermarkOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.List;

/**
 * Psd convert options
 */
@ApiModel(description = "Psd convert options")
public class PsdConvertOptions extends ImageConvertOptions {
  @SerializedName("channelBitsCount")
  private Integer channelBitsCount = null;

  @SerializedName("channelsCount")
  private Integer channelsCount = null;

  /**
   * Psd color mode
   */
  @JsonAdapter(ColorModeEnum.Adapter.class)
  public enum ColorModeEnum {
    BITMAP("Bitmap"),
    
    GRAYSCALE("Grayscale"),
    
    INDEXED("Indexed"),
    
    RGB("Rgb"),
    
    CMYK("Cmyk"),
    
    MULTICHANNEL("Multichannel"),
    
    DUOTONE("Duotone"),
    
    LAB("Lab");

    private String value;

    ColorModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ColorModeEnum fromValue(String text) {
      for (ColorModeEnum b : ColorModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ColorModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ColorModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ColorModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ColorModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("colorMode")
  private ColorModeEnum colorMode = null;

  /**
   * Psd compression method
   */
  @JsonAdapter(CompressionMethodEnum.Adapter.class)
  public enum CompressionMethodEnum {
    RAW("Raw"),
    
    RLE("Rle"),
    
    ZIPWITHOUTPREDICTION("ZipWithoutPrediction"),
    
    ZIPWITHPREDICTION("ZipWithPrediction");

    private String value;

    CompressionMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CompressionMethodEnum fromValue(String text) {
      for (CompressionMethodEnum b : CompressionMethodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CompressionMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CompressionMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CompressionMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CompressionMethodEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("compressionMethod")
  private CompressionMethodEnum compressionMethod = null;

  @SerializedName("version")
  private Integer version = null;

  public PsdConvertOptions channelBitsCount(Integer channelBitsCount) {
    this.channelBitsCount = channelBitsCount;
    return this;
  }

   /**
   * Bits count per color channel
   * @return channelBitsCount
  **/
  @ApiModelProperty(required = true, value = "Bits count per color channel")
  public Integer getChannelBitsCount() {
    return channelBitsCount;
  }

  public void setChannelBitsCount(Integer channelBitsCount) {
    this.channelBitsCount = channelBitsCount;
  }

  public PsdConvertOptions channelsCount(Integer channelsCount) {
    this.channelsCount = channelsCount;
    return this;
  }

   /**
   * Color channels count
   * @return channelsCount
  **/
  @ApiModelProperty(required = true, value = "Color channels count")
  public Integer getChannelsCount() {
    return channelsCount;
  }

  public void setChannelsCount(Integer channelsCount) {
    this.channelsCount = channelsCount;
  }

  public PsdConvertOptions colorMode(ColorModeEnum colorMode) {
    this.colorMode = colorMode;
    return this;
  }

   /**
   * Psd color mode
   * @return colorMode
  **/
  @ApiModelProperty(required = true, value = "Psd color mode")
  public ColorModeEnum getColorMode() {
    return colorMode;
  }

  public void setColorMode(ColorModeEnum colorMode) {
    this.colorMode = colorMode;
  }

  public PsdConvertOptions compressionMethod(CompressionMethodEnum compressionMethod) {
    this.compressionMethod = compressionMethod;
    return this;
  }

   /**
   * Psd compression method
   * @return compressionMethod
  **/
  @ApiModelProperty(required = true, value = "Psd compression method")
  public CompressionMethodEnum getCompressionMethod() {
    return compressionMethod;
  }

  public void setCompressionMethod(CompressionMethodEnum compressionMethod) {
    this.compressionMethod = compressionMethod;
  }

  public PsdConvertOptions version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * Psd file version
   * @return version
  **/
  @ApiModelProperty(required = true, value = "Psd file version")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PsdConvertOptions psdConvertOptions = (PsdConvertOptions) o;
    return Objects.equals(this.channelBitsCount, psdConvertOptions.channelBitsCount) &&
        Objects.equals(this.channelsCount, psdConvertOptions.channelsCount) &&
        Objects.equals(this.colorMode, psdConvertOptions.colorMode) &&
        Objects.equals(this.compressionMethod, psdConvertOptions.compressionMethod) &&
        Objects.equals(this.version, psdConvertOptions.version) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelBitsCount, channelsCount, colorMode, compressionMethod, version, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PsdConvertOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    channelBitsCount: ").append(toIndentedString(channelBitsCount)).append("\n");
    sb.append("    channelsCount: ").append(toIndentedString(channelsCount)).append("\n");
    sb.append("    colorMode: ").append(toIndentedString(colorMode)).append("\n");
    sb.append("    compressionMethod: ").append(toIndentedString(compressionMethod)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

