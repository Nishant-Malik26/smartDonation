package com.smartDonation.Controller;

import com.smartDonation.Entity.Rescue;
import com.smartDonation.Service.RescueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/rescues")
public class RescueController {

    private final RescueService rescueService;

    @Autowired
    public RescueController(RescueService rescueService) {
        this.rescueService = rescueService;
    }

    @PostMapping("/save")
    public ResponseEntity<Rescue> saveRescue(
            @RequestParam("name") String name,
            @RequestParam("animal") String animal,
            @RequestParam("gender") String gender,
            @RequestParam(value = "breed", required = false) String breed,
            @RequestParam(value = "condition", required = false) String condition,
            @RequestParam(value = "informer_name", required = false) String informerName,
            @RequestParam(value = "informer_contact", required = false) String informerContact,
            @RequestParam(value = "informer_id", required = false) String informerId,
            @RequestParam(value = "location", required = false) String location,
            @RequestParam(value = "age_months", required = false) Integer ageMonths,
            @RequestParam(value = "age_years", required = false) Integer ageYears,
            @RequestParam(value = "rescued_by", required = false) String rescuedBy,
            @RequestParam(value = "file", required = false) MultipartFile file
    ) throws IOException {
        Rescue rescue = new Rescue();
        rescue.setName(name);
        rescue.setAnimal(animal);
        rescue.setGender(gender);
        rescue.setBreed(breed);
        rescue.setCondition(condition);
        rescue.setInformerName(informerName);
        rescue.setInformerContact(informerContact);
        rescue.setInformerId(informerId);
        rescue.setLocation(location);
        rescue.setAgeMonths(ageMonths);
        rescue.setAgeYears(ageYears);
        rescue.setRescuedBy(rescuedBy);

        Rescue savedRescue = rescueService.saveRescue(rescue, file);
        return ResponseEntity.ok(savedRescue);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Rescue> getRescueById(@PathVariable Long id) {
        Rescue rescue = rescueService.getRescueById(id);
        return ResponseEntity.ok(rescue);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Rescue>> getAllRescues() {
        List<Rescue> rescues = rescueService.getAllRescues();
        return ResponseEntity.ok(rescues);
    }
}

