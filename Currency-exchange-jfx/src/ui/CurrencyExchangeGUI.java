package ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import model.CurrencyExchange;


public class CurrencyExchangeGUI {
	

    @FXML
    private TextField colombianPesos;

    @FXML
    private TextField Dolars;
    
      
	@FXML
	public void exchangeCOPtoUSD(ActionEvent event) {
		try { 
			double priceUsd = CurrencyExchange.COPtoUSD(Double.valueOf(colombianPesos.getText()));
			Dolars.setText(String.valueOf(priceUsd));
		
		}catch(NumberFormatException ex){
			colombianPesos.setText("");
		}
	}
	
	@FXML
	public void exchangeUSDtoCOP(ActionEvent event) {
		try { 
			double priceCop = CurrencyExchange.USDtoCOP(Double.valueOf(Dolars.getText()));
			colombianPesos.setText(String.valueOf(priceCop));
		
		}catch(NumberFormatException ex){
			//colombianPesos.setText("pleace write an amound");
			Dolars.setText("");
		}
		
	}
	

}
