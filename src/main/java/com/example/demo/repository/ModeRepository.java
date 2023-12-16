package com.example.demo.repository;

import com.example.demo.document.Mode;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ModeRepository extends MongoRepository<Mode, String> {
   
}
