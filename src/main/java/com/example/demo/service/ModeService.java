package com.example.demo.service;

import com.example.demo.document.Mode;

import com.example.demo.repository.ModeRepository;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModeService  {
	
    @Autowired
    ModeRepository modeRepository;
   
   
    
    public boolean getautomode() {
    	 Mode m=modeRepository.findById("1000").orElseThrow();
    	 	return m.isAuto();
		}
    
    public void initialmode() {
   	 modeRepository.save(new Mode("1000", true));
   	 	
		}
    
    
    public boolean changeMode(boolean b) {
        Mode m = modeRepository.findById("1000").orElseThrow();
        
        if (m != null) {
            m.setAuto(b);
            modeRepository.save(m);
            return getautomode() ; 
        } else {
            
            return false;
        }
    }
    
    public List<Mode> findAll() {
        return modeRepository.findAll();
                
    }
    
 public long gettime() {
    	
    	LocalDateTime localDateTime = LocalDateTime.now(); 
    	ZoneId tunisiaZone = ZoneId.of("Africa/Tunis");
    	ZonedDateTime zdtTunisia = ZonedDateTime.of(localDateTime, tunisiaZone);
    	long millis = zdtTunisia.toInstant().toEpochMilli();
		return millis;
		
	}
    
    

}
