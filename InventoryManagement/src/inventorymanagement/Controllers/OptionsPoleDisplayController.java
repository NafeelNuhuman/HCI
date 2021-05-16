package inventorymanagement.Controllers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Dino
 */


public class OptionsPoleDisplayController implements Initializable {

    @FXML
    private Button bttnsave, buttonBackup, buttonGroups, buttonInventory, buttonNun, buttonPole, buttonPrint, buttonStore, buttonTax, buttonTheme, buttonUsers;
    @FXML
    private ComboBox comboBox1, comboBox2, comboBox3, comboBox4, comboBox5, comboBox6, comboBox7;
    @FXML
    private CheckBox check;

    
    @FXML
    public void handleButtonAction(ActionEvent event) throws Exception {
        //URL url1 = new File("src/inventorymanagement/FXML/OptionsInventory.fxml").toURI().toURL();
        //URL url2 = new File("src/inventorymanagement/FXML/OptionsInventory.fxml").toURI().toURL();
        URL url3 = new File("src/inventorymanagement/FXML/OptionsInventory.fxml").toURI().toURL();
        //URL url4 = new File("src/inventorymanagement/FXML/OptionsInventory.fxml").toURI().toURL();
        URL url5 = new File("src/inventorymanagement/FXML/OptionsPoleDisplay.fxml").toURI().toURL();
        URL url6 = new File("src/inventorymanagement/FXML/OptionsPrin.fxml").toURI().toURL();
        URL url7 = new File("src/inventorymanagement/FXML/OptionsStore.fxml").toURI().toURL();
        URL url8 = new File("src/inventorymanagement/FXML/OptionsTa.fxml").toURI().toURL();
        Stage stage;
        Parent root;

        if (event.getSource() == buttonInventory) {
            stage = (Stage) buttonInventory.getScene().getWindow();
            root = FXMLLoader.load(url3);
        } else if (event.getSource() == buttonPole) {
            stage = (Stage) buttonPole.getScene().getWindow();
            root = FXMLLoader.load(url5);
        } else if (event.getSource() == buttonPrint) {
            stage = (Stage) buttonPrint.getScene().getWindow();
            root = FXMLLoader.load(url6);
        } else if (event.getSource() == buttonStore) {
            stage = (Stage) buttonStore.getScene().getWindow();
            root = FXMLLoader.load(url7);
        } else if (event.getSource() == buttonTax) {
            stage = (Stage) buttonTax.getScene().getWindow();
            root = FXMLLoader.load(url8);
        } else {
            stage = (Stage) buttonInventory.getScene().getWindow();
            root = FXMLLoader.load(url3);
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        if (comboBox1 != null) {
            comboBox1.getItems().removeAll(comboBox1.getItems());
            comboBox1.getItems().addAll("1", "2", "3", "4", "5", "6", "7", "8");
            comboBox1.getSelectionModel().select("1");
            comboBox2.getItems().removeAll(comboBox2.getItems());
            comboBox2.getItems().addAll("300", "600", "1200", "2400", "4800", "9600", "14400", "19200", "115200");
            comboBox2.getSelectionModel().select("300");
            comboBox3.getItems().removeAll(comboBox3.getItems());
            comboBox3.getItems().addAll("8", "7");
            comboBox3.getSelectionModel().select("8");
            comboBox4.getItems().removeAll(comboBox4.getItems());
            comboBox4.getItems().addAll("1", "1.5", "2");
            comboBox4.getSelectionModel().select("1");
            comboBox5.getItems().removeAll(comboBox5.getItems());
            comboBox5.getItems().addAll("27,64", "12,11", "31,0");
            comboBox5.getSelectionModel().select("27,64");
            comboBox6.getItems().removeAll(comboBox6.getItems());
            comboBox6.getItems().addAll("11", "0,0", "NON");
            comboBox6.getSelectionModel().select("NON");
            comboBox7.getItems().removeAll(comboBox7.getItems());
            comboBox7.getItems().addAll("11,10", "13,10", "10,13", "NON");
            comboBox7.getSelectionModel().select("NON");
        }
       
       
    }
    
}



