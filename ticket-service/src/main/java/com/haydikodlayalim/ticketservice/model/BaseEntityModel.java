package com.haydikodlayalim.ticketservice.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import org.springframework.data.annotation.CreatedDate;

@MappedSuperclass
public abstract class BaseEntityModel implements Serializable {

    @CreatedDate
    @Column(name = "created_at")
    private Date cretedAt;

    @Column(name = "updated_at")
    private Date updatedAt;
}
