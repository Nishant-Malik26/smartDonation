package com.smartDonation.Service;

import com.smartDonation.Entity.Rescue;
import com.smartDonation.Repository.RescueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RescueService {

    @Autowired
    private RescueRepository rescueRepository;

    public Rescue addRescue(Rescue rescue) {
        return rescueRepository.save(rescue);
    }
}
