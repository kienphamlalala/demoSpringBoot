package com.example.project_railway.Controller;

import com.example.project_railway.Model.Interviewer;
import com.example.project_railway.Repository.InterviewerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/interviewer")
public class InterviewerController {
    @Autowired
    public InterviewerRepository interviewerRepository;

    @PostMapping("/add")
    public ResponseEntity <Interviewer> addInterviewer (@RequestBody Interviewer newInterviewer)
    {
        Interviewer saveNewInterviewer =interviewerRepository.save(newInterviewer);
        if(saveNewInterviewer==null)
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        return ResponseEntity.ok(saveNewInterviewer);
    }
    @PostMapping("/addall")
    public ResponseEntity<List<Interviewer>> addInterviewers(@RequestBody List<Interviewer> newInterviewers) {
        List<Interviewer> savedInterviewers = interviewerRepository.saveAll(newInterviewers);
        if (savedInterviewers.isEmpty()) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
        return ResponseEntity.ok(savedInterviewers);
    }
    @GetMapping("/all")
    public ResponseEntity<List<Interviewer>> getAllInterviewer() {
        List<Interviewer> interviewers = interviewerRepository.findAll();
        if (interviewers.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(interviewers);
    }




}
