package ui;

import model.MultipleCount;
import thread.MultipleCountThread;

public class Main {

	private MultipleCount m5;
	private MultipleCount m7 ;
	private MultipleCount m2;
	
	private static MultipleCountThread hm5;
	private static MultipleCountThread hm7;
	private static MultipleCountThread hm2;
	
	public Main() {
		m5 = new MultipleCount("Juan",5);
		m7 = new MultipleCount("Victor", 7);
		m2 = new MultipleCount("Angela", 2);
		
		hm5 = new MultipleCountThread(this, m5);
		hm7 = new MultipleCountThread(this, m7);
		hm2 = new MultipleCountThread(this, m2);
	
	}
	
	public void printAmountOfMultiple(MultipleCount m , int amountM) {
		System.out.println(m.getName()+" cuenta "+amountM+" multiplos de "+m.getNumberMultiple());
		
	}
	/**
	public void countMultiple() {
		hm5.start();
		hm7.start();
		hm2.start();
	}
	
	**/

	public static void main(String[] args) {
		Main ppal = new Main();
		hm5.start();
		hm7.start();
		hm2.start();
		
		try {
			hm5.join();
			hm7.join();
			hm2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
