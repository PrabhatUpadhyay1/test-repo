package com.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.entities.Floor;

@Repository
public interface FloorRepository extends CrudRepository<Floor, Long>{

}
