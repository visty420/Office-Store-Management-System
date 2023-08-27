package com.example.bookstoremanagementplatform.Controller;

import com.example.bookstoremanagementplatform.Models.Autor;
import com.example.bookstoremanagementplatform.Repositories.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/autori")
public class AutorController {

    private final AutorRepository autorRepository;

    @Autowired
    public AutorController(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    @PostMapping
    public Autor adaugaAutor(@RequestBody Autor autor) {
        return autorRepository.save(autor);
    }

    @GetMapping("/{id}")
    public Autor gasesteAutor(@PathVariable int id) {
        return autorRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Autor actualizeazaAutor(@PathVariable int id, @RequestBody Autor autor) {
        if (autorRepository.existsById(id)) {
            autor.setId(id);
            return autorRepository.save(autor);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void stergeAutor(@PathVariable int id) {
        autorRepository.deleteById(id);
    }
}