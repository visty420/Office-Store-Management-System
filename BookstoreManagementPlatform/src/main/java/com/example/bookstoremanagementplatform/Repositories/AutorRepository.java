package com.example.bookstoremanagementplatform.Repositories;

import com.example.bookstoremanagementplatform.Models.Autor;

public interface AutorRepository {
    void adaugaAutor(Autor autor);
    Autor gasesteAutor(int id);
    void actualizeazaAutor(Autor autor);
    void stergeAutor(int id);
}
