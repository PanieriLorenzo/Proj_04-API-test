package control;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import javafx.application.Platform;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.EventHandler;
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
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import model.DistanceMatrixResponse;
import model.ElevationResponse;
import model.GeocodeResponse;
import model.IPResponse;
import model.Key;
import model.LocateResponse;
import model.Location;

public class Controller implements Initializable{
	
	/* Componenti login */
	@FXML Label lblPass;
	@FXML TextField txtPass;
	@FXML Button btnJoin;
	
	/* Componenti inserimento */
	
	@FXML TextField txtStartAdd;
	@FXML TextField txtStartCiv;
	@FXML TextField txtEndAdd;
	@FXML TextField txtEndCiv;
	
	private boolean startGeo;
	private boolean endGeo;
	
	@FXML Button btnStartChange;
	@FXML Button btnEndChange;
	@FXML ToggleButton toggleBtnMan;
	
	@FXML Button btnAdd;
	
	
	@FXML TabPane tabPane;
	@FXML SplitPane splitPane;
	
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
	
	/* Tab Immagini */
	@FXML Label lblIm1;
	@FXML Label lblIm2;
	
	//ATTRIBUTI LOGICA:
	Scanner in = new Scanner(System.in);	//!DEBUG!
	private boolean isStartAuto, isStartCoord, isEndCoord;
	private String address_1, address_2, matrix_distance, matrix_duration;
	private int lat_1, lon_1, lat_2, lon_2, elevation_1, elevation_2;
	private Location loc_start, loc_end;
	private JAXBContext jaxbContext;
	private Unmarshaller jaxbUnmarshaller;
	private GeocodeResponse geocodeResponse;
	private ElevationResponse elevationResponse;
	private DistanceMatrixResponse distanceMatrixResponse;
	private IPResponse ipResponse;
	private LocateResponse locateResponse;
	private URL file;
	private double airDistance, elevDelta;
	private String key;
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		Platform.runLater(()->splitPane.lookupAll(".split-pane-divider").stream().forEach(div ->  div.setMouseTransparent(true) ));
		startGeo = false;
		endGeo = false;
		btnEndIm.setText("");
		Image image = new Image(getClass().getResourceAsStream("/view/photo.png"));
		btnEndIm.setGraphic(new ImageView(image));


		txtStartCiv.setVisible(false);
		txtEndCiv.setVisible(false);
		
