package ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.ContactManager;



public class Main extends Application{
	
       private ContactManager manager;
       private ContactManagerGUI gui;
	
       
    public Main() {
    	manager = new ContactManager();
    	gui = new ContactManagerGUI(manager);
    }   
	
	

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		//Parent root = FXMLLoader.load(getClass().getResource("welcome.fxml"));
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("welcome.fxml"));
		
		loader.setController(gui);
		
		Parent root = loader.load();
		
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("Contact Manager");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

}
