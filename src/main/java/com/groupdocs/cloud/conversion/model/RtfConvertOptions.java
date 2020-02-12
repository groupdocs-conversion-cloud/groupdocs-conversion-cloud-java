/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="RtfConvertOptions.java">
 *   Copyright (c) 2003-2020 Aspose Pty Ltd
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
import com.groupdocs.cloud.conversion.model.WatermarkOptions;
import com.groupdocs.cloud.conversion.model.WordProcessingConvertOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.List;

/**
 * Rtf convert options
 */
@ApiModel(description = "Rtf convert options")
public class RtfConvertOptions extends WordProcessingConvertOptions {
  @SerializedName("exportImagesForOldReaders")
  private Boolean exportImagesForOldReaders = null;

  public RtfConvertOptions exportImagesForOldReaders(Boolean exportImagesForOldReaders) {
    this.exportImagesForOldReaders = exportImagesForOldReaders;
    return this;
  }

   /**
   * Specifies whether the keywords for \&quot;old readers\&quot; are written to RTF or not. This can significantly affect the size of the RTF document. Default is False.
   * @return exportImagesForOldReaders
  **/
  @ApiModelProperty(required = true, value = "Specifies whether the keywords for \"old readers\" are written to RTF or not. This can significantly affect the size of the RTF document. Default is False.")
  public Boolean getExportImagesForOldReaders() {
    return exportImagesForOldReaders;
  }

  public void setExportImagesForOldReaders(Boolean exportImagesForOldReaders) {
    this.exportImagesForOldReaders = exportImagesForOldReaders;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RtfConvertOptions rtfConvertOptions = (RtfConvertOptions) o;
    return Objects.equals(this.exportImagesForOldReaders, rtfConvertOptions.exportImagesForOldReaders) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exportImagesForOldReaders, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RtfConvertOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    exportImagesForOldReaders: ").append(toIndentedString(exportImagesForOldReaders)).append("\n");
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

