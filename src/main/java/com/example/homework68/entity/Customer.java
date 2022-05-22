package com.example.homework66.entity;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Table(name = "customers")
@Entity
@Builder
@Getter
@Setter
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Email
    @NotBlank
    @Size(min = 1, max = 128)
    @Column(length = 128)
    private String email;

    @NotBlank
    @Size(min = 1, max = 128)
    @Column(length = 128)
    private String fullname;


    @NotBlank
    @Size(min = 1, max = 128)
    @Column(length = 128)
    private String password;

    @Column
    @Builder.Default
    private boolean enabled = true;

    @NotBlank
    @Size(min = 1, max = 128)
    @Column(length = 128)
    @Builder.Default
    private String role = "USER";
}
