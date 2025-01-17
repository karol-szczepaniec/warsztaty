package pl.charliesz.poll.model.request;

import pl.charliesz.poll.model.PollDto;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class AddPollRequest {
    @Valid
    @NotNull
    private PollDto poll;
    private String color;

    public PollDto getPoll() {
        return poll;
    }

    public void setPoll(PollDto poll) {
        this.poll = poll;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
