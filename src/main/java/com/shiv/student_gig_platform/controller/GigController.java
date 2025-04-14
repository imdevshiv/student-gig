package com.shiv.student_gig_platform.controller;

import com.shiv.student_gig_platform.model.Gig;
import com.shiv.student_gig_platform.service.GigService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping(path = "/api/gig")
public class GigController {

    GigService gigService;
    GigController(GigService gigService)
    {
        this.gigService=gigService;
    }

    @PostMapping(path = "/postGig")
    public ResponseEntity<Gig> postGig(@Valid @RequestBody Gig gig)
    {
        return ResponseEntity.ok(gigService.postGig(gig));
    }

    @GetMapping(path = "/gigs")
    public ResponseEntity<List<Gig>> getAllGig()
    {
        return ResponseEntity.ok(gigService.getAllGig());
    }


}
