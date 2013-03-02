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
	private String birth;
	private String physician;
	private String phoneNumber;
	private ArrayList<String> pastMedicalHistory;
	private ArrayList<String> allergies;
	private String ssn;
	private String language;

	/**
	 * Constructor for Patient object.
	 */
	public Patient(){
		//Default Values for testing purposes.
		nameFirst = "John";
		nameLast = "Smith";
		gender = "Male";
		address = new Address();
		//TODO Fix date object
		birth = "January 1, 1990";
		physician = "Dr.Brown";
		phoneNumber = "1234567890";
		pastMedicalHistory = new ArrayList<String>();
		allergies = new ArrayList<String>();
		ssn = "333224444";
		language = "English";
	}

	/**
	 * Writes patient information to a String
	 * @return String String containing all patient information
	 */
	public String toString() {
		return ssn + "\n" + nameFirst + "\n" + nameLast+"\n"+ gender + "\n" + language + "\n" +
				address + "\n" + birth + "\n" + physician + "\n" + 
				phoneNumber + "\n" + pMH() + "\n" + allergies();
	}
	
	/**
	 * Writes patient Information to a String with name of fields
	 * @return String String containing all Patient information
	 */
	public String printLong(){
		return "SSN: " + ssn +
				"\nFirst Name: " + nameFirst +
				"\nLast Name: " + nameLast +
				"\nGender: " + gender +
				"\nLanguage: " + language +
				"\nAddress: " + address + 
				"\nBirth Date: " + birth +
				"\nPhysician: " + physician +
				"\nPhone Number: " + phoneNumber +
				"\nPast Medical History: " + pMH() +
				"\nAllergies: " + allergies();
	}
	
	/**
	 * Private Helper Class to generate String representation of Past Medical History field
	 * @return String representation of Past Medical History Field
	 */
	private String pMH(){
		String str = "";
		if(pastMedicalHistory.isEmpty()){
			pastMedicalHistory.add("N/A");
		}
		for(String condition: pastMedicalHistory){
			str += condition + "\n";
		}
		return str + "}";
	}
	
	/**
	 * Private Helper Class to generate String representation of Allergies field
	 * @return String representation of Allergies Field
	 */
	private String allergies(){
		String str= "";
		if(allergies.isEmpty()){
			allergies.add("N/A");
		}
		
		for(String allergy: allergies){
			str += allergy + "\n";
		}
		return str + "}";
	}
	/**
	 * Writes patient information to a File, "LastNameFirstNamePT.txt" 
	 * @return File File containing all patient information
	 */
	public File toFile(){
		File file = new File("ptFiles/" +nameLast+nameFirst+"PT.txt");
		BufferedWriter out;

		try {
			out = new BufferedWriter(new FileWriter(file));
			out.write(this.toString());
			out.close();
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
	 * @param input Address File containing new address field
	 */
	public void setAddress(Address input){
		address = input;
	}
	/**
	 * Sets address field.
	 * @param input String containing new address field
	 */
	public void setAddress(String input){
		address.parseAddress(input);
	}

	/**
	 * Sets Birth Field 
	 * @param input String containing new Birth Field
	 */
	public void setBirth(String input){
		birth = input;
	}

	/**
	 * Sets Physician Field
	 * @param input String containing new Physician Field
	 */
	public void setPhysician(String input){
		physician = input;
	}

	/**
	 * Sets PhoneNumber Field
	 * @param input String containing new PhoneNumber Field
	 */
	public void setPhoneNumber(String input){
		phoneNumber = input;
	}

	/**
	 * Sets Allergies Field
	 * @param input String containing new Allergies Field
	 */
	public void setAllergies(String input){
		if(input.equals(""))
			allergies.add("N/A");
		else{
		//TODO Separate string by the comma's
			Scanner sc = new Scanner(input);
			while (sc.hasNextLine())
				allergies.add(sc.nextLine());
		}
		
	}
	
	/**
	 * Set Allergies Field
	 * @param input Array List of Strings containing new Allergies Field
	 */
	public void setAllergies(ArrayList<String> input){
		//TODO Separate string by the comma's
		
		for(int i = 0; i<input.size() ; i++){
			allergies.add(input.get(i));
		}
	}
	
	/**
	 * Sets Past Medical History Field
	 * @param input String containing new PastMedicalHistory Field
	 */
	public void setMedicalHistory(String input){
		if(input.equals(""))
			pastMedicalHistory.add("N/A");
		else{
		//TODO Separate string by the comma's
			Scanner sc = new Scanner(input);
			while (sc.hasNextLine())
				pastMedicalHistory.add(sc.nextLine());
		}
	}
	
	/**
	 * Set Past Medical History Field
	 * @param input Array List of Strings containing new PastMedicalHistory Field
	 */
	public void setMedicalHistory(ArrayList<String> input){
		//TODO Separate string by the comma's
		
		for(int i = 0; i<input.size() ; i++){
			pastMedicalHistory.add(input.get(i));
		}
	}
	
	/**
	 * Set SSN Field
	 * @param newSSN String Containing new Social Security Number
	 */
	public void setSSN(String newSSN){
		ssn = newSSN;
	}
	
	/**
	 * Set Language Field
	 * @param newLanguage String Containing new Language Field
	 */
	public void setLanguage(String newLanguage) {
		language = newLanguage;		
	}

	/**
	 * Getter class for the nameFirst Field
	 * @return First Name of Patient
	 */
	public String getNameFirst(){
		return nameFirst;
	}

	/**
	 * Getter class for the nameLast Field
	 * @return Last Name of Patient
	 */
	public String getNameLast(){
		return nameLast;
	}

	/**
	 * Getter class for the Gender Field
	 * @return Gender of Patient
	 */
	public String getGender(){
		return gender;
	}

	/**
	 * Getter class for the Address Field
	 * @return Address of Patient
	 */
	public String getAddress(){
		return address.toString();
	}
	
	/**
	 * Getter class for the SSN Field
	 * @return Social Security Number of Patient
	 */
	public String getSSN(){
		return ssn;
	}

	public static void main(String [] args){
		Patient pt = new Patient();
		System.out.println(pt.printLong());
		pt.toFile();
	}
}