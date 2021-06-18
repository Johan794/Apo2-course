package ui;
import java.util.Arrays;

public class Main {
	public static int array[];
	
	public static void main(String[] args) {
      
		long start = System.nanoTime();
		bubbleSort();
		long end = System.nanoTime();
		System.out.println("Bubble sort:\n "+Arrays.toString(array)+"\n finished at: "+(end-start)+"\n");
		
		long start2 = System.nanoTime();
		selectionSort();
		long end2 = System.nanoTime();
		System.out.println("Selection sort:\n "+Arrays.toString(array)+"\n finished at: "+(end2-start2)+"\n");

		long start3 = System.nanoTime();
		incertionSort();
		long end3 = System.nanoTime();
		System.out.println("Incertion sort sort:\n "+Arrays.toString(array)+"\n finished at: "+(end3-start3)+"\n");
		

	}
	
	//Bubble Sort algorithm
    public static void bubbleSort() {
    	array = new int[] {7,3,9,2,5,1,8,4,6};
    	boolean changed = true;
    	for(int i =1; i<array.length && changed; i++) {
    		changed=false;
    	   for(int j=0; j<array.length-1; j++) {
    		   if(array[j]<array[j+1]) {
       			int temp = array[j];
       			array[j]=array[j+1];
       			array[j+1]=temp;
       			changed = true;
       			}   
    	   }
    		
    		
    	}
    }
    
    //Selection sort algorithm
    public static void selectionSort() {
    	array = new int[] {7,3,9,2,5,1,8,4,6};
    	for(int i=0; i<array.length;i++) {
    		int min = array[i];
        	for(int j=i+1; j<array.length; j++) {
        		if(array[j]<min) {
        			int temp = array[j];
            		array[j]= min;
            		 min=temp;
        		}	
        	}
        	array[i]=min;	
    	}
    	
    }
    
    public static void incertionSort() {
    	array = new int[] {7,3,9,2,5,1,8,4,6};
    	int temp=0;
    	for(int i=1; i<array.length; i++) {
    		for(int j=i; j>0 && array[j-1] > array[j]; j--) {
    			temp=array[j];
    			array[j]=array[j-1];
    			array[j-1]= temp;
    		}
    		
    	}
    	
    }
	
	

}
