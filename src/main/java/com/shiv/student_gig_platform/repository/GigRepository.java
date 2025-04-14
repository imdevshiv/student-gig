package com.shiv.student_gig_platform.repository;

import com.shiv.student_gig_platform.model.Gig;
import com.shiv.student_gig_platform.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GigRepository extends JpaRepository<Gig,Long> {

    List<Gig> findByPostedBy(User user);
}
