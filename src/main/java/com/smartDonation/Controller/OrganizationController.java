package com.smartDonation.Controller;


import com.smartDonation.Entity.Organization;
import com.smartDonation.Service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/organization")
public class OrganizationController {

    @Autowired
    private OrganizationService organizationService;

    @PostMapping
    public ResponseEntity<Organization> addOrganization(@RequestBody Organization organization) {
        Organization savedOrganization = organizationService.addOrganization(organization);
        return new ResponseEntity<>(savedOrganization, HttpStatus.CREATED);
    }
}
