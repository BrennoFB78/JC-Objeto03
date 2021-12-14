package com.javastructures;

import java.util.concurrent.Semaphore;

public class Passageiro extends Thread {

	private String nome;
	private int curFloor;
	private Semaphore sp;
	private int queuePos;
	private Elevador elevador;
	
	public Passageiro(String nome, int curFloor, Semaphore sp, Elevador elevador){
		this.nome = nome;
		this.sp = sp;
		this.curFloor = curFloor;
		this.elevador = elevador;
	}
	
	public void run() {
		if(elevador.curFloor == curFloor && queuePos == 1) {
			try{
				sp.acquire();
			} catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}	
}
