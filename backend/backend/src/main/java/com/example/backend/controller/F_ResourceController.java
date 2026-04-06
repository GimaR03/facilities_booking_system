package com.example.backend.controller;

import com.example.backend.model.F_ResourceModel;
import com.example.backend.service.F_ResourceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/resources")
@CrossOrigin(origins = "*")
public class F_ResourceController {

    private final F_ResourceService resourceService;

    public F_ResourceController(F_ResourceService resourceService) {
        this.resourceService = resourceService;
    }

    @PostMapping
    public ResponseEntity<F_ResourceModel> createResource(@RequestBody F_ResourceModel resource) {
        F_ResourceModel savedResource = resourceService.createResource(resource);
        return new ResponseEntity<>(savedResource, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<F_ResourceModel>> getAllResources() {
        List<F_ResourceModel> resources = resourceService.getAllResources();
        return ResponseEntity.ok(resources);
    }

    @GetMapping("/{id}")
    public ResponseEntity<F_ResourceModel> getResourceById(@PathVariable Long id) {
        F_ResourceModel resource = resourceService.getResourceById(id);
        return ResponseEntity.ok(resource);
    }

    @PutMapping("/{id}")
    public ResponseEntity<F_ResourceModel> updateResource(@PathVariable Long id,
                                                          @RequestBody F_ResourceModel resource) {
        F_ResourceModel updatedResource = resourceService.updateResource(id, resource);
        return ResponseEntity.ok(updatedResource);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteResource(@PathVariable Long id) {
        resourceService.deleteResource(id);
        return ResponseEntity.ok("Resource deleted successfully");
    }
}