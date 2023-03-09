package com.cursoceat.model;

public class Mecanico extends Empleado {
	 public enum ESPECIALIDAD {FRENOS,HIDRAULICA, ELECTRICIDAD,MOTOR} //visible 
	 private ESPECIALIDAD especialidad; //encapsulada
	 
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
	
	@Override
	public void mostrarDatos() {
		super.mostrarDatos();
		System.out.println("Especialidad: "+ this.especialidad);
	}

	@Override
	public String toString() {
		return "\n Especialidad=" + especialidad + "\n Nombre=" + nombre + "\n Dni=" + dni + "\n Telefono="
				+ telefono + "\n Sueldo=" + sueldo + "]";
	}
	 
	 
}
