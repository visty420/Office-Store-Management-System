package com.example.bookstoremanagementplatform.Repositories;

import com.example.bookstoremanagementplatform.Models.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Integer> {
    void adaugaAutor(Autor autor);
    Autor gasesteAutor(int id);
    void actualizeazaAutor(Autor autor);
    void stergeAutor(int id);
}
