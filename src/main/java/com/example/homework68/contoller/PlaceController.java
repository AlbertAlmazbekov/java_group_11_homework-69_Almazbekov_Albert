package com.example.homework66.contoller;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/places")
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class PlaceController {

}
