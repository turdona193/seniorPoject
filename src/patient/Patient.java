package patient;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.*;
import resources.Address;

public class Patient {

	private String nameFirst, nameLast;
	private String gender;
	private Address address;
	private Date birth;
	private String physician;
	private String phoneNumber;
	private ArrayList<String> allergies = new ArrayList<String>();

	/**
	 * Constructor for Patient object.
	 */
	public Patient(){
		//Default Values for testing purposes.
		nameFirst = "John";
		nameLast = "Smith";
		gender = "male";
		address = new Address();
		//TODO Fix date object
		birth = null;
		physician = "Dr.Brown";
		phoneNumber = "1234567890";
		allergies.add("N/A");
	}

	/**
	 * Writes patient information to a String
	 * @return String String containing all patient information
	 */
	public String toString() {
		return "Patient [Name=" + nameFirst +" "+ nameLast + ", gender=" + gender + ", address="
				+ address + ", birth=" + birth + ", physician=" + physician
				+ ", phoneNumber=" + phoneNumber + ", Allergies = " + allergies + "]";
	}

	/**
	 * Writes patient information to a File, "LastNameFirstNamePT.txt" 
	 * @return File File containing all patient information
	 */
	public File toFile(){
		File file = new File(nameLast+nameFirst+"PT.txt");
		BufferedWriter out;

		try {
			out = new BufferedWriter(new FileWriter(file));
			out.write(this.toString());
		} catch (Exception e) {
			System.out.println("couldn't create file object:" + e);
			e.printStackTrace();
		}
		return file;

	}
	/**
	 * Sets first name field.
	 * @param input String containing new first name
	 */
	public void setNameFirst(String input){
		nameFirst = input;
	}
	/**
	 * Sets last name field.
	 * @param input String containing new last name
	 */
	public void setNameLast(String input){
		nameLast = input;
	}
	/**
	 * Sets gender field.
	 * @param input String containing new gender
	 */
	public void setGender(String input){
		gender = input;
	}
	/**
	 * Sets address field.
	 * @param input String containing new address field
	 */
	public void setAddress(Address input){
		address = input;
	}

	public void setBirth(Date input){
		birth = input;
	}

	public void setPhysician(String input){
		physician = input;
	}

	public void setPhoneNumber(String input){
		phoneNumber = input;
	}

	public void setAllergies(String input){
		//TODO Separate string by the comma's
		String holder = input;
	}

	public String getNameFirst(){
		return nameFirst;
	}

	public String getNameLast(){
		return nameLast;
	}

	public String getGender(){
		return gender;
	}

	public String getAddress(){
		return address.toString();
	}

	public String Address(){
		return address.toString();
	}


	public static void main(String [] args){
		Patient pt = new Patient();
		System.out.println(pt);

	}
}
