package com.generation;

import com.gatitos.Gato;

public class Main {

	public static void main(String[] args) {
		//objeto
		//Tacos taco1 = new Tacos( );
		//Tacos taco1 = new Tacos("Masa Azul", "Suadero",2, "Mediana", 30);
		//Caracteristicas propias del objeto 
//		taco1.tipoDeTortilla = "Masa Azul";
//		taco1.tipoDeGuisado = "Suadero";
//		taco1.numeroDeTortilla = 2;
//		taco1.tamanioDeTortilla = "Mediana";
//		taco1.precio = 30;
		//taco1.subirPrecio(5.5f);
		
		//System.out.println(taco1.toString());
		/*
		//objeto
		Tacos taco2 = new Tacos();
		//Caracteristicas propias del objeto 
		taco2.tipoDeTortilla = "Harina";
		taco2.tipoDeGuisado = "Bisteck";
		taco2.numeroDeTortilla = 1;
		taco2.tamanioDeTortilla = "Grande";
		taco2.precio = 42.6f;//se agrega la f -tipo de dato
		taco2.tipoDeTortilla= "Trigo"; //remplazo el valor y coloco el nuevo (reasignación)
		System.out.println(taco2.toString());

		
		Tacos taco3 = new Tacos ("Maiz");
		System.out.println(taco3);*/
		
		Tacos t = new Tacos();
		//g.nombre = "Taco";
		//g.patas = 3;
		
		//System.out.println(g);
		
		t.setTipoDeTortilla("Maiz");
		t.setTipoDeGuisado("Suadero");
		t.setNumeroDeTortilla(2);
		
		t.setAdoptado(false);
		
		System.out.println(t);
	}

}
