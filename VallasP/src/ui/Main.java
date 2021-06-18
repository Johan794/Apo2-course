package ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.InfrastructureDepartment;

import java.io.IOException;

public class Main extends Application {

    private  InfrastructureDepartment infrastructureDepartment;
    private  BillboardsGUI gui;
    public Main(){
        infrastructureDepartment = new InfrastructureDepartment();
        gui = new BillboardsGUI(infrastructureDepartment);

    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Menu.fxml"));
        loader.setController(gui);
        Parent root = loader.load();


        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("App");
        gui.initializeApp();
        primaryStage.show();



    }
}
