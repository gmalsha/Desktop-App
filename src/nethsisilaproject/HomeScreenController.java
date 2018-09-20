/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nethsisilaproject;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

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
    @FXML
    private Pane pane_foodorders;
    @FXML
    private StackPane stackpane;

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
         pane_reserve.setStyle("-fx-background-color: white; -fx-background-radius: 12px;");  
    }

    @FXML
    private void mouse_Hover_Rseserve(MouseEvent event) {
            pane_reserve.setStyle("-fx-background-color: #808080; -fx-background-radius: 12px;"); 
    }

      @FXML
    private void mouse_Exit_FoodOrders(MouseEvent event) {
       
          pane_foodorders.setStyle("-fx-background-color: white; -fx-background-radius: 12px;");
    }
    
    private void mouse_Hover_FoodOrders(MouseEvent event) {
          pane_foodorders.setStyle("-fx-background-color: #808080; -fx-background-radius: 12px;");
        
    }
    
    
    
    @FXML
    private void reservationScreen(MouseEvent event){
        
        Stage reservation = new Stage();
        Parent root = null;
        
          try {
            root=FXMLLoader.load(getClass().getResource("ReservationScreen.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(AdminScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Stage current=(Stage)pane_reserve.getScene().getWindow();
        Scene scene=new Scene(root);
        
        reservation.setScene(scene);
        reservation.initStyle(StageStyle.TRANSPARENT);
        
        current.hide();
        reservation.show();
    }

    @FXML
    private void roomsScreen(MouseEvent event) {
        
        Stage room = new Stage();
        Parent root = null;
        
          try {
            root=FXMLLoader.load(getClass().getResource("RoomsScreen.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(AdminScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Stage current=(Stage)pane_reserve.getScene().getWindow();
        Scene scene=new Scene(root);
        
        room.setScene(scene);
        room.initStyle(StageStyle.TRANSPARENT);
        
        current.hide();
        room.show();
    }
    

    @FXML
    private void foodScreen(MouseEvent event) {

       Stage food= new Stage();
        Parent root = null;
        
          try {
            root=FXMLLoader.load(getClass().getResource("RoomsScreen.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(AdminScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Stage current=(Stage)pane_reserve.getScene().getWindow();
        Scene scene=new Scene(root);
        
        food.setScene(scene);
        food.initStyle(StageStyle.TRANSPARENT);
        
        current.hide();
        food.show();
    }
  

    @FXML
    private void foodOrderScreen(MouseEvent event) {
           Stage foodOrder= new Stage();
        Parent root = null;
        
          try {
            root=FXMLLoader.load(getClass().getResource("FoodOrdersScreen.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(AdminScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Stage current=(Stage)pane_reserve.getScene().getWindow();
        Scene scene=new Scene(root);
        
        foodOrder.setScene(scene);
        foodOrder.initStyle(StageStyle.TRANSPARENT);
        
        current.hide();
        foodOrder.show();
    }
    
    

    @FXML
    private void customersScreen(MouseEvent event) {
           Stage customer = new Stage();
        Parent root = null;
        
          try {
            root=FXMLLoader.load(getClass().getResource("CustomerScreen.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(AdminScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Stage current=(Stage)pane_reserve.getScene().getWindow();
        Scene scene=new Scene(root);
        
        customer.setScene(scene);
        customer.initStyle(StageStyle.TRANSPARENT);
        
        current.hide();
        customer.show();
    }
    
      @FXML
    private void logoutScreen(MouseEvent event) {
          JFXDialogLayout dialogLayout=new JFXDialogLayout();
        dialogLayout.setHeading(new Text("Alert"));
        dialogLayout.setBody(new Text("Do You want to Logout !"));
        
        JFXButton ok=new JFXButton("Ok");
        JFXButton Cancel=new JFXButton("Cancel");
        
        JFXDialog dialog=new JFXDialog(stackpane, dialogLayout, JFXDialog.DialogTransition.CENTER);
        
        ok.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                
                
                Stage login=new Stage();
        Parent root=null;
        
        try {
            root=FXMLLoader.load(getClass().getResource("LoginScreen.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(AdminScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Stage current=(Stage)pane_reserve.getScene().getWindow();
        Scene scene=new Scene(root);
        
        login.setScene(scene);
        login.initStyle(StageStyle.TRANSPARENT);
        
        current.hide();
        login.show();
        
         }
        });
        
        Cancel.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                dialog.close();
            }
        });
        
        dialogLayout.setActions(ok,Cancel);
        dialog.show();
    }

    @FXML
    private void exitScreen(MouseEvent event) {
        JFXDialogLayout dialogLayout=new JFXDialogLayout();
        dialogLayout.setHeading(new Text("Close"));
        dialogLayout.setBody(new Text("Do You want to exit !"));
        
        JFXButton ok=new JFXButton("Ok");
        JFXButton Cancel=new JFXButton("Cancel");
        
        JFXDialog dialog=new JFXDialog(stackpane, dialogLayout, JFXDialog.DialogTransition.CENTER);
        
        ok.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.exit(0);
            }
        });
        
        Cancel.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                dialog.close();
            }
        });
        
        dialogLayout.setActions(ok,Cancel);
        dialog.show();
    } } 

  
    

    
    
    
    
    
    

  
  

