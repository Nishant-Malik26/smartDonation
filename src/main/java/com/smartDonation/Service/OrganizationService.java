package com.smartDonation.Service;

import com.smartDonation.Entity.Organization;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface OrganizationService {

    Organization saveOrganization(Organization organization, MultipartFile file) throws IOException;

    Organization getOrganizationById(Long id);

    List<Organization> getAllOrganizations();
}

