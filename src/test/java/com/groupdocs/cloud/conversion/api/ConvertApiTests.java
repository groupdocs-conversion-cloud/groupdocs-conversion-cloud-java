/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd">
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

package com.groupdocs.cloud.conversion.api;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.List;

import com.groupdocs.cloud.conversion.client.ApiException;
import com.groupdocs.cloud.conversion.model.*;
import com.groupdocs.cloud.conversion.model.requests.*;

import org.junit.Test;

import junit.framework.Assert;

/**
 * API tests for ConvertApi
 */
public class ConvertApiTests extends BaseApiTest {

    /**
     * Converts source document to specified type
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void convertDocumentTest() throws ApiException {
        ConvertSettings convertSettings = new ConvertSettings();
        convertSettings.setFilePath(TestFiles.OnePageDocx.getPath());
        convertSettings.setFormat("pdf");
        convertSettings.setConvertOptions(new PdfConvertOptions());
        convertSettings.setOutputPath("converted");
        

        ConvertDocumentRequest request = new ConvertDocumentRequest(convertSettings);
        
        List<StoredConvertedResult> result = convertApi.convertDocument(request);

        assertNotNull(result);
        assertTrue(result.size() > 0);
    }

    /**
     * Converts source document to specified type
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void convertDocumentDownloadTest() throws ApiException {
        ConvertSettings convertSettings = new ConvertSettings();
        convertSettings.setFilePath(TestFiles.OnePageDocx.getPath());
        convertSettings.setFormat("pdf");
        convertSettings.setConvertOptions(new PdfConvertOptions());
        
        ConvertDocumentRequest request = new ConvertDocumentRequest(convertSettings);
        
        File file = convertApi.convertDocumentDownload(request);

        assertNotNull(file);
        assertTrue(file.length() > 0);
    }
}