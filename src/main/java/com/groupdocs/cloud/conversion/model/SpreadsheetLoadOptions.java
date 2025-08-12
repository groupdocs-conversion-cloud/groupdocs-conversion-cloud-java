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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Spreadsheet document load options
 */
@ApiModel(description = "Spreadsheet document load options")
public class SpreadsheetLoadOptions extends LoadOptions {
  @SerializedName("clearCustomDocumentProperties")
  private Boolean clearCustomDocumentProperties = null;

  @SerializedName("clearBuiltInDocumentProperties")
  private Boolean clearBuiltInDocumentProperties = null;

  @SerializedName("rowsPerPage")
  private Integer rowsPerPage = null;

  @SerializedName("columnsPerPage")
  private Integer columnsPerPage = null;

  @SerializedName("autoFitRows")
  private Boolean autoFitRows = null;

  @SerializedName("allColumnsInOnePagePerSheet")
  private Boolean allColumnsInOnePagePerSheet = null;

  @SerializedName("cultureInfo")
  private String cultureInfo = null;

  @SerializedName("checkExcelRestriction")
  private Boolean checkExcelRestriction = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("skipEmptyRowsAndColumns")
  private Boolean skipEmptyRowsAndColumns = null;

  @SerializedName("convertRange")
  private String convertRange = null;

  @SerializedName("optimizePdfSize")
  private Boolean optimizePdfSize = null;

  @SerializedName("onePagePerSheet")
  private Boolean onePagePerSheet = null;

  @SerializedName("showHiddenSheets")
  private Boolean showHiddenSheets = null;

  @SerializedName("showGridLines")
  private Boolean showGridLines = null;

  @SerializedName("fontSubstitutes")
  private Map<String, String> fontSubstitutes = null;

  @SerializedName("defaultFont")
  private String defaultFont = null;

  @SerializedName("sheetIndexes")
  private List<Integer> sheetIndexes = null;

  @SerializedName("sheets")
  private List<String> sheets = null;

  /**
   * Represents the way comments are printed with the sheet. Default is PrintNoComments.
   */
  @JsonAdapter(PrintCommentsEnum.Adapter.class)
  public enum PrintCommentsEnum {
    PRINTINPLACE("PrintInPlace"),
    
    PRINTNOCOMMENTS("PrintNoComments"),
    
    PRINTSHEETEND("PrintSheetEnd"),
    
    PRINTWITHTHREADEDCOMMENTS("PrintWithThreadedComments");

    private String value;

    PrintCommentsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PrintCommentsEnum fromValue(String text) {
      for (PrintCommentsEnum b : PrintCommentsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PrintCommentsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PrintCommentsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PrintCommentsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PrintCommentsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("printComments")
  private PrintCommentsEnum printComments = null;

  @SerializedName("resetFontFolders")
  private Boolean resetFontFolders = null;

  public SpreadsheetLoadOptions clearCustomDocumentProperties(Boolean clearCustomDocumentProperties) {
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

  public SpreadsheetLoadOptions clearBuiltInDocumentProperties(Boolean clearBuiltInDocumentProperties) {
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

  public SpreadsheetLoadOptions rowsPerPage(Integer rowsPerPage) {
    this.rowsPerPage = rowsPerPage;
    return this;
  }

   /**
   * Split a worksheet into pages by rows. Default is 0, no pagination.
   * @return rowsPerPage
  **/
  @ApiModelProperty(required = true, value = "Split a worksheet into pages by rows. Default is 0, no pagination.")
  public Integer getRowsPerPage() {
    return rowsPerPage;
  }

  public void setRowsPerPage(Integer rowsPerPage) {
    this.rowsPerPage = rowsPerPage;
  }

  public SpreadsheetLoadOptions columnsPerPage(Integer columnsPerPage) {
    this.columnsPerPage = columnsPerPage;
    return this;
  }

   /**
   * Split a worksheet into pages by columns. Default is 0, no pagination.
   * @return columnsPerPage
  **/
  @ApiModelProperty(required = true, value = "Split a worksheet into pages by columns. Default is 0, no pagination.")
  public Integer getColumnsPerPage() {
    return columnsPerPage;
  }

  public void setColumnsPerPage(Integer columnsPerPage) {
    this.columnsPerPage = columnsPerPage;
  }

  public SpreadsheetLoadOptions autoFitRows(Boolean autoFitRows) {
    this.autoFitRows = autoFitRows;
    return this;
  }

   /**
   * Autofits all rows when converting
   * @return autoFitRows
  **/
  @ApiModelProperty(required = true, value = "Autofits all rows when converting")
  public Boolean getAutoFitRows() {
    return autoFitRows;
  }

  public void setAutoFitRows(Boolean autoFitRows) {
    this.autoFitRows = autoFitRows;
  }

  public SpreadsheetLoadOptions allColumnsInOnePagePerSheet(Boolean allColumnsInOnePagePerSheet) {
    this.allColumnsInOnePagePerSheet = allColumnsInOnePagePerSheet;
    return this;
  }

   /**
   * If AllColumnsInOnePagePerSheet is true, all column content of one sheet will output to only one page in result. The width of paper size of pagesetup will be invalid, and the other settings of pagesetup will still take effect.             
   * @return allColumnsInOnePagePerSheet
  **/
  @ApiModelProperty(required = true, value = "If AllColumnsInOnePagePerSheet is true, all column content of one sheet will output to only one page in result. The width of paper size of pagesetup will be invalid, and the other settings of pagesetup will still take effect.             ")
  public Boolean getAllColumnsInOnePagePerSheet() {
    return allColumnsInOnePagePerSheet;
  }

  public void setAllColumnsInOnePagePerSheet(Boolean allColumnsInOnePagePerSheet) {
    this.allColumnsInOnePagePerSheet = allColumnsInOnePagePerSheet;
  }

  public SpreadsheetLoadOptions cultureInfo(String cultureInfo) {
    this.cultureInfo = cultureInfo;
    return this;
  }

   /**
   * System culture info at the time file is loaded
   * @return cultureInfo
  **/
  @ApiModelProperty(value = "System culture info at the time file is loaded")
  public String getCultureInfo() {
    return cultureInfo;
  }

  public void setCultureInfo(String cultureInfo) {
    this.cultureInfo = cultureInfo;
  }

  public SpreadsheetLoadOptions checkExcelRestriction(Boolean checkExcelRestriction) {
    this.checkExcelRestriction = checkExcelRestriction;
    return this;
  }

   /**
   * Whether check restriction of excel file when user modify cells related objects. For example, excel does not allow inputting string value longer than 32K. When you input a value longer than 32K, if this property is true, you will get an Exception. If this property is false, we will accept your input string value as the cell&#39;s value so that later you can output the complete string value for other file formats such as CSV. However, if you have set such kind of value that is invalid for excel file format, you should not save the workbook as excel file format later. Otherwise there may be unexpected error for the generated excel file.             
   * @return checkExcelRestriction
  **/
  @ApiModelProperty(required = true, value = "Whether check restriction of excel file when user modify cells related objects. For example, excel does not allow inputting string value longer than 32K. When you input a value longer than 32K, if this property is true, you will get an Exception. If this property is false, we will accept your input string value as the cell's value so that later you can output the complete string value for other file formats such as CSV. However, if you have set such kind of value that is invalid for excel file format, you should not save the workbook as excel file format later. Otherwise there may be unexpected error for the generated excel file.             ")
  public Boolean getCheckExcelRestriction() {
    return checkExcelRestriction;
  }

  public void setCheckExcelRestriction(Boolean checkExcelRestriction) {
    this.checkExcelRestriction = checkExcelRestriction;
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

  public SpreadsheetLoadOptions optimizePdfSize(Boolean optimizePdfSize) {
    this.optimizePdfSize = optimizePdfSize;
    return this;
  }

   /**
   * If True and converting to Pdf the conversion is optimized for better file size than print quality.             
   * @return optimizePdfSize
  **/
  @ApiModelProperty(required = true, value = "If True and converting to Pdf the conversion is optimized for better file size than print quality.             ")
  public Boolean getOptimizePdfSize() {
    return optimizePdfSize;
  }

  public void setOptimizePdfSize(Boolean optimizePdfSize) {
    this.optimizePdfSize = optimizePdfSize;
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

  public SpreadsheetLoadOptions sheetIndexes(List<Integer> sheetIndexes) {
    this.sheetIndexes = sheetIndexes;
    return this;
  }

  public SpreadsheetLoadOptions addSheetIndexesItem(Integer sheetIndexesItem) {
    if (this.sheetIndexes == null) {
      this.sheetIndexes = new ArrayList<Integer>();
    }
    this.sheetIndexes.add(sheetIndexesItem);
    return this;
  }

   /**
   * List of sheet indexes to convert. The indexes must be zero-based
   * @return sheetIndexes
  **/
  @ApiModelProperty(value = "List of sheet indexes to convert. The indexes must be zero-based")
  public List<Integer> getSheetIndexes() {
    return sheetIndexes;
  }

  public void setSheetIndexes(List<Integer> sheetIndexes) {
    this.sheetIndexes = sheetIndexes;
  }

  public SpreadsheetLoadOptions sheets(List<String> sheets) {
    this.sheets = sheets;
    return this;
  }

  public SpreadsheetLoadOptions addSheetsItem(String sheetsItem) {
    if (this.sheets == null) {
      this.sheets = new ArrayList<String>();
    }
    this.sheets.add(sheetsItem);
    return this;
  }

   /**
   * List of sheet names to convert
   * @return sheets
  **/
  @ApiModelProperty(value = "List of sheet names to convert")
  public List<String> getSheets() {
    return sheets;
  }

  public void setSheets(List<String> sheets) {
    this.sheets = sheets;
  }

  public SpreadsheetLoadOptions printComments(PrintCommentsEnum printComments) {
    this.printComments = printComments;
    return this;
  }

   /**
   * Represents the way comments are printed with the sheet. Default is PrintNoComments.
   * @return printComments
  **/
  @ApiModelProperty(required = true, value = "Represents the way comments are printed with the sheet. Default is PrintNoComments.")
  public PrintCommentsEnum getPrintComments() {
    return printComments;
  }

  public void setPrintComments(PrintCommentsEnum printComments) {
    this.printComments = printComments;
  }

  public SpreadsheetLoadOptions resetFontFolders(Boolean resetFontFolders) {
    this.resetFontFolders = resetFontFolders;
    return this;
  }

   /**
   * Reset font folders before loading document
   * @return resetFontFolders
  **/
  @ApiModelProperty(required = true, value = "Reset font folders before loading document")
  public Boolean getResetFontFolders() {
    return resetFontFolders;
  }

  public void setResetFontFolders(Boolean resetFontFolders) {
    this.resetFontFolders = resetFontFolders;
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
    return Objects.equals(this.clearCustomDocumentProperties, spreadsheetLoadOptions.clearCustomDocumentProperties) &&
        Objects.equals(this.clearBuiltInDocumentProperties, spreadsheetLoadOptions.clearBuiltInDocumentProperties) &&
        Objects.equals(this.rowsPerPage, spreadsheetLoadOptions.rowsPerPage) &&
        Objects.equals(this.columnsPerPage, spreadsheetLoadOptions.columnsPerPage) &&
        Objects.equals(this.autoFitRows, spreadsheetLoadOptions.autoFitRows) &&
        Objects.equals(this.allColumnsInOnePagePerSheet, spreadsheetLoadOptions.allColumnsInOnePagePerSheet) &&
        Objects.equals(this.cultureInfo, spreadsheetLoadOptions.cultureInfo) &&
        Objects.equals(this.checkExcelRestriction, spreadsheetLoadOptions.checkExcelRestriction) &&
        Objects.equals(this.password, spreadsheetLoadOptions.password) &&
        Objects.equals(this.skipEmptyRowsAndColumns, spreadsheetLoadOptions.skipEmptyRowsAndColumns) &&
        Objects.equals(this.convertRange, spreadsheetLoadOptions.convertRange) &&
        Objects.equals(this.optimizePdfSize, spreadsheetLoadOptions.optimizePdfSize) &&
        Objects.equals(this.onePagePerSheet, spreadsheetLoadOptions.onePagePerSheet) &&
        Objects.equals(this.showHiddenSheets, spreadsheetLoadOptions.showHiddenSheets) &&
        Objects.equals(this.showGridLines, spreadsheetLoadOptions.showGridLines) &&
        Objects.equals(this.fontSubstitutes, spreadsheetLoadOptions.fontSubstitutes) &&
        Objects.equals(this.defaultFont, spreadsheetLoadOptions.defaultFont) &&
        Objects.equals(this.sheetIndexes, spreadsheetLoadOptions.sheetIndexes) &&
        Objects.equals(this.sheets, spreadsheetLoadOptions.sheets) &&
        Objects.equals(this.printComments, spreadsheetLoadOptions.printComments) &&
        Objects.equals(this.resetFontFolders, spreadsheetLoadOptions.resetFontFolders) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clearCustomDocumentProperties, clearBuiltInDocumentProperties, rowsPerPage, columnsPerPage, autoFitRows, allColumnsInOnePagePerSheet, cultureInfo, checkExcelRestriction, password, skipEmptyRowsAndColumns, convertRange, optimizePdfSize, onePagePerSheet, showHiddenSheets, showGridLines, fontSubstitutes, defaultFont, sheetIndexes, sheets, printComments, resetFontFolders, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpreadsheetLoadOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    clearCustomDocumentProperties: ").append(toIndentedString(clearCustomDocumentProperties)).append("\n");
    sb.append("    clearBuiltInDocumentProperties: ").append(toIndentedString(clearBuiltInDocumentProperties)).append("\n");
    sb.append("    rowsPerPage: ").append(toIndentedString(rowsPerPage)).append("\n");
    sb.append("    columnsPerPage: ").append(toIndentedString(columnsPerPage)).append("\n");
    sb.append("    autoFitRows: ").append(toIndentedString(autoFitRows)).append("\n");
    sb.append("    allColumnsInOnePagePerSheet: ").append(toIndentedString(allColumnsInOnePagePerSheet)).append("\n");
    sb.append("    cultureInfo: ").append(toIndentedString(cultureInfo)).append("\n");
    sb.append("    checkExcelRestriction: ").append(toIndentedString(checkExcelRestriction)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    skipEmptyRowsAndColumns: ").append(toIndentedString(skipEmptyRowsAndColumns)).append("\n");
    sb.append("    convertRange: ").append(toIndentedString(convertRange)).append("\n");
    sb.append("    optimizePdfSize: ").append(toIndentedString(optimizePdfSize)).append("\n");
    sb.append("    onePagePerSheet: ").append(toIndentedString(onePagePerSheet)).append("\n");
    sb.append("    showHiddenSheets: ").append(toIndentedString(showHiddenSheets)).append("\n");
    sb.append("    showGridLines: ").append(toIndentedString(showGridLines)).append("\n");
    sb.append("    fontSubstitutes: ").append(toIndentedString(fontSubstitutes)).append("\n");
    sb.append("    defaultFont: ").append(toIndentedString(defaultFont)).append("\n");
    sb.append("    sheetIndexes: ").append(toIndentedString(sheetIndexes)).append("\n");
    sb.append("    sheets: ").append(toIndentedString(sheets)).append("\n");
    sb.append("    printComments: ").append(toIndentedString(printComments)).append("\n");
    sb.append("    resetFontFolders: ").append(toIndentedString(resetFontFolders)).append("\n");
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

