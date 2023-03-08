package com.cursoceat.model;

public class Mecanico extends Empleado {
	 public enum ESPECIALIDAD {FRENOS,HIDRAULICA, ELECTRICIDAD,MOTOR}
	 private ESPECIALIDAD especialidad;
	 
	public Mecanico() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mecanico(String nombre, String dni, String telefono, double sueldo, ESPECIALIDAD espe) {
		super(nombre, dni, telefono, sueldo);
		// TODO Auto-generated constructor stub
		this.especialidad = espe;
	}

	public ESPECIALIDAD getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(ESPECIALIDAD especialidad) {
		this.especialidad = especialidad;
	}
	 
	 
	 
}
