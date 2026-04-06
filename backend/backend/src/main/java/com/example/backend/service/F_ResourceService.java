package com.example.backend.service;

import com.example.backend.model.F_ResourceModel;
import com.example.backend.repository.F_ResourceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class F_ResourceService {

    private final F_ResourceRepository resourceRepository;

    public F_ResourceService(F_ResourceRepository resourceRepository) {
        this.resourceRepository = resourceRepository;
    }

    public F_ResourceModel createResource(F_ResourceModel resource) {
        return resourceRepository.save(resource);
    }

    public List<F_ResourceModel> getAllResources() {
        return resourceRepository.findAll();
    }

    public F_ResourceModel getResourceById(Long id) {
        return resourceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Resource not found with id: " + id));
    }

    public F_ResourceModel updateResource(Long id, F_ResourceModel resource) {
        F_ResourceModel existing = getResourceById(id);
        existing.setName(resource.getName());
        existing.setType(resource.getType());
        existing.setCapacity(resource.getCapacity());
        existing.setLocation(resource.getLocation());
        existing.setAvailabilityStart(resource.getAvailabilityStart());
        existing.setAvailabilityEnd(resource.getAvailabilityEnd());
        existing.setStatus(resource.getStatus());
        existing.setDescription(resource.getDescription());
        return resourceRepository.save(existing);
    }

    public void deleteResource(Long id) {
        getResourceById(id);
        resourceRepository.deleteById(id);
    }
}
