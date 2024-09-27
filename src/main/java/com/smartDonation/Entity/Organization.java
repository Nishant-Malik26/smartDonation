package com.smartDonation.Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "organization")
public class Organization {
    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String field;
    private String category;
    private String thumbnail;

    @ElementCollection
    private List<String> feature;  // List to hold multiple features


}

