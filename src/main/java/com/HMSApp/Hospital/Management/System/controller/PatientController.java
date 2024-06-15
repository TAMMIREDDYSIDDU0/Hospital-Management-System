package com.HMSApp.Hospital.Management.System.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import com.HMSApp.Hospital.Management.System.entity.patient; // Adjust import statement here
import com.HMSApp.Hospital.Management.System.repository.PatientRepository;

@RestController
@RequestMapping("/api/v1")
public class PatientController {

    private final PatientRepository patientRepository;

    // Constructor
    public PatientController(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @PostMapping("/insert")
    public patient createPatient(@RequestBody patient patient) { // Adjust method parameter type here
        return patientRepository.save(patient);
    }
    @GetMapping
    public List<patient>getAllPatient()
    {
    	return patientRepository.findAll();
    }
}
