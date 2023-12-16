package com.example.demo.repository;

import com.example.demo.document.CaptureHis;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CaptureHisRepository extends MongoRepository<CaptureHis, String> {
    
}
