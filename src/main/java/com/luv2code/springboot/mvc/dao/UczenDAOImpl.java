package com.luv2code.springboot.mvc.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.luv2code.springboot.mvc.entity.Uczen;


@Repository
public class UczenDAOImpl implements UczenDAO {

	// need to inject the session factory
	@Autowired
	private EntityManager entityManager;;
			
	@Override
	public List<Uczen> getUczens() {
		
		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);

				
		// create a query  ... sort by last name
		Query<Uczen> theQuery = 
				currentSession.createQuery("from Uczen order by nazwisko",
						Uczen.class);
		
		// execute query and get result list
		List<Uczen> uczen = theQuery.getResultList();
				
		// return the results		
		return uczen;
	}

	@Override
	public void saveUczen(Uczen theUczen) {

		// get current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);

		
		// save/upate the customer ... finally LOL
		currentSession.saveOrUpdate(theUczen);
		
	}

	@Override
	public Uczen getUczen(int theId) {

		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);

		
		// now retrieve/read from database using the primary key
		Uczen theUczen = currentSession.get(Uczen.class, theId);
		
		return theUczen;
	}

	@Override
	public void deleteUczen(int theId) {

		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);

		
		// delete object with primary key
		Query theQuery = 
				currentSession.createQuery("delete from Uczen where id=:uczenId");
		theQuery.setParameter("uczenId", theId);
		
		theQuery.executeUpdate();		
	}

}











