package com.example.Tutorial.repostiory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Tutorial.model.tutorial;


@Repository
public interface TutorialRepository extends JpaRepository<tutorial, Long> {
}
