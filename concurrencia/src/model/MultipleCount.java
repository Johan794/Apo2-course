package model;

public class MultipleCount {
	public static final int MAX = 10000000;
	private String name;
	private int numberMultiple;
	
	public MultipleCount(String name, int numberMultiple) {
		this.name = name;
		this.numberMultiple = numberMultiple;
	}

	public String getName() {
		return name;
	}

	public int getNumberMultiple() {
		return numberMultiple;
	}
	
	
	public int howManyMultiple() {
		int howMany = 0;
		for (int i = 1; i <=MAX; i++) {
			if(i%numberMultiple==0) {
				howMany++;
			}
		}
		return howMany;
	}
	

}
