package com.luv2code.springboot.mvc.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="kwalifikacja_zawodowa")
public class KwalifikacjaZawodowa {

		@OneToMany(mappedBy="kwalifikacjaZawodowa")
		private Set<Testy> testy; 
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id_kwalifikacja_zawodowa")
		private int idKwalifikacjaZawodowa;
		
		@Column(name="nazwa")
		private String nazwa;
		
		@Column(name="indeks")
		private String indeks;
		
		public KwalifikacjaZawodowa()
		{
			
		}

		public KwalifikacjaZawodowa(String nazwa, String indeks) {
			
			this.nazwa = nazwa;
			this.indeks = indeks;
		}

		public int getIdKwalifikacjaZawodowa() {
			return idKwalifikacjaZawodowa;
		}

		public void setIdKwalifikacjaZawodowa(int idKwalifikacjaZawodowa) {
			this.idKwalifikacjaZawodowa = idKwalifikacjaZawodowa;
		}

		public String getNazwa() {
			return nazwa;
		}

		public void setNazwa(String nazwa) {
			this.nazwa = nazwa;
		}

		public String getIndeks() {
			return indeks;
		}

		public void setIndeks(String indeks) {
			this.indeks = indeks;
		}

		@Override
		public String toString() {
			return "KwalifikacjaZawodowa [idKwalifikacjaZawodowa=" + idKwalifikacjaZawodowa + ", nazwa=" + nazwa
					+ ", indeks=" + indeks + "]";
		}
		
		
		
		
	
		
		
}
