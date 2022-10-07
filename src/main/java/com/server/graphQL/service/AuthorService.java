package com.server.graphQL.service;

import com.server.graphQL.repo.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    @Autowired
    AuthorRepo authorRepository;
}
