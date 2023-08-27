package com.example.bookstoremanagementplatform.Repositories;

import com.example.bookstoremanagementplatform.Models.Autor;
import com.example.bookstoremanagementplatform.Models.Produs;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProdusRepository extends JpaRepository<Produs, Integer> {
    Optional<Produs> findById(Integer id);
}
