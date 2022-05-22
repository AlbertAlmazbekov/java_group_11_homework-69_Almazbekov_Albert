package com.example.homework66.service;

import com.example.homework66.dto.PlaceDTO;
import com.example.homework66.exception.ResourceNotFoundException;
import com.example.homework66.repository.PlaceRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;

public class PlaceService {
    private final PlaceRepository placeRepository;

    public PlaceService(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }


    public Slice<PlaceDTO> getPlaces(Pageable pageable) {
        return placeRepository.findAll(pageable)
                .map(PlaceDTO::from);
        //.toList();
    }

    public PlaceDTO getPlace(int id) {
        var place = placeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("place " + id));
        return PlaceDTO.from(place);
    }
}
