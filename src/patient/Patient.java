package patient;

import java.util.*;
import java.util.Calendar;
import java.util.Date;
import resources.Address;

public class Patient {

	private String Name;
	private String gender;
	private Address address;
	private Date birth;
	private String physician;
	private String phoneNumber;
	private ArrayList<String> allergies = new ArrayList<String>();
	
	public Patient(){
		Name = "John Smith";
		gender = "male";
		address = new Address();
		//TODO Fix date object
		birth = null;
		physician = "Dr.Brown";
		phoneNumber = "1234567890";
		allergies.add("N/A");
	}

	public String toString() {
		return "Patient [Name=" + Name + ", gender=" + gender + ", address="
				+ address + ", birth=" + birth + ", physician=" + physician
				+ ", phoneNumber=" + phoneNumber + ", Allergies = " + allergies + "]";
	}



	public static void main(String [] args){
		Patient pt = new Patient();
		System.out.println(pt);
		
	}
}
