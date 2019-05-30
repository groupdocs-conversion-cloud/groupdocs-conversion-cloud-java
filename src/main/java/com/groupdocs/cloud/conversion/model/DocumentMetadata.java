/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="DocumentMetadata.java">
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * Contains a document metadata 
 */
@ApiModel(description = "Contains a document metadata ")
public class DocumentMetadata {
  @SerializedName("fileType")
  private String fileType = null;

  @SerializedName("pageCount")
  private Integer pageCount = null;

  @SerializedName("size")
  private Long size = null;

  @SerializedName("width")
  private Integer width = null;

  @SerializedName("height")
  private Integer height = null;

  @SerializedName("horizontalResolution")
  private Integer horizontalResolution = null;

  @SerializedName("verticalResolution")
  private Integer verticalResolution = null;

  @SerializedName("bitsPerPixel")
  private Integer bitsPerPixel = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("author")
  private String author = null;

  @SerializedName("createdDate")
  private OffsetDateTime createdDate = null;

  @SerializedName("modifiedDate")
  private OffsetDateTime modifiedDate = null;

  @SerializedName("layers")
  private List<String> layers = null;

  @SerializedName("isPasswordProtected")
  private Boolean isPasswordProtected = null;

  public DocumentMetadata fileType(String fileType) {
    this.fileType = fileType;
    return this;
  }

   /**
   * Document file type
   * @return fileType
  **/
  @ApiModelProperty(value = "Document file type")
  public String getFileType() {
    return fileType;
  }

  public void setFileType(String fileType) {
    this.fileType = fileType;
  }

  public DocumentMetadata pageCount(Integer pageCount) {
    this.pageCount = pageCount;
    return this;
  }

