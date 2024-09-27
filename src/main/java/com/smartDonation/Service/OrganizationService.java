package com.smartDonation.Service;

import com.smartDonation.Entity.Organization;
import com.smartDonation.Repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrganizationService {


    @Autowired
    private OrganizationRepository organizationRepository;

    public Organization addOrganization(Organization organization) {
        return organizationRepository.save(organization);
    }
}
