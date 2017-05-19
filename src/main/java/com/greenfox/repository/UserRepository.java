package com.greenfox.repository;

import com.greenfox.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
  public User findClientByIdEquals(String name);
}