/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="ConvertOptions.java">
 *   Copyright (c) 2003-2020 Aspose Pty Ltd
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
import java.util.ArrayList;
import java.util.List;

/**
 * ConvertOptions base
 */
@ApiModel(description = "ConvertOptions base")
public class ConvertOptions {
  @SerializedName("fromPage")
  private Integer fromPage = null;

  @SerializedName("pagesCount")
  private Integer pagesCount = null;

  @SerializedName("pages")
  private List<Integer> pages = null;

  public ConvertOptions fromPage(Integer fromPage) {
    this.fromPage = fromPage;
    return this;
  }

   /**
   * Start conversion from FromPage page
   * @return fromPage
  **/
  @ApiModelProperty(required = true, value = "Start conversion from FromPage page")
  public Integer getFromPage() {
    return fromPage;
  }

  public void setFromPage(Integer fromPage) {
    this.fromPage = fromPage;
  }

  public ConvertOptions pagesCount(Integer pagesCount) {
    this.pagesCount = pagesCount;
    return this;
  }

   /**
   * Number of pages to convert
   * @return pagesCount
  **/
  @ApiModelProperty(required = true, value = "Number of pages to convert")
  public Integer getPagesCount() {
    return pagesCount;
  }

  public void setPagesCount(Integer pagesCount) {
    this.pagesCount = pagesCount;
  }

  public ConvertOptions pages(List<Integer> pages) {
    this.pages = pages;
    return this;
  }

  public ConvertOptions addPagesItem(Integer pagesItem) {
    if (this.pages == null) {
      this.pages = new ArrayList<Integer>();
    }
    this.pages.add(pagesItem);
    return this;
  }

   /**
   * Convert specific pages. The list contains the page indexes of the pages to be converted
   * @return pages
  **/
  @ApiModelProperty(value = "Convert specific pages. The list contains the page indexes of the pages to be converted")
  public List<Integer> getPages() {
    return pages;
  }

  public void setPages(List<Integer> pages) {
    this.pages = pages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConvertOptions convertOptions = (ConvertOptions) o;
    return Objects.equals(this.fromPage, convertOptions.fromPage) &&
        Objects.equals(this.pagesCount, convertOptions.pagesCount) &&
        Objects.equals(this.pages, convertOptions.pages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromPage, pagesCount, pages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConvertOptions {\n");
    
    sb.append("    fromPage: ").append(toIndentedString(fromPage)).append("\n");
    sb.append("    pagesCount: ").append(toIndentedString(pagesCount)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
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

