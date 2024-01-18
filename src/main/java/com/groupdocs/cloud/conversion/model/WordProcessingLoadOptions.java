/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="WordProcessingLoadOptions.java">
 *   Copyright (c) 2003-2024 Aspose Pty Ltd
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

  @SerializedName("autoFontSubstitution")
  private Boolean autoFontSubstitution = null;

  @SerializedName("fontSubstitutes")
  private Map<String, String> fontSubstitutes = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("hideWordTrackedChanges")
  private Boolean hideWordTrackedChanges = null;

  @SerializedName("hideComments")
  private Boolean hideComments = null;

  @SerializedName("bookmarksOutlineLevel")
  private Integer bookmarksOutlineLevel = null;

  @SerializedName("headingsOutlineLevels")
  private Integer headingsOutlineLevels = null;

  @SerializedName("expandedOutlineLevels")
  private Integer expandedOutlineLevels = null;

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

  public WordProcessingLoadOptions autoFontSubstitution(Boolean autoFontSubstitution) {
    this.autoFontSubstitution = autoFontSubstitution;
    return this;
  }

   /**
   * If AutoFontSubstitution is disabled, GroupDocs.Conversion uses the DefaultFont for the substitution of missing fonts. If AutoFontSubstitution is enabled, GroupDocs.Conversion evaluates all the related fields in FontInfo (Panose, Sig etc) for the missing font and finds the closest match among the available font sources. Note that font substitution mechanism will override the DefaultFont in cases when FontInfo for the missing font is available in the document. The default value is True.
   * @return autoFontSubstitution
  **/
  @ApiModelProperty(required = true, value = "If AutoFontSubstitution is disabled, GroupDocs.Conversion uses the DefaultFont for the substitution of missing fonts. If AutoFontSubstitution is enabled, GroupDocs.Conversion evaluates all the related fields in FontInfo (Panose, Sig etc) for the missing font and finds the closest match among the available font sources. Note that font substitution mechanism will override the DefaultFont in cases when FontInfo for the missing font is available in the document. The default value is True.")
  public Boolean getAutoFontSubstitution() {
    return autoFontSubstitution;
  }

  public void setAutoFontSubstitution(Boolean autoFontSubstitution) {
    this.autoFontSubstitution = autoFontSubstitution;
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

  public WordProcessingLoadOptions hideComments(Boolean hideComments) {
    this.hideComments = hideComments;
    return this;
  }

   /**
   * Hide comments
   * @return hideComments
  **/
  @ApiModelProperty(required = true, value = "Hide comments")
  public Boolean getHideComments() {
    return hideComments;
  }

  public void setHideComments(Boolean hideComments) {
    this.hideComments = hideComments;
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
        Objects.equals(this.autoFontSubstitution, wordProcessingLoadOptions.autoFontSubstitution) &&
        Objects.equals(this.fontSubstitutes, wordProcessingLoadOptions.fontSubstitutes) &&
        Objects.equals(this.password, wordProcessingLoadOptions.password) &&
        Objects.equals(this.hideWordTrackedChanges, wordProcessingLoadOptions.hideWordTrackedChanges) &&
        Objects.equals(this.hideComments, wordProcessingLoadOptions.hideComments) &&
        Objects.equals(this.bookmarksOutlineLevel, wordProcessingLoadOptions.bookmarksOutlineLevel) &&
        Objects.equals(this.headingsOutlineLevels, wordProcessingLoadOptions.headingsOutlineLevels) &&
        Objects.equals(this.expandedOutlineLevels, wordProcessingLoadOptions.expandedOutlineLevels) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultFont, autoFontSubstitution, fontSubstitutes, password, hideWordTrackedChanges, hideComments, bookmarksOutlineLevel, headingsOutlineLevels, expandedOutlineLevels, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WordProcessingLoadOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    defaultFont: ").append(toIndentedString(defaultFont)).append("\n");
    sb.append("    autoFontSubstitution: ").append(toIndentedString(autoFontSubstitution)).append("\n");
    sb.append("    fontSubstitutes: ").append(toIndentedString(fontSubstitutes)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    hideWordTrackedChanges: ").append(toIndentedString(hideWordTrackedChanges)).append("\n");
    sb.append("    hideComments: ").append(toIndentedString(hideComments)).append("\n");
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

