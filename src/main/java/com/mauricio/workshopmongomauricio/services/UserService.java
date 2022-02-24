package com.mauricio.workshopmongomauricio.services;


import com.mauricio.workshopmongomauricio.domain.User;
import com.mauricio.workshopmongomauricio.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll(){
        return repo.findAll();
    }
}
