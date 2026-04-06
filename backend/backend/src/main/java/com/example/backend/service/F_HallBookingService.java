package com.example.backend.service;

import com.example.backend.model.F_HallBookingModel;
import com.example.backend.repository.F_HallBookingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class F_HallBookingService {

    private final F_HallBookingRepository hallBookingRepository;

    public F_HallBookingService(F_HallBookingRepository hallBookingRepository) {
        this.hallBookingRepository = hallBookingRepository;
    }

    public F_HallBookingModel createHallBooking(F_HallBookingModel hallBooking) {
        return hallBookingRepository.save(hallBooking);
    }

    public List<F_HallBookingModel> getAllHallBookings() {
        return hallBookingRepository.findAll();
    }

    public F_HallBookingModel getHallBookingById(Long id) {
        return hallBookingRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Hall booking not found with id: " + id));
    }

    public F_HallBookingModel updateHallBooking(Long id, F_HallBookingModel hallBooking) {
        F_HallBookingModel existing = getHallBookingById(id);
        existing.setHallName(hallBooking.getHallName());
        existing.setRequestedBy(hallBooking.getRequestedBy());
        existing.setBookingDate(hallBooking.getBookingDate());
        existing.setTimeSlot(hallBooking.getTimeSlot());
        existing.setStatus(hallBooking.getStatus());
        return hallBookingRepository.save(existing);
    }

    public void deleteHallBooking(Long id) {
        getHallBookingById(id);
        hallBookingRepository.deleteById(id);
    }
}
