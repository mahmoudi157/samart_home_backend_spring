package com.example.demo.repository;

import com.example.demo.document.Lamp;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface LampRepository extends MongoRepository<Lamp, String> {
	Lamp findByName(String name);
    
}
