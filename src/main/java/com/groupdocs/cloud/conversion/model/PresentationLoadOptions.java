/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="PresentationLoadOptions.java">
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
 * Presentation document load options
 */
@ApiModel(description = "Presentation document load options")
public class PresentationLoadOptions extends LoadOptions {
  @SerializedName("preserveDocumentStructure")
  private Boolean preserveDocumentStructure = null;

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

  @SerializedName("showHiddenSlides")
  private Boolean showHiddenSlides = null;

  @SerializedName("defaultFont")
  private String defaultFont = null;

  @SerializedName("fontSubstitutes")
  private Map<String, String> fontSubstitutes = null;

  @SerializedName("password")
  private String password = null;

  /**
   * Represents the way comments are printed with the slide. Default is None.
   */
  @JsonAdapter(CommentsPositionEnum.Adapter.class)
  public enum CommentsPositionEnum {
    NONE("None"),
    
    BOTTOM("Bottom"),
    
    RIGHT("Right");

    private String value;

    CommentsPositionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CommentsPositionEnum fromValue(String text) {
      for (CommentsPositionEnum b : CommentsPositionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CommentsPositionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CommentsPositionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CommentsPositionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CommentsPositionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("commentsPosition")
  private CommentsPositionEnum commentsPosition = null;

  /**
   * Represents the way notes are printed with the slide. Default is None.
   */
  @JsonAdapter(NotesPositionEnum.Adapter.class)
  public enum NotesPositionEnum {
    NONE("None"),
    
    BOTTOMTRUNCATED("BottomTruncated"),
    
    BOTTOMFULL("BottomFull");

    private String value;

    NotesPositionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NotesPositionEnum fromValue(String text) {
      for (NotesPositionEnum b : NotesPositionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<NotesPositionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NotesPositionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NotesPositionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return NotesPositionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("notesPosition")
  private NotesPositionEnum notesPosition = null;

  public PresentationLoadOptions preserveDocumentStructure(Boolean preserveDocumentStructure) {
    this.preserveDocumentStructure = preserveDocumentStructure;
    return this;
  }

   /**
   * Determines whether the document structure should be preserved when converting     to PDF (default is false).
   * @return preserveDocumentStructure
  **/
  @ApiModelProperty(required = true, value = "Determines whether the document structure should be preserved when converting     to PDF (default is false).")
  public Boolean getPreserveDocumentStructure() {
    return preserveDocumentStructure;
  }

  public void setPreserveDocumentStructure(Boolean preserveDocumentStructure) {
    this.preserveDocumentStructure = preserveDocumentStructure;
  }

  public PresentationLoadOptions clearCustomDocumentProperties(Boolean clearCustomDocumentProperties) {
    this.clearCustomDocumentProperties = clearCustomDocumentProperties;
    return this;
  }

   /**
   * Value indicating whether custom document properties should be cleared.
   * @return clearCustomDocumentProperties
  **/
  @ApiModelProperty(required = true, value = "Value indicating whether custom document properties should be cleared.")
  public Boolean getClearCustomDocumentProperties() {
    return clearCustomDocumentProperties;
  }

  public void setClearCustomDocumentProperties(Boolean clearCustomDocumentProperties) {
    this.clearCustomDocumentProperties = clearCustomDocumentProperties;
  }

  public PresentationLoadOptions clearBuiltInDocumentProperties(Boolean clearBuiltInDocumentProperties) {
    this.clearBuiltInDocumentProperties = clearBuiltInDocumentProperties;
    return this;
  }

   /**
   * Value indicating whether built in document properties should be cleared.
   * @return clearBuiltInDocumentProperties
  **/
  @ApiModelProperty(required = true, value = "Value indicating whether built in document properties should be cleared.")
  public Boolean getClearBuiltInDocumentProperties() {
    return clearBuiltInDocumentProperties;
  }

  public void setClearBuiltInDocumentProperties(Boolean clearBuiltInDocumentProperties) {
    this.clearBuiltInDocumentProperties = clearBuiltInDocumentProperties;
  }

  public PresentationLoadOptions depth(Integer depth) {
    this.depth = depth;
    return this;
  }

   /**
   * Option to control how many levels in depth to perform conversion     Default: 1
   * @return depth
  **/
  @ApiModelProperty(required = true, value = "Option to control how many levels in depth to perform conversion     Default: 1")
  public Integer getDepth() {
    return depth;
  }

  public void setDepth(Integer depth) {
    this.depth = depth;
  }

  public PresentationLoadOptions convertOwned(Boolean convertOwned) {
    this.convertOwned = convertOwned;
    return this;
  }

   /**
   * Option to control whether the owned documents in the documents container must     be converted
   * @return convertOwned
  **/
  @ApiModelProperty(required = true, value = "Option to control whether the owned documents in the documents container must     be converted")
  public Boolean getConvertOwned() {
    return convertOwned;
  }

  public void setConvertOwned(Boolean convertOwned) {
    this.convertOwned = convertOwned;
  }

  public PresentationLoadOptions convertOwner(Boolean convertOwner) {
    this.convertOwner = convertOwner;
    return this;
  }

   /**
   * Option to control whether the documents container itself must be converted If     this property is true the documents container will be the first converted document     Default is true
   * @return convertOwner
  **/
  @ApiModelProperty(required = true, value = "Option to control whether the documents container itself must be converted If     this property is true the documents container will be the first converted document     Default is true")
  public Boolean getConvertOwner() {
    return convertOwner;
  }

  public void setConvertOwner(Boolean convertOwner) {
    this.convertOwner = convertOwner;
  }

  public PresentationLoadOptions showHiddenSlides(Boolean showHiddenSlides) {
    this.showHiddenSlides = showHiddenSlides;
    return this;
  }

   /**
   * Show hidden slides.
   * @return showHiddenSlides
  **/
  @ApiModelProperty(required = true, value = "Show hidden slides.")
  public Boolean getShowHiddenSlides() {
    return showHiddenSlides;
  }

  public void setShowHiddenSlides(Boolean showHiddenSlides) {
    this.showHiddenSlides = showHiddenSlides;
  }

  public PresentationLoadOptions defaultFont(String defaultFont) {
    this.defaultFont = defaultFont;
    return this;
  }

   /**
   * Default font for rendering the presentation. The following font will be used if a presentation font is missing.
   * @return defaultFont
  **/
  @ApiModelProperty(value = "Default font for rendering the presentation. The following font will be used if a presentation font is missing.")
  public String getDefaultFont() {
    return defaultFont;
  }

  public void setDefaultFont(String defaultFont) {
    this.defaultFont = defaultFont;
  }

  public PresentationLoadOptions fontSubstitutes(Map<String, String> fontSubstitutes) {
    this.fontSubstitutes = fontSubstitutes;
    return this;
  }

  public PresentationLoadOptions putFontSubstitutesItem(String key, String fontSubstitutesItem) {
    if (this.fontSubstitutes == null) {
      this.fontSubstitutes = new HashMap<String, String>();
    }
    this.fontSubstitutes.put(key, fontSubstitutesItem);
    return this;
  }

   /**
   * Substitute specific fonts when converting Slides document.
   * @return fontSubstitutes
  **/
  @ApiModelProperty(value = "Substitute specific fonts when converting Slides document.")
  public Map<String, String> getFontSubstitutes() {
    return fontSubstitutes;
  }

  public void setFontSubstitutes(Map<String, String> fontSubstitutes) {
    this.fontSubstitutes = fontSubstitutes;
  }

  public PresentationLoadOptions password(String password) {
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

  public PresentationLoadOptions commentsPosition(CommentsPositionEnum commentsPosition) {
    this.commentsPosition = commentsPosition;
    return this;
  }

   /**
   * Represents the way comments are printed with the slide. Default is None.
   * @return commentsPosition
  **/
  @ApiModelProperty(required = true, value = "Represents the way comments are printed with the slide. Default is None.")
  public CommentsPositionEnum getCommentsPosition() {
    return commentsPosition;
  }

  public void setCommentsPosition(CommentsPositionEnum commentsPosition) {
    this.commentsPosition = commentsPosition;
  }

  public PresentationLoadOptions notesPosition(NotesPositionEnum notesPosition) {
    this.notesPosition = notesPosition;
    return this;
  }

   /**
   * Represents the way notes are printed with the slide. Default is None.
   * @return notesPosition
  **/
  @ApiModelProperty(required = true, value = "Represents the way notes are printed with the slide. Default is None.")
  public NotesPositionEnum getNotesPosition() {
    return notesPosition;
  }

  public void setNotesPosition(NotesPositionEnum notesPosition) {
    this.notesPosition = notesPosition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PresentationLoadOptions presentationLoadOptions = (PresentationLoadOptions) o;
    return Objects.equals(this.preserveDocumentStructure, presentationLoadOptions.preserveDocumentStructure) &&
        Objects.equals(this.clearCustomDocumentProperties, presentationLoadOptions.clearCustomDocumentProperties) &&
        Objects.equals(this.clearBuiltInDocumentProperties, presentationLoadOptions.clearBuiltInDocumentProperties) &&
        Objects.equals(this.depth, presentationLoadOptions.depth) &&
        Objects.equals(this.convertOwned, presentationLoadOptions.convertOwned) &&
        Objects.equals(this.convertOwner, presentationLoadOptions.convertOwner) &&
        Objects.equals(this.showHiddenSlides, presentationLoadOptions.showHiddenSlides) &&
        Objects.equals(this.defaultFont, presentationLoadOptions.defaultFont) &&
        Objects.equals(this.fontSubstitutes, presentationLoadOptions.fontSubstitutes) &&
        Objects.equals(this.password, presentationLoadOptions.password) &&
        Objects.equals(this.commentsPosition, presentationLoadOptions.commentsPosition) &&
        Objects.equals(this.notesPosition, presentationLoadOptions.notesPosition) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preserveDocumentStructure, clearCustomDocumentProperties, clearBuiltInDocumentProperties, depth, convertOwned, convertOwner, showHiddenSlides, defaultFont, fontSubstitutes, password, commentsPosition, notesPosition, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PresentationLoadOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    preserveDocumentStructure: ").append(toIndentedString(preserveDocumentStructure)).append("\n");
    sb.append("    clearCustomDocumentProperties: ").append(toIndentedString(clearCustomDocumentProperties)).append("\n");
    sb.append("    clearBuiltInDocumentProperties: ").append(toIndentedString(clearBuiltInDocumentProperties)).append("\n");
    sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
    sb.append("    convertOwned: ").append(toIndentedString(convertOwned)).append("\n");
    sb.append("    convertOwner: ").append(toIndentedString(convertOwner)).append("\n");
    sb.append("    showHiddenSlides: ").append(toIndentedString(showHiddenSlides)).append("\n");
    sb.append("    defaultFont: ").append(toIndentedString(defaultFont)).append("\n");
    sb.append("    fontSubstitutes: ").append(toIndentedString(fontSubstitutes)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    commentsPosition: ").append(toIndentedString(commentsPosition)).append("\n");
    sb.append("    notesPosition: ").append(toIndentedString(notesPosition)).append("\n");
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

