/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="SpreadsheetLoadOptions.java">
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
 * Spreadsheet document load options
 */
@ApiModel(description = "Spreadsheet document load options")
public class SpreadsheetLoadOptions extends LoadOptions {
  @SerializedName("defaultFont")
  private String defaultFont = null;

  @SerializedName("fontSubstitutes")
  private Map<String, String> fontSubstitutes = null;

  @SerializedName("showGridLines")
  private Boolean showGridLines = null;

  @SerializedName("showHiddenSheets")
  private Boolean showHiddenSheets = null;

  @SerializedName("onePagePerSheet")
  private Boolean onePagePerSheet = null;

  @SerializedName("convertRange")
  private String convertRange = null;

  @SerializedName("skipEmptyRowsAndColumns")
  private Boolean skipEmptyRowsAndColumns = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("hideComments")
  private Boolean hideComments = null;

  public SpreadsheetLoadOptions defaultFont(String defaultFont) {
    this.defaultFont = defaultFont;
    return this;
  }

   /**
   * Default font for Cells document. The following font will be used if a font is missing.
   * @return defaultFont
  **/
  @ApiModelProperty(value = "Default font for Cells document. The following font will be used if a font is missing.")
  public String getDefaultFont() {
    return defaultFont;
  }

  public void setDefaultFont(String defaultFont) {
    this.defaultFont = defaultFont;
  }

  public SpreadsheetLoadOptions fontSubstitutes(Map<String, String> fontSubstitutes) {
    this.fontSubstitutes = fontSubstitutes;
    return this;
  }

  public SpreadsheetLoadOptions putFontSubstitutesItem(String key, String fontSubstitutesItem) {
    if (this.fontSubstitutes == null) {
      this.fontSubstitutes = new HashMap<String, String>();
    }
    this.fontSubstitutes.put(key, fontSubstitutesItem);
    return this;
  }

   /**
   * Substitute specific fonts when converting Cells document.
   * @return fontSubstitutes
  **/
  @ApiModelProperty(value = "Substitute specific fonts when converting Cells document.")
  public Map<String, String> getFontSubstitutes() {
    return fontSubstitutes;
  }

  public void setFontSubstitutes(Map<String, String> fontSubstitutes) {
    this.fontSubstitutes = fontSubstitutes;
  }

  public SpreadsheetLoadOptions showGridLines(Boolean showGridLines) {
    this.showGridLines = showGridLines;
    return this;
  }

   /**
   * Show grid lines when converting Excel files
   * @return showGridLines
  **/
  @ApiModelProperty(required = true, value = "Show grid lines when converting Excel files")
  public Boolean getShowGridLines() {
    return showGridLines;
  }

  public void setShowGridLines(Boolean showGridLines) {
    this.showGridLines = showGridLines;
  }

  public SpreadsheetLoadOptions showHiddenSheets(Boolean showHiddenSheets) {
    this.showHiddenSheets = showHiddenSheets;
    return this;
  }

   /**
   * Show hidden sheets when converting Excel files
   * @return showHiddenSheets
  **/
  @ApiModelProperty(required = true, value = "Show hidden sheets when converting Excel files")
  public Boolean getShowHiddenSheets() {
    return showHiddenSheets;
  }

  public void setShowHiddenSheets(Boolean showHiddenSheets) {
    this.showHiddenSheets = showHiddenSheets;
  }

  public SpreadsheetLoadOptions onePagePerSheet(Boolean onePagePerSheet) {
    this.onePagePerSheet = onePagePerSheet;
    return this;
  }

   /**
   * If OnePagePerSheet is true the content of the sheet will be converted to one page in the PDF document. Default value is true.
   * @return onePagePerSheet
  **/
  @ApiModelProperty(required = true, value = "If OnePagePerSheet is true the content of the sheet will be converted to one page in the PDF document. Default value is true.")
  public Boolean getOnePagePerSheet() {
    return onePagePerSheet;
  }

  public void setOnePagePerSheet(Boolean onePagePerSheet) {
    this.onePagePerSheet = onePagePerSheet;
  }

  public SpreadsheetLoadOptions convertRange(String convertRange) {
    this.convertRange = convertRange;
    return this;
  }

   /**
   * Convert specific range when converting to other than cells format. Example: \&quot;D1:F8\&quot;
   * @return convertRange
  **/
  @ApiModelProperty(value = "Convert specific range when converting to other than cells format. Example: \"D1:F8\"")
  public String getConvertRange() {
    return convertRange;
  }

  public void setConvertRange(String convertRange) {
    this.convertRange = convertRange;
  }

  public SpreadsheetLoadOptions skipEmptyRowsAndColumns(Boolean skipEmptyRowsAndColumns) {
    this.skipEmptyRowsAndColumns = skipEmptyRowsAndColumns;
    return this;
  }

   /**
   * Skips empty rows and columns when converting. Default is True.
   * @return skipEmptyRowsAndColumns
  **/
  @ApiModelProperty(required = true, value = "Skips empty rows and columns when converting. Default is True.")
  public Boolean getSkipEmptyRowsAndColumns() {
    return skipEmptyRowsAndColumns;
  }

  public void setSkipEmptyRowsAndColumns(Boolean skipEmptyRowsAndColumns) {
    this.skipEmptyRowsAndColumns = skipEmptyRowsAndColumns;
  }

  public SpreadsheetLoadOptions password(String password) {
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

  public SpreadsheetLoadOptions hideComments(Boolean hideComments) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpreadsheetLoadOptions spreadsheetLoadOptions = (SpreadsheetLoadOptions) o;
    return Objects.equals(this.defaultFont, spreadsheetLoadOptions.defaultFont) &&
        Objects.equals(this.fontSubstitutes, spreadsheetLoadOptions.fontSubstitutes) &&
        Objects.equals(this.showGridLines, spreadsheetLoadOptions.showGridLines) &&
        Objects.equals(this.showHiddenSheets, spreadsheetLoadOptions.showHiddenSheets) &&
        Objects.equals(this.onePagePerSheet, spreadsheetLoadOptions.onePagePerSheet) &&
        Objects.equals(this.convertRange, spreadsheetLoadOptions.convertRange) &&
        Objects.equals(this.skipEmptyRowsAndColumns, spreadsheetLoadOptions.skipEmptyRowsAndColumns) &&
        Objects.equals(this.password, spreadsheetLoadOptions.password) &&
        Objects.equals(this.hideComments, spreadsheetLoadOptions.hideComments) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultFont, fontSubstitutes, showGridLines, showHiddenSheets, onePagePerSheet, convertRange, skipEmptyRowsAndColumns, password, hideComments, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpreadsheetLoadOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    defaultFont: ").append(toIndentedString(defaultFont)).append("\n");
    sb.append("    fontSubstitutes: ").append(toIndentedString(fontSubstitutes)).append("\n");
    sb.append("    showGridLines: ").append(toIndentedString(showGridLines)).append("\n");
    sb.append("    showHiddenSheets: ").append(toIndentedString(showHiddenSheets)).append("\n");
    sb.append("    onePagePerSheet: ").append(toIndentedString(onePagePerSheet)).append("\n");
    sb.append("    convertRange: ").append(toIndentedString(convertRange)).append("\n");
    sb.append("    skipEmptyRowsAndColumns: ").append(toIndentedString(skipEmptyRowsAndColumns)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    hideComments: ").append(toIndentedString(hideComments)).append("\n");
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

