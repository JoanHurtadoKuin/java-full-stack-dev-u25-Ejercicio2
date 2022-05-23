package com.team02.u25.ejercicio2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.team02.u25.ejercicio2.dto.Empleado;
import com.team02.u25.ejercicio2.service.EmpleadoServiceImpl;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {
	
	@Autowired
	EmpleadoServiceImpl empleadoServiceImpl;
	//liste de empleados
	@GetMapping("/")
	public List<Empleado> listarEmpleado(){
		return empleadoServiceImpl.listarEmpleado();
	}
	//salvar empleado
	@PostMapping("/")
	public Empleado salvarEmpleado(@RequestBody Empleado empleado) {
		return empleadoServiceImpl.guardarEmpleado(empleado);
	}
	//añadir empleado
	@GetMapping("/{dni}")
	public Empleado EmpleadoXID(@PathVariable(name="id") String dni) {
		
		Empleado Empleado_xid = new Empleado();
		
		Empleado_xid = empleadoServiceImpl.empleadoXID(dni);
		
		return Empleado_xid;
		
	}
	//actualizar los empleados
	@PutMapping("/{dni}")
	public Empleado actualizarEmpleado(@PathVariable(name="dni")String dni,@RequestBody Empleado Empleado) {
		
		Empleado Empleado_seleccionado= new Empleado();
		Empleado Empleado_actualizado= new Empleado();
		
		Empleado_seleccionado= empleadoServiceImpl.empleadoXID(dni);
		
		Empleado_seleccionado.setDni(Empleado.getDni());
		Empleado_seleccionado.setNombre(Empleado.getNombre());
		Empleado_seleccionado.setApellidos(Empleado.getApellidos());
		Empleado_seleccionado.setDepartamento(Empleado.getDepartamento());

		
		Empleado_actualizado = empleadoServiceImpl.actualizarEmpleado(Empleado_seleccionado);
		
		System.out.println("El cliente actualizado es: "+ Empleado_actualizado);
		
		return Empleado_actualizado;
	}
	//eliminar empleado
	@DeleteMapping("/{dni}")
	public void eleiminarEmpleado(@PathVariable(name="dni")String dni) {
		empleadoServiceImpl.eliminarEmpleado(dni);
	}
	
}