   /**
   * Gets pages count if applicable to the current document format
   * @return pageCount
  **/
  @ApiModelProperty(required = true, value = "Gets pages count if applicable to the current document format")
  public Integer getPageCount() {
    return pageCount;
  }

  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }

  public DocumentMetadata size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * Document bytes size
   * @return size
  **/
  @ApiModelProperty(required = true, value = "Document bytes size")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public DocumentMetadata width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Returns detected width if applicable to the current document format
   * @return width
  **/
  @ApiModelProperty(required = true, value = "Returns detected width if applicable to the current document format")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public DocumentMetadata height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Returns detected height if applicable to the current document format
   * @return height
  **/
  @ApiModelProperty(required = true, value = "Returns detected height if applicable to the current document format")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public DocumentMetadata horizontalResolution(Integer horizontalResolution) {
    this.horizontalResolution = horizontalResolution;
    return this;
  }

   /**
   * Returns detected horizontal resolution if applicable to the current document format
   * @return horizontalResolution
  **/
  @ApiModelProperty(required = true, value = "Returns detected horizontal resolution if applicable to the current document format")
  public Integer getHorizontalResolution() {
    return horizontalResolution;
  }

  public void setHorizontalResolution(Integer horizontalResolution) {
    this.horizontalResolution = horizontalResolution;
  }

  public DocumentMetadata verticalResolution(Integer verticalResolution) {
    this.verticalResolution = verticalResolution;
    return this;
  }

   /**
   * Returns detected vertical resolution if applicable to the current document format
   * @return verticalResolution
  **/
  @ApiModelProperty(required = true, value = "Returns detected vertical resolution if applicable to the current document format")
  public Integer getVerticalResolution() {
    return verticalResolution;
  }

  public void setVerticalResolution(Integer verticalResolution) {
    this.verticalResolution = verticalResolution;
  }

  public DocumentMetadata bitsPerPixel(Integer bitsPerPixel) {
    this.bitsPerPixel = bitsPerPixel;
    return this;
  }

   /**
   * Returns detected bits per pixel if applicable to the current document format
   * @return bitsPerPixel
  **/
  @ApiModelProperty(required = true, value = "Returns detected bits per pixel if applicable to the current document format")
  public Integer getBitsPerPixel() {
    return bitsPerPixel;
  }

  public void setBitsPerPixel(Integer bitsPerPixel) {
    this.bitsPerPixel = bitsPerPixel;
  }

  public DocumentMetadata title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Returns document title width if applicable to the current document format
   * @return title
  **/
  @ApiModelProperty(value = "Returns document title width if applicable to the current document format")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public DocumentMetadata author(String author) {
    this.author = author;
    return this;
  }

   /**
   * Returns detected document author if applicable to the current document format
   * @return author
  **/
  @ApiModelProperty(value = "Returns detected document author if applicable to the current document format")
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public DocumentMetadata createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Returns detected document creation date if it&#39;s applicable to the current document format
   * @return createdDate
  **/
  @ApiModelProperty(required = true, value = "Returns detected document creation date if it's applicable to the current document format")
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public DocumentMetadata modifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }

   /**
   * Returns detected document modification date if applicable to the current document format
   * @return modifiedDate
  **/
  @ApiModelProperty(required = true, value = "Returns detected document modification date if applicable to the current document format")
  public OffsetDateTime getModifiedDate() {
    return modifiedDate;
  }

  public void setModifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  public DocumentMetadata layers(List<String> layers) {
    this.layers = layers;
    return this;
  }

  public DocumentMetadata addLayersItem(String layersItem) {
    if (this.layers == null) {
      this.layers = new ArrayList<String>();
    }
    this.layers.add(layersItem);
    return this;
  }

   /**
   * Returns list of layer names if applicable to the current document format
   * @return layers
  **/
  @ApiModelProperty(value = "Returns list of layer names if applicable to the current document format")
  public List<String> getLayers() {
    return layers;
  }

  public void setLayers(List<String> layers) {
    this.layers = layers;
  }

  public DocumentMetadata isPasswordProtected(Boolean isPasswordProtected) {
    this.isPasswordProtected = isPasswordProtected;
    return this;
  }

   /**
   * Is document password protected
   * @return isPasswordProtected
  **/
  @ApiModelProperty(required = true, value = "Is document password protected")
  public Boolean getIsPasswordProtected() {
    return isPasswordProtected;
  }

  public void setIsPasswordProtected(Boolean isPasswordProtected) {
    this.isPasswordProtected = isPasswordProtected;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentMetadata documentMetadata = (DocumentMetadata) o;
    return Objects.equals(this.fileType, documentMetadata.fileType) &&
        Objects.equals(this.pageCount, documentMetadata.pageCount) &&
        Objects.equals(this.size, documentMetadata.size) &&
        Objects.equals(this.width, documentMetadata.width) &&
        Objects.equals(this.height, documentMetadata.height) &&
        Objects.equals(this.horizontalResolution, documentMetadata.horizontalResolution) &&
        Objects.equals(this.verticalResolution, documentMetadata.verticalResolution) &&
        Objects.equals(this.bitsPerPixel, documentMetadata.bitsPerPixel) &&
        Objects.equals(this.title, documentMetadata.title) &&
        Objects.equals(this.author, documentMetadata.author) &&
        Objects.equals(this.createdDate, documentMetadata.createdDate) &&
        Objects.equals(this.modifiedDate, documentMetadata.modifiedDate) &&
        Objects.equals(this.layers, documentMetadata.layers) &&
        Objects.equals(this.isPasswordProtected, documentMetadata.isPasswordProtected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileType, pageCount, size, width, height, horizontalResolution, verticalResolution, bitsPerPixel, title, author, createdDate, modifiedDate, layers, isPasswordProtected);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentMetadata {\n");
    
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    horizontalResolution: ").append(toIndentedString(horizontalResolution)).append("\n");
    sb.append("    verticalResolution: ").append(toIndentedString(verticalResolution)).append("\n");
    sb.append("    bitsPerPixel: ").append(toIndentedString(bitsPerPixel)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    layers: ").append(toIndentedString(layers)).append("\n");
    sb.append("    isPasswordProtected: ").append(toIndentedString(isPasswordProtected)).append("\n");
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

