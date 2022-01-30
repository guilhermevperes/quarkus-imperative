package org.acme.mongodb.panache.integration;

import io.smallrye.mutiny.Uni;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/tests")
@RegisterRestClient
public interface TestApi {

    @POST
    TestResponse postTest();

}
