package com.example.bookstoremanagementplatform.Controller;

import com.example.bookstoremanagementplatform.Models.Categorie;
import com.example.bookstoremanagementplatform.Repositories.CategorieRepository;

public class CategorieController {
    private CategorieRepository categorieRepository;

    public CategorieController(CategorieRepository categorieRepository) {
        this.categorieRepository = categorieRepository;
    }

    public void adaugaCategorie(Categorie categorie) {
        categorieRepository.adaugaCategorie(categorie);
    }

    public Categorie gasesteCategorie(int id) {
        return categorieRepository.gasesteCategorie(id);
    }

    public void actualizeazaCategorie(Categorie categorie) {
        categorieRepository.actualizeazaCategorie(categorie);
    }

    public void stergeCategorie(int id) {
        categorieRepository.stergeCategorie(id);
    }
}
