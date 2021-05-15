/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorymanagement.Controllers;

import java.awt.event.MouseEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class AmendGroupController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    TextField tfDescription;
    
    @FXML
    Label lblID;
    
    @FXML
    HBox hbVegetables;
    
    @FXML 
    ImageView image,imgElectro;
    
    @FXML
    Button btnEditGroup1;
    
    public void handleButtonClicks(javafx.event.ActionEvent mouseEvent) throws FileNotFoundException {
        if (mouseEvent.getSource() == btnEditGroup1) {
            InputStream stream = new FileInputStream("C:\\Users\\User\\Desktop\\HCI\\HCI\\InventoryManagement\\src\\inventorymanagement\\Icons\\vegetables.jpg");
            Image image1 = new Image(stream);
            image.setImage(image1);
            lblID.setText("01");
            tfDescription.setText("Vegetables");
        }else if (mouseEvent.getSource() == imgElectro){
            setElectro((MouseEvent) mouseEvent.getSource());
        }
    }
    
    
    public void setElectro(MouseEvent event) throws FileNotFoundException{
        try {
            event.consume();
            InputStream stream = new FileInputStream("C:\\Users\\User\\Desktop\\HCI\\HCI\\InventoryManagement\\src\\inventorymanagement\\Icons\\electronics.jpg");
            Image image1 = new Image(stream);
            image.setImage(image1);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AmendGroupController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    
    }    
    
     private void loadStage(String fxml) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxml));
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            //stage.getIcons().add(new Image("/home/icons/icon.png"));
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
