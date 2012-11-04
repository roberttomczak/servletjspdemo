package com.example.servletjspdemo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.servletjspdemo.domain.Dane;

public class Data {

	private List<Dane> db = new ArrayList<Dane>();
		
	public void add(Dane dane){
		Dane newdane = new Dane(dane.getImie(),dane.getNazwisko());
		db.add(newdane);
	}
	
	public List<Dane> getAllDane(){
		return db;
	}
	
}
