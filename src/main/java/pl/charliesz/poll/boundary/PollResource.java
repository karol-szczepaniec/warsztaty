package pl.charliesz.poll.boundary;
import pl.charliesz.poll.model.PollDto;
import pl.charliesz.poll.model.request.AddPollRequest;
import pl.charliesz.poll.model.request.AnswerPollRequest;
import pl.charliesz.poll.model.response.GetPollsResponse;
import sun.security.validator.ValidatorException;

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

    @GET
    public GetPollsResponse getPolls(){
        LOGGER.info("GET: getPolls, została wywołana");
        return new GetPollsResponse(Collections.emptyList());
    }

    @POST
    public Response addPoll(AddPollRequest request){
        LOGGER.info("POST: addPoll, question: "+request.getPoll().getQuestion() + " kolor: "+ request.getColor());
        // Wyrzucenie wyjątku:
        if(request.getPoll().getQuestion() == null){
            return Response.status(Response.Status.BAD_REQUEST).entity("Question_nie_może_być_null").build();
        }
        PollDto newPoll = new PollDto(request.getPoll().getQuestion());

        return Response.noContent().build();
    }

    @POST
    @Path("{id}/answer")
    public void answerPoll(@PathParam("id") Long id, AnswerPollRequest request){
        LOGGER.info(String.format(" POST: answer - id=%s answer=%s", id, request.getAnswer()));
    }
}


















