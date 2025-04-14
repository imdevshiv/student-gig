package com.shiv.student_gig_platform.repository;

import com.shiv.student_gig_platform.model.Application;
import com.shiv.student_gig_platform.model.Gig;
import com.shiv.student_gig_platform.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ApplicationRepository extends JpaRepository<Application,Long> {

    List<Application> findByApplicant(User user);
    List<Gig> findByGig(Gig gig);

}
