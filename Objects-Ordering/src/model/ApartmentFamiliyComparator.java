package model;

import java.util.Comparator;

public class ApartmentFamiliyComparator implements Comparator<Apartment> {
	@Override
	public int compare(Apartment o1, Apartment o2) {
		return o1.getFamily().compareTo(o2.getFamily());
	}

}
