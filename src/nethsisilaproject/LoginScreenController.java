/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nethsisilaproject;

import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

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
  