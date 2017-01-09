package com.rajconst.property.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rajconst.property.domain.Property;


@FeignClient(name = "property-service")
public interface PropertyServiceClient {

		@RequestMapping(method = RequestMethod.GET, value = "/{area}", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
		String retriveProperty(@PathVariable("area") String areaName);
}
