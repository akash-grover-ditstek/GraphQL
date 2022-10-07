package com.server.graphQL.repo;

import com.server.graphQL.entity.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorialRepo extends JpaRepository<Tutorial, Long> {
}
