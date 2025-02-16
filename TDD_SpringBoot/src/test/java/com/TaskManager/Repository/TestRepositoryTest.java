package com.TaskManager.Repository;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.TaskManager.Model.Task;
import com.TaskManager.Repo.TaskRepo;

//it exclude other security and other layers which is unncessory.
//testing jpa repo 

@DataJpaTest
public class TestRepositoryTest {

	@Autowired
	TaskRepo taskRepository;

	@Test
	public void testSaveTask() {
		// arrange
		Task task = new Task();
		task.setTitle("MyTest Task");
		task.setStatus("To do");

		// act
		Task savedtask = taskRepository.save(task);

		// assert
		assertNotNull(savedtask);
		assertEquals("MyTest Task", savedtask.getTitle());

	}
	
	@Test
	public void testDeleteTask() {
		
		//arrange
		
		Task task= new Task();
		task.setTitle("deleteTask");
		task.setStatus("completed");
		taskRepository.save(task);
		
		//act
		taskRepository.deleteById(task.getId());
		
		//assure
		assertFalse(taskRepository.findById(task.getId()).isPresent());
		
	}

}
