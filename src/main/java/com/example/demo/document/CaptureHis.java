package com.example.demo.document;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Document
public class CaptureHis   {
    @Id
    @JsonIgnore
    String id;
    
    @NonNull
    private Date date;
    
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public CaptureHis() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CaptureHis(@NonNull Date date, double temp, double humid) {
		super();
		this.date = date;
		this.temp = temp;
		this.humid = humid;
	}

	private double temp;
	
	private double humid;
  
}
