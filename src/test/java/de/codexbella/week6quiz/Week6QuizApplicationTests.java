package de.codexbella.week6quiz;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class Week6QuizApplicationTests {
   @Autowired
   private TestRestTemplate restTemplate;

   @Test
   void contextLoads() {
      Question question = new Question();
      question.setQuestion("Warum ist der Himmel blau?");

      ResponseEntity<Question> response = restTemplate.postForEntity("/", "Warum ist der Himmel blau?", Question.class);
      Assertions.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
      Assertions.assertThat(response.getBody().getId()).isNotNull();
      Assertions.assertThat(response.getBody().getQuestion()).isEqualTo("Warum ist der Himmel blau?");
   }
}