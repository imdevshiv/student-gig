package com.shiv.student_gig_platform.controller;

import com.shiv.student_gig_platform.model.Application;
import com.shiv.student_gig_platform.model.User;
import com.shiv.student_gig_platform.service.ApplicationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/applicant")
public class ApplicationController {

    ApplicationService applicationService;
    ApplicationController(ApplicationService applicationService)
    {
        this.applicationService=applicationService;
    }

    @PostMapping(path = "/applyForGig")
    public ResponseEntity<Application> applyToGig(@RequestBody Application application)
    {
        return ResponseEntity.ok(applicationService.applyToGig(application));
    }

    @GetMapping(path = "/getAllApplicant")
    public ResponseEntity<List<Application>> getAllApplicant(@RequestBody User user)
    {
        return ResponseEntity.ok(applicationService.getByUser(user));
    }
}
