package com.javastructures;

public class mainApp {
	
	public static void main(String[] args) {
		int NPassageiro = 10;
		int passageirosInseridos = 0;
		Predio predio = new Predio();
		
		for(int i = 0; i < NPassageiro; i++) {
			passageirosInseridos++;
			new Passageiro("Passageiro " + passageirosInseridos, (int)Math.floor(Math.random()*(predio.elevador.maxFloor-predio.elevador.minFloor+1)+
					predio.elevador.minFloor), predio.elevador);
		}
	}
}
