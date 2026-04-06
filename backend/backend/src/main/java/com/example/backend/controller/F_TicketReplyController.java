package com.example.backend.controller;

import com.example.backend.model.F_TicketReplyModel;
import com.example.backend.service.F_TicketReplyService;
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
@RequestMapping("/api/ticket-replies")
@CrossOrigin(origins = "*")
public class F_TicketReplyController {

    private final F_TicketReplyService ticketReplyService;

    public F_TicketReplyController(F_TicketReplyService ticketReplyService) {
        this.ticketReplyService = ticketReplyService;
    }

    @PostMapping
    public ResponseEntity<F_TicketReplyModel> createTicketReply(@RequestBody F_TicketReplyModel ticketReply) {
        F_TicketReplyModel saved = ticketReplyService.createTicketReply(ticketReply);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<F_TicketReplyModel>> getAllTicketReplies() {
        return ResponseEntity.ok(ticketReplyService.getAllTicketReplies());
    }

    @GetMapping("/{id}")
    public ResponseEntity<F_TicketReplyModel> getTicketReplyById(@PathVariable Long id) {
        return ResponseEntity.ok(ticketReplyService.getTicketReplyById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<F_TicketReplyModel> updateTicketReply(
            @PathVariable Long id,
            @RequestBody F_TicketReplyModel ticketReply
    ) {
        return ResponseEntity.ok(ticketReplyService.updateTicketReply(id, ticketReply));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTicketReply(@PathVariable Long id) {
        ticketReplyService.deleteTicketReply(id);
        return ResponseEntity.ok("Ticket reply deleted successfully");
    }
}
