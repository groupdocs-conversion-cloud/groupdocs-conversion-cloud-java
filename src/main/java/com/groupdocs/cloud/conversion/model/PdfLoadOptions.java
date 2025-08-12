/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="PdfLoadOptions.java">
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
 * Pdf document load options
 */
@ApiModel(description = "Pdf document load options")
public class PdfLoadOptions extends LoadOptions {
  @SerializedName("clearBuiltInDocumentProperties")
  private Boolean clearBuiltInDocumentProperties = null;

  @SerializedName("clearCustomDocumentProperties")
  private Boolean clearCustomDocumentProperties = null;

  @SerializedName("pageNumbering")
  private Boolean pageNumbering = null;

  @SerializedName("flattenAllFields")
  private Boolean flattenAllFields = null;

  @SerializedName("hidePdfAnnotations")
  private Boolean hidePdfAnnotations = null;

  @SerializedName("defaultFont")
  private String defaultFont = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("removeJavascript")
  private Boolean removeJavascript = null;

  @SerializedName("removeEmbeddedFiles")
  private Boolean removeEmbeddedFiles = null;

  @SerializedName("fontSubstitutes")
  private Map<String, String> fontSubstitutes = null;

  public PdfLoadOptions clearBuiltInDocumentProperties(Boolean clearBuiltInDocumentProperties) {
    this.clearBuiltInDocumentProperties = clearBuiltInDocumentProperties;
    return this;
  }

   /**
   * Clear built-in document properties
   * @return clearBuiltInDocumentProperties
  **/
  @ApiModelProperty(required = true, value = "Clear built-in document properties")
  public Boolean getClearBuiltInDocumentProperties() {
    return clearBuiltInDocumentProperties;
  }

  public void setClearBuiltInDocumentProperties(Boolean clearBuiltInDocumentProperties) {
    this.clearBuiltInDocumentProperties = clearBuiltInDocumentProperties;
  }

  public PdfLoadOptions clearCustomDocumentProperties(Boolean clearCustomDocumentProperties) {
    this.clearCustomDocumentProperties = clearCustomDocumentProperties;
    return this;
  }

   /**
   * Clear custom document properties
   * @return clearCustomDocumentProperties
  **/
  @ApiModelProperty(required = true, value = "Clear custom document properties")
  public Boolean getClearCustomDocumentProperties() {
    return clearCustomDocumentProperties;
  }

  public void setClearCustomDocumentProperties(Boolean clearCustomDocumentProperties) {
    this.clearCustomDocumentProperties = clearCustomDocumentProperties;
  }

  public PdfLoadOptions pageNumbering(Boolean pageNumbering) {
    this.pageNumbering = pageNumbering;
    return this;
  }

   /**
   * Enable or disable generation of page numbering in converted document. Default:     false
   * @return pageNumbering
  **/
  @ApiModelProperty(required = true, value = "Enable or disable generation of page numbering in converted document. Default:     false")
  public Boolean getPageNumbering() {
    return pageNumbering;
  }

  public void setPageNumbering(Boolean pageNumbering) {
    this.pageNumbering = pageNumbering;
  }

  public PdfLoadOptions flattenAllFields(Boolean flattenAllFields) {
    this.flattenAllFields = flattenAllFields;
    return this;
  }

   /**
   * Flatten all the fields of the PDF form
   * @return flattenAllFields
  **/
  @ApiModelProperty(required = true, value = "Flatten all the fields of the PDF form")
  public Boolean getFlattenAllFields() {
    return flattenAllFields;
  }

  public void setFlattenAllFields(Boolean flattenAllFields) {
    this.flattenAllFields = flattenAllFields;
  }

  public PdfLoadOptions hidePdfAnnotations(Boolean hidePdfAnnotations) {
    this.hidePdfAnnotations = hidePdfAnnotations;
    return this;
  }

   /**
   * Hide annotations in Pdf documents
   * @return hidePdfAnnotations
  **/
  @ApiModelProperty(required = true, value = "Hide annotations in Pdf documents")
  public Boolean getHidePdfAnnotations() {
    return hidePdfAnnotations;
  }

  public void setHidePdfAnnotations(Boolean hidePdfAnnotations) {
    this.hidePdfAnnotations = hidePdfAnnotations;
  }

