package com.gatitos;

public class PruebaGato {
	public static void main(String[] args) {
		//Gato g = new Gato();
		Gato g = new Gato("Taco",3,false);
		//g.nombre = "Taco";
		//g.patas = 3;
		
		//System.out.println(g);
		
		g.setNombre("Taco");
		g.setPatas(3);
		g.setAdoptado(false);
		
		System.out.println(g);
		System.out.println("Migato se llama "+ g.getNombre());
		
		//excepciones
		/*
		int num1 = 5,num2 = 0;
		int resultado = num1/num2; //error de tiempode ejecución
		System.out.println(resultado);
		System.out.println("Hola Mundo");
		*/
		
	}

}
