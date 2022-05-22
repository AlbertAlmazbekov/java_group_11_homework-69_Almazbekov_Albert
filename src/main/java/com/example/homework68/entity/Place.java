package com.example.homework66.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@Entity
@Table(name="places_table")
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    @Size(min = 1, max = 128)
    @Column(length = 128)
    private String name;

    @NotBlank
    @Size(max = 128)
    @Column(length = 128)
    private String address;

    @NotBlank
    @Size(min = 1, max = 128)
    private String image;
}
