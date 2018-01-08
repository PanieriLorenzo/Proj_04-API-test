package application;

import java.net.URL;
import java.util.ResourceBundle;



import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DialogPane;
import javafx.scene.control.SplitPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class Controller implements Initializable{
	
	@FXML TextField txtStartAdd;
	@FXML TextField txtStartCiv;
	@FXML TextField txtEndAdd;
	@FXML TextField txtEndCiv;
	
	private boolean startGeo;
	private boolean endGeo;
	
	@FXML Button btnStartChange;
	@FXML Button btnEndChange;
	@FXML ToggleButton toggleBtnMan;
	@FXML TabPane tabPane;
	@FXML SplitPane splitPane;
	
	@FXML Button btnStartIm;
	@FXML Button btnEndIm;
	
	@FXML Tab imTab;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		Platform.runLater(()->splitPane.lookupAll(".split-pane-divider").stream().forEach(div ->  div.setMouseTransparent(true) ));
		startGeo = false;
		endGeo = false;
		btnStartIm.setText("");
		Image image = new Image(getClass().getResourceAsStream("photo.png"));
		btnStartIm.setGraphic(new ImageView(image));
		btnEndIm.setText("");
		btnEndIm.setGraphic(new ImageView(image));

	}
	
	public void enter() {
		boolean ok = true;
		
		if(txtStartAdd.getText().equals("") || txtStartCiv.getText().equals("")) {
			ok = false;
			Alert alert = new Alert(AlertType.ERROR, "Inserisci correttamente gli indirizzi!" , ButtonType.OK);
			txtStartAdd.requestFocus();
			alert.showAndWait();
		}else {
			if(txtEndAdd.getText().equals("") || txtEndCiv.getText().equals("")) {
				ok = false;
				Alert alert = new Alert(AlertType.ERROR, "Inserisci correttamente gli indirizzi!" , ButtonType.OK);
				txtEndAdd.requestFocus();
				alert.showAndWait();
			}
		}
		
		if(ok) {
			tabPane.getSelectionModel().select(1);
		}	
	}

	public void startChange() {
		if(startGeo == false) {
			txtStartAdd.setPromptText("Longitudine");
			txtStartCiv.setPromptText("Latitudine");
			startGeo = true;
		}else {
			txtStartAdd.setPromptText("Via");
			txtStartCiv.setPromptText("Numero civico");
			startGeo = false;
		}
	}
	
	public void endChange() {
		if(endGeo == false) {
			txtEndAdd.setPromptText("Longitudine");
			txtEndCiv.setPromptText("Latitudine");
			endGeo = true;
		}else {
			txtEndAdd.setPromptText("Via");
			txtEndCiv.setPromptText("Numero civico");
			endGeo = false;
		}
	}
	
	public void changeManAuto() {
		if(toggleBtnMan.isSelected()) {
			toggleBtnMan.setText("Automatico");
		}else {
			toggleBtnMan.setText("Manuale");
		}
	}
	
	public void startIm() {
		imTab.setDisable(false);
		tabPane.getSelectionModel().select(2);
	}
	
	public void endIm() {
		imTab.setDisable(false);
		tabPane.getSelectionModel().select(2);
	}
	
	public void imOk() {
		tabPane.getSelectionModel().select(1);
		imTab.setDisable(true);
	}
}
