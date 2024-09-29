package com.smartDonation.Service;

import com.smartDonation.Entity.Rescue;
import com.smartDonation.Repository.RescueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Service
public class RescueServiceImpl implements RescueService {

    private final RescueRepository rescueRepository;

    @Autowired
    public RescueServiceImpl(RescueRepository rescueRepository) {
        this.rescueRepository = rescueRepository;
    }

    @Override
    public Rescue saveRescue(Rescue rescue, MultipartFile file) throws IOException {
        // Save the uploaded file if available
        if (!file.isEmpty()) {
            String fileName = UUID.randomUUID() + "_" + file.getOriginalFilename();
            String filePath = "/Users/prernamalik/downloads/uploads/" + fileName;

            File dest = new File(filePath);
            dest.getParentFile().mkdirs(); // Ensure the directory exists
            file.transferTo(dest);

            rescue.setPhotoUri(filePath);  // Save the file path in the entity
        }

        return rescueRepository.save(rescue);
    }

    @Override
    public Rescue getRescueById(Long id) {
        return rescueRepository.findById(id).orElseThrow(() -> new RuntimeException("Rescue not found"));
    }

    @Override
    public List<Rescue> getAllRescues() {
        return rescueRepository.findAll();
    }
}

