/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="CadLoadOptions.java">
 *   Copyright (c) Aspose Pty Ltd
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
import com.groupdocs.cloud.conversion.model.LoadOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Options for loading CAD documents
 */
@ApiModel(description = "Options for loading CAD documents")
public class CadLoadOptions extends LoadOptions {
  @SerializedName("layoutNames")
  private List<String> layoutNames = null;

  @SerializedName("backgroundColor")
  private String backgroundColor = null;

  /**
   * Gets or sets type of drawing.
   */
  @JsonAdapter(DrawTypeEnum.Adapter.class)
  public enum DrawTypeEnum {
    USEDRAWCOLOR("UseDrawColor"),
    
    USEOBJECTCOLOR("UseObjectColor");

    private String value;

    DrawTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DrawTypeEnum fromValue(String text) {
      for (DrawTypeEnum b : DrawTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DrawTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DrawTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DrawTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DrawTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("drawType")
  private DrawTypeEnum drawType = null;

  public CadLoadOptions layoutNames(List<String> layoutNames) {
    this.layoutNames = layoutNames;
    return this;
  }

  public CadLoadOptions addLayoutNamesItem(String layoutNamesItem) {
    if (this.layoutNames == null) {
      this.layoutNames = new ArrayList<String>();
    }
    this.layoutNames.add(layoutNamesItem);
    return this;
  }

   /**
   * Render specific CAD layouts
   * @return layoutNames
  **/
  @ApiModelProperty(value = "Render specific CAD layouts")
  public List<String> getLayoutNames() {
    return layoutNames;
  }

  public void setLayoutNames(List<String> layoutNames) {
    this.layoutNames = layoutNames;
  }

  public CadLoadOptions backgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

   /**
   * Gets or sets a background color.
   * @return backgroundColor
  **/
  @ApiModelProperty(value = "Gets or sets a background color.")
  public String getBackgroundColor() {
    return backgroundColor;
  }

  public void setBackgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
  }

  public CadLoadOptions drawType(DrawTypeEnum drawType) {
    this.drawType = drawType;
    return this;
  }

   /**
   * Gets or sets type of drawing.
   * @return drawType
  **/
  @ApiModelProperty(required = true, value = "Gets or sets type of drawing.")
  public DrawTypeEnum getDrawType() {
    return drawType;
  }

  public void setDrawType(DrawTypeEnum drawType) {
    this.drawType = drawType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CadLoadOptions cadLoadOptions = (CadLoadOptions) o;
    return Objects.equals(this.layoutNames, cadLoadOptions.layoutNames) &&
        Objects.equals(this.backgroundColor, cadLoadOptions.backgroundColor) &&
        Objects.equals(this.drawType, cadLoadOptions.drawType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(layoutNames, backgroundColor, drawType, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CadLoadOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    layoutNames: ").append(toIndentedString(layoutNames)).append("\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    drawType: ").append(toIndentedString(drawType)).append("\n");
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

