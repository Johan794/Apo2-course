package model;

import java.util.ArrayList;
import java.util.List;

public class Condominium {
    private List<Apartment> aparments;
    
    public Condominium() {
    	aparments = new ArrayList<>();
    }
    
    public List<Apartment> getApartments(){
    	return aparments;
    }
    
    public void addAparment(char tower, int number, int floor, String family, boolean pet) {
    	aparments.add(new Apartment(tower,  number, floor,  family,  pet));
    }
    
}
