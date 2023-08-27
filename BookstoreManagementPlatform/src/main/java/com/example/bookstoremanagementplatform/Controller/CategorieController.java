package com.example.bookstoremanagementplatform.Controller;

import com.example.bookstoremanagementplatform.Models.Categorie;
import com.example.bookstoremanagementplatform.Repositories.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorii")
public class CategorieController {

    private final CategorieRepository categorieRepository;

    @Autowired
    public CategorieController(CategorieRepository categorieRepository) {
        this.categorieRepository = categorieRepository;
    }

    @GetMapping
    public List<Categorie> listaCategorii() {
        return categorieRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Categorie> gasesteCategorie(@PathVariable int id) {
        return categorieRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Categorie> adaugaCategorie(@RequestBody Categorie categorie) {
        Categorie categorieAdaugata = categorieRepository.save(categorie);
        return ResponseEntity.status(HttpStatus.CREATED).body(categorieAdaugata);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Categorie> actualizeazaCategorie(@PathVariable int id, @RequestBody Categorie categorie) {
        if (!categorieRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        categorie.setId(id);
        Categorie categorieActualizata = categorieRepository.save(categorie);
        return ResponseEntity.ok(categorieActualizata);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> stergeCategorie(@PathVariable int id) {
        if (!categorieRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        categorieRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
