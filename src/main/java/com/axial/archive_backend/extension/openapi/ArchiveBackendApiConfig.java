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
    public List<ApiHeader> getApiHeaders() {

        final List<ApiHeader> headers = ApiCustomizer.super.getApiHeaders();

        headers.addAll(Arrays.asList(
                ApiHeader.builder().key("ClearCachedData").name("X-ClearCachedData")
                        .defaultValue("false").required(false).description("Clear cached data")
                        .defaultApiHeader(false).defaultSecurityHeader(false).build()
        ));

        return headers;
    }
}
