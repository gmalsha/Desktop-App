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
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author Malsha
 */
public class AdminScreenController implements Initializable {

    @FXML
    private Pane pane_home;
    @FXML
    private Pane pane_exit;
    @FXML
    private Pane pane_food;
    @FXML
    private Pane pane_logout;
    @FXML
    private Pane pane_customer;
    @FXML
    private Pane pane_employee;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void mouse_Exit_Home(MouseEvent event) {
                pane_home.setStyle("-fx-background-color: white; -fx-background-radius: 12px;");  
    }

    @FXML
    private void mouse_Hover_Home(MouseEvent event) {
   pane_home.setStyle("-fx-background-color: #808080; -fx-background-radius: 12px;"); 
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
    private void mouse_Exit_Customer(MouseEvent event) {
                pane_customer.setStyle("-fx-background-color: white; -fx-background-radius: 12px;");  
    }

    @FXML
    private void mouse_Hover_Customer(MouseEvent event) {
        pane_customer.setStyle("-fx-background-color: #808080; -fx-background-radius: 12px;"); 
        
    }

    @FXML
    private void mouse_Exit_Employee(MouseEvent event) {
                pane_employee.setStyle("-fx-background-color: white; -fx-background-radius: 12px;");  
    }

    @FXML
    private void mouse_Hover_Employee(MouseEvent event) {
        pane_employee.setStyle("-fx-background-color: #808080; -fx-background-radius: 12px;"); 
    }
    
}
