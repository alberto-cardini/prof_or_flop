package com.swe.EduMeter.business_logic;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;

@Path("/greet")
public class GreetResource {

    @GET
    @Path("/{language}")
    @Produces("text/html")
    public String greet(@QueryParam("name") String name, @PathParam("language") String language) {
        if (name != null) {
            if (language.equals("italiano")) {
                return "Ciao <b>" + name + "</b>";
            }
            return "Hi <b>" + name + "</b>";
        }

        if (language.equals("italiano")) {
            return "<b>Ciao bello</b>";
        }

        return "<b>Hi there</b>";
    }
}
