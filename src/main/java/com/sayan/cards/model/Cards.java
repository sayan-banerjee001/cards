package com.sayan.cards.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter @Setter @ToString
public class Cards {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "card_id")
    private int cardId;
    @Column(name = "card_number")
    private String cardNumber;
    @Column(name = "customer_id")
    private int customerId;
    @Column(name = "card_type")
    private String cardType;
    @Column(name = "total_limit")
    private int totalLimit;
    @Column(name = "amount_used")
    private int amountUsed;
    @Column(name = "available_amount")
    private int availableAmount;
    @Column(name = "create_dt")
    private LocalDate createDate;
}
