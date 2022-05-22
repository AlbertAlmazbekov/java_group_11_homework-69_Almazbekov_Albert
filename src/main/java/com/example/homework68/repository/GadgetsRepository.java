package com.example.homework66.repository;

import com.example.homework66.entity.Gadgets;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GadgetsRepository extends JpaRepository<Gadgets, Integer> {
    Page<Gadgets> findAllByPlaceId(int placeId, Pageable pageable);
}
