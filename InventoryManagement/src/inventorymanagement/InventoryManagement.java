/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorymanagement;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author User
 */

    
   public class InventoryManagement extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {

        //Parent root = FXMLLoader.load(getClass().getResource("FXML/Home.fxml"));    
        //Parent root = FXMLLoader.load(getClass().getResource("FXML/nIs.fxml"));    
        //Parent root = FXMLLoader.load(getClass().getResource("FXML/DS.fxml"));    
        //Parent root = FXMLLoader.load(getClass().getResource("FXML/AdCu.fxml"));    
        //Parent root = FXMLLoader.load(getClass().getResource("FXML/OptionsTax.fxml")); 
        //Parent root = FXMLLoader.load(getClass().getResource("FXML/OptionsStore.fxml")); 
        //Parent root = FXMLLoader.load(getClass().getResource("FXML/OptionsPrint.fxml")); 
        //Parent root = FXMLLoader.load(getClass().getResource("FXML/OptionsPoleDisplay.fxml")); 
        Parent root = FXMLLoader.load(getClass().getResource("FXML/OptionsInventory.fxml"));    

        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
