package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Vechile;
import com.cg.service.VechileService;

@RestController
@RequestMapping("/vechileapi")
public class VechileController {
	
	@Autowired
	private VechileService vservice;
	
	@PostMapping("/add")
	public String addVechile(@RequestBody Vechile v) {
		return vservice.addVechile(v);
	}
	@GetMapping("/get")
	public List<Vechile> getAll(){
		return vservice.getallVechiles();
	}

}
