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
	}

	/**
	 * Writes patient information to a String
	 * @return String String containing all patient information
	 */
	public String toString() {
		return ssn + "\n" + nameFirst + "\n" + nameLast+"\n"+ gender + "\n" +
				address + "\n" + birth + "\n" + physician + "\n" + 
				phoneNumber + "\n" + pMH() + "\n" + allergies();
	}
	
	private String pMH(){
		String str = "";
		for(String condition: pastMedicalHistory){
			str += condition + "\n";
		}
		return str + "}";
	}
	
	private String allergies(){
		String str= "";
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
		File file = new File(nameLast+nameFirst+"PT.txt");
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

	public void setBirth(String input){
		birth = input;
	}

	public void setPhysician(String input){
		physician = input;
	}

	public void setPhoneNumber(String input){
		phoneNumber = input;
	}

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
	
	public void setAllergies(ArrayList<String> input){
		//TODO Separate string by the comma's
		
		for(int i = 0; i<input.size() ; i++){
			allergies.add(input.get(i));
		}
	}
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
	
	public void setMedicalHistory(ArrayList<String> input){
		//TODO Separate string by the comma's
		
		for(int i = 0; i<input.size() ; i++){
			pastMedicalHistory.add(input.get(i));
		}
	}
	
	public void setSSN(String newSSN){
		ssn = newSSN;
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
	//TODO make geter and seter for SSN
	public String getSSN(){
		return ssn;
	}

	public static void main(String [] args){
		Patient pt = new Patient();
		System.out.println(pt);
		pt.toFile();
	}
}