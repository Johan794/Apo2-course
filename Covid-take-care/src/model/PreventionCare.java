package model;

public class PreventionCare {
	
	private int careNumber;
	
	
	public PreventionCare() {
		
	}
	
	public void setCareNumber(int newCareNumber) {
		careNumber = newCareNumber;
		
	}
	
	public String getTextCare() {
		String care ="";
	
		switch(careNumber) {
		
		    case 1: care = "Wash your hands with soap frequently";
		             break;
		             
		    case 2: care = "Sneeze or cough into your flexed elbow";
		             break;
		             
		    case 3: care = "Avoid touching your eyes, nose and mouth";
		             break;
		             
		    case 4:  care = "Keep spaces well ventilated";
		             break;
		             
		    case 5: care = "Disinfect frequently used objects";
		             break;
		     default: care = "please write an number from 1 to 5";
		 }
		
		return care;
	}
	
	
	

}
