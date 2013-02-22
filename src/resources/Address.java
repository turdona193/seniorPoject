package resources;

import java.util.regex.*;

public class Address {

	private String streetAddress;
	private String houseNumber;
	private String streetName;
	private String city;
	private String state;
	private String zipCode;
	private String country;
		
	public Address(){
		streetAddress = "";
		houseNumber = "";
		streetName = "";
		city = "";
		state = "";
		zipCode = "";
		country = "";
	}

	public Address(String address){
		parseAddress(address);
	}
	
	public void parseAddress(String address){
	    Pattern pattern = Pattern.compile("((([^/ ]+)/)?([^ ]+) ([^,]+), ([^,]+), ([^ ]+) (\\d+))");
	    Matcher m = pattern.matcher(address);
	    if (m.find()) {
	    	houseNumber = m.group(4);
	        streetName = m.group(5);
	        city =  m.group(6);
	        state =  m.group(7);
	        zipCode = m.group(8);
	        streetAddress = houseNumber + " " + streetName;
	    } else {
	        throw new IllegalArgumentException("Somthing went Wrong");
	    }
	}
	
	public void setHouseNumber(String newHouseNumber){
		houseNumber = newHouseNumber;
	}
	
	public void setStreetName(String newStreetName){
		streetName = newStreetName;
	}
	
	public void setStreetAddress(String newStreetAddress){
		streetAddress = newStreetAddress;
	}
	
	public void setCity(String newCity){
		city = newCity;
	}
	
	public void setState(String newState){
		state = newState;
	}
	
	public void setZipCode(String newZipCode){
		zipCode = newZipCode;
	}
	public void setCountry(String newCountry){
		country = newCountry;
	}
	
	public String toString() {
		if(!streetAddress.equals(""))
			return streetAddress + ", " + city + ", " + state
					+ " " + zipCode + " " + country;
		else
			return "" + houseNumber + " "
			+ streetName + ", " + city + ", " + state
			+ " " + zipCode + " " + country;
	}



	public static void main(String [] args){
		Address address = new Address();
		address.setStreetAddress("3510 Barrington Dr");
		address.setCity("Potsdam");
		address.setState("New York");
		address.setZipCode("13676");
		address.setCountry("United States");
		System.out.println(address);

	}
	
}