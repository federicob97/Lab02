package it.polito.tdp.alien;

/**
 * Sample Skeleton for 'Alien.fxml' Controller Class
 */



import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.alienModel.AlienDictionary;
import it.polito.tdp.alienModel.Word;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {
	
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private TextField txtWord;
    @FXML
    private TextArea txtResult;
    @FXML
    private Button btnTranslate;
    @FXML
    private Button btnReset;
    
    AlienDictionary ad = new AlienDictionary();
        
    
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    	assert txtWord != null : "fx:id=\"txtWord\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnTranslate != null : "fx:id=\"bntTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Alien.fxml'.";
    	
    }
  
    
    @FXML
    void doTranslate(ActionEvent event) {
    	    String l = txtWord.getText().toLowerCase();
    	   	String[] s = l.toLowerCase().split(" ");
    	   	String r ="";
    	   if(s.length==1) {
    		   //cerca
    		   r=ad.getTranslate(l);
    		   txtResult.appendText(r+"\n");
    		   txtWord.clear();
    	   }
    	   else if(s.length==2) {
    		   //aggiungi
    		   ad.addWord(s[0],s[1]);
    		   txtResult.appendText("Traduzione aggiunta correttamente\n");
    		   txtWord.clear();
    	   }
    	   else {
    		   txtResult.appendText("Errore inserimento\n");
    		   txtWord.clear();
    	   }
    }
    
    
    @FXML
    void doReset(ActionEvent event) {
    	ad.clearDictionary();
    	txtResult.clear();
    }
    
}
