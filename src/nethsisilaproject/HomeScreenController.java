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
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author Malsha
 */
public class HomeScreenController implements Initializable {

    @FXML
    private Pane pane_reserve;
    @FXML
    private Pane pane_rooms;
    @FXML
    private Pane pane_customers;
    @FXML
    private Pane pane_food;
    @FXML
    private Pane pane_logout;
    @FXML
    private Pane pane_exit;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    private void mouse_exit_Reserve(MouseEvent event) {
        pane_reserve.setStyle("-fx-background-color: white; -fx-background-radius: 12px;");  
    }

    private void mouse_Hover_Reserve(MouseEvent event) {
         pane_reserve.setStyle("-fx-background-color: #808080; -fx-background-radius: 12px;"); 
    }

    @FXML
    private void mouse_Exit_Rooms(MouseEvent event) {
         pane_rooms.setStyle("-fx-background-color: white; -fx-background-radius: 12px;");
    }

    @FXML
    private void mouse_Hover_Rooms(MouseEvent event) {
         pane_rooms.setStyle("-fx-background-color: #808080; -fx-background-radius: 12px;"); 
    }

    @FXML
    private void mouse_Exit_Customers(MouseEvent event) {
         pane_customers.setStyle("-fx-background-color: white; -fx-background-radius: 12px;");
    }

    @FXML
    private void mouse_Hover_Customers(MouseEvent event) {
         pane_customers.setStyle("-fx-background-color: #808080; -fx-background-radius: 12px;"); 
    }

    @FXML
    private void mouse_Exit_Food(MouseEvent event) {
         pane_food.setStyle("-fx-background-color: white; -fx-background-radius: 12px;");
    }

    @FXML
    private void mouse_Hover_Food(MouseEvent event) {
         pane_food.setStyle("-fx-background-color: #808080; -fx-background-radius: 12px;"); 
    }

    @FXML
    private void mouse_Exit_Logout(MouseEvent event) {
         pane_logout.setStyle("-fx-background-color: white; -fx-background-radius: 12px;");
    }

    @FXML
    private void mouse_Hover_Logout(MouseEvent event) {
         pane_logout.setStyle("-fx-background-color: #808080; -fx-background-radius: 12px;"); 
    }

    @FXML
    private void mouse_Exit_Exit(MouseEvent event) {
         pane_exit.setStyle("-fx-background-color: white; -fx-background-radius: 12px;");
    }

    @FXML
    private void mouse_Hover_Exit(MouseEvent event) {
         pane_exit.setStyle("-fx-background-color: #808080; -fx-background-radius: 12px;"); 
    }

    @FXML
    private void mouse_Exit_Reserve(MouseEvent event) {
    }

    @FXML
    private void mouse_Hover_Rseserve(MouseEvent event) {
    }
    
}
