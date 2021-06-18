package ui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import model.Billboard;
import model.InfrastructureDepartment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BillboardsGUI {

    @FXML
    private TableView<Billboard> billboards;

    @FXML
    private TableColumn<Billboard, String> Colheight;

    @FXML
    private TableColumn<Billboard, String> Colbroad;

    @FXML
    private TableColumn<Billboard, String> Coluse;

    @FXML
    private TableColumn<Billboard, String> Colbrand;


    @FXML
    private TextField txtWidth;

    @FXML
    private TextField txtHeigth;

    @FXML
    private TextField txtBrand;

    @FXML
    private RadioButton yes;

    @FXML
    private Pane addPane;

    @FXML
    private Pane mainPane;

    @FXML
    private ImageView MainImage;


    private  InfrastructureDepartment infrastructureDepartmentGUI;

    public BillboardsGUI(InfrastructureDepartment ifd) {

        infrastructureDepartmentGUI = ifd;
    }

    public  void initializeApp(){
        Image currentImage = new Image("giphy.gif");
        MainImage.setImage(currentImage);


    }

    public void leave(ActionEvent event){
        Stage primary = (Stage)mainPane.getScene().getWindow();
        primary.close();

    }

    public void newBillboard(ActionEvent event){
        double width =0;
        double height=0;
        boolean inUse= false;
        String brand="";

        try {
             width = Double.valueOf(txtWidth.getText());
             height = Double.valueOf(txtHeigth.getText());

        }catch (NumberFormatException ex){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Something went wrong");
            alert.setHeaderText(null);
            alert.setContentText("Please fill the blank correctly");
            alert.showAndWait();

        }

        brand = txtBrand.getText();

        if(yes.isPressed()){
            inUse = true;
        }else {
            inUse=false;
        }

        infrastructureDepartmentGUI.addBillboard(width,height,inUse,brand);


    }

    public void screen2(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("AddBillboard.fxml"));
        loader.setController(this);

        Parent screen2 = loader.load();

        mainPane.getChildren().setAll(screen2);
    }

    public void screen3(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("DisplayBillboards.fxml"));
        loader.setController(this);
        Parent screen3 = loader.load();
        initializeBillboards();
        mainPane.getChildren().setAll(screen3);

    }

    public void initializeBillboards(){
        ObservableList<Billboard> observableList;
        observableList = FXCollections.observableArrayList(infrastructureDepartmentGUI.getBillboards());
        billboards.setItems(observableList);

        Colheight.setCellValueFactory(new PropertyValueFactory<Billboard,String>("width"));
        Colbroad.setCellValueFactory(new PropertyValueFactory<Billboard,String>("height"));
        Coluse.setCellValueFactory(new PropertyValueFactory<Billboard,String>("inUse"));
        Colbrand.setCellValueFactory(new PropertyValueFactory<Billboard,String>("Brand"));



    }

    public void backtoMenu(ActionEvent event)throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Menu.fxml"));
        loader.setController(this);
        Parent menu = loader.load();

        addPane.getChildren().setAll(menu);

    }

    public void importBillboard(ActionEvent event) throws IOException {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select a file");
        File f = fileChooser.showOpenDialog(mainPane.getScene().getWindow());
        infrastructureDepartmentGUI.importData(f.getAbsolutePath());
    }

    public void  exportData(ActionEvent event) throws FileNotFoundException {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select a file");
        File f = fileChooser.showOpenDialog(mainPane.getScene().getWindow());
        infrastructureDepartmentGUI.exportDangerousBillboard(f.getAbsolutePath());

    }
}
