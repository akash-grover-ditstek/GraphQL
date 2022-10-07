package com.server.graphQL.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.server.graphQL.entity.Author;
import com.server.graphQL.entity.Tutorial;
import com.server.graphQL.repo.AuthorRepo;
import com.server.graphQL.repo.TutorialRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Query implements GraphQLQueryResolver {
    private AuthorRepo authorRepository;
    private TutorialRepo tutorialRepository;

    public Iterable<Author> findAllAuthors() {
        return authorRepository.findAll();
    }

    public Iterable<Tutorial> findAllTutorials() {
        return tutorialRepository.findAll();
    }

    public long countAuthors() {
        return authorRepository.count();
    }

    public long countTutorials() {
        return tutorialRepository.count();
    }

}
