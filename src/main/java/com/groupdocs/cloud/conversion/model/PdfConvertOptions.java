/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="PdfConvertOptions.java">
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
import com.groupdocs.cloud.conversion.model.ConvertOptions;
import com.groupdocs.cloud.conversion.model.WatermarkOptions;
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

  /**
   * Set the pdf format of the converted document.
   */
  @JsonAdapter(PdfFormatEnum.Adapter.class)
  public enum PdfFormatEnum {
    DEFAULT("Default"),
    
    PDFA_1A("PdfA_1A"),
    
    PDFA_1B("PdfA_1B"),
    
    PDFA_2A("PdfA_2A"),
    
    PDFA_3A("PdfA_3A"),
    
    PDFA_2B("PdfA_2B"),
    
    PDFA_2U("PdfA_2U"),
    
    PDFA_3B("PdfA_3B"),
    
    PDFA_3U("PdfA_3U"),
    
    V1_3("v1_3"),
    
    V1_4("v1_4"),
    
    V1_5("v1_5"),
    
    V1_6("v1_6"),
    
    V1_7("v1_7"),
    
    PDFX_1A("PdfX_1A"),
    
    PDFX3("PdfX3");

    private String value;

    PdfFormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PdfFormatEnum fromValue(String text) {
      for (PdfFormatEnum b : PdfFormatEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PdfFormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PdfFormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PdfFormatEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PdfFormatEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("pdfFormat")
  private PdfFormatEnum pdfFormat = null;

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

  /**
   * Sets reading order of text: L2R (left to right) or R2L (right to left). Default: L2R.
   */
  @JsonAdapter(DirectionEnum.Adapter.class)
  public enum DirectionEnum {
    L2R("L2R"),
    
    R2L("R2L");

    private String value;

    DirectionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DirectionEnum fromValue(String text) {
      for (DirectionEnum b : DirectionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DirectionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DirectionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DirectionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DirectionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("direction")
  private DirectionEnum direction = null;

  @SerializedName("displayDocTitle")
  private Boolean displayDocTitle = null;

  @SerializedName("fitWindow")
  private Boolean fitWindow = null;

  @SerializedName("hideMenuBar")
  private Boolean hideMenuBar = null;

  @SerializedName("hideToolBar")
  private Boolean hideToolBar = null;

  @SerializedName("hideWindowUI")
  private Boolean hideWindowUI = null;

  /**
   * Sets page mode, specifying how to display the document on exiting full-screen mode.
   */
  @JsonAdapter(NonFullScreenPageModeEnum.Adapter.class)
  public enum NonFullScreenPageModeEnum {
    USENONE("UseNone"),
    
    USEOUTLINES("UseOutlines"),
    
    USETHUMBS("UseThumbs"),
    
    FULLSCREEN("FullScreen"),
    
    USEOC("UseOC"),
    
    USEATTACHMENTS("UseAttachments");

    private String value;

    NonFullScreenPageModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NonFullScreenPageModeEnum fromValue(String text) {
      for (NonFullScreenPageModeEnum b : NonFullScreenPageModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<NonFullScreenPageModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NonFullScreenPageModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NonFullScreenPageModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return NonFullScreenPageModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("nonFullScreenPageMode")
  private NonFullScreenPageModeEnum nonFullScreenPageMode = null;

  /**
   * Sets page layout which shall be used when the document is opened.
   */
  @JsonAdapter(PageLayoutEnum.Adapter.class)
  public enum PageLayoutEnum {
    DEFAULT("Default"),
    
    SINGLEPAGE("SinglePage"),
    
    ONECOLUMN("OneColumn"),
    
    TWOCOLUMNLEFT("TwoColumnLeft"),
    
    TWOCOLUMNRIGHT("TwoColumnRight"),
    
    TWOPAGELEFT("TwoPageLeft"),
    
    TWOPAGERIGHT("TwoPageRight");

    private String value;

    PageLayoutEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PageLayoutEnum fromValue(String text) {
      for (PageLayoutEnum b : PageLayoutEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PageLayoutEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PageLayoutEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PageLayoutEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PageLayoutEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("pageLayout")
  private PageLayoutEnum pageLayout = null;

  /**
   * Sets page mode, specifying how document should be displayed when opened.
   */
  @JsonAdapter(PageModeEnum.Adapter.class)
  public enum PageModeEnum {
    USENONE("UseNone"),
    
    USEOUTLINES("UseOutlines"),
    
    USETHUMBS("UseThumbs"),
    
    FULLSCREEN("FullScreen"),
    
    USEOC("UseOC"),
    
    USEATTACHMENTS("UseAttachments");

    private String value;

    PageModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PageModeEnum fromValue(String text) {
      for (PageModeEnum b : PageModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PageModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PageModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PageModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PageModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("pageMode")
  private PageModeEnum pageMode = null;

  /**
   * Rotate page
   */
  @JsonAdapter(RotateEnum.Adapter.class)
  public enum RotateEnum {
    NONE("None"),
    
    ON90("On90"),
    
    ON180("On180"),
    
    ON270("On270");

    private String value;

    RotateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RotateEnum fromValue(String text) {
      for (RotateEnum b : RotateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RotateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RotateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RotateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RotateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("rotate")
  private RotateEnum rotate = null;

  @SerializedName("watermarkOptions")
  private WatermarkOptions watermarkOptions = null;

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

  public PdfConvertOptions pdfFormat(PdfFormatEnum pdfFormat) {
    this.pdfFormat = pdfFormat;
    return this;
  }

   /**
   * Set the pdf format of the converted document.
   * @return pdfFormat
  **/
  @ApiModelProperty(required = true, value = "Set the pdf format of the converted document.")
  public PdfFormatEnum getPdfFormat() {
    return pdfFormat;
  }

  public void setPdfFormat(PdfFormatEnum pdfFormat) {
    this.pdfFormat = pdfFormat;
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

  public PdfConvertOptions direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }

   /**
   * Sets reading order of text: L2R (left to right) or R2L (right to left). Default: L2R.
   * @return direction
  **/
  @ApiModelProperty(required = true, value = "Sets reading order of text: L2R (left to right) or R2L (right to left). Default: L2R.")
  public DirectionEnum getDirection() {
    return direction;
  }

  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
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

  public PdfConvertOptions hideMenuBar(Boolean hideMenuBar) {
    this.hideMenuBar = hideMenuBar;
    return this;
  }

   /**
   * Specify whether menu bar should be hidden when document is active. Default: false.
   * @return hideMenuBar
  **/
  @ApiModelProperty(required = true, value = "Specify whether menu bar should be hidden when document is active. Default: false.")
  public Boolean getHideMenuBar() {
    return hideMenuBar;
  }

  public void setHideMenuBar(Boolean hideMenuBar) {
    this.hideMenuBar = hideMenuBar;
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

  public PdfConvertOptions nonFullScreenPageMode(NonFullScreenPageModeEnum nonFullScreenPageMode) {
    this.nonFullScreenPageMode = nonFullScreenPageMode;
    return this;
  }

   /**
   * Sets page mode, specifying how to display the document on exiting full-screen mode.
   * @return nonFullScreenPageMode
  **/
  @ApiModelProperty(required = true, value = "Sets page mode, specifying how to display the document on exiting full-screen mode.")
  public NonFullScreenPageModeEnum getNonFullScreenPageMode() {
    return nonFullScreenPageMode;
  }

  public void setNonFullScreenPageMode(NonFullScreenPageModeEnum nonFullScreenPageMode) {
    this.nonFullScreenPageMode = nonFullScreenPageMode;
  }

  public PdfConvertOptions pageLayout(PageLayoutEnum pageLayout) {
    this.pageLayout = pageLayout;
    return this;
  }

   /**
   * Sets page layout which shall be used when the document is opened.
   * @return pageLayout
  **/
  @ApiModelProperty(required = true, value = "Sets page layout which shall be used when the document is opened.")
  public PageLayoutEnum getPageLayout() {
    return pageLayout;
  }

  public void setPageLayout(PageLayoutEnum pageLayout) {
    this.pageLayout = pageLayout;
  }

  public PdfConvertOptions pageMode(PageModeEnum pageMode) {
    this.pageMode = pageMode;
    return this;
  }

   /**
   * Sets page mode, specifying how document should be displayed when opened.
   * @return pageMode
  **/
  @ApiModelProperty(required = true, value = "Sets page mode, specifying how document should be displayed when opened.")
  public PageModeEnum getPageMode() {
    return pageMode;
  }

  public void setPageMode(PageModeEnum pageMode) {
    this.pageMode = pageMode;
  }

  public PdfConvertOptions rotate(RotateEnum rotate) {
    this.rotate = rotate;
    return this;
  }

   /**
   * Rotate page
   * @return rotate
  **/
  @ApiModelProperty(required = true, value = "Rotate page")
  public RotateEnum getRotate() {
    return rotate;
  }

  public void setRotate(RotateEnum rotate) {
    this.rotate = rotate;
  }

  public PdfConvertOptions watermarkOptions(WatermarkOptions watermarkOptions) {
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
    PdfConvertOptions pdfConvertOptions = (PdfConvertOptions) o;
    return Objects.equals(this.width, pdfConvertOptions.width) &&
        Objects.equals(this.height, pdfConvertOptions.height) &&
        Objects.equals(this.dpi, pdfConvertOptions.dpi) &&
        Objects.equals(this.password, pdfConvertOptions.password) &&
        Objects.equals(this.marginTop, pdfConvertOptions.marginTop) &&
        Objects.equals(this.marginBottom, pdfConvertOptions.marginBottom) &&
        Objects.equals(this.marginLeft, pdfConvertOptions.marginLeft) &&
        Objects.equals(this.marginRight, pdfConvertOptions.marginRight) &&
        Objects.equals(this.pdfFormat, pdfConvertOptions.pdfFormat) &&
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
        Objects.equals(this.direction, pdfConvertOptions.direction) &&
        Objects.equals(this.displayDocTitle, pdfConvertOptions.displayDocTitle) &&
        Objects.equals(this.fitWindow, pdfConvertOptions.fitWindow) &&
        Objects.equals(this.hideMenuBar, pdfConvertOptions.hideMenuBar) &&
        Objects.equals(this.hideToolBar, pdfConvertOptions.hideToolBar) &&
        Objects.equals(this.hideWindowUI, pdfConvertOptions.hideWindowUI) &&
        Objects.equals(this.nonFullScreenPageMode, pdfConvertOptions.nonFullScreenPageMode) &&
        Objects.equals(this.pageLayout, pdfConvertOptions.pageLayout) &&
        Objects.equals(this.pageMode, pdfConvertOptions.pageMode) &&
        Objects.equals(this.rotate, pdfConvertOptions.rotate) &&
        Objects.equals(this.watermarkOptions, pdfConvertOptions.watermarkOptions) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, height, dpi, password, marginTop, marginBottom, marginLeft, marginRight, pdfFormat, removePdfaCompliance, zoom, linearize, linkDuplicateStreams, removeUnusedObjects, removeUnusedStreams, compressImages, imageQuality, unembedFonts, grayscale, centerWindow, direction, displayDocTitle, fitWindow, hideMenuBar, hideToolBar, hideWindowUI, nonFullScreenPageMode, pageLayout, pageMode, rotate, watermarkOptions, super.hashCode());
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
    sb.append("    pdfFormat: ").append(toIndentedString(pdfFormat)).append("\n");
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
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    displayDocTitle: ").append(toIndentedString(displayDocTitle)).append("\n");
    sb.append("    fitWindow: ").append(toIndentedString(fitWindow)).append("\n");
    sb.append("    hideMenuBar: ").append(toIndentedString(hideMenuBar)).append("\n");
    sb.append("    hideToolBar: ").append(toIndentedString(hideToolBar)).append("\n");
    sb.append("    hideWindowUI: ").append(toIndentedString(hideWindowUI)).append("\n");
    sb.append("    nonFullScreenPageMode: ").append(toIndentedString(nonFullScreenPageMode)).append("\n");
    sb.append("    pageLayout: ").append(toIndentedString(pageLayout)).append("\n");
    sb.append("    pageMode: ").append(toIndentedString(pageMode)).append("\n");
    sb.append("    rotate: ").append(toIndentedString(rotate)).append("\n");
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

