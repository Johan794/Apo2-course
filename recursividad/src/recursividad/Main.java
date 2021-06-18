package recursividad;

import java.util.Scanner;

public class Main {
 
	public static int[] array;
	public static int size;
	
	public static void main(String[] args) {
		array = new int[4];
		size =0;
		Scanner sc = new Scanner(System.in);
		int value;
		//int response =-1;
		do {
			System.out.print("Ingrese el valor: ");
			value = sc.nextInt();
		}while(llenarArray(array,value));
		size =0;
		long start = System.nanoTime();
		imprimir(array);
		long end = System.nanoTime();
		System.out.println("Tiempo con recursividad: "+(end-start));
		long start1 =System.nanoTime();
		imprimirFor(array);
		long end1 =  System.nanoTime();		
		System.out.println("Tiempo for: "+(end1-start1));
		sc.close();
	}
	
	public static void imprimir(int [] array) {
		if(size<=array.length-1) {
			System.out.print(array[size]+" ");
			size++;
			imprimir(array);
		}else {
			size =0;
		}
		
	}
	
	public static boolean llenarArray(int [] array, int value) {
		boolean can= false;
		System.out.println(can);
		if(size<=array.length-1) {
			if(array[size]==0) {
				array[size] = value;
				can = true;
				System.out.println(size);
			}else {
				size++;
				llenarArray(array,value);
			}
			
		}else {
			System.out.println(size);
		}
		System.out.println(can);
		return can;
	}
	
	public static void imprimirFor(int [] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
	
	

}
