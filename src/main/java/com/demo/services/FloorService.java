package com.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entities.Floor;
import com.demo.repositories.FloorRepository;

@Service
public class FloorService {
	
	@Autowired
	FloorRepository repository;

	public Floor addFloor(Floor floor) {
		// TODO Auto-generated method stub
		return repository.save(floor);
	}

}
