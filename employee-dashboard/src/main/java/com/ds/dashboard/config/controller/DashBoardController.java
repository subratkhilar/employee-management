package com.ds.dashboard.config.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DashBoardController {
	
@GetMapping("/getDetails")
	public ResponseEntity<String> getEmpDetails(){
		return new ResponseEntity<String>("success",HttpStatus.OK);
	}
}
