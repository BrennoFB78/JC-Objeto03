package com.javastructures;

import java.util.concurrent.Semaphore;

public class Elevador extends Thread{
final int maxFloor = 10;
final int minFloor = 1; 
int curFloor = 1;
int desFloor = 0;
Boolean lotado = false;

Semaphore sp = new Semaphore(1);

	void display (String string) {
		System.out.println(string);	
	}

	void ask (String string) {
		System.out.print(string);
	}

	void delay (int ms) {
		try {
			Thread.sleep(ms);
		}
		catch (Exception e) {}
	}

	void AbrirPorta() {
		sp.release();
	}
	
	void FecharPorta() {
		
	}
	
	void VisitarAndar() {
		curFloor = (int)Math.floor(Math.random()*(maxFloor-minFloor+1)+minFloor);
	}
}