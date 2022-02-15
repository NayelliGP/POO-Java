package com.gatitos;

public class Gato {
	//atributos
	private String nombre;
	private int patas;
	private boolean adoptado;
	
	//constrictors
	public Gato(String nombre, int patas, boolean adoptado) {
		super();
		this.nombre = nombre;
		this.patas = patas;
		this.adoptado = adoptado;
	}
	
	
	//getters y setters
	//deben de ser publicos (public) con convención
	public String getNombre() {
		return this.nombre;
	}
	

	public void setNombre(String nombre) {
		this.nombre = nombre;	
	}
	
	public int getPatas() {
		return this.patas;
	}
	
	public void setPatas(int patas) {
		if(patas >= 0 && patas< 5) {//0 -4 paas
			this.patas = patas;	
		}else{
			throw new IllegalArgumentException("El número de patas nos es válido");
		}
		
		//this.patas = patas;
	}
	
	public boolean isAdoptado() { //is, por que se hace una pregunta
		return this.adoptado;
	}
	
	public void setAdoptado(boolean adoptado) {
		this.adoptado = adoptado;
	}

	
	//Método toString
	
	@Override
	public String toString() {
		return "Gato [nombre=" + nombre + ", patas=" + patas + ", adoptado=" + adoptado + "]";
	}
	

	

}
