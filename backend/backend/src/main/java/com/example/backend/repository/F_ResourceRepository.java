package com.example.backend.repository;

import com.example.backend.model.F_ResourceModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface F_ResourceRepository extends JpaRepository<F_ResourceModel, Long> {

    // Search by type
    List<F_ResourceModel> findByType(String type);

    // Search by location
    List<F_ResourceModel> findByLocationContaining(String location);

    // Search by capacity >= value
    List<F_ResourceModel> findByCapacityGreaterThanEqual(Integer capacity);

    // Search by status
    List<F_ResourceModel> findByStatus(String status);

    // Combined search example
    List<F_ResourceModel> findByTypeAndLocationContaining(String type, String location);
}