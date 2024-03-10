package com.example.ToDoListApplication;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToDoService {

	@Autowired
	private ToDoRepository todoRepository;
	/*
	 * create/
	 * showall/
	 * updatebyid/
	 * deletebyid/
	 * showbydate
	 * showcomplete
	 * showincomplete
	 * */
	
	public List<ToDo> getAllTask(){
		return todoRepository.findAll();
	}
	
	public ToDo createTask(ToDo task) {
		return todoRepository.save(task);
	}
	
	public ToDo updateTask(Integer id, ToDo task){
		task.setId(id);
		return todoRepository.save(task);
	}
	
	public void deleteTask(Integer id) {
		todoRepository.deleteById(id);
	}
	
	public List<ToDo> getTaskByDate(Date date){
		return todoRepository.findByDate(date);
	}
	
	public List<ToDo> getCompleteTask(){
		return todoRepository.findByIsdoneTrue();
	}
	
	public List<ToDo> getIncompleteTask(){
		return todoRepository.findByIsdoneFalse();
	}
}
