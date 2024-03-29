package com.todo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepos extends JpaRepository<Todo, Integer> {

}
