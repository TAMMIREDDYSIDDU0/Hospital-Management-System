package com.HMSApp.Hospital.Management.System.doclogin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HMSApp.Hospital.Management.System.doclogin.entity.Medicine;
import com.HMSApp.Hospital.Management.System.doclogin.repository.MedicineRepository;

@RestController
@RequestMapping("/api/v3")
public class MedicineController {

    private final MedicineRepository medicineRepository;

    @Autowired
    public MedicineController(MedicineRepository medicineRepository) {
        this.medicineRepository = medicineRepository;
    }

    @PostMapping("/insert")
    public Medicine createMedicine(@RequestBody Medicine medicine) {
        return medicineRepository.save(medicine);
    }
}
