package com.haydikodlayalim.ticketservice.model;

import lombok.Getter;

@Getter
public enum PriorityType {

    URGENT("Acil"),
    LOW("Önemsiz"),
    HIGH("Yüksek Öncelikli");

    private String label;

    PriorityType(String label){
        this.label = label;
    }

}
