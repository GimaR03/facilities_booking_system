package com.example.backend.repository;

import com.example.backend.model.F_HallBookingModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface F_HallBookingRepository extends JpaRepository<F_HallBookingModel, Long> {
    List<F_HallBookingModel> findByBookingDate(LocalDate bookingDate);
    List<F_HallBookingModel> findByStatus(String status);
}
