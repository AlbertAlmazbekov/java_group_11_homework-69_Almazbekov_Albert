package com.example.homework66.contoller;

import com.example.homework66.entity.Gadgets;
import com.example.homework66.repository.GadgetsRepository;
import com.example.homework66.service.GadgetService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/gadgets")
@RequiredArgsConstructor
public class GadgetController {
    private final GadgetService gadgetService;

//    @GetMapping
//    public String getGadgets(Model model){
//        List<Gadgets> gadgets = gadgetsRepository.findAll();
//        model.addAttribute("gadgets", gadgets);
//        return "tovar";
//    }
}

