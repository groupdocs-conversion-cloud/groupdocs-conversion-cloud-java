/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="EmailLoadOptions.java">
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
import com.groupdocs.cloud.conversion.model.FieldLabel;
import com.groupdocs.cloud.conversion.model.LoadOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Options for loading Email documents
 */
@ApiModel(description = "Options for loading Email documents")
public class EmailLoadOptions extends LoadOptions {
  @SerializedName("preserveOriginalDate")
  private Boolean preserveOriginalDate = null;

  @SerializedName("fieldLabels")
  private List<FieldLabel> fieldLabels = null;

  @SerializedName("timeZoneOffset")
  private String timeZoneOffset = null;

  @SerializedName("displaySent")
  private Boolean displaySent = null;

  @SerializedName("displaySubject")
  private Boolean displaySubject = null;

  @SerializedName("displayAttachments")
  private Boolean displayAttachments = null;

  @SerializedName("displayEmailAddresses")
  private Boolean displayEmailAddresses = null;

  @SerializedName("displayBccEmailAddress")
  private Boolean displayBccEmailAddress = null;

  @SerializedName("displayCcEmailAddress")
  private Boolean displayCcEmailAddress = null;

  @SerializedName("displayToEmailAddress")
  private Boolean displayToEmailAddress = null;

  @SerializedName("displayFromEmailAddress")
  private Boolean displayFromEmailAddress = null;

  @SerializedName("displayHeader")
  private Boolean displayHeader = null;

  @SerializedName("defaultFont")
  private String defaultFont = null;

  @SerializedName("fontSubstitutes")
  private Map<String, String> fontSubstitutes = null;

  public EmailLoadOptions preserveOriginalDate(Boolean preserveOriginalDate) {
    this.preserveOriginalDate = preserveOriginalDate;
    return this;
  }

   /**
   * Defines whether need to keep original date header string in mail message when saving or not (Default value is true)
   * @return preserveOriginalDate
  **/
  @ApiModelProperty(required = true, value = "Defines whether need to keep original date header string in mail message when saving or not (Default value is true)")
  public Boolean getPreserveOriginalDate() {
    return preserveOriginalDate;
  }

  public void setPreserveOriginalDate(Boolean preserveOriginalDate) {
    this.preserveOriginalDate = preserveOriginalDate;
  }

  public EmailLoadOptions fieldLabels(List<FieldLabel> fieldLabels) {
    this.fieldLabels = fieldLabels;
    return this;
  }

  public EmailLoadOptions addFieldLabelsItem(FieldLabel fieldLabelsItem) {
    if (this.fieldLabels == null) {
      this.fieldLabels = new ArrayList<FieldLabel>();
    }
    this.fieldLabels.add(fieldLabelsItem);
    return this;
  }

   /**
   * The mapping between email message field and field text representation
   * @return fieldLabels
  **/
  @ApiModelProperty(value = "The mapping between email message field and field text representation")
  public List<FieldLabel> getFieldLabels() {
    return fieldLabels;
  }

  public void setFieldLabels(List<FieldLabel> fieldLabels) {
    this.fieldLabels = fieldLabels;
  }

  public EmailLoadOptions timeZoneOffset(String timeZoneOffset) {
    this.timeZoneOffset = timeZoneOffset;
    return this;
  }

   /**
   * Gets or sets the Coordinated Universal Time (UTC) offset for the message dates. This property defines the time zone difference, between the localtime and UTC.
   * @return timeZoneOffset
  **/
  @ApiModelProperty(value = "Gets or sets the Coordinated Universal Time (UTC) offset for the message dates. This property defines the time zone difference, between the localtime and UTC.")
  public String getTimeZoneOffset() {
    return timeZoneOffset;
  }

  public void setTimeZoneOffset(String timeZoneOffset) {
    this.timeZoneOffset = timeZoneOffset;
  }

  public EmailLoadOptions displaySent(Boolean displaySent) {
    this.displaySent = displaySent;
    return this;
  }

   /**
   * Option to display or hide sent date/time in the header. Default: true.
   * @return displaySent
  **/
  @ApiModelProperty(required = true, value = "Option to display or hide sent date/time in the header. Default: true.")
  public Boolean getDisplaySent() {
    return displaySent;
  }

  public void setDisplaySent(Boolean displaySent) {
    this.displaySent = displaySent;
  }

  public EmailLoadOptions displaySubject(Boolean displaySubject) {
    this.displaySubject = displaySubject;
    return this;
  }

