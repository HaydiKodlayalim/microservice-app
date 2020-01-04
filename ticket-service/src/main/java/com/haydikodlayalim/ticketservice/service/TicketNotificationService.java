package com.haydikodlayalim.ticketservice.service;

import com.haydikodlayalim.ticketservice.model.Ticket;

public interface TicketNotificationService {

    void sendToQueue(Ticket ticket);
}
