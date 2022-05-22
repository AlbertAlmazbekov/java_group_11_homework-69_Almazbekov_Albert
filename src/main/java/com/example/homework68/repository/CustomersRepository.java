package com.example.homework66.repository;

import com.example.homework66.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomersRepository extends JpaRepository<Customer, Integer> {
    boolean existsByEmail(String email);

    Optional<Customer> findByEmail(String email);
}
