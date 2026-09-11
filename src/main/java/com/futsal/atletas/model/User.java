package com.futsal.atletas.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password; // Guardada encriptada com BCrypt

    private String role; // Ex: "ADMIN" ou "CLIENT"

    // Getters e Setters
}
