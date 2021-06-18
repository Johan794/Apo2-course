package ui;

import model.Market;
import java.util.Scanner;

public class Main {
	private static Market ma;
	private static Scanner sc;

	public static void main(String[] args) {
		ma = new Market();
		sc = new Scanner (System.in);
		
		
		String name ; 
		double price ; 
		long id;
		System.out.println("Crea un nuevo producto");
		
		System.out.print("nombre: ");
		name = sc.nextLine();
		System.out.print("precio: ");
		price = sc.nextDouble();
		System.out.print("id: ");
		id = sc.nextLong();
		
		ma.addProduct(name, price, id);
		
		System.out.println(ma.showList());
		

	}
	
	

}
