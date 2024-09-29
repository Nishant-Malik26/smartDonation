package com.smartDonation.Controller;



import com.smartDonation.Entity.Organization;
import com.smartDonation.Service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/organizations")
public class OrganizationController {

    private final OrganizationService organizationService;


    @Autowired
    public OrganizationController(OrganizationService organizationService) {
        this.organizationService = organizationService;
    }

    @PostMapping("/save")
    public ResponseEntity<Organization> saveOrganization(
            @RequestParam("name") String name,
            @RequestParam("field") String field,
            @RequestParam(value = "category", required = false) String category,
            @RequestParam(value = "feature", required = false) List<String> feature,
            @RequestParam(value = "file", required = false) MultipartFile file
    ) throws IOException {
        Organization organization = new Organization();
        organization.setName(name);
        organization.setField(field);
        organization.setCategory(category);
        organization.setFeature(feature);

        Organization savedOrganization = organizationService.saveOrganization(organization, file);
        return ResponseEntity.ok(savedOrganization);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Organization> getOrganizationById(@PathVariable Long id) {
        Organization organization = organizationService.getOrganizationById(id);
        return ResponseEntity.ok(organization);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Organization>> getAllOrganizations() {
        List<Organization> organizations = organizationService.getAllOrganizations();
        return ResponseEntity.ok(organizations);
    }
}

