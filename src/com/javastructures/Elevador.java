package com.javastructures;
public class Elevador {
	Elevador e = new Elevador();
	
final int maxFloor = 10;
final int minFloor = 1; 
int curFloor = 1;
int desFloor = 0;

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
void goUp () {
	while (curFloor++ < desFloor);
	display("subindo... andar: + curFloor");
	delay(600);
}
	
void goDown () {
	while (curFloor-- > desFloor);
	display("descendo... andar: + curFloor");
	delay (600);
}

void ask() {
	ask("Insira o andar desejado: ");
	if (desFloor < minFloor || desFloor > maxFloor || desFloor == curFloor) {
		display("O andar selecionado não existe ou é o atual.");
		ask ();
	} else {
		display("Fechando a porta...");
		delay(600);
		if(desFloor < curFloor) {
			goDown();
		} else if (desFloor > curFloor) {
			goUp();
		}
	}
} 
}