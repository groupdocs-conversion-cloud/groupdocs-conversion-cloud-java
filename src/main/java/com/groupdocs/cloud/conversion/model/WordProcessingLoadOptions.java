/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="WordProcessingLoadOptions.java">
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * WordProcessing document load options
 */
@ApiModel(description = "WordProcessing document load options")
public class WordProcessingLoadOptions extends LoadOptions {
  @SerializedName("defaultFont")
  private String defaultFont = null;

  @SerializedName("fontSubstitutes")
  private Map<String, String> fontSubstitutes = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("hideWordTrackedChanges")
  private Boolean hideWordTrackedChanges = null;

  @SerializedName("bookmarksOutlineLevel")
  private Integer bookmarksOutlineLevel = null;

  @SerializedName("headingsOutlineLevels")
  private Integer headingsOutlineLevels = null;

  @SerializedName("expandedOutlineLevels")
  private Integer expandedOutlineLevels = null;

  @SerializedName("clearCustomDocumentProperties")
  private Boolean clearCustomDocumentProperties = null;

  @SerializedName("clearBuiltInDocumentProperties")
  private Boolean clearBuiltInDocumentProperties = null;

  @SerializedName("depth")
  private Integer depth = null;

  @SerializedName("convertOwned")
  private Boolean convertOwned = null;

  @SerializedName("convertOwner")
  private Boolean convertOwner = null;

  @SerializedName("autoHyphenation")
  private Boolean autoHyphenation = null;

  @SerializedName("hyphenateCaps")
  private Boolean hyphenateCaps = null;

  @SerializedName("pageNumbering")
  private Boolean pageNumbering = null;

  @SerializedName("preserveDocumentStructure")
  private Boolean preserveDocumentStructure = null;

  @SerializedName("skipExternalResources")
  private Boolean skipExternalResources = null;

  @SerializedName("useTextShaper")
  private Boolean useTextShaper = null;

  @SerializedName("preserveFormFields")
  private Boolean preserveFormFields = null;

  /**
   * Specifies how comments should be displayed in the output document. Default is Balloon.
   */
  @JsonAdapter(CommentDisplayModeEnum.Adapter.class)
  public enum CommentDisplayModeEnum {
    HIDDEN("Hidden"),
    
    BALLOON("Balloon"),
    
    ANNOTATION("Annotation");

    private String value;

    CommentDisplayModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CommentDisplayModeEnum fromValue(String text) {
      for (CommentDisplayModeEnum b : CommentDisplayModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CommentDisplayModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CommentDisplayModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CommentDisplayModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CommentDisplayModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("commentDisplayMode")
  private CommentDisplayModeEnum commentDisplayMode = null;

  @SerializedName("keepDateFieldOriginalValue")
  private Boolean keepDateFieldOriginalValue = null;

  @SerializedName("updateFields")
  private Boolean updateFields = null;

  @SerializedName("updatePageLayout")
  private Boolean updatePageLayout = null;

  @SerializedName("embedTrueTypeFonts")
  private Boolean embedTrueTypeFonts = null;

  @SerializedName("fontInfoSubstitutionEnabled")
  private Boolean fontInfoSubstitutionEnabled = null;

  @SerializedName("fontConfigSubstitutionEnabled")
  private Boolean fontConfigSubstitutionEnabled = null;

  @SerializedName("fontNameSubstitutionEnabled")
  private Boolean fontNameSubstitutionEnabled = null;

  @SerializedName("showFullCommenterName")
  private Boolean showFullCommenterName = null;

  public WordProcessingLoadOptions defaultFont(String defaultFont) {
    this.defaultFont = defaultFont;
    return this;
  }

   /**
   * Default font for Words document. The following font will be used if a font is missing.
   * @return defaultFont
  **/
  @ApiModelProperty(value = "Default font for Words document. The following font will be used if a font is missing.")
  public String getDefaultFont() {
    return defaultFont;
  }

  public void setDefaultFont(String defaultFont) {
    this.defaultFont = defaultFont;
  }

  public WordProcessingLoadOptions fontSubstitutes(Map<String, String> fontSubstitutes) {
    this.fontSubstitutes = fontSubstitutes;
    return this;
  }

  public WordProcessingLoadOptions putFontSubstitutesItem(String key, String fontSubstitutesItem) {
    if (this.fontSubstitutes == null) {
      this.fontSubstitutes = new HashMap<String, String>();
    }
    this.fontSubstitutes.put(key, fontSubstitutesItem);
    return this;
  }

   /**
   * Substitute specific fonts when converting Words document.
   * @return fontSubstitutes
  **/
  @ApiModelProperty(value = "Substitute specific fonts when converting Words document.")
  public Map<String, String> getFontSubstitutes() {
    return fontSubstitutes;
  }

  public void setFontSubstitutes(Map<String, String> fontSubstitutes) {
    this.fontSubstitutes = fontSubstitutes;
  }

  public WordProcessingLoadOptions password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Set password to unprotect protected document
   * @return password
  **/
  @ApiModelProperty(value = "Set password to unprotect protected document")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public WordProcessingLoadOptions hideWordTrackedChanges(Boolean hideWordTrackedChanges) {
    this.hideWordTrackedChanges = hideWordTrackedChanges;
    return this;
  }

   /**
   * Hide markup and track changes for Word documents
   * @return hideWordTrackedChanges
  **/
  @ApiModelProperty(required = true, value = "Hide markup and track changes for Word documents")
  public Boolean getHideWordTrackedChanges() {
    return hideWordTrackedChanges;
  }

  public void setHideWordTrackedChanges(Boolean hideWordTrackedChanges) {
    this.hideWordTrackedChanges = hideWordTrackedChanges;
  }

  public WordProcessingLoadOptions bookmarksOutlineLevel(Integer bookmarksOutlineLevel) {
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

  public WordProcessingLoadOptions headingsOutlineLevels(Integer headingsOutlineLevels) {
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

  public WordProcessingLoadOptions expandedOutlineLevels(Integer expandedOutlineLevels) {
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

  public WordProcessingLoadOptions clearCustomDocumentProperties(Boolean clearCustomDocumentProperties) {
    this.clearCustomDocumentProperties = clearCustomDocumentProperties;
    return this;
  }

   /**
   * Clear custom document properties. Default is false.
   * @return clearCustomDocumentProperties
  **/
  @ApiModelProperty(required = true, value = "Clear custom document properties. Default is false.")
  public Boolean getClearCustomDocumentProperties() {
    return clearCustomDocumentProperties;
  }

  public void setClearCustomDocumentProperties(Boolean clearCustomDocumentProperties) {
    this.clearCustomDocumentProperties = clearCustomDocumentProperties;
  }

  public WordProcessingLoadOptions clearBuiltInDocumentProperties(Boolean clearBuiltInDocumentProperties) {
    this.clearBuiltInDocumentProperties = clearBuiltInDocumentProperties;
    return this;
  }

   /**
   * Clear built-in document properties. Default is false.
   * @return clearBuiltInDocumentProperties
  **/
  @ApiModelProperty(required = true, value = "Clear built-in document properties. Default is false.")
  public Boolean getClearBuiltInDocumentProperties() {
    return clearBuiltInDocumentProperties;
  }

  public void setClearBuiltInDocumentProperties(Boolean clearBuiltInDocumentProperties) {
    this.clearBuiltInDocumentProperties = clearBuiltInDocumentProperties;
  }

  public WordProcessingLoadOptions depth(Integer depth) {
    this.depth = depth;
    return this;
  }

   /**
   * Option to control how many levels in depth to perform conversion. Default: 1.
   * @return depth
  **/
  @ApiModelProperty(required = true, value = "Option to control how many levels in depth to perform conversion. Default: 1.")
  public Integer getDepth() {
    return depth;
  }

  public void setDepth(Integer depth) {
    this.depth = depth;
  }

  public WordProcessingLoadOptions convertOwned(Boolean convertOwned) {
    this.convertOwned = convertOwned;
    return this;
  }

   /**
   * Option to control whether the owned documents in the documents container must be converted
   * @return convertOwned
  **/
  @ApiModelProperty(required = true, value = "Option to control whether the owned documents in the documents container must be converted")
  public Boolean getConvertOwned() {
    return convertOwned;
  }

  public void setConvertOwned(Boolean convertOwned) {
    this.convertOwned = convertOwned;
  }

  public WordProcessingLoadOptions convertOwner(Boolean convertOwner) {
    this.convertOwner = convertOwner;
    return this;
  }

   /**
   * Option to control whether the documents container itself must be converted If this property is true the documents container will be the first converted document. Default is true.
   * @return convertOwner
  **/
  @ApiModelProperty(required = true, value = "Option to control whether the documents container itself must be converted If this property is true the documents container will be the first converted document. Default is true.")
  public Boolean getConvertOwner() {
    return convertOwner;
  }

  public void setConvertOwner(Boolean convertOwner) {
    this.convertOwner = convertOwner;
  }

  public WordProcessingLoadOptions autoHyphenation(Boolean autoHyphenation) {
    this.autoHyphenation = autoHyphenation;
    return this;
  }

   /**
   * Gets or sets value determining whether automatic hyphenation is turned on for the document. Default value for this property is false.
   * @return autoHyphenation
  **/
  @ApiModelProperty(required = true, value = "Gets or sets value determining whether automatic hyphenation is turned on for the document. Default value for this property is false.")
  public Boolean getAutoHyphenation() {
    return autoHyphenation;
  }

  public void setAutoHyphenation(Boolean autoHyphenation) {
    this.autoHyphenation = autoHyphenation;
  }

  public WordProcessingLoadOptions hyphenateCaps(Boolean hyphenateCaps) {
    this.hyphenateCaps = hyphenateCaps;
    return this;
  }

   /**
   * Gets or sets value determining whether words written in all capital letters are hyphenated. Default value for this property is true.
   * @return hyphenateCaps
  **/
  @ApiModelProperty(required = true, value = "Gets or sets value determining whether words written in all capital letters are hyphenated. Default value for this property is true.")
  public Boolean getHyphenateCaps() {
    return hyphenateCaps;
  }

  public void setHyphenateCaps(Boolean hyphenateCaps) {
    this.hyphenateCaps = hyphenateCaps;
  }

  public WordProcessingLoadOptions pageNumbering(Boolean pageNumbering) {
    this.pageNumbering = pageNumbering;
    return this;
  }

   /**
   * Enable or disable generation of page numbering in converted document. Default: false
   * @return pageNumbering
  **/
  @ApiModelProperty(required = true, value = "Enable or disable generation of page numbering in converted document. Default: false")
  public Boolean getPageNumbering() {
    return pageNumbering;
  }

  public void setPageNumbering(Boolean pageNumbering) {
    this.pageNumbering = pageNumbering;
  }

  public WordProcessingLoadOptions preserveDocumentStructure(Boolean preserveDocumentStructure) {
    this.preserveDocumentStructure = preserveDocumentStructure;
    return this;
  }

   /**
   * Determines whether the document structure should be preserved when converting to PDF (default is false).
   * @return preserveDocumentStructure
  **/
  @ApiModelProperty(required = true, value = "Determines whether the document structure should be preserved when converting to PDF (default is false).")
  public Boolean getPreserveDocumentStructure() {
    return preserveDocumentStructure;
  }

  public void setPreserveDocumentStructure(Boolean preserveDocumentStructure) {
    this.preserveDocumentStructure = preserveDocumentStructure;
  }

  public WordProcessingLoadOptions skipExternalResources(Boolean skipExternalResources) {
    this.skipExternalResources = skipExternalResources;
    return this;
  }

   /**
   * If true all external resource will not be loading. Default is true.
   * @return skipExternalResources
  **/
  @ApiModelProperty(required = true, value = "If true all external resource will not be loading. Default is true.")
  public Boolean getSkipExternalResources() {
    return skipExternalResources;
  }

  public void setSkipExternalResources(Boolean skipExternalResources) {
    this.skipExternalResources = skipExternalResources;
  }

  public WordProcessingLoadOptions useTextShaper(Boolean useTextShaper) {
    this.useTextShaper = useTextShaper;
    return this;
  }

   /**
   * Specifies whether to use a text shaper for better kerning display. Default is false.
   * @return useTextShaper
  **/
  @ApiModelProperty(required = true, value = "Specifies whether to use a text shaper for better kerning display. Default is false.")
  public Boolean getUseTextShaper() {
    return useTextShaper;
  }

  public void setUseTextShaper(Boolean useTextShaper) {
    this.useTextShaper = useTextShaper;
  }

  public WordProcessingLoadOptions preserveFormFields(Boolean preserveFormFields) {
    this.preserveFormFields = preserveFormFields;
    return this;
  }

   /**
   * Specifies whether to preserve Microsoft Word form fields as form fields in PDF or convert them to text. Default is false.
   * @return preserveFormFields
  **/
  @ApiModelProperty(required = true, value = "Specifies whether to preserve Microsoft Word form fields as form fields in PDF or convert them to text. Default is false.")
  public Boolean getPreserveFormFields() {
    return preserveFormFields;
  }

  public void setPreserveFormFields(Boolean preserveFormFields) {
    this.preserveFormFields = preserveFormFields;
  }

  public WordProcessingLoadOptions commentDisplayMode(CommentDisplayModeEnum commentDisplayMode) {
    this.commentDisplayMode = commentDisplayMode;
    return this;
  }

   /**
   * Specifies how comments should be displayed in the output document. Default is Balloon.
   * @return commentDisplayMode
  **/
  @ApiModelProperty(required = true, value = "Specifies how comments should be displayed in the output document. Default is Balloon.")
  public CommentDisplayModeEnum getCommentDisplayMode() {
    return commentDisplayMode;
  }

  public void setCommentDisplayMode(CommentDisplayModeEnum commentDisplayMode) {
    this.commentDisplayMode = commentDisplayMode;
  }

  public WordProcessingLoadOptions keepDateFieldOriginalValue(Boolean keepDateFieldOriginalValue) {
    this.keepDateFieldOriginalValue = keepDateFieldOriginalValue;
    return this;
  }

   /**
   * Keep original value of date field. Default: false
   * @return keepDateFieldOriginalValue
  **/
  @ApiModelProperty(required = true, value = "Keep original value of date field. Default: false")
  public Boolean getKeepDateFieldOriginalValue() {
    return keepDateFieldOriginalValue;
  }

  public void setKeepDateFieldOriginalValue(Boolean keepDateFieldOriginalValue) {
    this.keepDateFieldOriginalValue = keepDateFieldOriginalValue;
  }

  public WordProcessingLoadOptions updateFields(Boolean updateFields) {
    this.updateFields = updateFields;
    return this;
  }

   /**
   * Update fields after loading. Default: false
   * @return updateFields
  **/
  @ApiModelProperty(required = true, value = "Update fields after loading. Default: false")
  public Boolean getUpdateFields() {
    return updateFields;
  }

  public void setUpdateFields(Boolean updateFields) {
    this.updateFields = updateFields;
  }

  public WordProcessingLoadOptions updatePageLayout(Boolean updatePageLayout) {
    this.updatePageLayout = updatePageLayout;
    return this;
  }

   /**
   * Update page layout after loading. Default: false
   * @return updatePageLayout
  **/
  @ApiModelProperty(required = true, value = "Update page layout after loading. Default: false")
  public Boolean getUpdatePageLayout() {
    return updatePageLayout;
  }

  public void setUpdatePageLayout(Boolean updatePageLayout) {
    this.updatePageLayout = updatePageLayout;
  }

  public WordProcessingLoadOptions embedTrueTypeFonts(Boolean embedTrueTypeFonts) {
    this.embedTrueTypeFonts = embedTrueTypeFonts;
    return this;
  }

   /**
   * If EmbedTrueTypeFonts is true, GroupDocs.Conversion Cloud embed true type fonts in the output document. Default: true
   * @return embedTrueTypeFonts
  **/
  @ApiModelProperty(required = true, value = "If EmbedTrueTypeFonts is true, GroupDocs.Conversion Cloud embed true type fonts in the output document. Default: true")
  public Boolean getEmbedTrueTypeFonts() {
    return embedTrueTypeFonts;
  }

  public void setEmbedTrueTypeFonts(Boolean embedTrueTypeFonts) {
    this.embedTrueTypeFonts = embedTrueTypeFonts;
  }

  public WordProcessingLoadOptions fontInfoSubstitutionEnabled(Boolean fontInfoSubstitutionEnabled) {
    this.fontInfoSubstitutionEnabled = fontInfoSubstitutionEnabled;
    return this;
  }

   /**
   * Automatically substitutes missing fonts based on FontInfo in the document. Default: false.
   * @return fontInfoSubstitutionEnabled
  **/
  @ApiModelProperty(required = true, value = "Automatically substitutes missing fonts based on FontInfo in the document. Default: false.")
  public Boolean getFontInfoSubstitutionEnabled() {
    return fontInfoSubstitutionEnabled;
  }

  public void setFontInfoSubstitutionEnabled(Boolean fontInfoSubstitutionEnabled) {
    this.fontInfoSubstitutionEnabled = fontInfoSubstitutionEnabled;
  }

  public WordProcessingLoadOptions fontConfigSubstitutionEnabled(Boolean fontConfigSubstitutionEnabled) {
    this.fontConfigSubstitutionEnabled = fontConfigSubstitutionEnabled;
    return this;
  }

   /**
   * Automatically substitutes missing fonts based on FontConfig in the system. Default: false.
   * @return fontConfigSubstitutionEnabled
  **/
  @ApiModelProperty(required = true, value = "Automatically substitutes missing fonts based on FontConfig in the system. Default: false.")
  public Boolean getFontConfigSubstitutionEnabled() {
    return fontConfigSubstitutionEnabled;
  }

  public void setFontConfigSubstitutionEnabled(Boolean fontConfigSubstitutionEnabled) {
    this.fontConfigSubstitutionEnabled = fontConfigSubstitutionEnabled;
  }

  public WordProcessingLoadOptions fontNameSubstitutionEnabled(Boolean fontNameSubstitutionEnabled) {
    this.fontNameSubstitutionEnabled = fontNameSubstitutionEnabled;
    return this;
  }

   /**
   * Automatically substitutes missing fonts based on the font name. Default: false.
   * @return fontNameSubstitutionEnabled
  **/
  @ApiModelProperty(required = true, value = "Automatically substitutes missing fonts based on the font name. Default: false.")
  public Boolean getFontNameSubstitutionEnabled() {
    return fontNameSubstitutionEnabled;
  }

  public void setFontNameSubstitutionEnabled(Boolean fontNameSubstitutionEnabled) {
    this.fontNameSubstitutionEnabled = fontNameSubstitutionEnabled;
  }

  public WordProcessingLoadOptions showFullCommenterName(Boolean showFullCommenterName) {
    this.showFullCommenterName = showFullCommenterName;
    return this;
  }

   /**
   * Show full commenter name in comments. Default is false.
   * @return showFullCommenterName
  **/
  @ApiModelProperty(required = true, value = "Show full commenter name in comments. Default is false.")
  public Boolean getShowFullCommenterName() {
    return showFullCommenterName;
  }

  public void setShowFullCommenterName(Boolean showFullCommenterName) {
    this.showFullCommenterName = showFullCommenterName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WordProcessingLoadOptions wordProcessingLoadOptions = (WordProcessingLoadOptions) o;
    return Objects.equals(this.defaultFont, wordProcessingLoadOptions.defaultFont) &&
        Objects.equals(this.fontSubstitutes, wordProcessingLoadOptions.fontSubstitutes) &&
        Objects.equals(this.password, wordProcessingLoadOptions.password) &&
        Objects.equals(this.hideWordTrackedChanges, wordProcessingLoadOptions.hideWordTrackedChanges) &&
        Objects.equals(this.bookmarksOutlineLevel, wordProcessingLoadOptions.bookmarksOutlineLevel) &&
        Objects.equals(this.headingsOutlineLevels, wordProcessingLoadOptions.headingsOutlineLevels) &&
        Objects.equals(this.expandedOutlineLevels, wordProcessingLoadOptions.expandedOutlineLevels) &&
        Objects.equals(this.clearCustomDocumentProperties, wordProcessingLoadOptions.clearCustomDocumentProperties) &&
        Objects.equals(this.clearBuiltInDocumentProperties, wordProcessingLoadOptions.clearBuiltInDocumentProperties) &&
        Objects.equals(this.depth, wordProcessingLoadOptions.depth) &&
        Objects.equals(this.convertOwned, wordProcessingLoadOptions.convertOwned) &&
        Objects.equals(this.convertOwner, wordProcessingLoadOptions.convertOwner) &&
        Objects.equals(this.autoHyphenation, wordProcessingLoadOptions.autoHyphenation) &&
        Objects.equals(this.hyphenateCaps, wordProcessingLoadOptions.hyphenateCaps) &&
        Objects.equals(this.pageNumbering, wordProcessingLoadOptions.pageNumbering) &&
        Objects.equals(this.preserveDocumentStructure, wordProcessingLoadOptions.preserveDocumentStructure) &&
        Objects.equals(this.skipExternalResources, wordProcessingLoadOptions.skipExternalResources) &&
        Objects.equals(this.useTextShaper, wordProcessingLoadOptions.useTextShaper) &&
        Objects.equals(this.preserveFormFields, wordProcessingLoadOptions.preserveFormFields) &&
        Objects.equals(this.commentDisplayMode, wordProcessingLoadOptions.commentDisplayMode) &&
        Objects.equals(this.keepDateFieldOriginalValue, wordProcessingLoadOptions.keepDateFieldOriginalValue) &&
        Objects.equals(this.updateFields, wordProcessingLoadOptions.updateFields) &&
        Objects.equals(this.updatePageLayout, wordProcessingLoadOptions.updatePageLayout) &&
        Objects.equals(this.embedTrueTypeFonts, wordProcessingLoadOptions.embedTrueTypeFonts) &&
        Objects.equals(this.fontInfoSubstitutionEnabled, wordProcessingLoadOptions.fontInfoSubstitutionEnabled) &&
        Objects.equals(this.fontConfigSubstitutionEnabled, wordProcessingLoadOptions.fontConfigSubstitutionEnabled) &&
        Objects.equals(this.fontNameSubstitutionEnabled, wordProcessingLoadOptions.fontNameSubstitutionEnabled) &&
        Objects.equals(this.showFullCommenterName, wordProcessingLoadOptions.showFullCommenterName) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultFont, fontSubstitutes, password, hideWordTrackedChanges, bookmarksOutlineLevel, headingsOutlineLevels, expandedOutlineLevels, clearCustomDocumentProperties, clearBuiltInDocumentProperties, depth, convertOwned, convertOwner, autoHyphenation, hyphenateCaps, pageNumbering, preserveDocumentStructure, skipExternalResources, useTextShaper, preserveFormFields, commentDisplayMode, keepDateFieldOriginalValue, updateFields, updatePageLayout, embedTrueTypeFonts, fontInfoSubstitutionEnabled, fontConfigSubstitutionEnabled, fontNameSubstitutionEnabled, showFullCommenterName, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WordProcessingLoadOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    defaultFont: ").append(toIndentedString(defaultFont)).append("\n");
    sb.append("    fontSubstitutes: ").append(toIndentedString(fontSubstitutes)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    hideWordTrackedChanges: ").append(toIndentedString(hideWordTrackedChanges)).append("\n");
    sb.append("    bookmarksOutlineLevel: ").append(toIndentedString(bookmarksOutlineLevel)).append("\n");
    sb.append("    headingsOutlineLevels: ").append(toIndentedString(headingsOutlineLevels)).append("\n");
    sb.append("    expandedOutlineLevels: ").append(toIndentedString(expandedOutlineLevels)).append("\n");
    sb.append("    clearCustomDocumentProperties: ").append(toIndentedString(clearCustomDocumentProperties)).append("\n");
    sb.append("    clearBuiltInDocumentProperties: ").append(toIndentedString(clearBuiltInDocumentProperties)).append("\n");
    sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
    sb.append("    convertOwned: ").append(toIndentedString(convertOwned)).append("\n");
    sb.append("    convertOwner: ").append(toIndentedString(convertOwner)).append("\n");
    sb.append("    autoHyphenation: ").append(toIndentedString(autoHyphenation)).append("\n");
    sb.append("    hyphenateCaps: ").append(toIndentedString(hyphenateCaps)).append("\n");
    sb.append("    pageNumbering: ").append(toIndentedString(pageNumbering)).append("\n");
    sb.append("    preserveDocumentStructure: ").append(toIndentedString(preserveDocumentStructure)).append("\n");
    sb.append("    skipExternalResources: ").append(toIndentedString(skipExternalResources)).append("\n");
    sb.append("    useTextShaper: ").append(toIndentedString(useTextShaper)).append("\n");
    sb.append("    preserveFormFields: ").append(toIndentedString(preserveFormFields)).append("\n");
    sb.append("    commentDisplayMode: ").append(toIndentedString(commentDisplayMode)).append("\n");
    sb.append("    keepDateFieldOriginalValue: ").append(toIndentedString(keepDateFieldOriginalValue)).append("\n");
    sb.append("    updateFields: ").append(toIndentedString(updateFields)).append("\n");
    sb.append("    updatePageLayout: ").append(toIndentedString(updatePageLayout)).append("\n");
    sb.append("    embedTrueTypeFonts: ").append(toIndentedString(embedTrueTypeFonts)).append("\n");
    sb.append("    fontInfoSubstitutionEnabled: ").append(toIndentedString(fontInfoSubstitutionEnabled)).append("\n");
    sb.append("    fontConfigSubstitutionEnabled: ").append(toIndentedString(fontConfigSubstitutionEnabled)).append("\n");
    sb.append("    fontNameSubstitutionEnabled: ").append(toIndentedString(fontNameSubstitutionEnabled)).append("\n");
    sb.append("    showFullCommenterName: ").append(toIndentedString(showFullCommenterName)).append("\n");
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

