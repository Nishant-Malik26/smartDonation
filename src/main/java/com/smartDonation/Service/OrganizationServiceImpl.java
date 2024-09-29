package com.smartDonation.Service;

import com.smartDonation.Entity.Organization;
import com.smartDonation.Repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Service
public class OrganizationServiceImpl implements OrganizationService {

    private final OrganizationRepository organizationRepository;

    @Autowired
    public OrganizationServiceImpl(OrganizationRepository organizationRepository) {
        this.organizationRepository = organizationRepository;
    }

    @Override
    public Organization saveOrganization(Organization organization, MultipartFile file) throws IOException {
        // Save uploaded file
        if (!file.isEmpty()) {
            String fileName = UUID.randomUUID() + "_" + file.getOriginalFilename();
            String filePath = "/Users/prernamalik/downloads/uploads/" + fileName; // This is where the file will be saved

            File dest = new File(filePath);
            dest.getParentFile().mkdirs();
            file.transferTo(dest);

            organization.setThumbnail(filePath);  // Set the file path in the thumbnail field
        }

        return organizationRepository.save(organization);
    }

    @Override
    public Organization getOrganizationById(Long id) {
        return organizationRepository.findById(id).orElseThrow(() -> new RuntimeException("Organization not found"));
    }

    @Override
    public List<Organization> getAllOrganizations() {
        return organizationRepository.findAll();
    }
}

