package com.example.bookstoremanagementplatform.Repositories;

import com.example.bookstoremanagementplatform.Models.Produs;

public interface ProdusRepository {
    void adaugaProdus(Produs produs);
    Produs gasesteProdus(int id);

    void actualizeazaProdus(Produs produs);

    void stergeProdus(int id);
}
