package com.workintech.s18d4.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "account", schema ="fsweb")
@Data
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "account_name")
    private String accountName;
    @Column(name = "money_amount")
    private double moneyAmount;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "customer_id")
    private Customer customer;
}