/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="CadLoadOptions.java">
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
  @SerializedName("width")
  private Integer width = null;

  @SerializedName("height")
  private Integer height = null;

  @SerializedName("layoutNames")
  private List<String> layoutNames = null;

  public CadLoadOptions width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Set desired page width for converting CAD document
   * @return width
  **/
  @ApiModelProperty(required = true, value = "Set desired page width for converting CAD document")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public CadLoadOptions height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Set desired page height for converting CAD document
   * @return height
  **/
  @ApiModelProperty(required = true, value = "Set desired page height for converting CAD document")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CadLoadOptions cadLoadOptions = (CadLoadOptions) o;
    return Objects.equals(this.width, cadLoadOptions.width) &&
        Objects.equals(this.height, cadLoadOptions.height) &&
        Objects.equals(this.layoutNames, cadLoadOptions.layoutNames) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, height, layoutNames, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CadLoadOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    layoutNames: ").append(toIndentedString(layoutNames)).append("\n");
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

