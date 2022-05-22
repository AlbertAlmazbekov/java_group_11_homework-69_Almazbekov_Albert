package com.example.homework66.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Table(name = "gadgettype")
@Entity
public class GadgetType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    @Size(min = 1, max = 128)
    @Column(length = 128)
    private String name;

    @NotBlank
    @Size(min = 1, max = 128)
    @Column(length = 128)
    private String icon;
}
