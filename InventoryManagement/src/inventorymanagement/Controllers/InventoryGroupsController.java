package inventorymanagement.Controllers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

/**
 * FXML Controller class
 *
 * @author Dil
 */
public class InventoryGroupsController implements Initializable {
    @FXML private ComboBox sortComboBox;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       sortComboBox.getItems().addAll("Sort by Name", "Sort by group NO", "Sort by quantity");
    }    
    
}
