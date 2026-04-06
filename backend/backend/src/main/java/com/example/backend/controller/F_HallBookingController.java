package com.example.backend.controller;

import com.example.backend.model.F_HallBookingModel;
import com.example.backend.service.F_HallBookingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/hall-bookings")
@CrossOrigin(origins = "*")
public class F_HallBookingController {

    private final F_HallBookingService hallBookingService;

    public F_HallBookingController(F_HallBookingService hallBookingService) {
        this.hallBookingService = hallBookingService;
    }

    @PostMapping
    public ResponseEntity<F_HallBookingModel> createHallBooking(@RequestBody F_HallBookingModel hallBooking) {
        F_HallBookingModel saved = hallBookingService.createHallBooking(hallBooking);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<F_HallBookingModel>> getAllHallBookings() {
        return ResponseEntity.ok(hallBookingService.getAllHallBookings());
    }

    @GetMapping("/{id}")
    public ResponseEntity<F_HallBookingModel> getHallBookingById(@PathVariable Long id) {
        return ResponseEntity.ok(hallBookingService.getHallBookingById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<F_HallBookingModel> updateHallBooking(
            @PathVariable Long id,
            @RequestBody F_HallBookingModel hallBooking
    ) {
        return ResponseEntity.ok(hallBookingService.updateHallBooking(id, hallBooking));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteHallBooking(@PathVariable Long id) {
        hallBookingService.deleteHallBooking(id);
        return ResponseEntity.ok("Hall booking deleted successfully");
    }
}
