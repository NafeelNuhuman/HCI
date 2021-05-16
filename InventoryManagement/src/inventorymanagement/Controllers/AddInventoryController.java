package inventorymanagement.Controllers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author LINUX
 */
public class AddInventoryController implements Initializable {

      @FXML
    private ComboBox Grpsort;
    
     @FXML  
    private AnchorPane AnchorPane;
   
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        Grpsort.getItems().addAll("Food","Drink","Garden","Beauty","Clothing", "Computer");
        Grpsort.setValue("Food");
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
     
   /*  private void AddButtonAction(javafx.event.ActionEvent event){
         Stage stage = (Stage) AnchorPane.getScene().getWindow();
         Alert.AlertType type = Alert.AlertType.CONFIRMATION;
         Alert alert = new Alert(type, " ");
         
         alert.initModality(Modality.APPLICATION_MODAL);
         alert.initOwner(stage);
         
         alert.getDialogPane().setContentText("Test");
         
         alert.getDialogPane().setHeaderText("Test2");
        
        Optional<ButtonType> result = alert.showAndWait();
         if(result.get() == ButtonType.OK)
         {
             System.out.println("Ok Button");
         }
         else if(result.get() == ButtonType.CANCEL)
         {
             System.out.println("Cancel");
         } 
     } */
}
