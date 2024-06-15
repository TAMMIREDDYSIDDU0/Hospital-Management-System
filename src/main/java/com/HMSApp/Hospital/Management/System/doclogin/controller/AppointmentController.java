package com.HMSApp.Hospital.Management.System.doclogin.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HMSApp.Hospital.Management.System.doclogin.repository.AppointmentsRepository;
import com.HMSApp.Hospital.Management.System.doclogin.entity.Appointment; // Adjust import statement here



@RestController
@RequestMapping("/api/v2")
public class AppointmentController {

    private final AppointmentsRepository appointmentsRepository;

    public AppointmentController(AppointmentsRepository appointmentsRepository) {
        this.appointmentsRepository = appointmentsRepository;
    }

    @PostMapping("/insert")
    public Appointment createAppointment(@RequestBody Appointment appointment) {
        return appointmentsRepository.save(appointment);
    }
}
