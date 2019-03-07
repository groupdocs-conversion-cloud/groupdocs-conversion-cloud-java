/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="PdfFormatType.java">
 *   Copyright (c) 2003-2019 Aspose Pty Ltd
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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Defines an pdf format types.
 */
@JsonAdapter(PdfFormatType.Adapter.class)
public enum PdfFormatType {
  
  DEFAULT("Default"),
  
  PDFA_1A("PdfA_1A"),
  
  PDFA_1B("PdfA_1B"),
  
  PDFA_2A("PdfA_2A"),
  
  PDFA_3A("PdfA_3A"),
  
  PDFA_2B("PdfA_2B"),
  
  PDFA_2U("PdfA_2U"),
  
  PDFA_3B("PdfA_3B"),
  
  PDFA_3U("PdfA_3U"),
  
  V1_3("v1_3"),
  
  V1_4("v1_4"),
  
  V1_5("v1_5"),
  
  V1_6("v1_6"),
  
  V1_7("v1_7"),
  
  PDFX_1A("PdfX_1A"),
  
  PDFX3("PdfX3");

  private String value;

  PdfFormatType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PdfFormatType fromValue(String text) {
    for (PdfFormatType b : PdfFormatType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PdfFormatType> {
    @Override
    public void write(final JsonWriter jsonWriter, final PdfFormatType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PdfFormatType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PdfFormatType.fromValue(String.valueOf(value));
    }
  }
}

