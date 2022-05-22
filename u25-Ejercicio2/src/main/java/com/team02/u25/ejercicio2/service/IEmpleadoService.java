package com.team02.u25.ejercicio2.service;

import java.util.List;

import com.team02.u25.ejercicio2.dto.Empleado;


public interface IEmpleadoService {

	//Metodos del CRUD
	public List<Empleado> listarEmpleado(); 
	
	public Empleado guardarEmpleado(Empleado empleado);	
	
	public Empleado empleadoXID(String dni); 
	
	public Empleado actualizarEmpleado(Empleado empleado); 
	
	public void eliminarEmpleado(String dni);
}
