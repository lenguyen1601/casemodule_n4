package com.example.case_module_n4.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Ranks {
    @Id
    private long id;
    private String rankstar;
    private double ranksalary;
}
