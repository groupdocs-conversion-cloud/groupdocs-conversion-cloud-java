/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="OperationResult.java">
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
import com.groupdocs.cloud.conversion.model.StoredConvertedResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * Operation status result
 */
@ApiModel(description = "Operation status result")
public class OperationResult {
  @SerializedName("id")
  private String id = null;

  /**
   * Gets or Sets method
   */
  @JsonAdapter(MethodEnum.Adapter.class)
  public enum MethodEnum {
    CONVERT("Convert"),
    
    CONVERTANDSAVE("ConvertAndSave");

    private String value;

    MethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MethodEnum fromValue(String text) {
      for (MethodEnum b : MethodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MethodEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MethodEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("method")
  private MethodEnum method = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    CREATED("Created"),
    
    STARTED("Started"),
    
    FAILED("Failed"),
    
    CANCELED("Canceled"),
    
    FINISHED("Finished");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("created")
  private OffsetDateTime created = null;

  @SerializedName("started")
  private OffsetDateTime started = null;

  @SerializedName("failed")
  private OffsetDateTime failed = null;

  @SerializedName("canceled")
  private OffsetDateTime canceled = null;

  @SerializedName("finished")
  private OffsetDateTime finished = null;

  @SerializedName("result")
  private List<StoredConvertedResult> result = null;

  @SerializedName("error")
  private String error = null;

  public OperationResult id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OperationResult method(MethodEnum method) {
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @ApiModelProperty(required = true, value = "")
  public MethodEnum getMethod() {
    return method;
  }

  public void setMethod(MethodEnum method) {
    this.method = method;
  }

  public OperationResult status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public OperationResult created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public OperationResult started(OffsetDateTime started) {
    this.started = started;
    return this;
  }

   /**
   * Get started
   * @return started
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getStarted() {
    return started;
  }

  public void setStarted(OffsetDateTime started) {
    this.started = started;
  }

  public OperationResult failed(OffsetDateTime failed) {
    this.failed = failed;
    return this;
  }

   /**
   * Get failed
   * @return failed
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getFailed() {
    return failed;
  }

  public void setFailed(OffsetDateTime failed) {
    this.failed = failed;
  }

  public OperationResult canceled(OffsetDateTime canceled) {
    this.canceled = canceled;
    return this;
  }

   /**
   * Get canceled
   * @return canceled
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCanceled() {
    return canceled;
  }

  public void setCanceled(OffsetDateTime canceled) {
    this.canceled = canceled;
  }

  public OperationResult finished(OffsetDateTime finished) {
    this.finished = finished;
    return this;
  }

   /**
   * Get finished
   * @return finished
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getFinished() {
    return finished;
  }

  public void setFinished(OffsetDateTime finished) {
    this.finished = finished;
  }

  public OperationResult result(List<StoredConvertedResult> result) {
    this.result = result;
    return this;
  }

  public OperationResult addResultItem(StoredConvertedResult resultItem) {
    if (this.result == null) {
      this.result = new ArrayList<StoredConvertedResult>();
    }
    this.result.add(resultItem);
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @ApiModelProperty(value = "")
  public List<StoredConvertedResult> getResult() {
    return result;
  }

  public void setResult(List<StoredConvertedResult> result) {
    this.result = result;
  }

  public OperationResult error(String error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @ApiModelProperty(value = "")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationResult operationResult = (OperationResult) o;
    return Objects.equals(this.id, operationResult.id) &&
        Objects.equals(this.method, operationResult.method) &&
        Objects.equals(this.status, operationResult.status) &&
        Objects.equals(this.created, operationResult.created) &&
        Objects.equals(this.started, operationResult.started) &&
        Objects.equals(this.failed, operationResult.failed) &&
        Objects.equals(this.canceled, operationResult.canceled) &&
        Objects.equals(this.finished, operationResult.finished) &&
        Objects.equals(this.result, operationResult.result) &&
        Objects.equals(this.error, operationResult.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, method, status, created, started, failed, canceled, finished, result, error);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationResult {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    started: ").append(toIndentedString(started)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    canceled: ").append(toIndentedString(canceled)).append("\n");
    sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

