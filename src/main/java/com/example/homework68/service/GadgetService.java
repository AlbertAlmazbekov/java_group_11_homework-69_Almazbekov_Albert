package com.example.homework66.service;

import com.example.homework66.dto.GadgetDTO;
import com.example.homework66.repository.GadgetsRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class GadgetService {
    private final GadgetsRepository gadgetsRepository;

    public Slice<GadgetDTO> getGadgets(int id, Pageable pageable) {
        return gadgetsRepository.findAllByPlaceId(id, pageable)
                .map(GadgetDTO::from);
    }
}
