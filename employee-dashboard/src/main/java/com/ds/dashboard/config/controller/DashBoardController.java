package com.ds.dashboard.config.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ds.dashboard.config.bean.TaskBean;
/*import com.ds.dashboard.config.client.EmployeeServiceClient;*/
import com.ds.dashboard.config.service.TaskService;
/*import com.ers.config.bean.Employee;*/

@RestController
@CrossOrigin(maxAge = 3600)
public class DashBoardController {

	@Autowired
	private TaskService taskService;
	/*
	 * @Autowired private EmployeeServiceClient employeeServiceClient;
	 */

	@GetMapping("/getDetails/{taskId}")
	public ResponseEntity<TaskBean> getTaskDetails(@PathVariable("taskId") Long taskId) {
		TaskBean taskBean = taskService.getTaskById(taskId);
		// Employee employee =
		// employeeServiceClient.getEmployeeById(taskBean.getEmpId());
		// System.out.println("Employee details inside dashbord controller >> "
		// + employee.toString());
		return new ResponseEntity<TaskBean>(taskBean, HttpStatus.OK);
	}

	@PostMapping("/tasks")
	public ResponseEntity<String> createTask(@RequestBody TaskBean task) {
		taskService.createTask(task);
		return new ResponseEntity<String>("success", HttpStatus.OK);
	}

	@GetMapping("/tasks")
	public List<TaskBean> getAllTaskDetails() {
		return taskService.listOfTasks();
	}

}
