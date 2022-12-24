package com.axial.archive_backend.extension.openapi.model;

import com.axial.modules.openapi_manager.model.config.ApiConfig;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ArchiveApiConfig extends ApiConfig {

    private List<String> allowedRoles;

}
