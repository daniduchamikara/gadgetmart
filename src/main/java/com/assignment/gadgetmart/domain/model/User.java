package com.assignment.gadgetmart.domain.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String username;
    private int isActive;
    private String email;
    private String password;
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String mobile;

    
}
