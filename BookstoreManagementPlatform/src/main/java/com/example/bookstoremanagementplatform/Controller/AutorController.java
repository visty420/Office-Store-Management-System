package com.example.bookstoremanagementplatform.Controller;

import com.example.bookstoremanagementplatform.Models.Autor;
import com.example.bookstoremanagementplatform.Repositories.AutorRepository;

public class AutorController {
    private AutorRepository autorRepository;

    public AutorController(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    public void adaugaAutor(Autor autor) {
        autorRepository.adaugaAutor(autor);
    }

    public Autor gasesteAutor(int id) {
        return autorRepository.gasesteAutor(id);
    }

    public void actualizeazaAutor(Autor autor) {
        autorRepository.actualizeazaAutor(autor);
    }

    public void stergeAutor(int id) {
        autorRepository.stergeAutor(id);
    }
}
