package com.example.demo.service;


import com.example.demo.document.Lamp;
import com.example.demo.repository.LampRepository;
import lombok.NonNull;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;










@Service
public class LampService  {
	
    @Autowired
    LampRepository lampRepository;
   
    public Lamp updateLamp(@NonNull String name, @NonNull String etat) {
        Lamp existingLamp = lampRepository.findByName(name);
        
        if (existingLamp != null) {
            existingLamp.setEtat(etat);
            return lampRepository.save(existingLamp); // Use save() to update the existing document
        } else {
            
            return null;
        }
    }

    
    
    public Lamp addLamp(@NonNull String name,@NonNull String etat) {
    	
     Lamp existingLamp = lampRepository.findByName(name);
        
        if (existingLamp != null) {	return null;}else {
    	return 	lampRepository.insert(new Lamp(name,etat));
        }
	
    	
		}
    
    public String getEtatLamp(@NonNull String name) {
    	 Lamp l=	lampRepository.findByName(name);
    	 	return l.getEtat();
	
    	
		}
    
    public List<Lamp> findAll() {
        return lampRepository.findAll();
                
    }
    
    
    
   
    
}
