package com.shiv.student_gig_platform.service;

import com.shiv.student_gig_platform.model.Application;
import com.shiv.student_gig_platform.model.User;
import com.shiv.student_gig_platform.repository.ApplicationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ApplicationService {

    private final ApplicationRepository applicationRepository;

    public Application applyToGig(Application application)
    {
        application.setAppliedDate(LocalDate.now());
        return applicationRepository.save(application);
    }

    public List<Application> getByUser(User user)
    {
        return applicationRepository.findByApplicant(user);
    }

}
