package ui;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

import model.*;

public class ContactManagerGUI {

	@FXML
    private Pane mainPane;
    
    @FXML
    private TextField txtName;
    
    @FXML
    private TextField txtEmail;

    
    @FXML
    private TableView<Contact> tvContactList;

    @FXML
    private TableColumn<Contact, String> tcColumName;

    @FXML
    private TableColumn<Contact, String> tcColumEmail;
    
    private ContactManager manager;
    
    public ContactManagerGUI(ContactManager manager) {
    	manager = new ContactManager();
    }
    
    @FXML
    public void showAdd(ActionEvent event) throws IOException {
    	//Parent form1=  FXMLLoader.load(getClass().getResource("AddContatc.fxml"));
    	
    	 FXMLLoader loader = new  FXMLLoader(getClass().getResource("AddContatc.fxml"));
    	 loader.setController(this);
    	 
    	 Parent form1 = loader.load();
    	
    	mainPane.getChildren().setAll(form1);
    	
    	
    	
    }
    
    @FXML
    public void showList(ActionEvent event) throws IOException  {
       Parent form2=  FXMLLoader.load(getClass().getResource("ContactList.fxml"));
    	mainPane.getChildren().setAll(form2);
    	
    	
    }
    
    
    @FXML
    public void saveContact(ActionEvent event) {
    	String name , email;
    	Alert succesMsg = new Alert(AlertType.INFORMATION);
    	Alert warningMsg = new Alert(AlertType.WARNING);
    	
    	succesMsg.setTitle("Information");
    	succesMsg.setHeaderText(null);
    	succesMsg.setContentText("The contact has been saved succesfully");
    	
    	warningMsg.setTitle("¡¡Warning!!");
    	warningMsg.setHeaderText(null);
    	warningMsg.setContentText("Please fill the blanks");
    	
    	
    	name = txtName.getText();
		email = txtEmail.getText();
		Contact inContact = new Contact(name, email);
		
    	if((name.equals("") || email.equals(""))) {
    		warningMsg.showAndWait();
    		
    	}else {
    		manager.saveContact(inContact);
    		succesMsg.showAndWait();
    		
    	}
    	
		
    	
    	   	
    	
    	
    }

}
