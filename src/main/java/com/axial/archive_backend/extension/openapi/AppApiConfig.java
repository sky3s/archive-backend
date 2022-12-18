package com.axial.archive_backend.extension.openapi;

import com.axial.modules.openapi_manager.model.ApiCustomizer;
import com.axial.modules.openapi_manager.model.OpenApiHeader;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Created on December 2022
 */
@Service
public class AppApiConfig implements ApiCustomizer {

    @Override
    public List<OpenApiHeader> getHeaders() {

        final List<OpenApiHeader> headers = getDefaultHeaders();

        headers.addAll(Arrays.asList(
           OpenApiHeader.builder().key("ClearCachedData").name("X-ClearCachedData")
                   .defaultValue("false").required(false).description("Clear cached data")
                   .defaultApiHeader(false).defaultSecurityHeader(false).build()
        ));

        return headers;
    }


}
