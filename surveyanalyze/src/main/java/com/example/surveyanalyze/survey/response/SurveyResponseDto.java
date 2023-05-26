package com.example.surveyanalyze.survey.response;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class SurveyResponseDto {
    Long id;
    String title;
    String description;
    int type;
    List<QuestionResponseDto> questionResponse;

//    @ConstructorProperties({"title", "description", "type", "questionResponse"})
    @Builder
    public SurveyResponseDto(String title, String description, int type, List<QuestionResponseDto> questionResponse) {
        this.title = title;
        this.description = description;
        this.type = type;
        this.questionResponse = questionResponse;
    }
}