   /**
   * Option to display or hide subject in the header. Default: true.
   * @return displaySubject
  **/
  @ApiModelProperty(required = true, value = "Option to display or hide subject in the header. Default: true.")
  public Boolean getDisplaySubject() {
    return displaySubject;
  }

  public void setDisplaySubject(Boolean displaySubject) {
    this.displaySubject = displaySubject;
  }

  public EmailLoadOptions displayAttachments(Boolean displayAttachments) {
    this.displayAttachments = displayAttachments;
    return this;
  }

   /**
   * Option to display or hide attachments in the header. Default: true.
   * @return displayAttachments
  **/
  @ApiModelProperty(required = true, value = "Option to display or hide attachments in the header. Default: true.")
  public Boolean getDisplayAttachments() {
    return displayAttachments;
  }

  public void setDisplayAttachments(Boolean displayAttachments) {
    this.displayAttachments = displayAttachments;
  }

  public EmailLoadOptions displayEmailAddresses(Boolean displayEmailAddresses) {
    this.displayEmailAddresses = displayEmailAddresses;
    return this;
  }

   /**
   * Get displayEmailAddresses
   * @return displayEmailAddresses
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getDisplayEmailAddresses() {
    return displayEmailAddresses;
  }

  public void setDisplayEmailAddresses(Boolean displayEmailAddresses) {
    this.displayEmailAddresses = displayEmailAddresses;
  }

  public EmailLoadOptions displayBccEmailAddress(Boolean displayBccEmailAddress) {
    this.displayBccEmailAddress = displayBccEmailAddress;
    return this;
  }

   /**
   * Option to display or hide \&quot;Bcc\&quot; email address. Default: false
   * @return displayBccEmailAddress
  **/
  @ApiModelProperty(required = true, value = "Option to display or hide \"Bcc\" email address. Default: false")
  public Boolean getDisplayBccEmailAddress() {
    return displayBccEmailAddress;
  }

  public void setDisplayBccEmailAddress(Boolean displayBccEmailAddress) {
    this.displayBccEmailAddress = displayBccEmailAddress;
  }

  public EmailLoadOptions displayCcEmailAddress(Boolean displayCcEmailAddress) {
    this.displayCcEmailAddress = displayCcEmailAddress;
    return this;
  }

   /**
   * Option to display or hide \&quot;Cc\&quot; email address. Default: false
   * @return displayCcEmailAddress
  **/
  @ApiModelProperty(required = true, value = "Option to display or hide \"Cc\" email address. Default: false")
  public Boolean getDisplayCcEmailAddress() {
    return displayCcEmailAddress;
  }

  public void setDisplayCcEmailAddress(Boolean displayCcEmailAddress) {
    this.displayCcEmailAddress = displayCcEmailAddress;
  }

  public EmailLoadOptions displayToEmailAddress(Boolean displayToEmailAddress) {
    this.displayToEmailAddress = displayToEmailAddress;
    return this;
  }

   /**
   * Option to display or hide \&quot;to\&quot; email address. Default: true
   * @return displayToEmailAddress
  **/
  @ApiModelProperty(required = true, value = "Option to display or hide \"to\" email address. Default: true")
  public Boolean getDisplayToEmailAddress() {
    return displayToEmailAddress;
  }

  public void setDisplayToEmailAddress(Boolean displayToEmailAddress) {
    this.displayToEmailAddress = displayToEmailAddress;
  }

  public EmailLoadOptions displayFromEmailAddress(Boolean displayFromEmailAddress) {
    this.displayFromEmailAddress = displayFromEmailAddress;
    return this;
  }

   /**
   * Option to display or hide \&quot;from\&quot; email address. Default: true
   * @return displayFromEmailAddress
  **/
  @ApiModelProperty(required = true, value = "Option to display or hide \"from\" email address. Default: true")
  public Boolean getDisplayFromEmailAddress() {
    return displayFromEmailAddress;
  }

  public void setDisplayFromEmailAddress(Boolean displayFromEmailAddress) {
    this.displayFromEmailAddress = displayFromEmailAddress;
  }

  public EmailLoadOptions displayHeader(Boolean displayHeader) {
    this.displayHeader = displayHeader;
    return this;
  }

   /**
   * Option to display or hide the email header. Default: true
   * @return displayHeader
  **/
  @ApiModelProperty(required = true, value = "Option to display or hide the email header. Default: true")
  public Boolean getDisplayHeader() {
    return displayHeader;
  }

