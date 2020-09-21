package dk.easv;

import dk.easv.models.Question;
import dk.easv.models.Quiz;

public class Main {

    public static void main(String[] args) {

        Quiz quiz = new Quiz();
        // TODO: Add four questions to the quiz, and for each question at least three answers.

        for(Question q : quiz.getQuestions()) {
            /*
            TODO:
                For each question print the question for the user followed by a list of answers.
                Use the Scanner-object to ask for an answer.
                If the answer is correct, show the message: "Well done" otherwise show "Too bad, try again"
                and show the question once more.
             */
        }

    }
}
