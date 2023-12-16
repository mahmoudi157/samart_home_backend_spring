package com.example.demo.document;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Document
public class History   {
    @Id
    @JsonIgnore
    String id;
    @NonNull
    private String event;
    @NonNull
    private boolean auto;
    @NonNull
    private Date date; 
    public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
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
	public History(@NonNull String event, @NonNull boolean auto, @NonNull Date date, double temp, double humid) {
		super();
		this.event = event;
		this.auto = auto;
		this.date = date;
		this.temp = temp;
		this.humid = humid;
	}
	private double temp;
	private double humid;
	public boolean isAuto() {
		return auto;
	}
	public void setAuto(boolean auto) {
		this.auto = auto;
	}
  
}
