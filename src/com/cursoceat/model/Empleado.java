package com.cursoceat.model;

import javax.lang.model.util.ElementScanner9;

public class Empleado {
	private static int id;
	protected String nombre;
	protected String dni;
	protected String telefono;
	protected double sueldo;
	
	public Empleado() {
		asignarID(); //creamos un constructor y le asignamos un id
	}

	public Empleado(String nombre, String dni, String telefono, double sueldo) {
		this.nombre = nombre;
		this.dni = dni;
		this.telefono = telefono;
		this.sueldo = sueldo;
		asignarID();//constructor con todos los datos y asignamos id
	}
	
	static private void asignarID() {
		id++;
	}
	
	static public int getId() {
		return id;		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	public void mostrarDatos() {
		System.out.println("El id es: " + id);
		System.out.println("El nombre es : "+ this.nombre );
		System.out.println("El DNI es: "+ this.dni );
		System.out.println("El Teléfono es : "+ this.telefono);
		System.out.println("El Sueldo es : "+ this.sueldo );
	}
	
	
	
	
	

}
