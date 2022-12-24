package com.axial.archive_backend.extension.openapi;

import com.axial.modules.openapi_manager.model.ApiCustomizer;
import com.axial.modules.openapi_manager.model.ApiHeader;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created on December 2022
 */
@Component
public class ArchiveBackendApiConfig implements ApiCustomizer {

    @Override
    public List<ApiHeader> getHeaders() {

        final List<ApiHeader> headers = ApiCustomizer.super.getHeaders();

        headers.addAll(Arrays.asList(

                ApiHeader.builder().key("ApiKeyAuth").name("X-ApiKey")
                        .defaultValue("ABCD123456").required(true).description("Enter your apikey")
                        .defaultApiHeader(false).defaultSecurityHeader(true).build(),

                ApiHeader.builder().key("Username").name("X-Username")
                        .defaultValue("dummyUser").required(false).description("Enter your username")
                        .defaultApiHeader(false).defaultSecurityHeader(false).build(),

                ApiHeader.builder().key("AcceptLanguage").name("Accept-Language")
                        .defaultValue("tr").required(false).description("Requested language")
                        .defaultApiHeader(true).defaultSecurityHeader(false).build(),

                ApiHeader.builder().key("ClearCachedData").name("X-ClearCachedData")
                        .defaultValue("false").required(false).description("Clear cached data")
                        .defaultApiHeader(false).defaultSecurityHeader(false).build()
        ));

        return headers;
    }
}
