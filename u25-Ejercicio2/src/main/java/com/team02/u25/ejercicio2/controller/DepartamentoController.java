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

import com.team02.u25.ejercicio2.dto.Departamento;
import com.team02.u25.ejercicio2.service.DepartamentoServiceImpl;

@RestController
@RequestMapping("/departamento")
public class DepartamentoController {
	
	@Autowired
	DepartamentoServiceImpl departamentoServiceImpl;

	@GetMapping("/")
	public List<Departamento> listarDepartamentos(){
		return departamentoServiceImpl.listarDepartamentos();
	}
	
	@PostMapping("/")
	public Departamento salvarDepartamento(@RequestBody Departamento departamento) {
		return departamentoServiceImpl.guardarDepartamento(departamento);
	}
	
	@GetMapping("/{codigo}")
	public Departamento departamentoXID(@PathVariable(name="codigo") int codigo) {
		
		Departamento departamento_xid = new Departamento();
		
		departamento_xid = departamentoServiceImpl.departamentoXID(codigo);
		
		return departamento_xid;
		
	}
	
	@PutMapping("/{codigo}")
	public Departamento actualizarDepartamento(@PathVariable(name="codigo")int codigo,@RequestBody Departamento departamento) {
		
		Departamento departamento_seleccionado= new Departamento();
		Departamento departamento_actualizado= new Departamento();
		
		departamento_seleccionado= departamentoServiceImpl.departamentoXID(codigo);
		
		departamento_seleccionado.setNombre(departamento.getNombre());
		departamento_seleccionado.setPresupuesto(departamento.getPresupuesto());

		
		departamento_actualizado = departamentoServiceImpl.actualizarDepartamento(departamento_seleccionado);
		
		return departamento_actualizado;
	}
	
	@DeleteMapping("/{codigo}")
	public void eleiminarDepartamento(@PathVariable(name="codigo")int codigo) {
		departamentoServiceImpl.eliminarDepartamento(codigo);
	}
	
}
