package com.example.project_railway.Model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table (name = "Interview")
public class Interview {
    @Id
    @Column (name="interview_id")
    private String Id;

    //Hello nhá

    @ManyToOne
    @JoinColumn(name = "interviewer_Id",nullable = false,referencedColumnName = "interviewer_Id")
    @JsonBackReference
    private Interviewer interviewer;



    @Column (name="candidate_id")
    private String candidateId;

    @Column (name="interview_datetime")
    private String interviewDatetime;

    @Column (name="venue")
    private String venue;

    @Column (name="total_score")
    private String totalScore;

    @Column (name="summary")
    private String summary;

    public Interview(String id, Interviewer interviewer, String candidateId, String interviewDatetime, String venue, String totalScore, String summary) {
        Id = id;
        this.interviewer = interviewer;
        this.candidateId = candidateId;
        this.interviewDatetime = interviewDatetime;
        this.venue = venue;
        this.totalScore = totalScore;
        this.summary = summary;
    }

    public Interview() {
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public Interviewer getInterviewer() {
        return interviewer;
    }

    public void setInterviewer(Interviewer interviewer) {
        this.interviewer = interviewer;
    }

    public String getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(String candidateId) {
        this.candidateId = candidateId;
    }

    public String getInterviewDatetime() {
        return interviewDatetime;
    }

    public void setInterviewDatetime(String interviewDatetime) {
        this.interviewDatetime = interviewDatetime;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(String totalScore) {
        this.totalScore = totalScore;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
