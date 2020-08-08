package com.example.hibernatepractice.model;

import lombok.*;

import javax.persistence.Entity;



import javax.persistence.*;
@ToString
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="customer")
public class Customer {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="email")
    private String email;

}
