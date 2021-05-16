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
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Duration;

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
    Label lblID,lblDescription;
    
    @FXML
    HBox hbVegetables;
    
    @FXML
    VBox groups;
    
    @FXML 
    ImageView image,imgElectro;
    
    @FXML
    Button btnEditGroup1,btnUploadPic,delete;
    
    @FXML
    AnchorPane anchorPane;
    
    @FXML
    private Label time,date;
    
    public void handleButtonClicks(javafx.event.ActionEvent mouseEvent) throws FileNotFoundException {
        if (mouseEvent.getSource() == btnEditGroup1) {
            InputStream stream = new FileInputStream("C:\\Users\\User\\Desktop\\HCI\\HCI\\InventoryManagement\\src\\inventorymanagement\\Icons\\vegetables.jpg");
            Image image1 = new Image(stream);
            image.setImage(image1);
            lblID.setText("02");
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
            //stage.getIcons().add(new Image("/home/icons/icon.png"));
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
     
    
    @FXML private void uploadPic (ActionEvent event){
        Stage stage =  (Stage) anchorPane.getScene().getWindow();
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        fileChooser.showOpenDialog(stage);
    }
    
    @FXML 
    private void deleteGroup(ActionEvent event){
        Stage stage = (Stage) anchorPane.getScene().getWindow();
        Alert.AlertType type;
        type = Alert.AlertType.CONFIRMATION;
        Alert alert = new Alert(type,"");
        
        alert.initModality(Modality.APPLICATION_MODAL);
        alert.initOwner(stage);
        
        alert.getDialogPane().setContentText("Do you want delete this group?");
        alert.getDialogPane().setHeaderText("Confirm");
        
        Optional<ButtonType> result = alert.showAndWait();
        
        if(result.get() == ButtonType.OK){
            groups.getChildren().remove(hbVegetables);
            alert.close();
        } else if (result.get() == ButtonType.CANCEL){
            alert.close();
        }    
    }
    
    @FXML
    private void saveChanges(ActionEvent event){
        
        
        Stage stage = (Stage) anchorPane.getScene().getWindow();
        Alert.AlertType type;
        type = Alert.AlertType.CONFIRMATION;
        Alert alert = new Alert(type,"");
        
        alert.initModality(Modality.APPLICATION_MODAL);
        alert.initOwner(stage);
        
        alert.getDialogPane().setContentText("Do you want save the changes?");
        alert.getDialogPane().setHeaderText("Confirm");
        
        Optional<ButtonType> result = alert.showAndWait();
        
        if(result.get() == ButtonType.OK){
            String desc = tfDescription.getText();
            lblDescription.setText(desc);
            alert.close();
        } else if (result.get() == ButtonType.CANCEL){
            alert.close();
        }    
        
    }
}
