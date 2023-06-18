package day_1.collections.task2;

public class Locations {
	int locationId;
	String locationName;
	String locationCountry;
	
	public int getLocationId() {
		return locationId;
	}
	
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	
	public String getLocationName() {
		return locationName;
	}
	
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	
	public String getLocationCountry() {
		return locationCountry;
	}
	
	public void setLocationCountry(String locationCountry) {
		this.locationCountry = locationCountry;
	}
	
	@Override
	public String toString() {
		return "Locations [locationId=" + locationId + ", locationName=" + locationName + ", locationCountry="
				+ locationCountry + "]";
	}
}
