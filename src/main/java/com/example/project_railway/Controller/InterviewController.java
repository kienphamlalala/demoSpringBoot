package com.example.project_railway.Controller;


import com.example.project_railway.Model.Interview;
import com.example.project_railway.Repository.InterviewRepository;
import com.example.project_railway.Repository.InterviewerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/interview")

public class InterviewController {
    @Autowired
    public InterviewRepository interviewRepository;

    @PostMapping("/addall")
    public ResponseEntity <List<Interview>> addInterview(@RequestBody List<Interview> newInterview)
    {
      List<Interview>   saveNewInterview=interviewRepository.saveAll(newInterview);
        if (saveNewInterview.isEmpty()) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
        return ResponseEntity.ok(saveNewInterview);
    }


    @PostMapping("/add")
    public ResponseEntity<Interview> addAnInterview(@RequestBody Interview interview) {
        Interview savedInterview = interviewRepository.save(interview);
        return new ResponseEntity<>(savedInterview, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity <List<Interview>> getAllInterview()
    {
        List<Interview> interviewList1=interviewRepository.findAll();
        return ResponseEntity.ok(interviewList1);
    }
}
