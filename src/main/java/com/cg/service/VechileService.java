package com.cg.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.dao.VechileInterface;
import com.cg.entity.Vechile;

@Service
public class VechileService  implements VechileInterface{
	
	List<Vechile> vechileList = new ArrayList<>();

	@Override
	public String addVechile(Vechile vechile) {
		vechileList.add(vechile);
		return "Vechile added successfully";
	}

	@Override
	public List<Vechile> getallVechiles() {
		
		
		return vechileList;
	}
	
	

}
