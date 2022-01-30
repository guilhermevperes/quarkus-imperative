package org.acme.mongodb.panache.services;

import org.acme.mongodb.panache.entities.User;
import org.acme.mongodb.panache.integration.TestApi;
import org.acme.mongodb.panache.integration.TestResponse;
import org.acme.mongodb.panache.repositories.UserRepository;
import org.acme.mongodb.panache.to.CreateRequestTO;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class CreateService {

    @Inject
    private UserRepository repository;

    @Inject
    @RestClient
    private TestApi testApi;

    public User execute(CreateRequestTO requestTO){
        User user = User.builder()
                .name(requestTO.getName())
                .document(requestTO.getDocument())
                .email(requestTO.getEmail())
                .build();

        TestResponse testResponse = testApi.postTest();

        System.out.println("RESPONSEEEE => " + testResponse);

        return repository.create(user);
    }
}
