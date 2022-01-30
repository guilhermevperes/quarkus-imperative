package org.acme.mongodb.panache.services;

import org.acme.mongodb.panache.entities.User;
import org.acme.mongodb.panache.repositories.UserRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class GetService {

    @Inject
    private UserRepository repository;

    public List<User> execute(){
        return repository.getAll();
    }

}
