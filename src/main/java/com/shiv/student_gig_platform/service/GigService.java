package com.shiv.student_gig_platform.service;

import com.shiv.student_gig_platform.model.Gig;
import com.shiv.student_gig_platform.repository.GigRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class GigService {

    private final GigRepository gigRepository;

    public Gig postGig(Gig gig)
    {
        gig.setPostedDate(LocalDate.now());
        return gigRepository.save(gig);
    }

    public List<Gig> getAllGig()
    {
        return gigRepository.findAll();
    }

}
