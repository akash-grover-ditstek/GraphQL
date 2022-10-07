package com.server.graphQL.repo;

import com.server.graphQL.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepo extends JpaRepository<Author, Long> {
}
