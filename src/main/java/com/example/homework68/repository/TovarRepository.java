package com.example.homework66.repository;


import com.example.homework66.entity.Tovar;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TovarRepository extends JpaRepository<Tovar, Long> {
    Page<Tovar> findByNameContainsIgnoreCase(String pattern, Pageable pageable);
}