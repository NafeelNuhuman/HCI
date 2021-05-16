package inventorymanagement.Controllers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Dil
 */
public class InventoryItemController implements Initializable {
    @FXML private ComboBox skuDropDown;
    @FXML private Label SKULabell;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        skuDropDown.getItems().addAll("Unit one", "Unit two", "Unit three");
    }   
    
    @FXML
    public void comboBoxClicked(ActionEvent event){
        String selectedval =(String) skuDropDown.getValue();
        
         if(selectedval.equalsIgnoreCase("Unit one")){
            SKULabell.setText("Coffee");
         }
         else if(selectedval.equalsIgnoreCase("Unit two")){
            SKULabell.setText("Instant Coffee");
         }
         else if(selectedval.equalsIgnoreCase("Unit three")){
            SKULabell.setText("Nestle Coffee");
         }
    }
    
}
