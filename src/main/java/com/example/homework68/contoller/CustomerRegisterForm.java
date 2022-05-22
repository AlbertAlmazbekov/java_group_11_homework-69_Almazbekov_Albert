package com.example.homework66.contoller;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Getter
@Setter
public class CustomerRegisterForm {
    @NotBlank
    @Email
    private String email = "";

    @Size(min=4, max=24, message = "length must be >= 2 and <= 25")
    @Pattern(regexp = "^[^\\d\\s]+$", message = "should contain only letters")
    private String name = "";

    @NotBlank
    private String password = "";
}