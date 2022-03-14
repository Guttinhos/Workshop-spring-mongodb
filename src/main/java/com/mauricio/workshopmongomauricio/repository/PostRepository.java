package com.mauricio.workshopmongomauricio.repository;

import com.mauricio.workshopmongomauricio.domain.Post;
import com.mauricio.workshopmongomauricio.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {



}
