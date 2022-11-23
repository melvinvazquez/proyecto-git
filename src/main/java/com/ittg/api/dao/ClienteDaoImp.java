package com.ittg.api.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ittg.api.model.Cliente;
@Repository
public class ClienteDaoImp implements IClienteDao{
	@PersistenceContext
private EntityManager em;
	@SuppressWarnings("unchecked")
	@Override
	@Transactional(readOnly=true)
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return em.createQuery("from Cliente").getResultList();
	}

}
