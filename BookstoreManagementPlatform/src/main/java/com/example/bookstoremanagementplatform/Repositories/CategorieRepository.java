package com.example.bookstoremanagementplatform.Repositories;

import com.example.bookstoremanagementplatform.Models.Autor;
import com.example.bookstoremanagementplatform.Models.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository extends JpaRepository<Categorie, Integer> {
    void adaugaCategorie(Categorie categorie);
    Categorie gasesteCategorie(int id);
    void actualizeazaCategorie(Categorie categorie);
    void stergeCategorie(int id);
}
