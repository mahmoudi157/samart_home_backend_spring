package com.example.demo.service;

import com.example.demo.document.History;

import com.example.demo.repository.HistoryRepository;


import lombok.NonNull;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistoryService  {
    @Autowired
    HistoryRepository historyRepository;
    @Autowired
   ModeService modeService;
    
    
    public History addHistory(@NonNull String event, double temp, double humid) {
         History history=new History(event, modeService.getautomode(), new Date(), temp, humid);
         return historyRepository.insert(history);
               
    }

    public List<History> findByDate(String date) {
        return historyRepository.findByDate(date);
                
    }
    public List<History> findAll() {
        return historyRepository.findAll();
                
    }
}
