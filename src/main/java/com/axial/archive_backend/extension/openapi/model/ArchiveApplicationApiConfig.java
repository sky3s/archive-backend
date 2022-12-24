package com.axial.archive_backend.extension.openapi.model;

import com.axial.modules.openapi_manager.model.config.HeaderConfig;
import com.axial.modules.openapi_manager.model.config.SecurityHeaderConfig;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@Primary
@Component
@ConfigurationProperties("api-config")
public class ArchiveApplicationApiConfig {

    /**
     * Application Name
     */
    private String name;

    /**
     * Custom server's domain names
     */
    private List<String> domains;

    private String version;

    private Map<String, SecurityHeaderConfig> commonSecurityHeaders;

    private Map<String, HeaderConfig> commonHeaders;

    private List<String> customPaths;

    private Map<String, ArchiveApiConfig> apis;

}
