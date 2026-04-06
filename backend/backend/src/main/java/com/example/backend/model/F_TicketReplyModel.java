package com.example.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ticket_replies")
public class F_TicketReplyModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String ticketRef;

    @Column(nullable = false)
    private String userEmail;

    @Column(nullable = false)
    private String subject;

    @Column(columnDefinition = "TEXT")
    private String adminReply;

    @Column(nullable = false)
    private String status;

    public F_TicketReplyModel() {
    }

    public F_TicketReplyModel(Long id, String ticketRef, String userEmail, String subject, String adminReply, String status) {
        this.id = id;
        this.ticketRef = ticketRef;
        this.userEmail = userEmail;
        this.subject = subject;
        this.adminReply = adminReply;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTicketRef() {
        return ticketRef;
    }

    public void setTicketRef(String ticketRef) {
        this.ticketRef = ticketRef;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAdminReply() {
        return adminReply;
    }

    public void setAdminReply(String adminReply) {
        this.adminReply = adminReply;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
