package it.polito.tdp.Lab01;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.Lab01.model.Parole;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole elenco ;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnInserisci;

    @FXML
    private Button btnReset;

    @FXML
    private TextField txtParola;

    @FXML
    private TextArea txtResult;
    
    @FXML
    private Button btnCacella;
    
    @FXML
    private TextArea txtResult1;

    @FXML
    void doInsert(ActionEvent event) {
    	
    	long startTime = System.nanoTime();
    	
    	txtResult.setText("");
    	txtResult1.setText("");
    	String s = txtParola.getText();
    	elenco.addParola(s);
    	
    	for (String p: elenco.getElenco()){
    		txtResult.appendText(p+"\n");
    		
    	txtParola.setText("");
    		
    	}
    	
    	long risultato = System.nanoTime() - startTime;
    	txtResult1.setText("Durata Totale: " +risultato);

    }

    @FXML
    void doReset(ActionEvent event) {
    	long startTime = System.nanoTime();
    	txtResult1.setText("");
    	
    	this.elenco.reset();
    	txtResult.setText("");
    	
    	long risultato = System.nanoTime() - startTime;
    	txtResult1.setText("Durata Totale: " +risultato);


    }
    
    @FXML
    void doDelete(ActionEvent event) {
    	
    	long startTime = System.nanoTime();
    	txtResult1.setText("");
    	
    	String s = txtParola.getText();
    	elenco.removeParola(s);
    	
    	txtResult.setText("");
    	
    	for (String p: elenco.getElenco()){
    		txtResult.appendText(p+"\n");
    		
    	txtParola.setText("");
    	}
    	long risultato = System.nanoTime() - startTime;
    	txtResult1.setText("Durata Totale: " +risultato);


    }


    @FXML
    void initialize() {
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnCacella != null : "fx:id=\"btnCacella\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult1 != null : "fx:id=\"txtResult1\" was not injected: check your FXML file 'Scene.fxml'.";
    
        elenco = new Parole() ;
    }

}
