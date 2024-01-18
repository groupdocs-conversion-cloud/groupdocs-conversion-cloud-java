/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="PdfLoadOptions.java">
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

/**
 * Pdf document load options
 */
@ApiModel(description = "Pdf document load options")
public class PdfLoadOptions extends LoadOptions {
  @SerializedName("removeEmbeddedFiles")
  private Boolean removeEmbeddedFiles = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("hidePdfAnnotations")
  private Boolean hidePdfAnnotations = null;

  @SerializedName("flattenAllFields")
  private Boolean flattenAllFields = null;

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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfLoadOptions pdfLoadOptions = (PdfLoadOptions) o;
    return Objects.equals(this.removeEmbeddedFiles, pdfLoadOptions.removeEmbeddedFiles) &&
        Objects.equals(this.password, pdfLoadOptions.password) &&
        Objects.equals(this.hidePdfAnnotations, pdfLoadOptions.hidePdfAnnotations) &&
        Objects.equals(this.flattenAllFields, pdfLoadOptions.flattenAllFields) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(removeEmbeddedFiles, password, hidePdfAnnotations, flattenAllFields, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfLoadOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    removeEmbeddedFiles: ").append(toIndentedString(removeEmbeddedFiles)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    hidePdfAnnotations: ").append(toIndentedString(hidePdfAnnotations)).append("\n");
    sb.append("    flattenAllFields: ").append(toIndentedString(flattenAllFields)).append("\n");
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

