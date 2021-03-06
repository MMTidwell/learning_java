package com.java24hours;

public class ModemTester {
	public static void main (String[] args) {
		// creates new objects from CableModem.java and DslModem.java
		CableModem surfBoard = new CableModem();
		DslModem gateway = new DslModem();
		// the speed method is pulled from the superclass Modem
		surfBoard.speed = 500000;
		gateway.speed = 400000;
		// first thing that prints 
		System.out.println("Trying the cable modem:");
		// the displaySpeed method is used from the superclass Modem
		surfBoard.displaySpeed();
		// the connect method is used from the subclass CableModem
		surfBoard.connect();
		System.out.println("Tyring the DSL modem:");
		// the displaySpeed method is pulled from the superclass Modem
		gateway.displaySpeed();
		// the connect method is pulled from the subclass CableModem
		gateway.connect();
	}
}
