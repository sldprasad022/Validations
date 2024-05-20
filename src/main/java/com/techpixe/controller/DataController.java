package com.techpixe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techpixe.entity.Data;
import com.techpixe.service.DataService;

@RestController
@RequestMapping("/data")
public class DataController {
	@Autowired
	private DataService dataService;

	@PostMapping("/registration")
	public ResponseEntity<?> saveData(@Validated @RequestParam String fullName, @Validated @RequestParam String email,
			@Validated @RequestParam Long mobileNumber) {
		Data savedData = dataService.saveData(fullName, email, mobileNumber);
		return ResponseEntity.ok(savedData);
	}
}