  public PdfLoadOptions defaultFont(String defaultFont) {
    this.defaultFont = defaultFont;
    return this;
  }

   /**
   * Default font for Pdf document. The following font will be used if a font is missing.
   * @return defaultFont
  **/
  @ApiModelProperty(value = "Default font for Pdf document. The following font will be used if a font is missing.")
  public String getDefaultFont() {
    return defaultFont;
  }

  public void setDefaultFont(String defaultFont) {
    this.defaultFont = defaultFont;
  }

  public PdfLoadOptions password(String password) {
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

  public PdfLoadOptions removeJavascript(Boolean removeJavascript) {
    this.removeJavascript = removeJavascript;
    return this;
  }

   /**
   * Remove javascript
   * @return removeJavascript
  **/
  @ApiModelProperty(required = true, value = "Remove javascript")
  public Boolean getRemoveJavascript() {
    return removeJavascript;
  }

  public void setRemoveJavascript(Boolean removeJavascript) {
    this.removeJavascript = removeJavascript;
  }

  public PdfLoadOptions removeEmbeddedFiles(Boolean removeEmbeddedFiles) {
    this.removeEmbeddedFiles = removeEmbeddedFiles;
    return this;
  }

   /**
   * Remove embedded files
   * @return removeEmbeddedFiles
  **/
  @ApiModelProperty(required = true, value = "Remove embedded files")
  public Boolean getRemoveEmbeddedFiles() {
    return removeEmbeddedFiles;
  }

  public void setRemoveEmbeddedFiles(Boolean removeEmbeddedFiles) {
    this.removeEmbeddedFiles = removeEmbeddedFiles;
  }

  public PdfLoadOptions fontSubstitutes(Map<String, String> fontSubstitutes) {
    this.fontSubstitutes = fontSubstitutes;
    return this;
  }

  public PdfLoadOptions putFontSubstitutesItem(String key, String fontSubstitutesItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfLoadOptions pdfLoadOptions = (PdfLoadOptions) o;
    return Objects.equals(this.clearBuiltInDocumentProperties, pdfLoadOptions.clearBuiltInDocumentProperties) &&
        Objects.equals(this.clearCustomDocumentProperties, pdfLoadOptions.clearCustomDocumentProperties) &&
        Objects.equals(this.pageNumbering, pdfLoadOptions.pageNumbering) &&
        Objects.equals(this.flattenAllFields, pdfLoadOptions.flattenAllFields) &&
        Objects.equals(this.hidePdfAnnotations, pdfLoadOptions.hidePdfAnnotations) &&
        Objects.equals(this.defaultFont, pdfLoadOptions.defaultFont) &&
        Objects.equals(this.password, pdfLoadOptions.password) &&
        Objects.equals(this.removeJavascript, pdfLoadOptions.removeJavascript) &&
        Objects.equals(this.removeEmbeddedFiles, pdfLoadOptions.removeEmbeddedFiles) &&
        Objects.equals(this.fontSubstitutes, pdfLoadOptions.fontSubstitutes) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clearBuiltInDocumentProperties, clearCustomDocumentProperties, pageNumbering, flattenAllFields, hidePdfAnnotations, defaultFont, password, removeJavascript, removeEmbeddedFiles, fontSubstitutes, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfLoadOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    clearBuiltInDocumentProperties: ").append(toIndentedString(clearBuiltInDocumentProperties)).append("\n");
    sb.append("    clearCustomDocumentProperties: ").append(toIndentedString(clearCustomDocumentProperties)).append("\n");
    sb.append("    pageNumbering: ").append(toIndentedString(pageNumbering)).append("\n");
    sb.append("    flattenAllFields: ").append(toIndentedString(flattenAllFields)).append("\n");
    sb.append("    hidePdfAnnotations: ").append(toIndentedString(hidePdfAnnotations)).append("\n");
    sb.append("    defaultFont: ").append(toIndentedString(defaultFont)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    removeJavascript: ").append(toIndentedString(removeJavascript)).append("\n");
    sb.append("    removeEmbeddedFiles: ").append(toIndentedString(removeEmbeddedFiles)).append("\n");
    sb.append("    fontSubstitutes: ").append(toIndentedString(fontSubstitutes)).append("\n");
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

