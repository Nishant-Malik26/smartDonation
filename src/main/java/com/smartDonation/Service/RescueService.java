package com.smartDonation.Service;

import com.smartDonation.Entity.Rescue;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface RescueService {

    Rescue saveRescue(Rescue rescue, MultipartFile file) throws IOException;

    Rescue getRescueById(Long id);

    List<Rescue> getAllRescues();
}

