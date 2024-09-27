package com.smartDonation.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "rescue")
public class Rescue {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private LocalDate rescueDate;
    private String animal;
    private String gender;
    private String breed;
    private String condition;
    private String informerName;
    private String informerContact;
    private Boolean informerToProfit;
    private String informerId;
    private String location;
    private Integer ageMonths;
    private Integer ageYears;
    private Boolean neutered;
    private Boolean vaccinated;
    private LocalDate vaccinationDate;
    private String rescuedBy;
    private String status;
    private String color;
    private String photoUri;
    private String immediateCare;
    private String problemDescription;
    private String isolationProvided;




}
