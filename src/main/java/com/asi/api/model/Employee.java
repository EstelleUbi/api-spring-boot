package com.asi.api.model;

import lombok.Data;

import javax.persistence.*;

// Cette classe Java est une entité. Cela signifie que la classe représente la table.
        // Chaque ligne de la table correspondra à une instance de la classe.
@Data
@Entity
@Table(name="employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String mail;

    private String password;
}