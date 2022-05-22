package com.example.homework66.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "tovars")

public class Tovar {
    @Id
    private Long id;

    private String name;

}
