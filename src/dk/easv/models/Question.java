package dk.easv.models;

public class Question {
    private String formulation;
    private Answer[] answers;

    public Question(String formulation, Answer[] answers) {
        this.formulation = formulation;
        this.answers = answers;
    }

    public String getFormulation() {
        return formulation;
    }

    public Answer[] getAnswers() {
        return answers;
    }
}
