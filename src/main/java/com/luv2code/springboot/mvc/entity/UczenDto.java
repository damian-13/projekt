package com.luv2code.springboot.mvc.entity;

import javax.persistence.Column;

public class UczenDto {

	private Long id;
	
	private OpiekunDto opiekun;
	
	private String klasa;
	
	private String imie;
	
	private String nazwisko;
	
	private String nrDomu;
	
	private String nrLokalu;
	
	private String ulica;
	
	private String kodPocztowy;
	
	private String powiat;
	
	private String wojewodztwo;
	
	private String miejscowosc;
	
	private String miasto;
	
	private String login;
	
	private String haslo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public OpiekunDto getOpiekun() {
		return opiekun;
	}

	public void setOpiekun(OpiekunDto opiekun) {
		this.opiekun = opiekun;
	}

	public String getKlasa() {
		return klasa;
	}

	public void setKlasa(String klasa) {
		this.klasa = klasa;
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

	public String getNrDomu() {
		return nrDomu;
	}

	public void setNrDomu(String nrDomu) {
		this.nrDomu = nrDomu;
	}

	public String getNrLokalu() {
		return nrLokalu;
	}

	public void setNrLokalu(String nrLokalu) {
		this.nrLokalu = nrLokalu;
	}

	public String getUlica() {
		return ulica;
	}

	public void setUlica(String ulica) {
		this.ulica = ulica;
	}

	public String getKodPocztowy() {
		return kodPocztowy;
	}

	public void setKodPocztowy(String kodPocztowy) {
		this.kodPocztowy = kodPocztowy;
	}

	public String getPowiat() {
		return powiat;
	}

	public void setPowiat(String powiat) {
		this.powiat = powiat;
	}

	public String getWojewodztwo() {
		return wojewodztwo;
	}

	public void setWojewodztwo(String wojewodztwo) {
		this.wojewodztwo = wojewodztwo;
	}

	public String getMiejscowosc() {
		return miejscowosc;
	}

	public void setMiejscowosc(String miejscowosc) {
		this.miejscowosc = miejscowosc;
	}

	public String getMiasto() {
		return miasto;
	}

	public void setMiasto(String miasto) {
		this.miasto = miasto;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getHaslo() {
		return haslo;
	}

	public void setHaslo(String haslo) {
		this.haslo = haslo;
	}
	
	
	public UczenDto()
	{
		
	}

	public UczenDto( String klasa, String imie, String nazwisko, String nrDomu, String nrLokalu,
			String ulica, String kodPocztowy, String powiat, String wojewodztwo, String miejscowosc, String miasto,
			String login, String haslo) {
		
		
		this.klasa = klasa;
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.nrDomu = nrDomu;
		this.nrLokalu = nrLokalu;
		this.ulica = ulica;
		this.kodPocztowy = kodPocztowy;
		this.powiat = powiat;
		this.wojewodztwo = wojewodztwo;
		this.miejscowosc = miejscowosc;
		this.miasto = miasto;
		this.login = login;
		this.haslo = haslo;
	}
	
	
	
}
