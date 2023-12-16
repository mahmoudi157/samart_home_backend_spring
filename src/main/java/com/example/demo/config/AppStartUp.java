package com.example.demo.config;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.service.ModeService;


@Component
public class AppStartUp implements CommandLineRunner{
	
	@Autowired
	private ModeService modeService;
	
	

	@Override
	public void run(String... args) throws Exception {
		
		if (modeService.findAll().isEmpty()) {		
		
			modeService.initialmode();
		}
	}

}
