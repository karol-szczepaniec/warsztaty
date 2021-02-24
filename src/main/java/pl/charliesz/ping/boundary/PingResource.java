package pl.charliesz.ping.boundary;

import javax.ws.rs.*;


@Path("ping")
public class PingResource {

    @GET
    public String ping() {
        return " Jakarta EE 8 with MicroProfile 3+!";
    }

    @GET
    @Path("pong/{id}")
    public String pong(@PathParam("id") Long id, @QueryParam("count") Long c, @QueryParam("func") Long f){
        return "przesłane id: " + id + " count: " + c + " func: " + f;
    }

}
