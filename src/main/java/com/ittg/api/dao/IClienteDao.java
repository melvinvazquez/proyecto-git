package com.ittg.api.dao;

import java.util.List;

import com.ittg.api.model.Cliente;

public interface IClienteDao {
	public List<Cliente> findAll();

}
