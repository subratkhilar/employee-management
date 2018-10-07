package com.ds.dashboard.config.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TASKS")
public class TaskBean {
	@Id
	@Column(name = "TASK_ID")
	private Long taskId;
	@Column(name = "TASK_DESCRIPTION")
	private String taskDescription;
	@Column(name = "EMPLOYEE_ID")
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
