package com.todolist.config;

//import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TodoListConfig {
	
	

		
		@Bean
		public String greeting() {
			return "Hello";
		}
		//@Bean
		//public ModelMapper mapper() {
		//	return new ModelMapper();
		//}

	}

