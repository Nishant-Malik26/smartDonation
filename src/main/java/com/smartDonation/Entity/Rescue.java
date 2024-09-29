package com.smartDonation.Entity;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Rescue")
public class Rescue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(name = "rescue_date", columnDefinition = "DATE DEFAULT CURRENT_DATE")
    private Date rescueDate = new Date();

    @Column(nullable = false)
    private String animal;

    @Column(nullable = false)
    private String gender;

    @Column
    private String breed;

    @Column
    private String condition;

    @Column(name = "informer_name")
    private String informerName;

    @Column(name = "informer_contact")
    private String informerContact;

    @Column(name = "informer_to_profit", columnDefinition = "BOOLEAN DEFAULT FALSE")
    private Boolean informerToProfit = false;

    @Column(name = "informer_id")
    private String informerId;

    @Column
    private String location;

    @Column(name = "age_months")
    private Integer ageMonths;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "age_years")
    private Integer ageYears;

    @Column(name = "neutered", columnDefinition = "BOOLEAN DEFAULT FALSE")
    private Boolean neutered = false;

    @Column(name = "vaccinated", columnDefinition = "BOOLEAN DEFAULT FALSE")
    private Boolean vaccinated = false;

    @Column(name = "vaccination_date")
    private Date vaccinationDate;

    @Column(name = "rescued_by")
    private String rescuedBy;

    @Column(name = "status", columnDefinition = "VARCHAR(20) DEFAULT 'Rescued'")
    private String status = "Rescued";

    @Column
    private String color;

    @Column(name = "photo_uri")
    private String photoUri; // Store the uploaded photo's path

    @Column(name = "immediate_care")
    private String immediateCare;

    @Column(name = "problem_description")
    private String problemDescription;

    @Column(name = "isolation_provided")
    private String isolationProvided;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getRescueDate() {
        return rescueDate;
    }

    public void setRescueDate(Date rescueDate) {
        this.rescueDate = rescueDate;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getInformerName() {
        return informerName;
    }

    public void setInformerName(String informerName) {
        this.informerName = informerName;
    }

    public String getInformerContact() {
        return informerContact;
    }

    public void setInformerContact(String informerContact) {
        this.informerContact = informerContact;
    }

    public Boolean getInformerToProfit() {
        return informerToProfit;
    }

    public void setInformerToProfit(Boolean informerToProfit) {
        this.informerToProfit = informerToProfit;
    }

    public String getInformerId() {
        return informerId;
    }

    public void setInformerId(String informerId) {
        this.informerId = informerId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getAgeMonths() {
        return ageMonths;
    }

    public void setAgeMonths(Integer ageMonths) {
        this.ageMonths = ageMonths;
    }

    public Integer getAgeYears() {
        return ageYears;
    }

    public void setAgeYears(Integer ageYears) {
        this.ageYears = ageYears;
    }

    public Boolean getNeutered() {
        return neutered;
    }

    public void setNeutered(Boolean neutered) {
        this.neutered = neutered;
    }

    public Boolean getVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(Boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    public Date getVaccinationDate() {
        return vaccinationDate;
    }

    public void setVaccinationDate(Date vaccinationDate) {
        this.vaccinationDate = vaccinationDate;
    }

    public String getRescuedBy() {
        return rescuedBy;
    }

    public void setRescuedBy(String rescuedBy) {
        this.rescuedBy = rescuedBy;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPhotoUri() {
        return photoUri;
    }

    public void setPhotoUri(String photoUri) {
        this.photoUri = photoUri;
    }

    public String getImmediateCare() {
        return immediateCare;
    }

    public void setImmediateCare(String immediateCare) {
        this.immediateCare = immediateCare;
    }

    public String getProblemDescription() {
        return problemDescription;
    }

    public void setProblemDescription(String problemDescription) {
        this.problemDescription = problemDescription;
    }

    public String getIsolationProvided() {
        return isolationProvided;
    }

    public void setIsolationProvided(String isolationProvided) {
        this.isolationProvided = isolationProvided;
    }
}