		//INIT LOGICA:
		isStartAuto = false;
		isStartCoord = false;
		isEndCoord = false;
		loc_start = new Location();
		loc_end = new Location();

	}
	
	public void enter() {
		boolean ok = true;
		
		/*if((txtStartAdd.getText().equals("") || txtStartCiv.getText().equals("")) && !toggleBtnMan.isSelected()) {
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
		}*/
		
		if(ok) {
			
			
			//LOGICA:
			
//			if(isStartAuto) {
//				System.out.println("Da Start Auto...");
//				loc_start.setLat(/* prendi con ip */null);
//				loc_start.setLng(/* prendi con ip */null);
				
				//no geocoding
				
				
			/*}else*/ if(isStartCoord) {
				System.out.println("Da Start Coord...");
				if(txtStartAdd.getText().equals("") || txtStartCiv.getText().equals("")) {
					ok = false;
					txtStartAdd.requestFocus();
					Alert alert = new Alert(AlertType.ERROR, "Inserisci correttamente le coordinate" , ButtonType.OK);
					alert.showAndWait();
				}else {
					loc_start.setLng(txtStartAdd.getText());
					loc_start.setLat(txtStartCiv.getText());
				}
				
				
				//no geocoding
				
			}else{
				System.out.println("Da Start Indirizzo...");
				loc_start.setAddress(txtStartAdd.getText()+" "+txtStartCiv.getText());
				System.out.println("DEBUG_1: " + txtStartAdd.getText()+" "+txtStartCiv.getText());
				loc_start.setAddress(loc_start.getAddress().replaceAll(" ", "+"));
				
				//geocoding:
				try {
					file = new URL("https://maps.googleapis.com/maps/api/geocode/xml?address=" + loc_start.getAddress()
							+ "&key=" + key);
					System.out.println("DEBUG_2: " + loc_start.getAddress());
					geocodeResponse = (GeocodeResponse) this.APIRequest(GeocodeResponse.class);
					loc_start.setLat(geocodeResponse.getResult().getGeometry().getLocation().getLat().toString());
					loc_start.setLng(geocodeResponse.getResult().getGeometry().getLocation().getLng().toString());
				}catch (Exception e) {

					ok = false;
					txtStartAdd.requestFocus();
					Alert alert = new Alert(AlertType.ERROR, "Inserisci correttamente gli indirizzi!" , ButtonType.OK);
					alert.showAndWait();
				}
				
			}
			if(ok) {
			if(isEndCoord) {
				System.out.println("...a End Coord");
				if(txtEndAdd.getText().equals("") || txtEndCiv.getText().equals("")) {
					ok = false;
					txtEndAdd.requestFocus();
					Alert alert = new Alert(AlertType.ERROR, "Inserisci correttamente le coordinate" , ButtonType.OK);
					alert.showAndWait();
				}else {
					loc_end.setLng(txtEndAdd.getText());
					loc_end.setLat(txtEndCiv.getText());
				}
				//no geocoding
				
			}else {
				System.out.println("...a End Indirizzo");

				loc_end.setAddress(txtEndAdd.getText()+" "+txtEndCiv.getText());
				loc_end.setAddress(loc_end.getAddress().replaceAll(" ", "+"));
				
				//geocoding:
				try {
					file = new URL("https://maps.googleapis.com/maps/api/geocode/xml?address=" + loc_end.getAddress()
							+ "&key=" + key);
					geocodeResponse = (GeocodeResponse) this.APIRequest(GeocodeResponse.class);
					loc_end.setLat(geocodeResponse.getResult().getGeometry().getLocation().getLat().toString());
					loc_end.setLng(geocodeResponse.getResult().getGeometry().getLocation().getLng().toString());
				}catch (Exception e) {

					ok = false;
					txtEndAdd.requestFocus();
					Alert alert = new Alert(AlertType.ERROR, "Inserisci correttamente gli indirizzi!" , ButtonType.OK);
					alert.showAndWait();
				}
			}
			if(ok) {
				// elevazioni:
				try {
					file = new URL("https://maps.googleapis.com/maps/api/elevation/xml?locations=" + loc_start.getLat()
							+ "," + loc_start.getLng() + "&key=" + key);
					elevationResponse = (ElevationResponse) this.APIRequest(ElevationResponse.class);
					loc_start.setElev(elevationResponse.getResult().getElevation().toString());

					file = new URL("https://maps.googleapis.com/maps/api/elevation/xml?locations=" + loc_end.getLat()
							+ "," + loc_end.getLng() + "&key=" + key);
					elevationResponse = (ElevationResponse) this.APIRequest(ElevationResponse.class);
					loc_end.setElev(elevationResponse.getResult().getElevation().toString());
				} catch (Exception e) {
					e.printStackTrace();
				}

				// distance matrix:
				try {
					file = new URL("https://maps.googleapis.com/maps/api/distancematrix/xml?origins="
							+ loc_start.getLat() + "," + loc_start.getLng() + "&destinations=" + loc_end.getLat() + ","
							+ loc_end.getLng() + "&mode=walking&language=it-IT&key=" + key);
					distanceMatrixResponse = (DistanceMatrixResponse) this.APIRequest(DistanceMatrixResponse.class);
					matrix_distance = distanceMatrixResponse.getRow().getElement().getDistance().getText();
					matrix_duration = distanceMatrixResponse.getRow().getElement().getDuration().getText();
				} catch (Exception e) {
					e.printStackTrace();
				}

				System.out.println(loc_start);
				System.out.println(loc_end);

				// calcolo distanza e dislivello:
				airDistance = coordToDistance(Double.parseDouble(loc_start.getLat()),
						Double.parseDouble(loc_start.getLng()), Double.parseDouble(loc_end.getLat()),
						Double.parseDouble(loc_end.getLng()));
				System.out.println("DEBUG air distance: " + airDistance);
				elevDelta = Double.parseDouble(loc_end.getElev()) - Double.parseDouble(loc_start.getElev());
				System.out.println("DEBUG dislivello: " + elevDelta);
				
				//stampa:
				String tempAdd1;
				String tempAdd2;
				
				if(!isStartCoord) {
					tempAdd1 = loc_start.getAddress().replaceAll("\\+", " ");
				}else {
					tempAdd1 = "";
				}
				
				if(!isEndCoord) {
					tempAdd2 = loc_end.getAddress().replaceAll("\\+", " ");
				}else {
					tempAdd2 = "";
				}
				
				insRisStart(tempAdd1, loc_start.getLng(), loc_start.getLat(), loc_start.getElev());
				insRisEnd(tempAdd2, loc_end.getLng(), loc_end.getLat(), loc_end.getElev());
				insRisGlob(""+airDistance, matrix_distance, matrix_duration, ""+elevDelta);
				risTab.setDisable(false);
				tabPane.getSelectionModel().select(1);
			}
			}
			
			
			//GRAFICA:

			if(startGeo) {
				this.changeManAuto();
			}else {
				txtStartAdd.setText("");
				txtStartCiv.setText("");
			}
			txtEndAdd.setText("");
			txtEndCiv.setText("");
			//imTab.setDisable(true);
		}	
	}

	//METODI LOGICA:
	private Object APIRequest(Class cls) throws JAXBException{
		jaxbContext = JAXBContext.newInstance(cls);
		jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		return jaxbUnmarshaller.unmarshal(file);
	}
	
	private double coordToDistance(double lon1, double lat1, double lon2, double lat2){
		/**
		 * CREDITS: Chuk, Stack overflow
		 * https://stackoverflow.com/questions/27928/calculate-distance-between-two-latitude-longitude-points-haversine-formula
		 */
		final int R = 6371; // Raggio della terra in chilometri
		double dLat = deg2rad(lat2-lat1);  // deg2rad sotto
		double dLon = deg2rad(lon2-lon1); 
		double a = 
		    Math.sin(dLat/2) * Math.sin(dLat/2) +
		    Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * 
		    Math.sin(dLon/2) * Math.sin(dLon/2); 
		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a)); 
		double d = R * c; // Distance in km
		return d;
	}
	
	private double deg2rad(double deg) {
		return deg * (Math.PI / 180);
	}
	
	//METODI GRAFICA:
	public void startChange() {
		if(startGeo == false) {
			txtStartAdd.setPromptText("Longitudine");
			txtStartCiv.setPromptText("Latitudine");
			btnStartChange.setText("Utilizza indirizzo");
			txtStartCiv.setVisible(true);
			startGeo = true;
			
			//LOGICA:
			isStartCoord = true;
		}else {
			txtStartAdd.setPromptText("Indirizzo");
			txtStartCiv.setPromptText("Numero civico");
			btnStartChange.setText("Utilizza coordinate geografiche");
			txtStartCiv.setVisible(false);
			startGeo = false;
			
			//LOGICA:
			isStartCoord = false;
		}
	}
	
	public void endChange() {
		if(endGeo == false) {
			txtEndAdd.setPromptText("Longitudine");
			txtEndCiv.setPromptText("Latitudine");
			btnEndChange.setText("Utilizza indirizzo");
			txtEndCiv.setVisible(true);
			endGeo = true;
			
			//LOGICA:
			isEndCoord = true;
		}else {
			txtEndAdd.setPromptText("Indirizzo");
			txtEndCiv.setPromptText("Numero civico");
			btnEndChange.setText("Utilizza coordinate geografiche");
			txtEndCiv.setVisible(false);
			endGeo = false;
			
			//LOGICA:
			isEndCoord = false;
		}
	}
	
	public void changeManAuto() {
		if(toggleBtnMan.isSelected()) {
			toggleBtnMan.setText("Automatico");
			
			txtStartAdd.setPromptText("Longitudine");
			txtStartCiv.setPromptText("Latitudine");
			btnStartChange.setText("Utilizza indirizzo");
			txtStartCiv.setVisible(true);
			startGeo = true;
			
			txtStartAdd.setDisable(true);
			txtStartCiv.setDisable(true);
			btnStartChange.setDisable(true);
			
			//LOGICA:
			isStartCoord = true;
			try {
				file = new URL("http://ip-api.com/xml");
				ipResponse = (IPResponse) this.APIRequest(IPResponse.class);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			try {
				file = new URL("http://api.eurekapi.com/iplocation/v1.8/locateip?key=SAKD8749XKG3435UK8YZ&ip=" + ipResponse.getQuery() + "&format=XML");
				locateResponse = (LocateResponse) this.APIRequest(LocateResponse.class);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			txtStartAdd.setText("" + locateResponse.getGeolocationData().getLongitude());
			txtStartCiv.setText("" + locateResponse.getGeolocationData().getLatitude());
		}else {
			toggleBtnMan.setText("Manuale");
			
			txtStartAdd.setDisable(false);
			txtStartCiv.setDisable(false);
			btnStartChange.setDisable(false);
			
			txtStartAdd.setText("");
			txtStartCiv.setText("");
			txtStartAdd.setPromptText("Indirizzo");
			txtStartCiv.setPromptText("Numero civico");
			btnStartChange.setText("Utilizza coordinate geografiche");
			txtStartCiv.setVisible(false);
			startGeo = false;
			
			//LOGICA:
			isStartCoord = false;
		}
	}
	
	
	public void endIm() {
		imTab.setDisable(false);
		tabPane.getSelectionModel().select(2);
		ImageView myImageView = new ImageView();
		Image image;
		try {
		    //URL url = new URL("https://maps.googleapis.com/maps/api/streetview?location=" + loc_end.getLat() + "," + loc_end.getLng() + "&size=368x269" + "&fov=100" + "&key=" + key);
			String path = "https://maps.googleapis.com/maps/api/streetview?location=" + loc_end.getLat() + "," + loc_end.getLng() + "&size=368x269&heading=0" + "&fov=100" + "&key=" + key;
		    image = new Image(path);
		    myImageView = new ImageView(image);
		    lblIm1.setGraphic(myImageView);
		    path = "https://maps.googleapis.com/maps/api/streetview?location=" + loc_end.getLat() + "," + loc_end.getLng() + "&size=368x269&heading=180" + "&fov=100" + "&key=" + key;
		    image = new Image(path);
		    myImageView = new ImageView(image);
		    lblIm2.setGraphic(myImageView);
		} catch (Exception e) {
			
		}
	}
	
	public void imOk() {
		tabPane.getSelectionModel().select(1);
		imTab.setDisable(true);
	}
	
	private void insRisStart(String add, String lon, String lat, String ele) {
		risStartAdd.setText(add);
		risStartLon.setText(lon);
		risStartLat.setText(lat);
		risStartEle.setText(ele);
	}
	
	private void insRisEnd(String add, String lon, String lat, String ele) {
		risEndAdd.setText(add);
		risEndLon.setText(lon);
		risEndLat.setText(lat);
		risEndEle.setText(ele);
	}
	
	private void insRisGlob(String distAir, String distReal, String time, String disl) {
		risDisAir.setText(distAir);
		risDisReal.setText(distReal);
		risTime.setText(time);
		risDisl.setText(disl);
	}
	
	public void joinPass() {
		
		try {
			String tempKey = XorCrypt.xor(Key.KEY_GOOGLE_DEFAULT,txtPass.getText());
			try {
				file = new URL("https://maps.googleapis.com/maps/api/geocode/xml?address=" + loc_end.getAddress()+ "&key=" + tempKey);
				GeocodeResponse testAPIKey = (GeocodeResponse) this.APIRequest(GeocodeResponse.class);
				if(testAPIKey.getStatus().equals("REQUEST_DENIED")) {
					Alert alert = new Alert(AlertType.ERROR, "Inserisci correttamente la password!" , ButtonType.OK);
					txtPass.requestFocus();
					alert.showAndWait();
				}else {
					if(testAPIKey.getStatus().equals("OK")) {
						key = tempKey;
						btnAdd.setDisable(false);
						lblPass.setVisible(false);
						txtPass.setVisible(false);
						btnJoin.setVisible(false);
					}
				}
			}catch (Exception e) {
				System.out.println(e);
			}
		}catch (Exception e) {
			Alert alert = new Alert(AlertType.ERROR, "Inserisci correttamente la password!" , ButtonType.OK);
			txtPass.requestFocus();
			alert.showAndWait();
		}
		
		
		
	}
	
	public void tabChange() {
		if(!tabPane.getSelectionModel().isSelected(2)) {
			imTab.setDisable(true);
		}
	}
	

}
