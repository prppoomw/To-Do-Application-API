package com.example.ToDoListApplication;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends JpaRepository<ToDo, Integer>{

	List<ToDo> findByDate(Date date);
	List<ToDo> findByIsdoneTrue();
	List<ToDo> findByIsdoneFalse();
}
