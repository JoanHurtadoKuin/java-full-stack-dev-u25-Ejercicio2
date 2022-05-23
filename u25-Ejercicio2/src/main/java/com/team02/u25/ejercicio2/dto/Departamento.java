package com.team02.u25.ejercicio2.dto;


import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;



import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
//crear tabla departamento
@Table(name= "departamento")
public class Departamento {
	

	//Atributos de entidad cliente
	@Id
	private int codigo;
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;
	@Column(name = "presupuesto")//no hace falta si se llama igual
	private int presupuesto;
	
    @OneToMany
    @JoinColumn(name="id")
    
    //lista de empleados
    private List<Empleado> empleado;
    
    public Departamento() { 
    	
    }

	public Departamento(int codigo, String nombre, int presupuesto) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.presupuesto = presupuesto;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "empleado")
	
	public List<Empleado> getEmpleado() {
		return empleado;
	}

	public void setEmpleado(List<Empleado> empleado) {
		this.empleado = empleado;
	}

	@Override
	public String toString() {
		return "Departamento [codigo=" + codigo + ", nombre=" + nombre + ", presupuesto=" + presupuesto + "]";
	}
    
}
