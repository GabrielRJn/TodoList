package com.todolist.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.todolist.model.TodoList;
import com.todolist.service.TodoListService;

@RestController
public class TodoListController {
	
	@Autowired
	TodoListService todoListService;
	
	@GetMapping("/")
	public String greeting() {
		return "Gabriel's To-do list";
	}
	
	//creating a get mapping that retrieves all the tasks detail from the database   
	@GetMapping("/alltasks")  
	private List<TodoList> getAlltasks()   
	{  
	return todoListService.getAllTasks(); 
	}  
	
	//creating a get mapping that retrieves the detail of a specific book  
	@GetMapping("/tasks/{taskID}")  
	private Optional<TodoList> getBookById(@PathVariable("taskID") long taskID)   
	{  
	return todoListService.getTaskById(taskID); 
	}  
	
	//creating a delete mapping that deletes a specified book  
	@DeleteMapping("/deleteTask/{taskID}")  
	private void deleteBook(@PathVariable("taskID") long taskID)   
	{  
		todoListService.delete(taskID);  
	}  
	
	//creating post mapping that post the book detail in the database  
	@PostMapping("/saveorupdateTask")  
	private ResponseEntity<TodoList> saveBook(@RequestBody TodoList task)   
	{  
		return new ResponseEntity<>(this.todoListService.saveOrUpdate(task), HttpStatus.CREATED);
	}  
	
	//creating put mapping that updates the book detail   
	@PutMapping("/savetasks")  
	private TodoList update(@RequestBody TodoList tasks)   
	{  
		todoListService.saveOrUpdate(tasks);  
	return tasks;  
	}  

}
