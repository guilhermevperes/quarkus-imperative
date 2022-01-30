package org.acme.mongodb.panache.controllers;

import org.acme.mongodb.panache.entities.User;
import org.acme.mongodb.panache.services.CreateService;
import org.acme.mongodb.panache.services.GetService;
import org.acme.mongodb.panache.to.CreateRequestTO;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.List;

@Path("/users")
@ApplicationScoped
public class UserController {

    @Inject
    private CreateService createService;

    @Inject
    private GetService getService;

    @POST
    public User post(CreateRequestTO requestTO) {
        return createService.execute(requestTO);
    }

    @GET
    public List<User> GET() {
        return getService.execute();
    }

}
