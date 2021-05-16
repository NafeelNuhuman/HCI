/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorymanagement.Controllers;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
//import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author Dil
 */
public class SalesReportController implements Initializable {

    @FXML
    private ImageView item1,item2,item3,item4,item5,item6;
    @FXML
    private Text item1No,item2No,item3No,item4No,item5No,item6No,item1Name,item2Name,item3Name,item4Name,item5Name,item6Name;
    
    @FXML
    private Text qty1,total1,qty2,total2,qty3,total3,qty4,total4,qty5,total5,qty6,total6;


    
    @FXML
    private Label transactionLabel,itemLabel,subTotalLabel,taxableLabel,nonTaxableLabel,totalLabel,vat1Label,vat2Label,salesLabel;
    
    @FXML
    private Label ScashLabel,SlotaltyLabel,SEFTLabel,SCreditLabel,SvoucherLabel,refundLabel,RCashLabel,RLoyalLabel,REFTLabel,RCreditLabel,RVoucherLabel;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    
    @FXML
    public void viewButtonClicked(ActionEvent mouseEvent){
           transactionLabel.setText("4");
            itemLabel.setText("10");
            subTotalLabel.setText("$230");
            taxableLabel.setText("$210");
            nonTaxableLabel.setText("$20");
            totalLabel.setText("$230.80");
            vat1Label.setText("$0.80");
            vat2Label.setText("$0.00");

            salesLabel.setText("$230.80");
            ScashLabel.setText("$30.80");
            SlotaltyLabel.setText("$0.00");
            SEFTLabel.setText("$100.00");
            SCreditLabel.setText("$100.00");
            SvoucherLabel.setText("$0.00");
            refundLabel.setText("$0.00");
            RCashLabel.setText("$0.00");

            RLoyalLabel.setText("$0.00");
            REFTLabel.setText("$0.00");
            RCreditLabel.setText("$0.00");
            RVoucherLabel.setText("$0.00");
            
            File file1 = new File("src/inventorymanagement/Icons/choco2.jpeg");
            Image image1 = new Image(file1.toURI().toString());
            item1.setImage(image1);
            
            File file2 = new File("src/inventorymanagement/Icons/strawberry.jpg");
            Image image2 = new Image(file2.toURI().toString());
            item2.setImage(image2);
            
            File file3 = new File("src/inventorymanagement/Icons/sanitizer.jpg");
            Image image3 = new Image(file3.toURI().toString());
            item3.setImage(image3);
            
            File file4 = new File("src/inventorymanagement/Icons/juice.jpg");
            Image image4 = new Image(file4.toURI().toString());
            item4.setImage(image4);
            
            File file5 = new File("src/inventorymanagement/Icons/apple.jpg");
            Image image5 = new Image(file5.toURI().toString());
            item5.setImage(image5);
            
            File file6 = new File("src/inventorymanagement/Icons/books.jpg");
            Image image6 = new Image(file6.toURI().toString());
            item6.setImage(image6);
            
            item1No.setText("00293");
            item2No.setText("00343");
            item6No.setText("00090");
            item3No.setText("00342"); 
            item4No.setText("00563");
            item5No.setText("00566");
               
            item1Name.setText("Chocolates");
            item2Name.setText("Strawberry");
            item3Name.setText("Sanitizer");
            item4Name.setText("Grapes Juice");
            item5Name.setText("Apples");
            item6Name.setText("Books");
            
            qty1.setText("1");
            qty2.setText("2");
            qty3.setText("1");
            qty4.setText("1");
            qty5.setText("3");
            qty6.setText("2");
            
            total1.setText("$3.00");
            total2.setText("$5.00");
            total3.setText("$6.00");
            total4.setText("$2.00");
            total5.setText("$1.00");
            total6.setText("$3.00");
            
            
            
                       
       
        
    }
    
}
