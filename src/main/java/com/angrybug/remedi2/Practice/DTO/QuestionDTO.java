package com.angrybug.remedi2.Practice.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuestionDTO {

    private String question;

    public QuestionDTO(String question) {
        this.question = question;
    }
}