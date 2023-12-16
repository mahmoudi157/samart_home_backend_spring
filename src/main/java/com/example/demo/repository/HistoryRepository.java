package com.example.demo.repository;

import com.example.demo.document.History;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface HistoryRepository extends MongoRepository<History, String> {
    List<History>findByDate(String date);
}
