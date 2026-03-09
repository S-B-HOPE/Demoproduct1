package com.example.demo.controller;

import java.net.http.HttpRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.AdharDto;
import com.example.demo.service.AdharService;

@RestController
public class AdharController {

	@Autowired
	AdharService adharServiceeee;

	@PostMapping("adhar")
	ResponseEntity assginAdhar(@RequestBody AdharDto dto) {

		adharService.AddAdharForPerson(dto);

		return new ResponseEntity(HttpStatus.CREATED);
	}

}
