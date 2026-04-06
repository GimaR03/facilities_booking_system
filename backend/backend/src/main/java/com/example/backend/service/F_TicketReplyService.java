package com.example.backend.service;

import com.example.backend.model.F_TicketReplyModel;
import com.example.backend.repository.F_TicketReplyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class F_TicketReplyService {

    private final F_TicketReplyRepository ticketReplyRepository;

    public F_TicketReplyService(F_TicketReplyRepository ticketReplyRepository) {
        this.ticketReplyRepository = ticketReplyRepository;
    }

    public F_TicketReplyModel createTicketReply(F_TicketReplyModel ticketReply) {
        return ticketReplyRepository.save(ticketReply);
    }

    public List<F_TicketReplyModel> getAllTicketReplies() {
        return ticketReplyRepository.findAll();
    }

    public F_TicketReplyModel getTicketReplyById(Long id) {
        return ticketReplyRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ticket reply not found with id: " + id));
    }

    public F_TicketReplyModel updateTicketReply(Long id, F_TicketReplyModel ticketReply) {
        F_TicketReplyModel existing = getTicketReplyById(id);
        existing.setTicketRef(ticketReply.getTicketRef());
        existing.setUserEmail(ticketReply.getUserEmail());
        existing.setSubject(ticketReply.getSubject());
        existing.setAdminReply(ticketReply.getAdminReply());
        existing.setStatus(ticketReply.getStatus());
        return ticketReplyRepository.save(existing);
    }

    public void deleteTicketReply(Long id) {
        getTicketReplyById(id);
        ticketReplyRepository.deleteById(id);
    }
}
