package com.smartDonation.Controller;

import com.smartDonation.Entity.Rescue;
import com.smartDonation.Service.RescueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/rescue")
public class RescueController {

    @Autowired
    private RescueService rescueService;

    @PostMapping
    public ResponseEntity<Rescue> addRescue(@RequestBody Rescue rescue) {
        Rescue savedRescue = rescueService.addRescue(rescue);
        return new ResponseEntity<>(savedRescue, HttpStatus.CREATED);
    }
}
