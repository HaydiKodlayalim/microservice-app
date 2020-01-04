package com.haydikodlayalim.messaging;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TicketNotification {
    private String ticketId;
    private String accountId;
    private String ticketDescription;
}
