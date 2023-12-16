package com.example.demo.service;

import com.example.demo.document.CaptureHis;
import com.example.demo.repository.CaptureHisRepository;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CaptureHisService  {
    @Autowired
    CaptureHisRepository captureHisRepository;
   
    public CaptureHis addcaptureshis(Double temp, Double humid) {
         CaptureHis capt=new CaptureHis(new Date(), temp, humid);
         return captureHisRepository.insert(capt);
               
    }

   
    public List<CaptureHis> findAll() {
        return captureHisRepository.findAll();
                
    }
}
