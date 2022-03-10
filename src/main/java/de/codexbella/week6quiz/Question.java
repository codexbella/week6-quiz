package de.codexbella.week6quiz;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "questions")
@Data
public class Question {
    @Id
    private String id;
    private String question;
}
