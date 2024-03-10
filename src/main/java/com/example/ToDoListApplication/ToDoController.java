package com.example.ToDoListApplication;


import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/to-do-app")
public class ToDoController {
	
	@Autowired
	ToDoService todoService;
	
	@GetMapping("/get-all-task")
	public ResponseEntity<List<ToDo>> getAllTask(){
		return ResponseEntity.ok(todoService.getAllTask());
	}
	
	@PostMapping("create-task")
	public ResponseEntity<ToDo> createTask(@RequestBody ToDo task){
		return ResponseEntity.ok(todoService.createTask(task));
	}
	
	@PutMapping("/update-{id}")
	public ResponseEntity<ToDo> updateTask(@PathVariable Integer id, @RequestBody ToDo task){
		return ResponseEntity.ok(todoService.updateTask(id, task));
	}
	
	@DeleteMapping("/delete-{id}") 
    public ResponseEntity<Boolean> deleteTasks(@PathVariable Integer id) { 
        todoService.deleteTask(id); 
        return ResponseEntity.ok(true); 
    }
	
	@GetMapping("/get-task-by-date")
	public ResponseEntity<List<ToDo>> getTaskByDate(@RequestParam Date date){
		//YYYY-MM-DD
		return ResponseEntity.ok(todoService.getTaskByDate(date));
	}
	
	@GetMapping("/complete-task")
	public ResponseEntity<List<ToDo>> getCompleteTask(){
		return ResponseEntity.ok(todoService.getCompleteTask());
	}
	
	@GetMapping("/incomplete-task")
	public ResponseEntity<List<ToDo>> getIncompleteTask(){
		return ResponseEntity.ok(todoService.getIncompleteTask());
	}
}
