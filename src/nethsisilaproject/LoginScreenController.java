/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nethsisilaproject;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;
import com.jfoenix.controls.JFXTextField;
import com.mysql.jdbc.PreparedStatement;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import org.controlsfx.control.Notifications;
import org.controlsfx.control.action.Action;

/**
 * FXML Controller class
 *
 * @author Malsha
 */
public class LoginScreenController implements Initializable {

    @FXML
    private JFXTextField username;
    @FXML
    private JFXTextField password;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loginbutton(MouseEvent event) {
        
        
        if (username.getText().toString().equals("")) {
            
              Image image=new Image("img/error.png");
            Notifications notification = Notifications.create()
            .title("Error")
            .text("Usename cannot be epmty")
            .hideAfter(Duration.seconds(5))
            .position(Pos.BOTTOM_LEFT)
            .graphic(new ImageView(image)); 
            notification.darkStyle();
                notification.show();
            
            
        }
        
        
         else if (password.getText().toString().equals("")) {
            
              Image image=new Image("img/error.png");
            Notifications notification = Notifications.create()
            .title("Error")
            .text("Usename cannot be epmty")
            .hideAfter(Duration.seconds(2))
            .position(Pos.TOP_CENTER)
            .graphic(new ImageView(image)); 
            notification.darkStyle();
                notification.show();
            
            
        }
        
        else{
        
        boolean isExist = false;
        String userPassword = "";
        String userType = "";
        
        String query ="select * from logindetails where username='"+username.getText().toString().trim()+"'";
         
        Connection connection = DBConnection.getConnection();
        
        try {
            PreparedStatement ps = (PreparedStatement)connection.prepareStatement(query);
            
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                 isExist = true;
                userPassword=rs.getString(3);
                userType=rs.getString(5);
            }
            if (isExist) {
                
                if (password.getText().toString().trim().equals(userPassword)) {
                    
                    if(userType.equals("admin")){
                        
                        Stage AdminScreen = new Stage();
                        
                        Parent root = null;
                        
                           try {
                            root=FXMLLoader.load(getClass().getResource("AdminScreen.fxml"));
                        } catch (IOException ex) {
                            Logger.getLogger(LoginScreenController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                        Stage current = (Stage)username.getScene().getWindow();
                         Scene scene=new Scene(root,1366,730);
                        
                        AdminScreen.setScene(scene);
                        AdminScreen.initStyle(StageStyle.TRANSPARENT);
                        
                        current.hide();
                        
                        AdminScreen.show();
                        
                        
                        AdminScreen.setScene(scene);
                        AdminScreen.initStyle(StageStyle.TRANSPARENT);
                        
                        current.hide();
                        
                        AdminScreen.show();
                        
                        
            }
                    
                
                else  
                    {
                         Stage HomeScreen = new Stage();
                        
                        Parent root = null;
                        
                           try {
                            root=FXMLLoader.load(getClass().getResource("HomeScreen.fxml"));
                        } catch (IOException ex) {
                            Logger.getLogger(LoginScreenController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                        Stage current = (Stage)username.getScene().getWindow();
                         Scene scene=new Scene(root,1366,730);
                        
                       HomeScreen.setScene(scene);
                        HomeScreen.initStyle(StageStyle.TRANSPARENT);
                        
                        current.hide();
                        
                     HomeScreen.show();
                        
                        
                        HomeScreen.setScene(scene);
                        HomeScreen.initStyle(StageStyle.TRANSPARENT);
                        
                        current.hide();
                        
                        HomeScreen.show();
                        
                } }
            }
            
           
        } catch (Exception e) {
        }
        
    }
   } 
}
  