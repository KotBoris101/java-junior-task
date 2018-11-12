package com.mcb.javajuniortask.model;

import java.math.BigDecimal;
import java.util.UUID;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Data
public class Payment {
    @Id
    private UUID id;
    private BigDecimal value;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
}

