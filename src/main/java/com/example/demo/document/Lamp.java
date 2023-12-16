package com.example.demo.document;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public  class Lamp   {
	



	@Id
	@JsonIgnore
	private  String id  ;
	@Indexed(unique = true)
	@NonNull
	private  String name;
	
	@NonNull
	private  boolean auto=true;
   
	public Lamp(String name, @NonNull String etat) {
		super();
		this.name = name;
		this.etat = etat;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public Lamp() {
		super();
		// TODO Auto-generated constructor stub
	}
	@NonNull
    private  String etat;

}
