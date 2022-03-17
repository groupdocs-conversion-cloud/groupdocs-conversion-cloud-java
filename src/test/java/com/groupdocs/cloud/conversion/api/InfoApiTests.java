/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd">
 *   Copyright (c) 2003-2022 Aspose Pty Ltd
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

import static org.junit.Assert.*;

import java.util.List;

import com.groupdocs.cloud.conversion.client.ApiException;
import com.groupdocs.cloud.conversion.model.DocumentMetadata;
import com.groupdocs.cloud.conversion.model.SupportedFormat;
import com.groupdocs.cloud.conversion.model.requests.GetDocumentMetadataRequest;
import com.groupdocs.cloud.conversion.model.requests.GetSupportedConversionTypesRequest;

import org.junit.Test;

/**
 * API tests for InfoApi
 */
public class InfoApiTests extends BaseApiTest {

    /**
     * Retrieves list of supported file formats.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSupportedConversionTypesTest() throws ApiException {
        List<SupportedFormat> response = infoApi.getSupportedConversionTypes(new GetSupportedConversionTypesRequest());

        assertTrue(response.size() > 0);
        for (SupportedFormat format : response) {
            assertFalse(format.getSourceFormat() == null);
        }
    }


    /**
     * Retrieves document metadata.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDocumentMetadataTest() throws ApiException {
        DocumentMetadata response = infoApi.getDocumentMetadata(new GetDocumentMetadataRequest(TestFiles.FourPagesDocx.getPath(), ""));

        assertTrue(4 == response.getPageCount());
    }

    @Test
    public void getInfoReturnsFileNotFoundTest()
    {
        try {
            infoApi.getDocumentMetadata(new GetDocumentMetadataRequest(TestFiles.NotExist.getPath(), ""));
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertTrue(ex.getMessage().contains("AmazonS3 Storage exception: The specified key does not exist"));
        }  
    }        
}
