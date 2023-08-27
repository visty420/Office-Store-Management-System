package com.example.bookstoremanagementplatform.Models;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Autori")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nume", length = 35)
    private String nume;
    @Temporal(TemporalType.DATE)
    @Column(name = "data_nasterii")
    private Date dataNasterii;
    @Column(name = "nationalitate")
    private String nationalitate;

    public Autor() {

    }

    /*public Autor(int id, String nume, Date dataNasterii, String nationalitate) {
        if (nume == null || dataNasterii == null || nationalitate == null) {
            throw new IllegalArgumentException("Toate câmpurile trebuie completate.");
        }
        this.id = id;
        this.nume = nume;
        this.dataNasterii = dataNasterii;
        this.nationalitate = nationalitate;
    }*/


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

    public Date getDataNasterii() {
        return dataNasterii;
    }

    public void setDataNasterii(Date dataNasterii) {
        this.dataNasterii = dataNasterii;
    }

    public String getNationalitate() {
        return nationalitate;
    }

    public void setNationalitate(String nationalitate) {
        this.nationalitate = nationalitate;
    }
    @Override
    public String toString() {
        return "Autor{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", dataNasterii=" + dataNasterii +
                ", nationalitate='" + nationalitate + '\'' +
                '}';
    }
}
