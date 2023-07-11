package com.example.project_railway.Repository;

import com.example.project_railway.Model.Interview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface InterviewRepository extends JpaRepository<Interview,String> {
}
