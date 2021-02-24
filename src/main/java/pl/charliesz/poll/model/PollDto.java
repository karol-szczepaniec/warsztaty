package pl.charliesz.poll.model;

public class PollDto {
    private String question;
    private Long id;

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

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }
}