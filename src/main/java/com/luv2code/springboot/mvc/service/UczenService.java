package com.luv2code.springboot.mvc.service;

import java.util.List;

import com.luv2code.springboot.mvc.entity.Uczen;



public interface UczenService {

	public List<Uczen> getUczens();

	public void saveUczen(Uczen theUczen);

	public Uczen getUczen(int theId);

	public void deleteUczen(int theId);
	
}
