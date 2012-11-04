package com.example.servletjspdemo.domain;

public class Dane {
	
	private String imie = "Robert";
	private String nazwisko = "Tomczak";
	
	public Dane() {
		super();
	}
	
	public Dane(String imie, String nazwisko) {
		super();
		this.imie = imie;
		this.nazwisko = nazwisko;
	}
	
	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

}
