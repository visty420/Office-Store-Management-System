package com.example.bookstoremanagementplatform.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "Categorii")
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nume")
    private String nume;

    public Categorie(Integer id, String nume) {
        if (nume == null || nume.isEmpty()) {
            throw new IllegalArgumentException("Numele categoriei nu poate fi gol.");
        }

        this.id = id;
        this.nume = nume;
    }

    public Categorie() {

    }

    // Getteri și setteri aici...
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

}
