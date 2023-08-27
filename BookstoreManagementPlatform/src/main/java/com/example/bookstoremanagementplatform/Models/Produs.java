package com.example.bookstoremanagementplatform.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.math.BigDecimal;
@Entity
@Table(name = "Produse")
public class Produs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nume")
    private String nume;
    @Column(name = "pret")
    private BigDecimal pret;

    @JoinColumn(name = "id_categorie")
    @JsonProperty("id_categorie")
    private Integer idCategorie;

    @JoinColumn(name = "id_autor")
    @JsonProperty("id_autor")
    private Integer idAutor;


    public Produs(Integer id, String nume, BigDecimal pret, Integer categorie, Integer autor) {
        if (nume == null || pret == null) {
            throw new IllegalArgumentException("Numele și prețul nu pot fi nule.");
        }

        this.id = id;
        this.nume = nume;
        this.pret = pret;
        this.idCategorie = categorie;
        this.idAutor = autor;
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

    public BigDecimal getPret() {
        return pret;
    }

    public void setPret(BigDecimal pret) {
        this.pret = pret;
    }

    public Integer getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(Integer idCategorie) {
        this.idCategorie = idCategorie;
    }

    public Integer getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Integer idAutor) {
        this.idAutor = idAutor;
    }

}
