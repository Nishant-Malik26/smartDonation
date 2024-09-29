package com.smartDonation.Entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Organization")
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String field;

    @Column
    private String category;

    @Column
    private String thumbnail;  // URL to store the path of the uploaded file

    @ElementCollection
    @Column(name = "feature")
    private List<String> feature; // List of features

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getField() { return field; }
    public void setField(String field) { this.field = field; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public String getThumbnail() { return thumbnail; }
    public void setThumbnail(String thumbnail) { this.thumbnail = thumbnail; }

    public List<String> getFeature() { return feature; }
    public void setFeature(List<String> feature) { this.feature = feature; }
}


