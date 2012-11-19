package resources;

import java.util.regex.*;

public class Address {

	private String houseNumber;
	private String streetName;
	private String city;
	private String state;
	private String zipCode;
		
	public Address(){
		houseNumber = "00A";
		streetName = "Street Name";
		city = "City";
		state = "State";
		zipCode = "00000";
				
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
	    } else {
	        throw new IllegalArgumentException("Somthing went Wrong");
	    }
	}
	
	public void setHouseNumber(String newHouseNumber){
		houseNumber = newHouseNumber;
	}
	
	public void setZipCode(String newZipCode){
		zipCode = newZipCode;
	}
	
	public void setStreetName(String newStreetName){
		streetName = newStreetName;
	}
	public void setState(String newState){
		state = newState;
	}
	
	public void setCity(String newCity){
		city = newCity;
	}
	
	
	
	public String toString() {
		return "" + houseNumber + " "
				+ streetName + ", " + city + ", " + state
				+ " " + zipCode;
	}



	public static void main(String [] args){
		Address address = new Address();
		System.out.println(address);
		
		address.parseAddress(address.toString());
		System.out.println(address);



	}
}
