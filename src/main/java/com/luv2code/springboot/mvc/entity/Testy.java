package com.luv2code.springboot.mvc.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="testy")
public class Testy {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_testy")
	private int idTesty;
	
	@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH,CascadeType.MERGE})
	@JoinColumn(name="uczen_id")
	private Uczen uczen;
	
	@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH,CascadeType.MERGE})
	@JoinColumn(name="nauczyciel_id")
	private Nauczyciel nauczyciel;
	
	@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH,CascadeType.MERGE})
	@JoinColumn(name="kurs_id")
	private Kurs kurs;
	
	@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH,CascadeType.MERGE})
	@JoinColumn(name="kwalifikacja_zawodowa_id")
	private KwalifikacjaZawodowa kwalifikacjaZawodowa;
	
	@Column(name="czas_trwania")
	private int czasTrwania;
	
	@Column(name="prog_zaliczenia")
	private int progZaliczenia;
	
	@Column(name="liczba_pytan")
	private int liczbaPytan;
	
	@Column(name="rodzaj_testu")
	private String rodzajTestu;
	
	@Column(name="ocena")
	private String ocena;
	
	@Column(name="notatka")
	private String notatka;
	
	public Testy()
	{
		
	}

	public Testy(int casTrwania, int progZaliczenia, int liczbaPytan, String rodzajTestu, String ocena,
			String notatka) {
		
		this.czasTrwania = casTrwania;
		this.progZaliczenia = progZaliczenia;
		this.liczbaPytan = liczbaPytan;
		this.rodzajTestu = rodzajTestu;
		this.ocena = ocena;
		this.notatka = notatka;
	}

	public int getIdTesty() {
		return idTesty;
	}

	public void setIdTesty(int idTesty) {
		this.idTesty = idTesty;
	}

	public int getCzasTrwania() {
		return czasTrwania;
	}

	public void setCzasTrwania(int casTrwania) {
		this.czasTrwania = casTrwania;
	}

	public int getProgZaliczenia() {
		return progZaliczenia;
	}

	public void setProgZaliczenia(int progZaliczenia) {
		this.progZaliczenia = progZaliczenia;
	}

	public int getLiczbaPytan() {
		return liczbaPytan;
	}

	public void setLiczbaPytan(int liczbaPytan) {
		this.liczbaPytan = liczbaPytan;
	}

	public String getRodzajTestu() {
		return rodzajTestu;
	}

	public void setRodzajTestu(String rodzajTestu) {
		this.rodzajTestu = rodzajTestu;
	}

	public String getOcena() {
		return ocena;
	}

	public void setOcena(String ocena) {
		this.ocena = ocena;
	}

	public String getNotatka() {
		return notatka;
	}

	public void setNotatka(String notatka) {
		this.notatka = notatka;
	}

	@Override
	public String toString() {
		return "Testy [idTesty=" + idTesty + ", casTrwania=" + czasTrwania + ", progZaliczenia=" + progZaliczenia
				+ ", liczbaPytan=" + liczbaPytan + ", rodzajTestu=" + rodzajTestu + ", ocena=" + ocena + ", notatka="
				+ notatka + "]";
	}
	
	
	
}
