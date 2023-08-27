package com.example.bookstoremanagementplatform.Controller;

import com.example.bookstoremanagementplatform.Models.Produs;
import com.example.bookstoremanagementplatform.Repositories.ProdusRepository;

public class ProdusController {
    private ProdusRepository produsRepository;

    public ProdusController(ProdusRepository produsRepository) {
        this.produsRepository = produsRepository;
    }
    public void adaugaProdus(Produs produs) {
        produsRepository.adaugaProdus(produs);
    }

    public Produs gasesteProdus(int id) {
        return produsRepository.gasesteProdus(id);
    }

    public void actualizeazaProdus(Produs produs) {
        produsRepository.actualizeazaProdus(produs);
    }

    public void stergeProdus(int id) {
        produsRepository.stergeProdus(id);
    }
}
