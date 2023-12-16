package com.example.demo.rest;

import com.example.demo.document.CaptureHis;

import com.example.demo.document.Lamp;
import com.example.demo.service.CaptureHisService;
import com.example.demo.service.LampService;
import com.example.demo.service.ModeService;



import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/data")
@Validated
public class DataREST {
	
	
	@Autowired
	LampService lampService;
	
	@Autowired
	ModeService  modeService;
	
	@Autowired
	CaptureHisService captureHisService;
	
	@PostMapping("/lamp/add")
    public ResponseEntity<?> addlamp(  @Validated @RequestBody Lamp la) {
		
        return ResponseEntity.ok(lampService.addLamp(la.getName(), la.getEtat()));
	}
	
	
	@PutMapping("/mode/{auto}")
    public ResponseEntity<?> changMode( @Validated @PathVariable Boolean auto) {
		
        return ResponseEntity.ok(modeService.changeMode(auto));
	}
	
	
	@GetMapping("/mode")
	public boolean getmode() {
   	 
   	 	return modeService.getautomode();
	
   	
		}
	
	@PutMapping("/lamp/{name}/{etat}")
	public ResponseEntity<?> turnLamp(@PathVariable String name, @PathVariable String etat) {
	    return ResponseEntity.ok(lampService.updateLamp(name, etat));
	}
	
	
	@GetMapping("/lamp/{name}")
	public String getEtatLamp(@PathVariable String name) {
   	 
   	 	return lampService.getEtatLamp(name);
	
   	
		}
	
	 @GetMapping("/lamp")
	    public List<Lamp> findAll() {
	        return lampService.findAll();
	                
	    }
	 
	 @GetMapping("/capture")
	    public List<CaptureHis> findAllCaptureHis() {
	        return captureHisService.findAll();
	                
	    }
	 
	 
	 @PostMapping("/capture/add")
	    public ResponseEntity<?> addCaptureHis(  @Validated @RequestBody CaptureHis captureHis) {
			
	        return ResponseEntity.ok(captureHisService.addcaptureshis(captureHis.getTemp(), captureHis.getHumid()));
		}
	
	 @GetMapping("/time")
	 public long gettime() {
		return modeService.gettime();}
}
