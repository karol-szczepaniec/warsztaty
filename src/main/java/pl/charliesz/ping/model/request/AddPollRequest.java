package pl.charliesz.ping.model.request;

import pl.charliesz.ping.model.PollDto;

public class AddPollRequest {
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
