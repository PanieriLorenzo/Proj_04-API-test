package control;

import java.net.URL;
import java.util.ResourceBundle;



import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
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
	
	/* Tab del tabPane */
	
	@FXML Tab imTab;
	@FXML Tab risTab;
	
	/* Tab Risultati */
	
	@FXML Label risStart;
	@FXML Label risEnd;
	
	@FXML TextField risStartAdd;
	@FXML TextField risEndAdd;
	@FXML TextField risStartLon;
	@FXML TextField risEndLon;
	@FXML TextField risStartLat;
	@FXML TextField risEndLat;
	@FXML TextField risStartEle;
	@FXML TextField risEndEle;
	@FXML TextField risDisAir;
	@FXML TextField risDisReal;
	@FXML TextField risTime;
	@FXML TextField risDisl;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		Platform.runLater(()->splitPane.lookupAll(".split-pane-divider").stream().forEach(div ->  div.setMouseTransparent(true) ));
		startGeo = false;
		endGeo = false;
		btnStartIm.setText("");
		Image image = new Image(getClass().getResourceAsStream("../view/photo.png"));
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
			risTab.setDisable(false);
			tabPane.getSelectionModel().select(1);
			txtStartAdd.setText("");
			txtStartCiv.setText("");
			txtEndAdd.setText("");
			txtEndCiv.setText("");
		}	
	}

	public void startChange() {
		if(startGeo == false) {
			txtStartAdd.setPromptText("Longitudine");
			txtStartCiv.setPromptText("Latitudine");
			btnStartChange.setText("Utilizza indirizzo");
			startGeo = true;
		}else {
			txtStartAdd.setPromptText("Via");
			txtStartCiv.setPromptText("Numero civico");
			btnStartChange.setText("Utilizza coordinate geografiche");
			startGeo = false;
		}
	}
	
	public void endChange() {
		if(endGeo == false) {
			txtEndAdd.setPromptText("Longitudine");
			txtEndCiv.setPromptText("Latitudine");
			btnEndChange.setText("Utilizza indirizzo");
			endGeo = true;
		}else {
			txtEndAdd.setPromptText("Via");
			txtEndCiv.setPromptText("Numero civico");
			btnEndChange.setText("Utilizza coordinate geografiche");
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
	
	private void insRisStart(String add, String lon, String lat, String ele) {
		risStartAdd.setText(add);
		risStartLon.setText(lat);
		risStartLat.setText(lat);
		risStartEle.setText(ele);
	}
	
	private void insRisEnd(String add, String lon, String lat, String ele) {
		risEndAdd.setText(add);
		risEndLon.setText(lat);
		risEndLat.setText(lat);
		risEndEle.setText(ele);
	}
	
	private void insRisGlob(String distAir, String distReal, String time, String disl) {
		risDisAir.setText(distAir);
		risDisReal.setText(distReal);
		risTime.setText(time);
		risDisl.setText(disl);
	}
}
