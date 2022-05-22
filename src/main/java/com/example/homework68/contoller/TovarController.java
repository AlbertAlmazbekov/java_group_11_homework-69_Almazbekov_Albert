package com.example.homework66.contoller;

import com.example.homework66.entity.Tovar;
import com.example.homework66.repository.TovarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/tovar")
@RequiredArgsConstructor
public class TovarController {
    private final TovarRepository tovarRepository;

    @GetMapping
    public String getIndex(Model model, Pageable pageable){
        Page<Tovar> tovars = tovarRepository.findAll(pageable);
        model.addAttribute("tovars", tovars.getContent());
        model.addAttribute("pattern", "");
        return "tovar";
    }

    @GetMapping("/search")
    public String getSearch(Model model, @RequestParam String pattern, Pageable pageable){
        Page<Tovar> tovars = tovarRepository.findByNameContainsIgnoreCase(pattern, pageable);
        model.addAttribute("tovars", tovars.getContent());
        model.addAttribute("pattern", pattern);
        return "tovar";
    }
}
