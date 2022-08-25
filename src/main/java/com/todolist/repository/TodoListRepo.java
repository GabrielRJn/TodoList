package com.todolist.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.todolist.model.TodoList;


public interface TodoListRepo extends JpaRepository<TodoList, Long> {
	
}

