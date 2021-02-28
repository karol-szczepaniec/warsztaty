package pl.charliesz.poll.service;

import pl.charliesz.poll.boundary.PollResource;
import pl.charliesz.poll.model.PollDto;

import javax.ejb.Stateless;
import java.util.logging.Logger;

@Stateless
public class AddPollService {

    private static final Logger LOGGER = Logger.getLogger(AddPollService.class.getName());

    public void addPoll(PollDto poll){
        LOGGER.info("Before ensuring '?' : "+ poll.getQuestion());
        if (poll.getQuestion().charAt(poll.getQuestion().length()-1) != '?') {

            poll.setQuestion(poll.getQuestion() + '?');
        }
        LOGGER.info("After ensuring '?' : " + poll.getQuestion());
    }
}
