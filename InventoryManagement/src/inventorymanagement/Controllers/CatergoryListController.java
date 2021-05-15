/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorymanagement.Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class CatergoryListController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    ComboBox cbSortBy;
            
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        cbSortBy.getItems().addAll("Barcode","Unique ID","Description");
        
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
