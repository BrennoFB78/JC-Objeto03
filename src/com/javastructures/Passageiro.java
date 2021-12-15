package com.javastructures;

public class Passageiro extends Thread {

	private String nome;
	private int curFloor;
	private int queuePos;
	private Elevador elevador;
	
	public Passageiro(String nome, int curFloor, Elevador elevador){
		this.nome = nome;
		this.curFloor = curFloor;
		this.elevador = elevador;
	}
	
	public void run() {
		if(elevador.curFloor == curFloor && queuePos == 1) {
			try{
				System.out.println(nome + " esta esperando pelo elevador...");
				elevador.sp.acquire();
			} catch(InterruptedException e){
				e.printStackTrace();
			}
		}	
		elevador.VisitarAndar();
		curFloor = elevador.curFloor;
		System.out.println(nome + " chegou no andar " + curFloor + ".");
	}	
}
