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
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author LINUX
 */
public class SearchInventoryController implements Initializable {
    
    
     @FXML
    private TextField SearchField;
     @FXML
    private Button Btn1,Btn2,Btn3,Btn4,Btn5,Btn6,Btn7,Btn8,Btn9,Btn0,BtnDel,Btndot;

     public void BtnClickHandler(javafx.event.ActionEvent mouseEvent) {
        
        if (mouseEvent.getSource() == Btn1){
            SearchField.setText(SearchField.getText() + "1");
        } else if (mouseEvent.getSource() == Btn2){
            SearchField.setText(SearchField.getText() + "2");
        } else if (mouseEvent.getSource() == Btn3){
           SearchField.setText(SearchField.getText() + "3");
        } else if (mouseEvent.getSource() == Btn4){
           SearchField.setText(SearchField.getText() + "4");
        } else if (mouseEvent.getSource() == Btn5){
           SearchField.setText(SearchField.getText() + "5");
        } else if (mouseEvent.getSource() == Btn6){
           SearchField.setText(SearchField.getText() + "6");
        } else if (mouseEvent.getSource() == Btn7){
        SearchField.setText(SearchField.getText() + "7");
        } else if (mouseEvent.getSource() == Btn8){
           SearchField.setText(SearchField.getText() + "8");
        } else if (mouseEvent.getSource() == Btn9){
            SearchField.setText(SearchField.getText() + "9");
        }else if (mouseEvent.getSource() == Btn0){
           SearchField.setText(SearchField.getText() + "0");
        }else if (mouseEvent.getSource() == BtnDel){
           SearchField.setText(" ");
        }else if (mouseEvent.getSource() == Btndot){
           SearchField.setText(SearchField.getText() + ".");
        }};
     
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
