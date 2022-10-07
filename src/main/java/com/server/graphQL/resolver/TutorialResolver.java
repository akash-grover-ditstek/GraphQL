package com.server.graphQL.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.server.graphQL.entity.Author;
import com.server.graphQL.entity.Tutorial;
import com.server.graphQL.repo.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TutorialResolver implements GraphQLResolver<Tutorial> {
    @Autowired
    private AuthorRepo authorRepository;

    public TutorialResolver(AuthorRepo authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author getAuthor(Tutorial tutorial) {
        return authorRepository.findById(tutorial.getAuthor().getId()).orElseThrow(null);
    }
}
