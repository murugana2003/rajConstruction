package com.rajconst.property.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rajconst.property.domain.Property;

@Repository
public interface PropertyRepository extends JpaRepository<Property,String>{

	@Query("select e.area from Property e where e.area=?1")
	public String getPropertyByArea(String areaName);
}
