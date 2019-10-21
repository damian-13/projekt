package com.luv2code.springboot.mvc.entity;

import java.sql.Date;
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

@Entity
@Table(name="kurs")
public class Kurs {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_kurs")
	private int idKurs;
	
	@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH,CascadeType.MERGE})
	@JoinColumn(name="nauczyciel_id")
	private Nauczyciel nauczyciel;
	
	@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH,CascadeType.MERGE})
	@JoinColumn(name = "uczen_id")
	private Uczen uczen;
	
	@OneToMany(mappedBy="kurs")
	private Set<Testy> testy;
	
	
	@Column(name="przedmiot")
	private String przedmiot;
	
	@Column(name="ocena")
	private int ocena;
	
	@Column(name="status")
	private String status;
	
	@Column(name="notatka")
	private String notatka;
	
	@Column(name="rok")
	private String rok;
	
	
	
	public Kurs() {
		
	}

	

	
	
	

	public Kurs(Nauczyciel nauczyciel, Uczen uczen, Set<Testy> testy, String przedmiot, int ocena, String status,
			String notatka, String rok) {
		
		this.nauczyciel = nauczyciel;
		this.uczen = uczen;
		this.testy = testy;
		this.przedmiot = przedmiot;
		this.ocena = ocena;
		this.status = status;
		this.notatka = notatka;
		this.rok = rok;
	}

	






	public Nauczyciel getNauczyciel() {
		return nauczyciel;
	}







	public void setNauczyciel(Nauczyciel nauczyciel) {
		this.nauczyciel = nauczyciel;
	}







	public Uczen getUczen() {
		return uczen;
	}







	public void setUczen(Uczen uczen) {
		this.uczen = uczen;
	}







	public Set<Testy> getTesty() {
		return testy;
	}







	public void setTesty(Set<Testy> testy) {
		this.testy = testy;
	}







	public String getNotatka() {
		return notatka;
	}

	public void setNotatka(String notatka) {
		this.notatka = notatka;
	}

	public String getRok() {
		return rok;
	}

	public void setRok(String rok) {
		this.rok = rok;
	}

	public int getIdKurs() {
		return idKurs;
	}

	public void setIdKurs(int idKurs) {
		this.idKurs = idKurs;
	}

	public String getPrzedmiot() {
		return przedmiot;
	}

	public void setPrzedmiot(String przedmiot) {
		this.przedmiot = przedmiot;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Kurs [idKurs=" + idKurs + ", przedmiot=" + przedmiot + ", ocena=" + ocena + ", status=" + status
				+ ", notatka=" + notatka + ", rok=" + rok + "]";
	}

	

	

	

	

	

	
	

}
