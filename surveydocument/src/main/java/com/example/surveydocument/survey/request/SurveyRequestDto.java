package com.example.surveydocument.survey.request;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class SurveyRequestDto {
    String title;
    String description;
    int type;
    List<QuestionRequestDto> questionRequest;

//    @ConstructorProperties({"title", "description", "type", "questionRequest"})
    @Builder
    public SurveyRequestDto(String title, String description, int type, List<QuestionRequestDto> questionRequest) {
        this.title = title;
        this.description = description;
        this.type = type;
        this.questionRequest = questionRequest;
    }
}
