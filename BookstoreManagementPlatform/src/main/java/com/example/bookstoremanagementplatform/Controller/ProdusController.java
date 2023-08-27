package com.example.bookstoremanagementplatform.Controller;

import com.example.bookstoremanagementplatform.Models.Produs;
import com.example.bookstoremanagementplatform.Repositories.ProdusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produse")
public class ProdusController {

    private final ProdusRepository produsRepository;

    @Autowired
    public ProdusController(ProdusRepository produsRepository) {
        this.produsRepository = produsRepository;
    }

    @GetMapping
    public List<Produs> listaProduse() {
        return produsRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produs> gasesteProdus(@PathVariable int id) {
        Optional<Produs> produsOptional = produsRepository.findById(id);
        return produsOptional.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/{adauga}")
    public ResponseEntity<Produs> adaugaProdus(@RequestBody Produs produs) {
        Produs produsAdaugat = produsRepository.save(produs);
        return ResponseEntity.status(HttpStatus.CREATED).body(produsAdaugat);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Produs> actualizeazaProdus(@PathVariable int id, @RequestBody Produs produs) {
        if (!produsRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        produs.setId(id);  // Asigurați-vă că aveți o metodă setId în clasa Produs
        Produs produsActualizat = produsRepository.save(produs);
        return ResponseEntity.ok(produsActualizat);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> stergeProdus(@PathVariable int id) {
        if (!produsRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        produsRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
