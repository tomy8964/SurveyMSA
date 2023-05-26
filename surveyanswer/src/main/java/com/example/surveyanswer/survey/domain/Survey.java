package com.example.surveyanswer.survey.domain;

import com.example.surveyanswer.user.domain.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

/***
 * 2023-04-23 Gihyun Kim
 * Survey Document 와 Survey answer 를 저장할 Survey Entity
 */

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Survey {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "survey_id")
    private Long id;

    @OneToOne
    @JsonIgnore
    @JoinColumn(name = "user_Id")
    private User user;

    @OneToMany(mappedBy = "survey", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore //순환참조 방지
    @Column(name = "survey_documentList")
    private List<SurveyDocument> surveyDocumentList;

    // List 에 survey Document & answer 를 저장할 method
    public void setDocument(SurveyDocument surveyDocument) {
        this.surveyDocumentList.add(surveyDocument);
    }

    @Builder
    public Survey(User user, List<SurveyDocument> surveyDocumentList) {
        this.user = user;
        this.surveyDocumentList = surveyDocumentList;
    }
}
