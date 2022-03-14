package com.mauricio.workshopmongomauricio.services;


import com.mauricio.workshopmongomauricio.UserDTO.UserDTO;
import com.mauricio.workshopmongomauricio.domain.Post;
import com.mauricio.workshopmongomauricio.domain.User;
import com.mauricio.workshopmongomauricio.repository.PostRepository;
import com.mauricio.workshopmongomauricio.repository.UserRepository;
import com.mauricio.workshopmongomauricio.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;


    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);

        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }


}
