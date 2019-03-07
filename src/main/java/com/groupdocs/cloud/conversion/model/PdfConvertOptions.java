/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="PdfConvertOptions.java">
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.List;

/**
 * Options for to PDF conversion
 */
@ApiModel(description = "Options for to PDF conversion")
public class PdfConvertOptions extends ConvertOptions {
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

  @SerializedName("removePdfaCompliance")
  private Boolean removePdfaCompliance = null;

  @SerializedName("zoom")
  private Integer zoom = null;

  @SerializedName("linearize")
  private Boolean linearize = null;

  @SerializedName("linkDuplicateStreams")
  private Boolean linkDuplicateStreams = null;

  @SerializedName("removeUnusedObjects")
  private Boolean removeUnusedObjects = null;

  @SerializedName("removeUnusedStreams")
  private Boolean removeUnusedStreams = null;

  @SerializedName("compressImages")
  private Boolean compressImages = null;

  @SerializedName("imageQuality")
  private Integer imageQuality = null;

  @SerializedName("unembedFonts")
  private Boolean unembedFonts = null;

  @SerializedName("grayscale")
  private Boolean grayscale = null;

  @SerializedName("centerWindow")
  private Boolean centerWindow = null;

  @SerializedName("displayDocTitle")
  private Boolean displayDocTitle = null;

  @SerializedName("fitWindow")
  private Boolean fitWindow = null;

  @SerializedName("hideMenubar")
  private Boolean hideMenubar = null;

  @SerializedName("hideToolBar")
  private Boolean hideToolBar = null;

  @SerializedName("hideWindowUI")
  private Boolean hideWindowUI = null;

  @SerializedName("bookmarksOutlineLevel")
  private Integer bookmarksOutlineLevel = null;

  @SerializedName("headingsOutlineLevels")
  private Integer headingsOutlineLevels = null;

  @SerializedName("expandedOutlineLevels")
  private Integer expandedOutlineLevels = null;

