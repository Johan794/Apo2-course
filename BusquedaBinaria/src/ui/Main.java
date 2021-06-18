package ui;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static int array[];
	public static void main(String[] args) {
		array = new int[] {7,3,9,2,5,1,8,4,6};
		int value;
		Scanner sc = new Scanner(System.in);
		incertionSort();
		System.out.println("Incertion sort:\n "+Arrays.toString(array));
		System.out.print("Please enter the number you'd like to search:");
		value = sc.nextInt();
		System.out.println("Your element was found?: "+binarySearch(value));
     
		sc.close();
	}
	
	public static void incertionSort() {
    	int temp=0;
    	for(int i=1; i<array.length; i++) {
    		for(int j=i; j>0 && array[j-1] > array[j]; j--) {
    			temp=array[j];
    			array[j]=array[j-1];
    			array[j-1]= temp;
    		}
    		
    	}
    	
    }
	
	public static boolean binarySearch(int value) {
		boolean found = false;
		int begin=0;
		int end=array.length-1;
		while(begin<=end && !found) {
			int middle = (begin + end)/2;
			if(array[middle]==value) {
				found=true;
			}else if(array[middle]> value) {
				end= middle-1;
			}else{
				begin = middle+1;
			}
		}
		
	return found;	
		
	}
	
	public static int binarySearch(String []entrada, String x) {
		int found=-1;
		int i =0;
		int j= entrada.length-1;
		while(i<=j && found<0) {
			int m = (i+j)/2;
			if(entrada[m].equals(x)) {
				found = m;
			}else if(x.compareTo(entrada[m])>0) {
				i = m+1;
			}else{
				j=m-1;
			}
		}
		
		return found;
		
	}
	
	

}
