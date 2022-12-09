package com.example.case_module_n4.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PersonDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double height;
    private double weight;
    public double fixedsalary;
    private String playtime;

    @OneToOne
    private Account account;
    @ManyToOne
    private Position position;
    @ManyToOne
    private Ranks rank;
    @ManyToOne
    private Manners manners;
}
