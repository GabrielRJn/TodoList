package com.todolist.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class TodoList {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long taskID;
	@Column
	private boolean completed;
	
	
	@NotNull(message = "Task name is required")
	@Column
	private String taskName;
	
	private LocalDateTime timeCreated;
	
	@Column(columnDefinition = "TEXT")
	private String taskDescription;
	

}
