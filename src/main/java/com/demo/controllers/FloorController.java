package com.demo.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entities.Floor;
import com.demo.services.FloorService;

@RestController
@RequestMapping("/demo")
public class FloorController {

	@Autowired
	FloorService service;
	
	
	@GetMapping("/floor")
	public String test() {
		return "API active";
	}
	
	@PostMapping("/floor")
	public Floor addFloor(@RequestBody Floor floor) {
		return service.addFloor(floor);
	}
}
