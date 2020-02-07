package person;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends Person {
	
	ArrayList<Diagnose> diagnosis;
	ArrayList<Doctor> doctors;
	
	Patient(){
		
	}
	
	Patient(String firstName, String lastName, Date dateOfBirth, String userName, String password) {
		super(firstName, lastName, dateOfBirth, userName, password);
	}
	
	public void addDiagnose(Diagnose diagnose) {
		diagnosis.add(diagnose);
	}
	
	public void updateDiagnose(int index, Diagnose diagnose) {
		diagnosis.add(index, diagnose);
	}
	
	public Diagnose getDiagnose(int index) {
		if (index < 0 || index > diagnosis.size()) {
			System.out.println("ERROR: INDEX NONEXSISTENT");
		}
		else {
			return diagnosis.get(index);
		}
	}
	
	public ArrayList<Diagnose> getDiagnose(){
		return diagnosis;
	}
	
	public void addDoctor(Doctor doctor) {
		doctors.add(doctor);
	}
	
	public void updateDoctor(int index, Doctor doctor) {
		doctors.add(index, doctor);
	}
	
	public Doctor getDoctor(int index) {
		if (index < 0 || index > doctors.size()) {
			System.out.println("ERROR: INDEX NONEXISTENT");
		}
		else {
			return doctors.get(index);
		}
	}
	
	public ArrayList<Doctor> getDoctor(){
		return doctors;
	}
	
	@Override
	public String toString() {
		return "First name: " + getFirstName() + "\nLast name: " + getLastName() + "\nDate of birth: " + getDateOfBirth()
				+ "\nUsername: " + getUserName();
	}
}


s





