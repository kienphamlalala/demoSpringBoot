package com.example.project_railway.Repository;

import com.example.project_railway.Model.Interviewer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterviewerRepository extends JpaRepository <Interviewer,String> {
}
