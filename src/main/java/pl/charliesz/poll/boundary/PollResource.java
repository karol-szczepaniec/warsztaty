package pl.charliesz.poll.boundary;
import pl.charliesz.poll.model.PollDto;
import pl.charliesz.poll.model.request.AddPollRequest;
import pl.charliesz.poll.model.request.AnswerPollRequest;
import pl.charliesz.poll.model.response.GetPollsResponse;
import pl.charliesz.poll.service.AddPollService;
import sun.security.validator.ValidatorException;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Collections;
import java.util.logging.Logger;

@Path("poll")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PollResource {

    private static final Logger LOGGER = Logger.getLogger(PollResource.class.getName());

    @Inject AddPollService addPollService;

    @GET
    public GetPollsResponse getPolls(){
        LOGGER.info("GET: getPolls, została wywołana");
        return new GetPollsResponse(Collections.emptyList());
    }

    @POST
    public void addPoll(@Valid @NotNull AddPollRequest request){
        LOGGER.info("POST: addPoll, question: "+request.getPoll().getQuestion() + " kolor: "+ request.getColor());

        addPollService.addPoll(request.getPoll());
    }

    @POST
    @Path("{id}/answer")
    public void answerPoll(@PathParam("id") Long id, AnswerPollRequest request){
        LOGGER.info(String.format(" POST: answer - id=%s answer=%s", id, request.getAnswer()));
    }
}


















