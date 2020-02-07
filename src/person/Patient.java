package person;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends Person {
	
	ArrayList<Diagnose> diagnosis;
	ArrayList<Doctor> doctors;
	
	Patient(){
		
	}
	
	
	Patient(String firstName, String lastName, Date dateOfBirth) {
		
	}
	
	public void addDiagnose(Diagnose diagnose) {
		diagnosis.add(diagnose);
	}
	
	public void updateDiagnose(int index, Diagnose diagnose) {
		diagnosis.add(index, diagnose);
	}
	
	public Diagnose getDiagnose(int index) {
		for (int i = 0; i < diagnosis.size; i++) {
			if (i == index) {
				return diagnosis.get(i);
			}
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
		for (int i = 0; i < doctors.size; i++) {
			if (i == index) {
				return doctors.get(i);
			}
		}
	}
	
	public ArrayList<Doctor> getDoctor(){
		for (Doctor doctor : doctors) {
			System.out.println(doctor);
		}
	}
	
	@Override
	public String toString() {
		return "First name: " + firstName + "\nLast name: " + lastName + "\nDate of birth: " + dateOfBirth
				+ "\nUsername: " + username;
	}
}








