package org.acme.mongodb.panache.repositories;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;
import org.acme.mongodb.panache.entities.User;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class UserRepository implements PanacheMongoRepository<User> {

    public User create(User user) {
        user.persist();
        return user;
    }

    public List<User> getAll() {
        return findAll().stream().map(i -> i).collect(Collectors.toList());
    }



}
