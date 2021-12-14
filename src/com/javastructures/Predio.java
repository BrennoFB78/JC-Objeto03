package com.javastructures;

public class Predio {
	public Elevador elevador;
	
	void IniciarElevador() {
		elevador.start();
	}
	
	void PararElevador() {
		elevador.interrupt();
	}
}
