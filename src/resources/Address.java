package resources;

import java.util.regex.*;

public class Address {

	private String streetAddress;
	private String houseNumber;
	private String streetName;
	private String city;
	private String state;
	private String zipCode;
		
	public Address(){
		streetAddress = "";
		houseNumber = "";
		streetName = "1 First Str";
		city = "New York";
		state = "NY";
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
	
	public String toString() {
		if(!streetAddress.equals(""))
			return streetAddress + ", " + city + ", " + state
					+ " " + zipCode ;
		else
			return "" + houseNumber + " "
			+ streetName + ", " + city + ", " + state
			+ " " + zipCode;
	}
	
	public String printLong(){
		return "StreetAddress: " + streetAddress +
				"\n HouseNumber: " + houseNumber +
				"\n StreetName: " + streetName+
				"\n City: " + city+
				"\n State: " + state+
				"\n ZipCode: " + zipCode;
	}



	public static void main(String [] args){
		Address address = new Address();
		address.setStreetAddress("3510 Barrington");
		address.setCity("Potsdam");
		address.setState("NY");
		address.setZipCode("13676");
		//Prints both variations of object
		System.out.println(address.printLong());
		System.out.println(address);
		//Creates 
		String add = address.toString();
		address = new Address();
		address.parseAddress(add);
		System.out.println(address.printLong());


	}
	
}