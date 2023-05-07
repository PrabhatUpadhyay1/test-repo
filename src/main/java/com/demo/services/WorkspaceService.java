package com.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entities.Floor;
import com.demo.entities.Workspace;
import com.demo.repositories.FloorRepository;
import com.demo.repositories.WorkspaceRepository;

@Service
public class WorkspaceService {

	
	@Autowired 
	WorkspaceRepository repository;
	
	@Autowired 
	FloorRepository floorRepository;
	
	public Workspace addWorkspace(Long floorId, Workspace workspace) throws Exception {
		// TODO Auto-generated method stub
		Optional<Floor> floor = floorRepository.findById(floorId);
		System.out.println(floor.get().getId());
		System.out.println(floorId);
//		if (!floor.isPresent()) {
//			throw new Exception("Not found floor");
//		}
		workspace.setFloor(floor.get());
		
		return repository.save(workspace);
	}

}
