package com.luv2code.springboot.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springboot.mvc.dao.UczenDAO;
import com.luv2code.springboot.mvc.entity.Uczen;



@Service
public class UczenServiceImpl implements UczenService {

	// need to inject customer dao
	@Autowired
	private UczenDAO uczenDAO;
	
	@Override
	@Transactional
	public List<Uczen> getUczens() {
		return uczenDAO.getUczens();
	}

	@Override
	@Transactional
	public void saveUczen(Uczen theUczen) {

		uczenDAO.saveUczen(theUczen);
	}

	@Override
	@Transactional
	public Uczen getUczen(int theId) {
		
		return uczenDAO.getUczen(theId);
	}

	@Override
	@Transactional
	public void deleteUczen(int theId) {
		
		uczenDAO.deleteUczen(theId);
	}
	
	
	
}





