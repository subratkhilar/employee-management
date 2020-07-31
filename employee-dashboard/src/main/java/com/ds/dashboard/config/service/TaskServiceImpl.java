package com.ds.dashboard.config.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ds.dashboard.config.bean.TaskBean;
import com.ds.dashboard.config.repository.TaskRepository;

@Service("taskService")
public class TaskServiceImpl implements TaskService {
	List<TaskBean> list = new ArrayList<TaskBean>();
	@Autowired
	private TaskRepository taskRepository;

	public void createTask(TaskBean task) {
		taskRepository.save(task);

	}

	public TaskBean getTaskById(Long taskId) {
		return taskRepository.findById(taskId).get();
	}

	public List<TaskBean> listOfTasks() {
		return (List<TaskBean>) taskRepository.findAll();
	}

}
