package model;

public class Apartment implements Comparable<Apartment> {
	private char tower;
	private int number;
	private int floor;
	private String family;
	private boolean pet;
	
	public Apartment(char tower, int number, int floor, String family, boolean pet) {
		super();
		this.tower = tower;
		this.number = number;
		this.floor = floor;
		this.family = family;
		this.pet = pet;
	}

	public char getTower() {
		return tower;
	}

	public int getNumber() {
		return number;
	}

	public int getFloor() {
		return floor;
	}

	public String getFamily() {
		return family;
	}

	public boolean isPet() {
		return pet;
	}

	@Override
	public String toString() {
		return "\n"+"Apartment [tower=" + tower + ", number=" + number + ", floor=" + floor + ", family=" + family + ", pet="
				+ pet + "]";
	}
	
	public int compareBytower(Apartment other) {
		return tower - other.getTower();
	}

	@Override
	public int compareTo(Apartment o) {
		return 0;
	}
	

}
