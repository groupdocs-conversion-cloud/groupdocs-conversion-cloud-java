# GroupDocs.Conversion Cloud SDK for Java

This repository contains GroupDocs.Conversion Cloud SDK for Java source code. This SDK has been developed to help you get started with using our document conversion REST API, allowing to seamlessly convert your documents to any format you need. With this single API, you can convert back and forth between over 50 types of documents and images, including all Microsoft Office and OpenDocument file formats, PDF documents, HTML, CAD, raster images and many more.

## Requirements

* Java SE Development Kit 8

## Installation

### Maven

Add following repository and dependency to your project's POM

```xml
<repository>
    <id>groupdocs-artifact-repository</id>
    <name>GroupDocs Artifact Repository</name>
    <url>https://repository.groupdocs.cloud/repo</url>
</repository>
```

```xml
<dependency>
    <groupId>com.groupdocs</groupId>
    <artifactId>groupdocs-conversion-cloud</artifactId>
    <version>25.8</version>
    <scope>compile</scope>
</dependency>
```

### Gradle

Add following repository and dependency to your build.gradle:

```javascript
repositories {
    maven {
        url "https://repository.groupdocs.cloud/repo/"
    }
}

...
dependencies {
    ...
    implementation 'com.groupdocs:groupdocs-conversion-cloud:25.8'
}
```

### Create an account
Creating an account is very simple. Go to Dashboard to create a free account.
We’re using Single Sign On across our websites, therefore, if you already have an account with our services, you can use it to also acccess the [Dashboard](https://dashboard.groupdocs.cloud).

### Create an API client app
Before you can make any requests to GroupDocs Cloud API you need to get a Client Id and a Client Secret. This will will be used to invoke GroupDocs Cloud API. You can get it by creating a new [Application](https://dashboard.groupdocs.cloud/applicationsV).

## Convert document

```java
import com.groupdocs.cloud.conversion.client.*;
import com.groupdocs.cloud.conversion.model.requests.*;
import com.groupdocs.cloud.conversion.api.*;
import java.io.File;
import java.util.*;

public class ApiExample {

    public static void main(String[] args) {
        //TODO: Get your ClientId and ClientSecret at https://dashboard.groupdocs.cloud (free registration is required).
        String ClientId = "XXXXXXXX-XXXX-XXXX-XXXX-XXXXXXXXXXXX";
        String ClientSecret = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";

        Configuration configuration = new Configuration(ClientId, ClientSecret);

        ConvertApi apiInstance = new ConvertApi(configuration);

        File file = new File("myFile.docx");

        ConvertDocumentDirectRequest request = new ConvertDocumentDirectRequest("pdf", file, 1, 0, null, null);

        File result = apiInstance.convertDocumentDirect(request);

        System.out.println("Document converted: " + result.length());
    }
}
```

## Convert document using cloud storage

```java
import com.groupdocs.cloud.conversion.client.*;
import com.groupdocs.cloud.conversion.model.requests.*;
import com.groupdocs.cloud.conversion.api.*;
import java.io.File;
import java.util.*;

public class ApiExample {

    public static void main(String[] args) {
        //TODO: Get your ClientId and ClientSecret at https://dashboard.groupdocs.cloud (free registration is required).
        String ClientId = "XXXXXXXX-XXXX-XXXX-XXXX-XXXXXXXXXXXX";
        String ClientSecret = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";

        Configuration configuration = new Configuration(ClientId, ClientSecret);

        FileApi fileApiInstance = new FileApi(configuration);
        ConvertApi apiInstance = new ConvertApi(configuration);

        // Upload file to cloud storage
        File file = new File("myFile.docx");
        UploadFileRequest request = new UploadFileRequest("myFile.docx", file, null);
		fileApiInstance.uploadFileWithHttpInfo(request);

        // Convert document
        ConvertSettings settings = new ConvertSettings();
        settings.setFilePath("myFile.docx");
        settings.setFormat("pdf");			
		settings.setOutputPath("converted");

		List<StoredConvertedResult> result = apiInstance.convertDocument(new ConvertDocumentRequest(settings));
		System.out.println("Document converted: " + result.get(0).getUrl());

        // Download the result
        DownloadFileRequest request = new DownloadFileRequest("converted/myFile.pdf", null, null);
        File response = fileApiInstance.downloadFile(request);
        System.err.println("Expected response type is File: " + response.length());
    }
}
```

## Licensing

All GroupDocs.Conversion Cloud SDKs are licensed under [MIT License](LICENSE).

## Resources

* [**Website**](https://www.groupdocs.cloud)
* [**Product Home**](https://products.groupdocs.cloud/conversion)
* [**Documentation**](https://docs.groupdocs.cloud/conversion/)
* [**Free Support Forum**](https://forum.groupdocs.cloud/c/conversion)
* [**Blog**](https://blog.groupdocs.cloud/category/conversion)

## Contact Us

Your feedback is very important to us. Please feel free to contact us using our [Support Forums](https://forum.groupdocs.cloud/c/conversion).
