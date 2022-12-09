package com.example.case_module_n4.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    public String username;
    public String password;
    public String fullname;
    public String email;
    public String phonenumber;
    public String address;
    public String img;
    public String status;

    @ManyToOne
    private Roles roles;
}