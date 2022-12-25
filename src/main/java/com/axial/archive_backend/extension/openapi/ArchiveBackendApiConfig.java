package com.axial.archive_backend.extension.openapi;

import com.axial.modules.openapi_manager.ApiCustomizer;
import com.axial.modules.openapi_manager.model.ApiHeader;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created on December 2022
 */
@Component
public class ArchiveBackendApiConfig implements ApiCustomizer {

    @Override
    public List<ApiHeader> getHeaders() {

        final List<ApiHeader> headers = ApiCustomizer.super.getHeaders();

        ApiHeader header = new ApiHeader();
        header.setKey("ApiKeyAuth");
        header.setName("X-ApiKey");
        header.setDefaultValue("ABCD123456");
        header.setRequired(true);
        header.setDescription("Enter your apikey");
        header.setDefaultApiHeader(false);
        header.setDefaultSecurityHeader(true);
        headers.add(header);

        header = new ApiHeader();
        header.setKey("Username");
        header.setName("X-Username");
        header.setDefaultValue("dummyUser");
        header.setRequired(false);
        header.setDescription("Enter your username");
        header.setDefaultApiHeader(false);
        header.setDefaultSecurityHeader(false);
        headers.add(header);

        header = new ApiHeader();
        header.setKey("AcceptLanguage");
        header.setName("Accept-Language");
        header.setDefaultValue("en");
        header.setRequired(false);
        header.setDescription("Requested language");
        header.setDefaultApiHeader(true);
        header.setDefaultSecurityHeader(false);
        headers.add(header);

        header = new ApiHeader();
        header.setKey("ClearCachedData");
        header.setName("X-ClearCachedData");
        header.setDefaultValue("false");
        header.setRequired(false);
        header.setDescription("Clear cached data");
        header.setDefaultApiHeader(false);
        header.setDefaultSecurityHeader(false);
        headers.add(header);

        return headers;
    }
}
