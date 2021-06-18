package ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javax.swing.JOptionPane;
import model.PreventionCare;

public class CoronavirusCareGUI {
	
	    @FXML
	    private TextField txtCareNumber;

	    @FXML
	    private Label labCareText;
	    
	    @FXML
	    private ImageView imageCare;
	    
	    
	    private PreventionCare pCare;

	    public CoronavirusCareGUI() {
	    	pCare = new PreventionCare();
	    	
	    }
	    
	    public void ShowCareRecomendation(ActionEvent event) {
    		Image care = null;
	    	try {
	    		int numCare = Integer.parseInt(txtCareNumber.getText());
	    		
	    		switch(numCare) {
	    		case 1:  care = new Image("images/WashHands.PNG"); 
	    		               break;
	    		               
	    		case 2:  care = new Image("images/SneezeElbow.PNG");
	    		                 break;
	    		
	    		case 3:  care = new Image("images/AvoidTouching.PNG");
	    		                 break;
	    			
	    		case 4: care = new Image("images/KeepVentilated.PNG");
                            break;
	    			
	    		case 5: care = new Image("images/DesinfectObjects.PNG");
                                break;
	    		}
	    		pCare.setCareNumber(numCare);
		    	labCareText.setText(pCare.getTextCare());
		    	imageCare.setImage(care);
		    	
	    	}catch(NumberFormatException ex) {
	    		JOptionPane.showMessageDialog(null, "please write an number", "Mistake", 0);
	    		txtCareNumber.setText("");
	    		labCareText.setText("");
	    		imageCare.setImage(care);
	    		
	    		
	    	}
	    	
	    	
	    }
	    
}
