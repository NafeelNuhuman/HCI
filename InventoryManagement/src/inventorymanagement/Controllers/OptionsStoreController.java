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
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Dino
 */
public class OptionsStoreController implements Initializable {

   @FXML
    private Button buttonBackup,buttonGroups,buttonInventory,buttonNun,buttonPole,buttonPrint,buttonStore,buttonTax,buttonTheme , buttonUsers;
    @FXML
    private ComboBox comboBox1, comboBox2, comboBox3, comboBox4, comboBox5, comboBox6, comboBox7;

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
        } else if(event.getSource() == buttonPole) {
            stage = (Stage) buttonPole.getScene().getWindow();
            root = FXMLLoader.load(url5);
        }else if(event.getSource() == buttonPrint) {
            stage = (Stage) buttonPrint.getScene().getWindow();
            root = FXMLLoader.load(url6);
        }else if(event.getSource() == buttonStore) {
            stage = (Stage) buttonStore.getScene().getWindow();
            root = FXMLLoader.load(url7);
        }else if(event.getSource() == buttonTax) {
            stage = (Stage) buttonTax.getScene().getWindow();
            root = FXMLLoader.load(url8);
        }else{
            stage = (Stage) buttonInventory.getScene().getWindow();
            root = FXMLLoader.load(url3);
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
