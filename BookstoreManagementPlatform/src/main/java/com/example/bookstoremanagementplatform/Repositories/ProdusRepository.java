package com.example.bookstoremanagementplatform.Repositories;

import com.example.bookstoremanagementplatform.Models.Autor;
import com.example.bookstoremanagementplatform.Models.Produs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdusRepository extends JpaRepository<Produs, Integer> {
    void adaugaProdus(Produs produs);
    Produs gasesteProdus(int id);
    void actualizeazaProdus(Produs produs);
    void stergeProdus(int id);
}
