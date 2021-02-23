package pl.charliesz.ping.model;

public class PollDto {
    private String question;

    public PollDto() {
    }

    public PollDto(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
