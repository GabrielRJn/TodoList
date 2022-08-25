package com.todolist.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todolist.model.TodoList;

import com.todolist.repository.TodoListRepo;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class TodoListService {
	
	@Autowired  
	TodoListRepo todoListRespository;  
	
	
	//getting all TodoList record by using the method findAll() of CrudRepository  
	public List<TodoList> getAllTasks()   
	{  
	List<TodoList> listOfTasks = new ArrayList<TodoList>();
	
	todoListRespository.findAll().forEach(task -> listOfTasks.add(task));
	return listOfTasks;
	}  
	
	//getting a specific record by using the method findById() of CrudRepository  
	public Optional<TodoList> getTaskById(long id)   
	{  
		//TodoList found = this.TodoListRepository.findById(id).orElseThrow(BookNotFoundID::new);
		return todoListRespository.findById(id);
		
	}  

	//saving a specific record by using the method save() of CrudRepository  
	public TodoList saveOrUpdate(TodoList task)   
	{  
	return todoListRespository.save(task);
	}  
	
	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(long id)   
	{  
		todoListRespository.deleteById(id);
	} 
	
	//updating a record  
	public void update(TodoList task)   
	{  
		todoListRespository.save(task);
	}  
	
	
}
