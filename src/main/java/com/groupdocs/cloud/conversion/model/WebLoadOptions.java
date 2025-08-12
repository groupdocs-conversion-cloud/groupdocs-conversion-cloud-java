/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="WebLoadOptions.java">
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

/**
 * Html document load options
 */
@ApiModel(description = "Html document load options")
public class WebLoadOptions extends LoadOptions {
  @SerializedName("pageNumbering")
  private Boolean pageNumbering = null;

  @SerializedName("basePath")
  private String basePath = null;

  @SerializedName("encoding")
  private String encoding = null;

  @SerializedName("skipExternalResources")
  private Boolean skipExternalResources = null;

  @SerializedName("usePdf")
  private Boolean usePdf = null;

  /**
   * Controls how HTML content is rendered. Default: AbsolutePositioning
   */
  @JsonAdapter(RenderingModeEnum.Adapter.class)
  public enum RenderingModeEnum {
    FLOW("Flow"),
    
    ABSOLUTEPOSITIONING("AbsolutePositioning");

    private String value;

    RenderingModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RenderingModeEnum fromValue(String text) {
      for (RenderingModeEnum b : RenderingModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RenderingModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RenderingModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RenderingModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RenderingModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("renderingMode")
  private RenderingModeEnum renderingMode = null;

  @SerializedName("zoom")
  private Integer zoom = null;

  /**
   * Specifies the page layout options when loading web documents
   */
  @JsonAdapter(PageLayoutEnum.Adapter.class)
  public enum PageLayoutEnum {
    NONE("None"),
    
    SCALETOPAGEWIDTH("ScaleToPageWidth"),
    
    SCALETOPAGEHEIGHT("ScaleToPageHeight");

    private String value;

    PageLayoutEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PageLayoutEnum fromValue(String text) {
      for (PageLayoutEnum b : PageLayoutEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PageLayoutEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PageLayoutEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PageLayoutEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PageLayoutEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("pageLayout")
  private PageLayoutEnum pageLayout = null;

  @SerializedName("customCssStyle")
  private String customCssStyle = null;

  public WebLoadOptions pageNumbering(Boolean pageNumbering) {
    this.pageNumbering = pageNumbering;
    return this;
  }

   /**
   * Enable or disable generation of page numbering in converted document. Default: false
   * @return pageNumbering
  **/
  @ApiModelProperty(required = true, value = "Enable or disable generation of page numbering in converted document. Default: false")
  public Boolean getPageNumbering() {
    return pageNumbering;
  }

  public void setPageNumbering(Boolean pageNumbering) {
    this.pageNumbering = pageNumbering;
  }

  public WebLoadOptions basePath(String basePath) {
    this.basePath = basePath;
    return this;
  }

   /**
   * The base path/url for the html
   * @return basePath
  **/
  @ApiModelProperty(value = "The base path/url for the html")
  public String getBasePath() {
    return basePath;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public WebLoadOptions encoding(String encoding) {
    this.encoding = encoding;
    return this;
  }

   /**
   * Get or sets the encoding to be used when loading the web document. If the property is null the encoding will be determined from document character set attribute
   * @return encoding
  **/
  @ApiModelProperty(value = "Get or sets the encoding to be used when loading the web document. If the property is null the encoding will be determined from document character set attribute")
  public String getEncoding() {
    return encoding;
  }

  public void setEncoding(String encoding) {
    this.encoding = encoding;
  }

  public WebLoadOptions skipExternalResources(Boolean skipExternalResources) {
    this.skipExternalResources = skipExternalResources;
    return this;
  }

   /**
   * If true all external resource will not be loading
   * @return skipExternalResources
  **/
  @ApiModelProperty(required = true, value = "If true all external resource will not be loading")
  public Boolean getSkipExternalResources() {
    return skipExternalResources;
  }

  public void setSkipExternalResources(Boolean skipExternalResources) {
    this.skipExternalResources = skipExternalResources;
  }

  public WebLoadOptions usePdf(Boolean usePdf) {
    this.usePdf = usePdf;
    return this;
  }

   /**
   * Use pdf for the conversion. Default: false
   * @return usePdf
  **/
  @ApiModelProperty(required = true, value = "Use pdf for the conversion. Default: false")
  public Boolean getUsePdf() {
    return usePdf;
  }

  public void setUsePdf(Boolean usePdf) {
    this.usePdf = usePdf;
  }

  public WebLoadOptions renderingMode(RenderingModeEnum renderingMode) {
    this.renderingMode = renderingMode;
    return this;
  }

   /**
   * Controls how HTML content is rendered. Default: AbsolutePositioning
   * @return renderingMode
  **/
  @ApiModelProperty(required = true, value = "Controls how HTML content is rendered. Default: AbsolutePositioning")
  public RenderingModeEnum getRenderingMode() {
    return renderingMode;
  }

  public void setRenderingMode(RenderingModeEnum renderingMode) {
    this.renderingMode = renderingMode;
  }

  public WebLoadOptions zoom(Integer zoom) {
    this.zoom = zoom;
    return this;
  }

   /**
   * Get zoom
   * @return zoom
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getZoom() {
    return zoom;
  }

  public void setZoom(Integer zoom) {
    this.zoom = zoom;
  }

  public WebLoadOptions pageLayout(PageLayoutEnum pageLayout) {
    this.pageLayout = pageLayout;
    return this;
  }

   /**
   * Specifies the page layout options when loading web documents
   * @return pageLayout
  **/
  @ApiModelProperty(required = true, value = "Specifies the page layout options when loading web documents")
  public PageLayoutEnum getPageLayout() {
    return pageLayout;
  }

  public void setPageLayout(PageLayoutEnum pageLayout) {
    this.pageLayout = pageLayout;
  }

  public WebLoadOptions customCssStyle(String customCssStyle) {
    this.customCssStyle = customCssStyle;
    return this;
  }

   /**
   * Get customCssStyle
   * @return customCssStyle
  **/
  @ApiModelProperty(value = "")
  public String getCustomCssStyle() {
    return customCssStyle;
  }

  public void setCustomCssStyle(String customCssStyle) {
    this.customCssStyle = customCssStyle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebLoadOptions webLoadOptions = (WebLoadOptions) o;
    return Objects.equals(this.pageNumbering, webLoadOptions.pageNumbering) &&
        Objects.equals(this.basePath, webLoadOptions.basePath) &&
        Objects.equals(this.encoding, webLoadOptions.encoding) &&
        Objects.equals(this.skipExternalResources, webLoadOptions.skipExternalResources) &&
        Objects.equals(this.usePdf, webLoadOptions.usePdf) &&
        Objects.equals(this.renderingMode, webLoadOptions.renderingMode) &&
        Objects.equals(this.zoom, webLoadOptions.zoom) &&
        Objects.equals(this.pageLayout, webLoadOptions.pageLayout) &&
        Objects.equals(this.customCssStyle, webLoadOptions.customCssStyle) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumbering, basePath, encoding, skipExternalResources, usePdf, renderingMode, zoom, pageLayout, customCssStyle, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebLoadOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    pageNumbering: ").append(toIndentedString(pageNumbering)).append("\n");
    sb.append("    basePath: ").append(toIndentedString(basePath)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    skipExternalResources: ").append(toIndentedString(skipExternalResources)).append("\n");
    sb.append("    usePdf: ").append(toIndentedString(usePdf)).append("\n");
    sb.append("    renderingMode: ").append(toIndentedString(renderingMode)).append("\n");
    sb.append("    zoom: ").append(toIndentedString(zoom)).append("\n");
    sb.append("    pageLayout: ").append(toIndentedString(pageLayout)).append("\n");
    sb.append("    customCssStyle: ").append(toIndentedString(customCssStyle)).append("\n");
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

