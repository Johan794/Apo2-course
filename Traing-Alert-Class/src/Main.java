import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		//delcara una nueva alerta
				Alert alert = new Alert(AlertType.INFORMATION);//tipo de alerta en el constructor
				
				//damos valores
				alert.setTitle("Hola menor, este es el primer tipo de alerta");
				alert.setHeaderText(null);
				alert.setContentText("y acá lo que va en el texto");
				
				//con esto se muestra
				alert.showAndWait();
		
	}

}
