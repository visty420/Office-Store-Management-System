package com.example.bookstoremanagementplatform.Repositories;

import com.example.bookstoremanagementplatform.Models.Categorie;

public interface CategorieRepository {
    void adaugaCategorie(Categorie categorie);
    Categorie gasesteCategorie(int id);
    void actualizeazaCategorie(Categorie categorie);
    void stergeCategorie(int id);
}
