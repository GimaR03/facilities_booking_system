package com.example.backend.repository;

import com.example.backend.model.F_TicketReplyModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface F_TicketReplyRepository extends JpaRepository<F_TicketReplyModel, Long> {
    List<F_TicketReplyModel> findByStatus(String status);
}
