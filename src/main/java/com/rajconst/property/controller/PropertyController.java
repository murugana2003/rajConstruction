package com.rajconst.property.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rajconst.property.domain.Property;
import com.rajconst.property.service.PropertyService;

@RestController
@RequestMapping("/properties")
public class PropertyController {

	@Autowired
	private PropertyService propertyService;
	
	@RequestMapping("/")
	public String getHello(){
		return "Hello World";
	}

	@RequestMapping(path = "/{areaName}", method = RequestMethod.GET)
	public String getListofProperty(@PathVariable String areaName) {
		System.out.println("Tester Area");
		return propertyService.findByAreaName(areaName);
	}

}