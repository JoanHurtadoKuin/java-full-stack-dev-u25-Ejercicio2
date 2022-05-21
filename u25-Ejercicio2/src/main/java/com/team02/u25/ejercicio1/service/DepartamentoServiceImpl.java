package com.team02.u25.ejercicio1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.team02.u25.ejercicio1.dao.IDepartamentoDAO;
import com.team02.u25.ejercicio1.dto.Departamento;

public class DepartamentoServiceImpl implements IDepartamentoService{
	
	@Autowired
	IDepartamentoDAO iDepartamentoDAO;

	@Override
	public List<Departamento> listarDepartamentos() {
		// TODO Auto-generated method stub
		return iDepartamentoDAO.findAll();
	}

	@Override
	public Departamento guardarDepartamento(Departamento departamento) {
		// TODO Auto-generated method stub
		return iDepartamentoDAO.save(departamento);
	}

	@Override
	public Departamento departamentoXID(Long id) {
		// TODO Auto-generated method stub
		return iDepartamentoDAO.findById(id).get();
	}

	@Override
	public Departamento actualizarDepartamento(Departamento departamento) {
		// TODO Auto-generated method stub
		return iDepartamentoDAO.save(departamento);
	}

	@Override
	public void eliminarDepartamento(Long id) {
		iDepartamentoDAO.deleteById(id);		
	}

}
