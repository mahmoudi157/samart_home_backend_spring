package com.example.demo.document;



import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public  class Mode   {
	


@Id
private String id;

public Mode(String id, boolean auto) {
	super();
	this.id = id;
	this.auto = auto;
}

public Mode() {
	super();
}

private boolean auto;

public boolean isAuto() {
	return auto;
}

public Mode(boolean auto) {
	super();
	this.auto = auto;
}

public void setAuto(boolean auto) {
	this.auto = auto;
}
	

}
