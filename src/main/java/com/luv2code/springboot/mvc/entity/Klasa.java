package com.luv2code.springboot.mvc.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="klasa")
public class Klasa {
	
	//@OneToMany(mappedBy = "klasa")
	//private Set<Uczen> uczen;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_klasa")
	private int idKlasa;
	
	@Column(name="nazwa")
	private String nazwa;
	
	public Klasa()
	{
		
	}

	public Klasa(String nazwa) {
		
		this.nazwa = nazwa;
	}

	public int getIdKlasa() {
		return idKlasa;
	}

	public void setIdKlasa(int idKlasa) {
		this.idKlasa = idKlasa;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	@Override
	public String toString() {
		return "Klasa [idKlasa=" + idKlasa + ", nazwa=" + nazwa + "]";
	}
	
	

}
