package com.example.case_module_n4.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Manners {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String manners;
}
