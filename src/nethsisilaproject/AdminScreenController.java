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
public class AdminScreenController implements Initializable {

    @FXML
    private Pane pane_home;
    @FXML
    private Pane pane_exit;
    private Pane pane_food;
    @FXML
    private Pane pane_logout;
    @FXML
    private Pane pane_customer;
    @FXML
    private Pane pane_employee;
    @FXML
    private StackPane stackpane;

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

    private void mouse_Exit_Food(MouseEvent event) {
                pane_food.setStyle("-fx-background-color: white; -fx-background-radius: 12px;");  
    }

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

    @FXML
    private void homeScreen(MouseEvent event) {
        
        
       Stage home= new Stage();
        Parent root = null;
        
          try {
            root=FXMLLoader.load(getClass().getResource("HomeScreen.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(AdminScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Stage current=(Stage)pane_home.getScene().getWindow();
        Scene scene=new Scene(root);
        
        home.setScene(scene);
        home.initStyle(StageStyle.TRANSPARENT);
        
        current.hide();
        home.show();
        
    }

    @FXML
    private void exitScreen(MouseEvent event) {
        
         JFXDialogLayout dialogLayout=new JFXDialogLayout();
        dialogLayout.setHeading(new Text("Alert"));
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
        
        Stage current=(Stage)pane_home.getScene().getWindow();
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
    private void progressScreen(MouseEvent event) {
        
         Stage progress= new Stage();
        Parent root = null;
        
          try {
            root=FXMLLoader.load(getClass().getResource("ProgressScreen.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(AdminScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Stage current=(Stage)pane_home.getScene().getWindow();
        Scene scene=new Scene(root);
        
        progress.setScene(scene);
        progress.initStyle(StageStyle.TRANSPARENT);
        
        current.hide();
        progress.show();
    }

    @FXML
    private void employeeScreen(MouseEvent event) {
        
         Stage home= new Stage();
        Parent root = null;
        
          try {
            root=FXMLLoader.load(getClass().getResource("EmployeeScreen.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(AdminScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Stage current=(Stage)pane_home.getScene().getWindow();
        Scene scene=new Scene(root);
        
        home.setScene(scene);
        home.initStyle(StageStyle.TRANSPARENT);
        
        current.hide();
        home.show();
    }
    
}
