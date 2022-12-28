package com.axial.archive_backend.extension.openapi.model;

import com.axial.modules.openapi_manager.model.config.ApiConfig;
import com.axial.modules.openapi_manager.model.config.HeaderConfig;
import com.axial.modules.openapi_manager.model.config.SecurityHeaderConfig;

import java.util.List;
import java.util.Map;

public class ArchiveApiConfig extends ApiConfig {

    private List<String> allowedRoles;

    public ArchiveApiConfig(String name,
                            String groupName,
                            String path,
                            Map<String, SecurityHeaderConfig> securityHeaders,
                            Map<String, HeaderConfig> headers,
                            String description,
                            List<String> allowedRoles) {
        super(name, groupName, path, securityHeaders, headers, description);
        this.allowedRoles = allowedRoles;
    }

    private ArchiveApiConfig(ArchiveApiConfig.ApiBuilder builder) {
        super(builder.name,
                builder.groupName,
                builder.path,
                builder.securityHeaders,
                builder.headers,
                builder.description);
        allowedRoles = builder.allowedRoles;
    }

    public static ApiBuilder apiBuilder() {
        return new ApiBuilder();
    }

    public static final class ApiBuilder {
        private String name;
        private String groupName;
        private String path;
        private Map<String, SecurityHeaderConfig> securityHeaders;
        private Map<String, HeaderConfig> headers;
        private String description;
        private List<String> allowedRoles;

        private ApiBuilder() {
        }

        public ArchiveApiConfig.ApiBuilder name(String val) {
            name = val;
            return this;
        }

        public ArchiveApiConfig.ApiBuilder groupName(String val) {
            groupName = val;
            return this;
        }

        public ArchiveApiConfig.ApiBuilder path(String val) {
            path = val;
            return this;
        }

        public ArchiveApiConfig.ApiBuilder securityHeaders(Map<String, SecurityHeaderConfig> val) {
            securityHeaders = val;
            return this;
        }

        public ArchiveApiConfig.ApiBuilder headers(Map<String, HeaderConfig> val) {
            headers = val;
            return this;
        }

        public ArchiveApiConfig.ApiBuilder description(String val) {
            description = val;
            return this;
        }

        public ApiBuilder allowedRoles(List<String> val) {
            allowedRoles = val;
            return this;
        }

        public ArchiveApiConfig build() {
            return new ArchiveApiConfig(this);
        }
    }

    public List<String> getAllowedRoles() {
        return allowedRoles;
    }
}
