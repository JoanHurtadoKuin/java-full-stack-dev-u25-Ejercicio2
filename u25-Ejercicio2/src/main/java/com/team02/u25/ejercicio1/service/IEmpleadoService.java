package com.team02.u25.ejercicio1.service;

import java.util.List;

import com.team02.u25.ejercicio1.dto.Empleado;


public interface IEmpleadoService {

	//Metodos del CRUD
	public List<Empleado> listarEmpleado(); 
	
	public Empleado guardarEmpleado(Empleado empleado);	
	
	public Empleado empleadoXID(Long id); 
	
	public Empleado actualizarEmpleado(Empleado empleado); 
	
	public void eliminarEmpleado(Long id);
}
