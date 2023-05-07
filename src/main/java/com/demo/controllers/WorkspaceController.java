package com.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entities.Floor;
import com.demo.entities.Workspace;
import com.demo.services.FloorService;
import com.demo.services.WorkspaceService;

@RestController
@RequestMapping("/demo")
public class WorkspaceController {

	@Autowired
	WorkspaceService service;

	@PostMapping("/workspace/{floorId}")
	public Workspace addWorkspace(@PathVariable("floorId") Long floorId, @RequestBody Workspace workspace) throws Exception {
		return service.addWorkspace(floorId, workspace);
	}
}
