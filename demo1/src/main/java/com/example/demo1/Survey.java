package com.example.demo1;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Survey {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "survey_document_id")
    private Long id;
    @Column(name = "survey_title")
    private String title;
    @Column(name = "survey_type")
    private int type;
    @Column(name = "survey_description")
    private String description;
    @Column(name = "accept_response")
    private boolean acceptResponse;
    @CreationTimestamp @Temporal(TemporalType.TIMESTAMP) @Column(name = "survey_start_date")
    private Date startDate;
    @CreationTimestamp @Temporal(TemporalType.TIMESTAMP) @Column(name = "survey_deadline")
    private Date deadline;
    @Column(name = "url")
    private String url;
    @Column(name = "answer_count")
    private int countAnswer;

    @Builder
    public Survey(Long id, String title, int type, String description, boolean acceptResponse, Date startDate, Date deadline, String url, int countAnswer) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.description = description;
        this.acceptResponse = acceptResponse;
        this.startDate = startDate;
        this.deadline = deadline;
        this.url = url;
        this.countAnswer = countAnswer;
    }
}
