package com.workintech.s18d4.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "address", schema ="fsweb")
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "street")
    private String street;
    @Column(name = "no")
    private Integer no;
    @Column(name = "city")
    private String city;
    @Column(name = "country")
    private String country;
    @Column(name = "description")
    private String description;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    private Customer customer;
}