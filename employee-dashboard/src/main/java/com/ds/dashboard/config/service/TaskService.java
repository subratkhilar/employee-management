package com.ds.dashboard.config.service;

import java.util.List;

import com.ds.dashboard.config.bean.TaskBean;

public interface TaskService {
	public void createTask(TaskBean task);

	public TaskBean getTaskById(Long taskId);

	public List<TaskBean> listOfTasks();
}
