package com.generation;

public class Tacos {
	
	//Atributos
	private String tipoDeTortilla;
	private String tipoDeGuisado;
	private int numeroDeTortilla;
	private String tamanioDeTortilla;
	private float precio = 0.0f;

	
	public Tacos() {
		
	}
	
	public Tacos(String tipoDeTortilla) {
		this.tipoDeTortilla =tipoDeTortilla;
		
	}
	//getters y setters
	//deben de ser publicos (public) con convención
	public String getTipoDeTortilla() {
		return this.tipoDeTortilla;
	}
	
	public void setTipoDeTortilla(String tipoDeTortilla) {
		this.tipoDeTortilla = tipoDeTortilla;	
	}
	public String getTipoDeGuisado() {
		return this.tipoDeGuisado;
	}
	
	public void setTipoDeGuisado(String tipoDeGuisado) {
		this.tipoDeGuisado = tipoDeGuisado;	
	}
	public int getNumeroDeTortilla() {
		return this.numeroDeTortilla;
	}
	
	public void setNumeroDeTortilla(int numeroDeTortilla) {
		if(numeroDeTortillas >=0 && numeroDeTortillas <3 ) {
			this.numeroDeTortilla = numeroDeTortilla;
		}else {
			
		}
		
			
	}
	public String getTamanioDeTortilla() {
		return this.tamanioDeTortilla;
	}
	
	public void setTamanioDeTortilla(String tamanioDeTortilla) {
		this.tamanioDeTortilla = tamanioDeTortilla;	
	}
	
	
	
	public int getPatas() {
		return this.patas;
	}
	
	//El contructor nos ayuda a inicialixar objetos
	public Tacos(String tipoDeTortilla, String tipoDeGuisado,
			int numeroDeTortilla, String tamanioDeTortilla,
			float precio){
		this.tipoDeTortilla = tipoDeTortilla;
		this.tipoDeGuisado = tipoDeGuisado;
		this.numeroDeTortilla = numeroDeTortilla;
		this.tamanioDeTortilla = tamanioDeTortilla;
		this.precio = precio;
		
		
	}
	
	//Metodos
	void preparar() {
		System.out.println("Preparando tu rico taco");
	}
	
	void vender() {
		System.out.println("Taco vendido");
	}
	
	void ponerSalsa() {
		System.out.println("Agregando salsa de la que no pica");
	}
	
	void subirPrecio(float aumento) {
		precio = precio + aumento;
		
	}
	
	
	
	

	@Override
	public String toString() {
		return "Tacos [tipoDeTortilla=" + tipoDeTortilla + ", tipoDeGuisado=" + tipoDeGuisado + ", numeroDeTortillas="
				+ numeroDeTortilla + ", tamanoDeTortilla=" + tamanioDeTortilla + ", precio=" + precio + "]";
	}
	
	

}
