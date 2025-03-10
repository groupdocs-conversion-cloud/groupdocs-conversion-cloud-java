/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="StartConvertAndSaveRequest.java">
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

package com.groupdocs.cloud.conversion.model.requests;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.groupdocs.cloud.conversion.model.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.File;

/**
 * Request model for startConvertAndSave method.
 */
public class StartConvertAndSaveRequest {
    
    /**
    * Initializes a new instance of the StartConvertAndSaveRequest class.
    */      
    public StartConvertAndSaveRequest()
    {
    }

    /**
    * Initializes a new instance of the StartConvertAndSaveRequest class.    
    * @param convertSettings Conversion settings
    */
    public StartConvertAndSaveRequest(ConvertSettings convertSettings)
    {
        this.convertSettings = convertSettings;
    }

  @SerializedName("convertSettings")
  private ConvertSettings convertSettings = null;

  /**
   * Conversion settings
   * @return Conversion settings
  **/
  @ApiModelProperty(example = "new ConvertSettings()", required = true, value = "Conversion settings")
  public ConvertSettings getconvertSettings() {
    return convertSettings;
  }

  public void setconvertSettings(ConvertSettings convertSettings) {
    this.convertSettings = convertSettings;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }

    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    
    StartConvertAndSaveRequest request = (StartConvertAndSaveRequest) o;
    return Objects.equals(this.convertSettings, request.convertSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(convertSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartConvertAndSave {\n");
    sb.append("    convertSettings: ").append(toIndentedString(convertSettings)).append("\n");
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

