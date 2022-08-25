package com.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.todolist.model.Person;

public interface UserRepo extends JpaRepository<Person, Long> {
	
}