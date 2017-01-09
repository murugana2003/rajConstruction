package com.rajconst.property.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rajconst.property.repository.PropertyRepository;

@Component
public class PropertyServiceImpl implements PropertyService {

	@Autowired
	PropertyRepository repository;
	
	public String findByAreaName(String areaName) {
		// TODO Auto-generated method stub
		System.out.println("Before AreaName:::" + areaName);
		String returnAread = repository.getPropertyByArea(areaName);
		System.out.println("After AreaName:::" + returnAread);
		return returnAread;
	
	}

}
