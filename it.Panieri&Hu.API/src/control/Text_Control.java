package control;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import model.DistanceMatrixResponse;
import model.ElevationResponse;
import model.GeocodeResponse;
import model.Key;
import model.Location;

public class Text_Control {
	private JAXBContext jaxbContext;
	private Unmarshaller jaxbUnmarshaller;
	private GeocodeResponse geocodeResponse;
	private ElevationResponse elevationResponse;
	private DistanceMatrixResponse distanceMatrixResponse;
	private URL file;
	private String matrix_distance, matrix_duration;
	
	public Text_Control() throws JAXBException, MalformedURLException {
/*		// URL file = new URL(
		// "https://maps.googleapis.com/maps/api/elevation/xml?locations=45.6702891,12.200062&key="
		// );
		file = new File("src/Elevation.xml");

		jaxbContext = JAXBContext.newInstance(ElevationResponse.class);
		jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		response = (ElevationResponse) jaxbUnmarshaller.unmarshal(file);

		System.out.println(response.getResult().getElevation());*/
		
		/*
		 * Chiede due indirizzi o uno + la tua posizione
		 * usa what is my ip per prendere l'ip
		 * usa qualcosa per prendere le coordinate dall'ip
		 * usa geocoding per prendere le coordinate
		 * usa le coordinate per prendere le elevazioni
		 * usa le coordinate per prendere le distanze
		 * calcola il dislivello
		 * calcola la distanza in linea d'aria
		 * visualizza i dati vari
		 * visualizza delle immagini prese con street view
		 */
		
		Scanner in = new Scanner(System.in);
		String address_1, address_2;
		int lat_1, lon_1, lat_2, lon_2, elevation_1, elevation_2;
		Location loc_start = new Location();
		Location loc_end = new Location();
		
		//INPUT:
		System.out.println("Inserisci la password: ");
		String key = XorCrypt.xor(Key.KEY_GOOGLE_DEFAULT,in.nextLine());
		System.out.println("Inserisci il primo indirizzo");
		loc_start.setAddress(in.nextLine());
		System.out.println("Inserisci il secondo indirizzo");
		loc_end.setAddress(in.nextLine());
		loc_start.setAddress(loc_start.getAddress().replaceAll(" ", "+"));
		loc_end.setAddress(loc_end.getAddress().replaceAll(" ", "+"));
		
		//GEOCODING:
		file = new URL("https://maps.googleapis.com/maps/api/geocode/xml?address=" + loc_start.getAddress() + "&key=" + key);
		geocodeResponse = (GeocodeResponse) this.APIRequest(GeocodeResponse.class);
		loc_start.setLat(geocodeResponse.getResult().getGeometry().getLocation().getLat().toString());
		loc_start.setLng(geocodeResponse.getResult().getGeometry().getLocation().getLng().toString());
		
		file = new URL("https://maps.googleapis.com/maps/api/geocode/xml?address=" + loc_end.getAddress() + "&key=" + key);
		geocodeResponse = (GeocodeResponse) this.APIRequest(GeocodeResponse.class);
		loc_end.setLat(geocodeResponse.getResult().getGeometry().getLocation().getLat().toString());
		loc_end.setLng(geocodeResponse.getResult().getGeometry().getLocation().getLng().toString());
		
		//ELEVAZIONI:
		file = new URL("https://maps.googleapis.com/maps/api/elevation/xml?locations=" + loc_start.getLat() + "," + loc_start.getLng() + "&key=" + key);
		geocodeResponse = (GeocodeResponse) this.APIRequest(ElevationResponse.class);
		loc_start.setElev(elevationResponse.getResult().getElevation().toString());
		
		file = new URL("https://maps.googleapis.com/maps/api/elevation/xml?locations=" + loc_end.getLat() + "," + loc_end.getLng() + "&key=" + key);
		geocodeResponse = (GeocodeResponse) this.APIRequest(ElevationResponse.class);
		loc_end.setElev(elevationResponse.getResult().getElevation().toString());
		
		//DISTANCE MATRIX:
		file = new URL("https://maps.googleapis.com/maps/api/distancematrix/xml?origins=" + loc_start.getLat() + "," + loc_start.getLng() + "&destinations=" + loc_end.getLat() + "," + loc_end.getLng() + "&mode=walking&language=it-IT&key=" + key);
		geocodeResponse = (GeocodeResponse) this.APIRequest(DistanceMatrixResponse.class);
		matrix_distance = distanceMatrixResponse.getRow().getElement().getDistance().getText();
		matrix_duration = distanceMatrixResponse.getRow().getElement().getDuration().getText();
		
		
		System.out.println(loc_start);
		System.out.println(loc_end);
		
		
	}
	
	private Object APIRequest(Class cls) throws JAXBException{
		jaxbContext = JAXBContext.newInstance(cls);
		jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		return jaxbUnmarshaller.unmarshal(file);
	}
	
	private double airDistance(double lon1, double lat1, double lon2, double lat2){
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
}
