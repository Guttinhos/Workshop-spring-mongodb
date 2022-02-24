package com.mauricio.workshopmongomauricio.repository;

import com.mauricio.workshopmongomauricio.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {



}
