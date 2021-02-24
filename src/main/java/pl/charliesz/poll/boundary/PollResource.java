package pl.charliesz.poll.boundary;
import pl.charliesz.poll.model.PollDto;
import pl.charliesz.poll.model.request.AddPollRequest;
import pl.charliesz.poll.model.request.AnswerPollRequest;
import pl.charliesz.poll.model.response.GetPollsResponse;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Collections;
import java.util.logging.Logger;

@Path("poll")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PollResource {

    private static final Logger LOGGER = Logger.getLogger(PollResource.class.getName());

    @GET
    public GetPollsResponse getPolls(){
        LOGGER.info("GET: getPolls, została wywołana");
        return new GetPollsResponse(Collections.emptyList());
    }

    @POST
    public void addPoll(AddPollRequest request){
        LOGGER.info("POST: addPoll, question: "+request.getPoll().getQuestion() + " kolor: "+ request.getColor());
        PollDto newPoll = new PollDto(request.getPoll().getQuestion());
    }

    @POST
    @Path("{id}/answer")
    public void answerPoll(@PathParam("id") Long id, AnswerPollRequest request){
        LOGGER.info(String.format(" POST: answer - id=%s answer=%s", id, request.getAnswer()));
    }
}


















