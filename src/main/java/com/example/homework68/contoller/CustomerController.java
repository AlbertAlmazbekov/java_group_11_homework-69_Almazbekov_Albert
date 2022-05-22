package com.example.homework66.contoller;

import com.example.homework66.entity.Customer;
import com.example.homework66.repository.CustomersRepository;
import com.example.homework66.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

import static java.util.stream.Collectors.toList;

@Controller
@RequestMapping
@AllArgsConstructor
public class CustomerController {

    private CustomerService customerService;

//    @GetMapping("/profile")
//    public String pageCustomerProfile(Model model, Principal principal)
//    {
//        var user = customerService.getByEmail(principal.getName());
//        model.addAttribute("dto", user);
//        return "profile";
//    }
//
//    @GetMapping("/register")
//    public String pageRegisterCustomer(Model model) {
//        if (!model.containsAttribute("dto")) {
//            model.addAttribute("dto", new CustomerRegisterForm());
//        }
//
//        return "register";
//    }
//
//    @PostMapping("/register")
//    public String registerPage(@Valid CustomerRegisterForm customerRequestDto,
//                               BindingResult validationResult,
//                               RedirectAttributes attributes) {
//        attributes.addFlashAttribute("dto", customerRequestDto);
//
//        if (validationResult.hasFieldErrors()) {
//            attributes.addFlashAttribute("errors", validationResult.getFieldErrors());
//            return "redirect:/register";
//        }
//
//        customerService.register(customerRequestDto);
//        return "redirect:/login";
//    }

    @GetMapping("/register")
    public String pageRegisterCustomer(Model model) {
        if (!model.containsAttribute("form")) {
            model.addAttribute("form", new CustomerRegisterForm());
        }
        return "register";
    }

    @GetMapping("/test")
    @ResponseBody
    public String getTestPage(@Valid CustomerRegisterForm form) {
        return form.getEmail();
    }

    @GetMapping("/profile")
    public String pageCustomerProfile() {
        return "profile";
    }


    @GetMapping("/login")
    public String loginPage(@RequestParam(required = false, defaultValue = "false") Boolean error, Model model) {
        model.addAttribute("error", error);
        return "login";
    }


    @ExceptionHandler(BindException.class)
    private ResponseEntity<Object> handleBindExceptionResponseEntity(BindException ex) {
        var apiFieldErrors = ex.getFieldErrors()
                .stream()
                .map(fe -> String.format("%s -> %s", fe.getField(), fe.getDefaultMessage()))
                .collect(toList());
        return ResponseEntity.unprocessableEntity()
                .body(apiFieldErrors);
    }

    @PostMapping("/register")
    public String registerPage(@Valid CustomerRegisterForm customerRequestDto,
                               BindingResult validationResult,
                               RedirectAttributes attributes) {
        attributes.addFlashAttribute("dto", customerRequestDto);

        if (validationResult.hasFieldErrors()) {
            attributes.addFlashAttribute("errors", validationResult.getFieldErrors());
            return "redirect:/register";
        }

        customerService.register(customerRequestDto);
        return "redirect:/login";
    }

//    @PostMapping("/register")
//    public String registerPage(@Valid CustomerRegisterForm form,
//                               BindingResult validationResult,
//                               RedirectAttributes attributes) {
//
//        // добавим в модель-представление нашу форму с данными
//        attributes.addFlashAttribute("form", form);
//
//        if (validationResult.hasFieldErrors()) {
//            attributes.addFlashAttribute("errors", validationResult.getFieldErrors());
//            return "redirect:/register";
//        }
//
//        // TODO actually register customer
//        // TODO do any other stuff
//        // TODO append session data
//
//        return "redirect:/profile";
//    }
}
