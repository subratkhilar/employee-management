package com.ds.dashboard.config.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Document(collection = "TASKS")
@JsonIgnoreProperties(ignoreUnknown = true)

public class TaskBean {
	@Id
	@Field("TASK_ID")
	private Long taskId;
	@Field("TASK_DESCRIPTION")
	private String taskDescription;
	@Field("EMPLOYEE_ID")
	private Long empId;

	public Long getTaskId() {
		return taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	public String getTaskDescription() {
		return taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

}
