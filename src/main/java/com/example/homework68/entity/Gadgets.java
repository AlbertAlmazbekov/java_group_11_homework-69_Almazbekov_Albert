package com.example.homework66.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

@Entity
@Table(name = "gadgets_table")
@Getter
@Setter
@Builder
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Gadgets {
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
    private String image;

    @Positive
    private Integer price;

    @ManyToOne
    @NotNull
    private GadgetType gadgetType;

    @ManyToOne(fetch = FetchType.LAZY)
    private Place place;

}
