/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorymanagement.Controllers;


import inventorymanagement.Models.Group;
import inventorymanagement.Models.Item;
import java.awt.Insets;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author User
 */


public class HomeController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML 
    private ImageView options;
    
    @FXML
    private Button btnAddInventory;
    
    @FXML
    private TextField BarcodeNumberField;
    
    @FXML
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnClr;
    
    @FXML
    private Button btnChocolates;
    
    @FXML
    private  GridPane itemGrid;
    

    
    @FXML
    private TextField qty2;
            
    Group group1,group2;
    
    public void handleButtonClicks(javafx.event.ActionEvent mouseEvent) {
        if (mouseEvent.getSource() == options) {
            loadStage("src/FXML/Options.fxml");
        } else if (mouseEvent.getSource() == btnAddInventory){
            loadStage("FXML/AddInventory.fxml");
        } else if (mouseEvent.getSource() == btn1){
            BarcodeNumberField.setText(BarcodeNumberField.getText() + "1");
        } else if (mouseEvent.getSource() == btn2){
            BarcodeNumberField.setText(BarcodeNumberField.getText() + "2");
        } else if (mouseEvent.getSource() == btn3){
            BarcodeNumberField.setText(BarcodeNumberField.getText() + "3");
        } else if (mouseEvent.getSource() == btn4){
            BarcodeNumberField.setText(BarcodeNumberField.getText() + "4");
        } else if (mouseEvent.getSource() == btn5){
            BarcodeNumberField.setText(BarcodeNumberField.getText() + "5");
        } else if (mouseEvent.getSource() == btn6){
            BarcodeNumberField.setText(BarcodeNumberField.getText() + "6");
        } else if (mouseEvent.getSource() == btn7){
            BarcodeNumberField.setText(BarcodeNumberField.getText() + "7");
        } else if (mouseEvent.getSource() == btn8){
            BarcodeNumberField.setText(BarcodeNumberField.getText() + "8");
        } else if (mouseEvent.getSource() == btn9){
            BarcodeNumberField.setText(BarcodeNumberField.getText() + "9");
        }else if (mouseEvent.getSource() == btn9){
            BarcodeNumberField.setText(BarcodeNumberField.getText() + "9");
        }else if (mouseEvent.getSource() == btnClr){
            BarcodeNumberField.setText(" ");
        }};
           

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        loadData();
        qty2.textProperty().addListener(new ChangeListener<String>() {
        @Override
        public void changed(ObservableValue<? extends String> observable, String oldValue, 
        String newValue) {
        if (!newValue.matches("\\d*")) {
            qty2.setText(newValue.replaceAll("[^\\d]", ""));
        }
    }
});
       
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
    
    public void loadData(){
        
        List<Item> list = new ArrayList<Item>();
        
        Item item1 = new Item("Ritzbury",1,25);
        Item item2 = new Item("Kandos",2,27);
        Item item3 = new Item("Revello",3,30);
        Item item4 = new Item("Ferrero",4,50);
        
        list.add(item1);
        list.add(item2);
        list.add(item3);
        list.add(item4);
  
        group1 = new Group("Chocolates",list);
        
        Item item5 = new Item("Carrot",5,25);
        Item item6 = new Item("Tomato",6,27);
        Item item7 = new Item("Potato",7,30);
        Item item8 = new Item("Broccoli",8,50);
        
        list.clear();
        list.add(item8);
        list.add(item5);
        list.add(item6);
        list.add(item7);
  
        group2 = new Group("Vegetables",list);
    }
    
    public void showItems(){
        
        List<Item> items = group1.getList();
        
        int col = 0;
        int row = 0;
        
        for(Item item : items){
        String name = item.getName();
        int price = item.getPrice();
        Button btn = new Button();
        btn.setText(name);
        btn.setMaxWidth(264);
        btn.setMaxHeight(344);
      
        itemGrid.add(btn,col,row);
 
        ++col;
        if (col == 3){
            col = 0;
            row += 1; 
        }
    }
    }
    
    public void addToBasket(String name,String price,String qty){
        HBox hbox = new HBox();
        
    }
}

//width 264 height 344