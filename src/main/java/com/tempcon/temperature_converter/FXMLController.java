package com.tempcon.temperature_converter;

import java.net.URL;

import java.util.ResourceBundle;

import javafx.fxml.FXML;

import javafx.fxml.Initializable;

import javafx.scene.control.Label;

import javafx.scene.control.TextField;


public class FXMLController implements Initializable {
    
    
    @FXML
    private Label label;
    
    @FXML
    public TextField f1;
    
   
    
    @FXML
    public void ferenheit() {
        
     
     double i = Double.parseDouble(f1.getText());
     double cel = (i-32)/1.8;
     label.setText(i+" degree farenheit is "+cel+" degree celcius");
        
     }
@FXML
   void celcius(){

     double i = Double.parseDouble(f1.getText());
     double fer = (i*1.8)+32;
     label.setText(i+" degree celcius is "+fer+" degree farnheit");
    }      
          
    
    @FXML
    void reset(){
    
    f1.setText("");
    label.setText("");
     
    }   
      
         
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
       
        
        }


        
   
        

