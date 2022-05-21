package com.team02.u25.ejercicio1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.team02.u25.ejercicio1.dto.Empleado;

public interface IEmpleadoDAO extends JpaRepository<Empleado, Long>{

}
