package com.example.homework66.service;

import com.example.homework66.contoller.CustomerRegisterForm;
import com.example.homework66.dto.CustomerDTO;
import com.example.homework66.entity.Customer;
import com.example.homework66.exception.CustomerAlreadyRegisteredException;
import com.example.homework66.exception.CustomerNotFoundException;
import com.example.homework66.repository.CustomersRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

@Service
@AllArgsConstructor
public class CustomerService {

    private final CustomersRepository repository;
    private final PasswordEncoder encoder;

    public CustomerDTO register(@Valid CustomerRegisterForm form) {
        if (repository.existsByEmail(form.getEmail())) {
            throw new CustomerAlreadyRegisteredException();
        }

        var user = Customer.builder()
                .email(form.getEmail())
                .fullname(form.getName())
                .password(encoder.encode(form.getPassword()))
                .build();

        repository.save(user);

        return CustomerDTO.from(user);
    }


    public CustomerDTO getByEmail(String email) {
        var user = repository.findByEmail(email)
                .orElseThrow(CustomerNotFoundException::new);

        return CustomerDTO.from(user);
    }
}
