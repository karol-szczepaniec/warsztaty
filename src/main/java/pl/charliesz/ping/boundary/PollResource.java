package pl.charliesz.ping.boundary;
import pl.charliesz.ping.model.PollDto;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

@Path("poll")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PollResource {

    private static final Logger LOGGER = Logger.getLogger(PollResource.class.getName());

    @GET
    public List<PollDto> getPolls(){
        LOGGER.info("GET: getPolls, została wywołana");
        return Collections.emptyList();
    }

    @POST
    public void addPoll(PollDto poll){
        LOGGER.info("POST: addPoll, question: "+poll.getQuestion());
        PollDto newPoll = new PollDto(poll.getQuestion());
    }
}