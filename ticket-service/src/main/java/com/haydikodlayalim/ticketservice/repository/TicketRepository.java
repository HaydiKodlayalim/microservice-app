package com.haydikodlayalim.ticketservice.repository;

import com.haydikodlayalim.ticketservice.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, String> {
}
