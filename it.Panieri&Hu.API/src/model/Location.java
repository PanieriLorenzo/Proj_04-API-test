package model;

public class Location {
	private String lat, lng, elev, address;
	private boolean hasIP;
	private String ip;
	
	public Location() {
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

	public String getElev() {
		return elev;
	}

	public void setElev(String elev) {
		this.elev = elev;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean hasIP() {
		return hasIP;
	}

	public void setHasIP(boolean hasIP) {
		this.hasIP = hasIP;
	}

	public String getIP() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	@Override
	public String toString() {
		return "Location [lat=" + lat + ", lng=" + lng + ", elev=" + elev + ", address=" + address + ", hasIP=" + hasIP
				+ ", ip=" + ip + "]";
	}
	
	
	

	
	
}
