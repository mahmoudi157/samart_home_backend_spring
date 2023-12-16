package com.example.demo.dto;

import lombok.NonNull;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class HistoryDto   {
    
    @NonNull
    private String event;
    @NonNull
    
    
   
    
	
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;}
	
	public double getTemp() {
		return temp;
	}
	public void setTemp(double temp) {
		this.temp = temp;
	}
	public double getHumid() {
		return humid;
	}
	public void setHumid(double humid) {
		this.humid = humid;
	}
	public HistoryDto(@NonNull String event,  double temp, double humid) {
		super();
		this.event = event;
		this.temp = temp;
		this.humid = humid;
	}
	private double temp;
	private double humid;
  
}
