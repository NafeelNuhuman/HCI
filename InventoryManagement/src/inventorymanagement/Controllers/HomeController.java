/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorymanagement.Controllers;


import inventorymanagement.Models.Group;
import inventorymanagement.Models.Item;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Duration;


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
    private ComboBox cbSortBy;
    
    @FXML
    private TextField qty2;
    
    @FXML
    private Label time,date;
    
    @FXML
    private VBox basket;
    
    @FXML 
    private Button btnEmptyBasket,btnAdd;
    
    @FXML 
    private AnchorPane anchorPane;
            
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
        
        //btnEmptyBasket.addEventHandler(MouseEvent.MOUSE_CLICKED, emptyBasket);
        btnAdd.addEventHandler(MouseEvent.MOUSE_CLICKED, addToBasket2);
        
        cbSortBy.getItems().addAll("Barcode","Description","Unique ID");
        cbSortBy.setValue("Barcode");
        
        Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {        
        LocalTime currentTime = LocalTime.now();
        time.setText(currentTime.getHour() + ":" + currentTime.getMinute() + ":" + currentTime.getSecond());
        }),
             new KeyFrame(Duration.seconds(1))
        );
        clock.setCycleCount(Animation.INDEFINITE);
        clock.play();
        
        date.setText(LocalDate.now().toString());
    }
    
    private void loadStage(String fxml) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxml));
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void loadData(){
        
        List<Item> list = new ArrayList<Item>();
        
        Item item1 = new Item("Toblerone",1,25);
        Item item2 = new Item("Snickers",2,27);
        Item item3 = new Item("Mars",3,30);
        Item item4 = new Item("Ferrero",4,50);
        Item item5 = new Item("Hersheys",4,50);
        Item item6 = new Item("Cadbury",4,50);
        
        list.add(item1);
        list.add(item2);
        list.add(item3);
        list.add(item4);
        list.add(item5);
        list.add(item6);
        
        group1 = new Group("Chocolates",list);
        
        /*Item item5 = new Item("Carrot",5,25);
        Item item6 = new Item("Tomato",6,27);
        Item item7 = new Item("Potato",7,30);
        Item item8 = new Item("Broccoli",8,50);
        
        list.clear();
        list.add(item5);
        list.add(item6);
        list.add(item7);
        list.add(item8);
  
        group2 = new Group("Vegetables",list);*/
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
        btn.addEventHandler(MouseEvent.MOUSE_CLICKED, addToBasket1);
        ++col;
        if (col == 3){
            col = 0;
            row += 1; 
        }
        }
    }
    
    
    
    EventHandler<MouseEvent> addToBasket1 = new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent event) {
            HBox hbox = new HBox();
            Label lblName = new Label();
            Label lblQty =  new Label();
            Label lblPrice = new Label();
            Button btnRemove = new Button();
            EventHandler<MouseEvent> removeItem = new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    basket.getChildren().remove(hbox);
                }
            };
            
            lblName.setText("Mars");
            lblName.setStyle("-fx-text-fill: white;");
            lblQty.setText("X1");
            lblQty.setStyle("-fx-text-fill: white;");
            lblPrice.setText("Rs.21.00");
            lblPrice.setStyle("-fx-text-fill: white;");
            btnRemove.setText("X");
            btnRemove.setStyle("-fx-text-fill: white;-fx-background-color:  red; ");
            btnRemove.addEventFilter(MouseEvent.MOUSE_CLICKED, removeItem);
            
            hbox.setStyle("-fx-background-color:  #30475E;");
            hbox.setAlignment(Pos.BASELINE_LEFT);
            hbox.setSpacing(50);
            hbox.setPadding(new javafx.geometry.Insets(3));
            hbox.getChildren().addAll(lblName,lblQty,lblPrice,btnRemove);
            
           

            basket.getChildren().add(hbox);
        }
    };
    
    EventHandler<MouseEvent> addToBasket2 = new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent event) {
            HBox hbox = new HBox();
            Label lblName = new Label();
            Label lblQty =  new Label();
            Label lblPrice = new Label();
            Button btnRemove = new Button();
            EventHandler<MouseEvent> removeItem = new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    basket.getChildren().remove(hbox);
                }
            };
            
            lblName.setText("Snickers");
            lblName.setStyle("-fx-text-fill: white;");
            lblQty.setText("X2");
            lblQty.setStyle("-fx-text-fill: white;");
            lblPrice.setText("Rs.21.00");
            lblPrice.setStyle("-fx-text-fill: white;");
            btnRemove.setText("X");
            btnRemove.setStyle("-fx-text-fill: white;-fx-background-color:  red; ");
            btnRemove.addEventHandler(MouseEvent.MOUSE_CLICKED, removeItem);
            hbox.setStyle("-fx-background-color:  #30475E;");
            hbox.setAlignment(Pos.BASELINE_LEFT);
            hbox.setSpacing(42);
            hbox.setPadding(new javafx.geometry.Insets(3));
            hbox.getChildren().addAll(lblName,lblQty,lblPrice,btnRemove);

            basket.getChildren().add(hbox);
        }
    };
    
    @FXML 
    private void empty(ActionEvent event){
        Stage stage = (Stage) anchorPane.getScene().getWindow();
        Alert.AlertType type;
        type = Alert.AlertType.CONFIRMATION;
        Alert alert = new Alert(type,"");
        
        alert.initModality(Modality.APPLICATION_MODAL);
        alert.initOwner(stage);
        
        alert.getDialogPane().setContentText("Do you want remove all the items in the basket?");
        alert.getDialogPane().setHeaderText("Confirm");
        
        Optional<ButtonType> result = alert.showAndWait();
        
        if(result.get() == ButtonType.OK){
            basket.getChildren().clear();
            alert.close();
        } else if (result.get() == ButtonType.CANCEL){
            alert.close();
        }    
    }

}
