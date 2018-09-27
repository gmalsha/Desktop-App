/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nethsisilaproject;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Malsha
 */
public class ReservationScreenController implements Initializable {

    @FXML
    private Label name;
    @FXML
    private Label NIC;
    @FXML
    private Label phone;
    @FXML
    private Label address;
    @FXML
    private Label noOfPeople;
    @FXML
    private Label email;
    @FXML
    private Label roomTypeId;
    @FXML
    private Label roomNo;
    @FXML
    private Label checkIn;
    @FXML
    private Label checkOut;
    @FXML
    private Label charge;
    @FXML
    private Label duration;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void back(MouseEvent event) {
    }

    @FXML
    private void reserve(MouseEvent event) {
    }
    
}
