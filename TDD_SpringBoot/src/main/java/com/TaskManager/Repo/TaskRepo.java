package com.TaskManager.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TaskManager.Model.Task;

public interface TaskRepo extends JpaRepository<Task, Long> {

}
