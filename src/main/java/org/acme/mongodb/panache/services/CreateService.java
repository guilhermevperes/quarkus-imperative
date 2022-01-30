package org.acme.mongodb.panache.services;

import org.acme.mongodb.panache.entities.User;
import org.acme.mongodb.panache.repositories.UserRepository;
import org.acme.mongodb.panache.to.CreateRequestTO;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class CreateService {

    @Inject
    private UserRepository repository;

    public User execute(CreateRequestTO requestTO){
        User user = User.builder()
                .name(requestTO.getName())
                .document(requestTO.getDocument())
                .email(requestTO.getEmail())
                .build();

        return repository.create(user);
    }
}
