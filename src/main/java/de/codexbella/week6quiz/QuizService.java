package de.codexbella.week6quiz;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class QuizService {
    private final QuestionRepository questionRepository;

    public Question createNewQuestion(String question) {
        Question newQuestion = new Question();
        newQuestion.setQuestion(question);
        return questionRepository.save(newQuestion);
    }
    public Optional<Question> findById(String id) {
        return questionRepository.findById(id);
    }
}
