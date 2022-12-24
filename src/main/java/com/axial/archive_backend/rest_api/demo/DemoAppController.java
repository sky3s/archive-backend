package com.axial.archive_backend.rest_api.demo;

import com.axial.archive_backend.extension.openapi.ArchiveBackendApiConfig;
import com.axial.modules.openapi_manager.model.ApiCustomizer;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on December, 2022
 */
@RestController
@AllArgsConstructor
@RequestMapping(value = {"app/api/v1/demo"})
public class DemoAppController {

    private final String controllerTag = "Demo App API Services";

    private final ApiCustomizer apiCustomizer;

    private final ArchiveBackendApiConfig apiConfig;

    @GetMapping(value = "/demo1", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> demo1() {

        return ResponseEntity.ok(Boolean.TRUE);
    }





}
