package com.cursoceat.controller;

import java.util.ArrayList;

import com.cursoceat.model.Empleado;
import com.cursoceat.model.JefeEstacion;
import com.cursoceat.model.Locomotora;
import com.cursoceat.model.Maquinista;
import com.cursoceat.model.Mecanico;
import com.cursoceat.model.Tren;
import com.cursoceat.model.Mecanico.*;


public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//crear un array y vamos guardando cada objeto
		ArrayList<Empleado> misEmpleados=new ArrayList<Empleado>();
		Mecanico unMecanico=new Mecanico("JD", 
				"06879545F", 
				"7867",
				1000,
				ESPECIALIDAD.ELECTRICIDAD);
		misEmpleados.add(unMecanico);
		
	//unMecanico.mostrarDatos();
	//	System.out.println(unMecanico.toString());
		Maquinista unMaquinista=new Maquinista("Pedro","06555872N","65555555",1250.50,"Jefe Sección");
	//	unMaquinista.mostrarDatos();
		misEmpleados.add(unMaquinista);
		JefeEstacion unJefeEstacion=new JefeEstacion("Diego", "07589654G","658714785", 1080.00);
	//	unJefeEstacion.mostrarDatos();
		misEmpleados.add(unJefeEstacion);
		JefeEstacion unJefeEstacion2=new JefeEstacion("Azucena","06879512","658741258", 2500.00);
		misEmpleados.add(unJefeEstacion2);
		
		//muestro en este momento lo que tengo en mis empleados
		for (Empleado e:misEmpleados) {
			e.mostrarDatos();
		}
		//***************
		System.out.println("***********Desde aqui ejecutamos Maquinaria ************");
		Locomotora unaLocomotora=new Locomotora("065874M", 1500, 2005, unMecanico);
		System.out.println(unaLocomotora.toString());
		System.out.println("***********************************");
		Tren miTren=new Tren(unaLocomotora, unMaquinista);
		
		miTren.agregarVagon(30000, 15000, "Bombillas");
		
		miTren.mostrarTren();
	}

}
