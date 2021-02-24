package pl.charliesz.ping.model.response;
import pl.charliesz.ping.model.PollDto;
import java.util.List;

public class GetPollsResponse {
    private List<PollDto> polls;

    public GetPollsResponse() {
    }

    public GetPollsResponse(List<PollDto> polls) {
        this.polls = polls;
    }

    public List<PollDto> getPolls() {
        return polls;
    }

    public void setPolls(List<PollDto> polls) {
        this.polls = polls;
    }
}
