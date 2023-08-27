package com.example.bookstoremanagementplatform.Models;

import jakarta.persistence.*;

import java.math.BigDecimal;
@Entity
@Table(name = "Produse")
public class Produs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nume")
    private String nume;
    @Column(name = "pret")
    private BigDecimal pret;
    @ManyToOne
    @JoinColumn(name = "id_categorie")
    private int idCategorie;
    @ManyToOne
    @JoinColumn(name = "id_autor")
    private int idAutor;


    public Produs(int id, String nume, BigDecimal pret, int idCategorie, int idAutor) {
        if (nume == null || pret == null) {
            throw new IllegalArgumentException("Numele și prețul nu pot fi nule.");
        }

        this.id = id;
        this.nume = nume;
        this.pret = pret;
        this.idCategorie = idCategorie;
        this.idAutor = idAutor;
    }

    // Getteri și setteri aici...
    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(int idCategorie) {
        this.idCategorie = idCategorie;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    @Override
    public String toString() {
        return "Produs{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", pret=" + pret +
                ", idCategorie=" + idCategorie +
                ", idAutor=" + idAutor +
                '}';
    }
}
