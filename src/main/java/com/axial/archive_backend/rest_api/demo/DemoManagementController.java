package com.axial.archive_backend.rest_api.demo;

import com.axial.archive_backend.extension.openapi.ArchiveBackendApiConfig;
import com.axial.modules.openapi_manager.ApiCustomizer;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on December 2022
 */
@RestController
@AllArgsConstructor
@RequestMapping(value = {"management/api/v1/demo"})
public class DemoManagementController {

    private final String controllerTag = "Demo Management API Services";

    private final ApiCustomizer apiCustomizer;

    private final ArchiveBackendApiConfig apiConfig;


    @GetMapping(value = "/demo2", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> demo2() {

        return ResponseEntity.ok(Boolean.TRUE);
    }





}