  public PdfConvertOptions width(Integer width) {
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

  public PdfConvertOptions height(Integer height) {
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

  public PdfConvertOptions dpi(Double dpi) {
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

  public PdfConvertOptions password(String password) {
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

  public PdfConvertOptions marginTop(Integer marginTop) {
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

  public PdfConvertOptions marginBottom(Integer marginBottom) {
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

  public PdfConvertOptions marginLeft(Integer marginLeft) {
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

  public PdfConvertOptions marginRight(Integer marginRight) {
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

  public PdfConvertOptions removePdfaCompliance(Boolean removePdfaCompliance) {
    this.removePdfaCompliance = removePdfaCompliance;
    return this;
  }

   /**
   * Remove Pdf-A Compliance
   * @return removePdfaCompliance
  **/
  @ApiModelProperty(required = true, value = "Remove Pdf-A Compliance")
  public Boolean getRemovePdfaCompliance() {
    return removePdfaCompliance;
  }

  public void setRemovePdfaCompliance(Boolean removePdfaCompliance) {
    this.removePdfaCompliance = removePdfaCompliance;
  }

  public PdfConvertOptions zoom(Integer zoom) {
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

  public PdfConvertOptions linearize(Boolean linearize) {
    this.linearize = linearize;
    return this;
  }

   /**
   * Linearize PDF Document for the Web
   * @return linearize
  **/
  @ApiModelProperty(required = true, value = "Linearize PDF Document for the Web")
  public Boolean getLinearize() {
    return linearize;
  }

  public void setLinearize(Boolean linearize) {
    this.linearize = linearize;
  }

  public PdfConvertOptions linkDuplicateStreams(Boolean linkDuplicateStreams) {
    this.linkDuplicateStreams = linkDuplicateStreams;
    return this;
  }

   /**
   * Link duplicate streams
   * @return linkDuplicateStreams
  **/
  @ApiModelProperty(required = true, value = "Link duplicate streams")
  public Boolean getLinkDuplicateStreams() {
    return linkDuplicateStreams;
  }

  public void setLinkDuplicateStreams(Boolean linkDuplicateStreams) {
    this.linkDuplicateStreams = linkDuplicateStreams;
  }

  public PdfConvertOptions removeUnusedObjects(Boolean removeUnusedObjects) {
    this.removeUnusedObjects = removeUnusedObjects;
    return this;
  }

   /**
   * Remove unused objects
   * @return removeUnusedObjects
  **/
  @ApiModelProperty(required = true, value = "Remove unused objects")
  public Boolean getRemoveUnusedObjects() {
    return removeUnusedObjects;
  }

  public void setRemoveUnusedObjects(Boolean removeUnusedObjects) {
    this.removeUnusedObjects = removeUnusedObjects;
  }

  public PdfConvertOptions removeUnusedStreams(Boolean removeUnusedStreams) {
    this.removeUnusedStreams = removeUnusedStreams;
    return this;
  }

   /**
   * Remove unused streams
   * @return removeUnusedStreams
  **/
  @ApiModelProperty(required = true, value = "Remove unused streams")
  public Boolean getRemoveUnusedStreams() {
    return removeUnusedStreams;
  }

  public void setRemoveUnusedStreams(Boolean removeUnusedStreams) {
    this.removeUnusedStreams = removeUnusedStreams;
  }

  public PdfConvertOptions compressImages(Boolean compressImages) {
    this.compressImages = compressImages;
    return this;
  }

   /**
   * If CompressImages set to true, all images in the document are recompressed. The compression is defined by the ImageQuality property.
   * @return compressImages
  **/
  @ApiModelProperty(required = true, value = "If CompressImages set to true, all images in the document are recompressed. The compression is defined by the ImageQuality property.")
  public Boolean getCompressImages() {
    return compressImages;
  }

  public void setCompressImages(Boolean compressImages) {
    this.compressImages = compressImages;
  }

  public PdfConvertOptions imageQuality(Integer imageQuality) {
    this.imageQuality = imageQuality;
    return this;
  }

   /**
   * Value in percent where 100% is unchanged quality and image size. To decrease the image size, use ImageQuality less than 100             
   * @return imageQuality
  **/
  @ApiModelProperty(required = true, value = "Value in percent where 100% is unchanged quality and image size. To decrease the image size, use ImageQuality less than 100             ")
  public Integer getImageQuality() {
    return imageQuality;
  }

  public void setImageQuality(Integer imageQuality) {
    this.imageQuality = imageQuality;
  }

  public PdfConvertOptions unembedFonts(Boolean unembedFonts) {
    this.unembedFonts = unembedFonts;
    return this;
  }

   /**
   * Make fonts not embedded if set to true
   * @return unembedFonts
  **/
  @ApiModelProperty(required = true, value = "Make fonts not embedded if set to true")
  public Boolean getUnembedFonts() {
    return unembedFonts;
  }

  public void setUnembedFonts(Boolean unembedFonts) {
    this.unembedFonts = unembedFonts;
  }

  public PdfConvertOptions grayscale(Boolean grayscale) {
    this.grayscale = grayscale;
    return this;
  }

   /**
   * Convert a PDF from RGB colorspace to Grayscale
   * @return grayscale
  **/
  @ApiModelProperty(required = true, value = "Convert a PDF from RGB colorspace to Grayscale")
  public Boolean getGrayscale() {
    return grayscale;
  }

  public void setGrayscale(Boolean grayscale) {
    this.grayscale = grayscale;
  }

  public PdfConvertOptions centerWindow(Boolean centerWindow) {
    this.centerWindow = centerWindow;
    return this;
  }

   /**
   * Specify whether position of the document&#39;s window will be centered on the screen. Default: false.
   * @return centerWindow
  **/
  @ApiModelProperty(required = true, value = "Specify whether position of the document's window will be centered on the screen. Default: false.")
  public Boolean getCenterWindow() {
    return centerWindow;
  }

  public void setCenterWindow(Boolean centerWindow) {
    this.centerWindow = centerWindow;
  }

  public PdfConvertOptions displayDocTitle(Boolean displayDocTitle) {
    this.displayDocTitle = displayDocTitle;
    return this;
  }

   /**
   * Specifying whether document&#39;s window title bar should display document title. Default: false.
   * @return displayDocTitle
  **/
  @ApiModelProperty(required = true, value = "Specifying whether document's window title bar should display document title. Default: false.")
  public Boolean getDisplayDocTitle() {
    return displayDocTitle;
  }

  public void setDisplayDocTitle(Boolean displayDocTitle) {
    this.displayDocTitle = displayDocTitle;
  }

  public PdfConvertOptions fitWindow(Boolean fitWindow) {
    this.fitWindow = fitWindow;
    return this;
  }

   /**
   * Specify whether document window must be resized to fit the first displayed page. Default: false.
   * @return fitWindow
  **/
  @ApiModelProperty(required = true, value = "Specify whether document window must be resized to fit the first displayed page. Default: false.")
  public Boolean getFitWindow() {
    return fitWindow;
  }

  public void setFitWindow(Boolean fitWindow) {
    this.fitWindow = fitWindow;
  }

  public PdfConvertOptions hideMenubar(Boolean hideMenubar) {
    this.hideMenubar = hideMenubar;
    return this;
  }

   /**
   * Specify whether menu bar should be hidden when document is active. Default: false.
   * @return hideMenubar
  **/
  @ApiModelProperty(required = true, value = "Specify whether menu bar should be hidden when document is active. Default: false.")
  public Boolean getHideMenubar() {
    return hideMenubar;
  }

  public void setHideMenubar(Boolean hideMenubar) {
    this.hideMenubar = hideMenubar;
  }

  public PdfConvertOptions hideToolBar(Boolean hideToolBar) {
    this.hideToolBar = hideToolBar;
    return this;
  }

   /**
   * Specifying whether toolbar should be hidden when document is active. Default: false.
   * @return hideToolBar
  **/
  @ApiModelProperty(required = true, value = "Specifying whether toolbar should be hidden when document is active. Default: false.")
  public Boolean getHideToolBar() {
    return hideToolBar;
  }

  public void setHideToolBar(Boolean hideToolBar) {
    this.hideToolBar = hideToolBar;
  }

  public PdfConvertOptions hideWindowUI(Boolean hideWindowUI) {
    this.hideWindowUI = hideWindowUI;
    return this;
  }

   /**
   * Specify whether user interface elements should be hidden when document is active. Default: false.
   * @return hideWindowUI
  **/
  @ApiModelProperty(required = true, value = "Specify whether user interface elements should be hidden when document is active. Default: false.")
  public Boolean getHideWindowUI() {
    return hideWindowUI;
  }

  public void setHideWindowUI(Boolean hideWindowUI) {
    this.hideWindowUI = hideWindowUI;
  }

  public PdfConvertOptions bookmarksOutlineLevel(Integer bookmarksOutlineLevel) {
    this.bookmarksOutlineLevel = bookmarksOutlineLevel;
    return this;
  }

   /**
   * Specifies the default level in the document outline at which to display Word bookmarks. Default is 0. Valid range is 0 to 9.
   * @return bookmarksOutlineLevel
  **/
  @ApiModelProperty(required = true, value = "Specifies the default level in the document outline at which to display Word bookmarks. Default is 0. Valid range is 0 to 9.")
  public Integer getBookmarksOutlineLevel() {
    return bookmarksOutlineLevel;
  }

  public void setBookmarksOutlineLevel(Integer bookmarksOutlineLevel) {
    this.bookmarksOutlineLevel = bookmarksOutlineLevel;
  }

  public PdfConvertOptions headingsOutlineLevels(Integer headingsOutlineLevels) {
    this.headingsOutlineLevels = headingsOutlineLevels;
    return this;
  }

   /**
   * Specifies how many levels of headings (paragraphs formatted with the Heading styles) to include in the document outline. Default is 0. Valid range is 0 to 9.
   * @return headingsOutlineLevels
  **/
  @ApiModelProperty(required = true, value = "Specifies how many levels of headings (paragraphs formatted with the Heading styles) to include in the document outline. Default is 0. Valid range is 0 to 9.")
  public Integer getHeadingsOutlineLevels() {
    return headingsOutlineLevels;
  }

  public void setHeadingsOutlineLevels(Integer headingsOutlineLevels) {
    this.headingsOutlineLevels = headingsOutlineLevels;
  }

  public PdfConvertOptions expandedOutlineLevels(Integer expandedOutlineLevels) {
    this.expandedOutlineLevels = expandedOutlineLevels;
    return this;
  }

   /**
   * Specifies how many levels in the document outline to show expanded when the file is viewed. Default is 0. Valid range is 0 to 9. Note that this options will not work when saving to XPS.
   * @return expandedOutlineLevels
  **/
  @ApiModelProperty(required = true, value = "Specifies how many levels in the document outline to show expanded when the file is viewed. Default is 0. Valid range is 0 to 9. Note that this options will not work when saving to XPS.")
  public Integer getExpandedOutlineLevels() {
    return expandedOutlineLevels;
  }

  public void setExpandedOutlineLevels(Integer expandedOutlineLevels) {
    this.expandedOutlineLevels = expandedOutlineLevels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfConvertOptions pdfConvertOptions = (PdfConvertOptions) o;
    return Objects.equals(this.width, pdfConvertOptions.width) &&
        Objects.equals(this.height, pdfConvertOptions.height) &&
        Objects.equals(this.dpi, pdfConvertOptions.dpi) &&
        Objects.equals(this.password, pdfConvertOptions.password) &&
        Objects.equals(this.marginTop, pdfConvertOptions.marginTop) &&
        Objects.equals(this.marginBottom, pdfConvertOptions.marginBottom) &&
        Objects.equals(this.marginLeft, pdfConvertOptions.marginLeft) &&
        Objects.equals(this.marginRight, pdfConvertOptions.marginRight) &&
        Objects.equals(this.removePdfaCompliance, pdfConvertOptions.removePdfaCompliance) &&
        Objects.equals(this.zoom, pdfConvertOptions.zoom) &&
        Objects.equals(this.linearize, pdfConvertOptions.linearize) &&
        Objects.equals(this.linkDuplicateStreams, pdfConvertOptions.linkDuplicateStreams) &&
        Objects.equals(this.removeUnusedObjects, pdfConvertOptions.removeUnusedObjects) &&
        Objects.equals(this.removeUnusedStreams, pdfConvertOptions.removeUnusedStreams) &&
        Objects.equals(this.compressImages, pdfConvertOptions.compressImages) &&
        Objects.equals(this.imageQuality, pdfConvertOptions.imageQuality) &&
        Objects.equals(this.unembedFonts, pdfConvertOptions.unembedFonts) &&
        Objects.equals(this.grayscale, pdfConvertOptions.grayscale) &&
        Objects.equals(this.centerWindow, pdfConvertOptions.centerWindow) &&
        Objects.equals(this.displayDocTitle, pdfConvertOptions.displayDocTitle) &&
        Objects.equals(this.fitWindow, pdfConvertOptions.fitWindow) &&
        Objects.equals(this.hideMenubar, pdfConvertOptions.hideMenubar) &&
        Objects.equals(this.hideToolBar, pdfConvertOptions.hideToolBar) &&
        Objects.equals(this.hideWindowUI, pdfConvertOptions.hideWindowUI) &&
        Objects.equals(this.bookmarksOutlineLevel, pdfConvertOptions.bookmarksOutlineLevel) &&
        Objects.equals(this.headingsOutlineLevels, pdfConvertOptions.headingsOutlineLevels) &&
        Objects.equals(this.expandedOutlineLevels, pdfConvertOptions.expandedOutlineLevels) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, height, dpi, password, marginTop, marginBottom, marginLeft, marginRight, removePdfaCompliance, zoom, linearize, linkDuplicateStreams, removeUnusedObjects, removeUnusedStreams, compressImages, imageQuality, unembedFonts, grayscale, centerWindow, displayDocTitle, fitWindow, hideMenubar, hideToolBar, hideWindowUI, bookmarksOutlineLevel, headingsOutlineLevels, expandedOutlineLevels, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfConvertOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    dpi: ").append(toIndentedString(dpi)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    marginTop: ").append(toIndentedString(marginTop)).append("\n");
    sb.append("    marginBottom: ").append(toIndentedString(marginBottom)).append("\n");
    sb.append("    marginLeft: ").append(toIndentedString(marginLeft)).append("\n");
    sb.append("    marginRight: ").append(toIndentedString(marginRight)).append("\n");
    sb.append("    removePdfaCompliance: ").append(toIndentedString(removePdfaCompliance)).append("\n");
    sb.append("    zoom: ").append(toIndentedString(zoom)).append("\n");
    sb.append("    linearize: ").append(toIndentedString(linearize)).append("\n");
    sb.append("    linkDuplicateStreams: ").append(toIndentedString(linkDuplicateStreams)).append("\n");
    sb.append("    removeUnusedObjects: ").append(toIndentedString(removeUnusedObjects)).append("\n");
    sb.append("    removeUnusedStreams: ").append(toIndentedString(removeUnusedStreams)).append("\n");
    sb.append("    compressImages: ").append(toIndentedString(compressImages)).append("\n");
    sb.append("    imageQuality: ").append(toIndentedString(imageQuality)).append("\n");
    sb.append("    unembedFonts: ").append(toIndentedString(unembedFonts)).append("\n");
    sb.append("    grayscale: ").append(toIndentedString(grayscale)).append("\n");
    sb.append("    centerWindow: ").append(toIndentedString(centerWindow)).append("\n");
    sb.append("    displayDocTitle: ").append(toIndentedString(displayDocTitle)).append("\n");
    sb.append("    fitWindow: ").append(toIndentedString(fitWindow)).append("\n");
    sb.append("    hideMenubar: ").append(toIndentedString(hideMenubar)).append("\n");
    sb.append("    hideToolBar: ").append(toIndentedString(hideToolBar)).append("\n");
    sb.append("    hideWindowUI: ").append(toIndentedString(hideWindowUI)).append("\n");
    sb.append("    bookmarksOutlineLevel: ").append(toIndentedString(bookmarksOutlineLevel)).append("\n");
    sb.append("    headingsOutlineLevels: ").append(toIndentedString(headingsOutlineLevels)).append("\n");
    sb.append("    expandedOutlineLevels: ").append(toIndentedString(expandedOutlineLevels)).append("\n");
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

