package com.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping(value = "/todo")
public class TodoController {

	@Autowired
	private TodoRepos todoRepos;
	
	@GetMapping
	public List<Todo> getMethodName() {
		return todoRepos.findAll();
	}
	
	@PostMapping
	public Todo postMethodName(@RequestBody Todo todoItem) {
		Todo todo = todoRepos.save(todoItem);
		return todo;
	}
	
	@PutMapping("/{id}")
	public Todo putMethodName(@PathVariable Integer id, @RequestBody Todo updateTodo) {
		Todo todoItem = todoRepos.findById(id).orElse(null);
        if (todoItem == null) {
            return null;
        }    
        todoItem.setDone(updateTodo.getDone());
        todoItem.setTitle(updateTodo.getTitle());
        
        return todoRepos.save(todoItem);
        
        }
}