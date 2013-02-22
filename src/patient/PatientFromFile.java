package patient;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class PatientFromFile {

	public PatientFromFile(){
	}
	
	public PatientFromFile(String fileName){
		getPatient(fileName);
	}
	
	public Patient getPatient(String fileName){
		File ptFile;
		Patient pt;
		Scanner sc = new Scanner("");
		try{
			ptFile = new File(fileName); 
			sc = new Scanner(ptFile);
		}catch(Exception e){}
		if(sc.next() == ""){
			return null;
		}
		pt = new Patient();
		pt.setSSN(sc.nextLine());
		pt.setNameFirst(sc.nextLine());
		pt.setNameLast(sc.nextLine());
		pt.setGender(sc.nextLine());
		pt.setAddress(sc.nextLine());
		sc.nextLine();
		//pt.setBirth(sc.nextLine());
		pt.setPhysician(sc.nextLine());
		pt.setPhoneNumber(sc.nextLine());
		
		String temp = "";
		ArrayList<String> holder = new ArrayList<String>();
		while(sc.hasNextLine()){
			temp = sc.nextLine();
			if(temp.contains("}"))
				break;
			holder.add(temp);
		}
		pt.setMedicalHistory(holder);
		
		temp = "";
		holder = new ArrayList<String>();
		while(sc.hasNextLine()){
			temp = sc.nextLine();
			if(temp.contains("}"))
				break;
			holder.add(temp);
		}
		pt.setAllergies(holder);
		
		return pt;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		PatientFromFile newPatient = new PatientFromFile();
		
	}

}