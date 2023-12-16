package com.example.demo.rest;

import com.example.demo.document.History;

import com.example.demo.dto.HistoryDto;

import com.example.demo.service.HistoryService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/history")
public class HistoryREST {
    @Autowired
   HistoryService historyService;

    @PostMapping("/add")
    
    public ResponseEntity<?> me(@RequestBody HistoryDto history) {
        return ResponseEntity.ok(historyService.addHistory(history.getEvent(), history.getTemp(), history.getHumid()));
    }
    
    @GetMapping()
    public List<History> findAll() {
        return historyService.findAll();
                
    }
    
}