  public void setDisplayHeader(Boolean displayHeader) {
    this.displayHeader = displayHeader;
  }

  public EmailLoadOptions defaultFont(String defaultFont) {
    this.defaultFont = defaultFont;
    return this;
  }

   /**
   * Default font for Email document. The following font will be used if a font is missing.
   * @return defaultFont
  **/
  @ApiModelProperty(value = "Default font for Email document. The following font will be used if a font is missing.")
  public String getDefaultFont() {
    return defaultFont;
  }

  public void setDefaultFont(String defaultFont) {
    this.defaultFont = defaultFont;
  }

  public EmailLoadOptions fontSubstitutes(Map<String, String> fontSubstitutes) {
    this.fontSubstitutes = fontSubstitutes;
    return this;
  }

  public EmailLoadOptions putFontSubstitutesItem(String key, String fontSubstitutesItem) {
    if (this.fontSubstitutes == null) {
      this.fontSubstitutes = new HashMap<String, String>();
    }
    this.fontSubstitutes.put(key, fontSubstitutesItem);
    return this;
  }

   /**
   * List of font substitutes.
   * @return fontSubstitutes
  **/
  @ApiModelProperty(value = "List of font substitutes.")
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
    EmailLoadOptions emailLoadOptions = (EmailLoadOptions) o;
    return Objects.equals(this.preserveOriginalDate, emailLoadOptions.preserveOriginalDate) &&
        Objects.equals(this.fieldLabels, emailLoadOptions.fieldLabels) &&
        Objects.equals(this.timeZoneOffset, emailLoadOptions.timeZoneOffset) &&
        Objects.equals(this.displaySent, emailLoadOptions.displaySent) &&
        Objects.equals(this.displaySubject, emailLoadOptions.displaySubject) &&
        Objects.equals(this.displayAttachments, emailLoadOptions.displayAttachments) &&
        Objects.equals(this.displayEmailAddresses, emailLoadOptions.displayEmailAddresses) &&
        Objects.equals(this.displayBccEmailAddress, emailLoadOptions.displayBccEmailAddress) &&
        Objects.equals(this.displayCcEmailAddress, emailLoadOptions.displayCcEmailAddress) &&
        Objects.equals(this.displayToEmailAddress, emailLoadOptions.displayToEmailAddress) &&
        Objects.equals(this.displayFromEmailAddress, emailLoadOptions.displayFromEmailAddress) &&
        Objects.equals(this.displayHeader, emailLoadOptions.displayHeader) &&
        Objects.equals(this.defaultFont, emailLoadOptions.defaultFont) &&
        Objects.equals(this.fontSubstitutes, emailLoadOptions.fontSubstitutes) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preserveOriginalDate, fieldLabels, timeZoneOffset, displaySent, displaySubject, displayAttachments, displayEmailAddresses, displayBccEmailAddress, displayCcEmailAddress, displayToEmailAddress, displayFromEmailAddress, displayHeader, defaultFont, fontSubstitutes, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailLoadOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    preserveOriginalDate: ").append(toIndentedString(preserveOriginalDate)).append("\n");
    sb.append("    fieldLabels: ").append(toIndentedString(fieldLabels)).append("\n");
    sb.append("    timeZoneOffset: ").append(toIndentedString(timeZoneOffset)).append("\n");
    sb.append("    displaySent: ").append(toIndentedString(displaySent)).append("\n");
    sb.append("    displaySubject: ").append(toIndentedString(displaySubject)).append("\n");
    sb.append("    displayAttachments: ").append(toIndentedString(displayAttachments)).append("\n");
    sb.append("    displayEmailAddresses: ").append(toIndentedString(displayEmailAddresses)).append("\n");
    sb.append("    displayBccEmailAddress: ").append(toIndentedString(displayBccEmailAddress)).append("\n");
    sb.append("    displayCcEmailAddress: ").append(toIndentedString(displayCcEmailAddress)).append("\n");
    sb.append("    displayToEmailAddress: ").append(toIndentedString(displayToEmailAddress)).append("\n");
    sb.append("    displayFromEmailAddress: ").append(toIndentedString(displayFromEmailAddress)).append("\n");
    sb.append("    displayHeader: ").append(toIndentedString(displayHeader)).append("\n");
    sb.append("    defaultFont: ").append(toIndentedString(defaultFont)).append("\n");
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

