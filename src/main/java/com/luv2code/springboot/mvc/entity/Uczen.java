package com.luv2code.springboot.mvc.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="uczen")
public class Uczen {
	
	@OneToMany(mappedBy="uczen")
	private Set<Kurs> kurs;
	
	@OneToMany(mappedBy = "uczen")
	private Set<Testy> testy;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="opiekun_id")
	
	private Opiekun opiekun;
	
	//@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH,CascadeType.MERGE})
	//@JoinColumn(name="klasa_id")
	//private Klasa klasa;
	
	@Column(name="klasa")
	private String klasa;
	
	@Column(name="imie")
	private String imie;
	
	@Column(name="nazwisko")
	private String nazwisko;
	
	@Column(name="nr_domu")
	private String nrDomu;
	
	@Column(name="nr_lokalu")
	private String nrLokalu;
	
	@Column(name="ulica")
	private String ulica;
	
	@Column(name="kod_pocztowy")
	private String kodPocztowy;
	
	@Column(name="powiat")
	private String powiat;
	
	@Column(name="wojewodztwo")
	private String wojewodztwo;
	
	@Column(name="miejscowosc")
	private String miejscowosc;
	
	@Column(name="miasto")
	private String miasto;
	
	@Column(name="login")
	private String login;
	
	@Column(name="haslo")
	private String haslo;
	
	public Uczen()
	{
		
	}



	public Uczen( String klasa, String imie, String nazwisko, String nrDomu, String nrLokalu,
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


	



	



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public Opiekun getOpiekun() {
		return opiekun;
	}



	public void setOpiekun(Opiekun opiekun) {
		this.opiekun = opiekun;
	}



	public String getKlasa() {
		return klasa;
	}

	public void setKlasa(String klasa) {
		this.klasa = klasa;
	}

	public int getIdUczen() {
		return id;
	}

	public void setIdUczen(int idNauczyciel) {
		this.id = idNauczyciel;
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

	@Override
	public String toString() {
		return "Uczen [idNauczyciel=" + id + ", imie=" + imie + ", nazwisko=" + nazwisko + ", nrDomu="
				+ nrDomu + ", nrLokalu=" + nrLokalu + ", ulica=" + ulica + ", kodPocztowy=" + kodPocztowy + ", powiat="
				+ powiat + ", wojewodztwo=" + wojewodztwo + ", miejscowosc=" + miejscowosc + ", miasto=" + miasto
				+ ", login=" + login + ", haslo=" + haslo + "]";
	}

	
	
	
	
	
}

