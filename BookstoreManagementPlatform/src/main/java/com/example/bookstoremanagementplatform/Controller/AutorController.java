package com.example.bookstoremanagementplatform.Controller;

import com.example.bookstoremanagementplatform.Models.Autor;
import com.example.bookstoremanagementplatform.Repositories.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/autori")
public class AutorController {

    private final AutorRepository autorRepository;

    @Autowired
    public AutorController(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    @PostMapping("/adauga")
    public ResponseEntity<Autor> adaugaAutor(@RequestBody Autor autor) {
        try {
            Autor nouAutor = autorRepository.save(autor);
            return new ResponseEntity<>(nouAutor, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Autor> gasesteAutor(@PathVariable Integer id) {
        Optional<Autor> autorOptional = autorRepository.findById(id);
        return autorOptional.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Autor> actualizeazaAutor(@PathVariable Integer id, @RequestBody Autor autor) {
        if (!autorRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        autor.setId(id);  // Asigurați-vă că aveți o metodă setId în clasa Autor
        Autor autorActualizat = autorRepository.save(autor);
        return ResponseEntity.ok(autorActualizat);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> stergeAutor(@PathVariable Integer id) {
        if (!autorRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        autorRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}