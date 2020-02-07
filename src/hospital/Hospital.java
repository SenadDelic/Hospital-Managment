package hospital;

import java.util.ArrayList;
import java.util.Date;

import person.Patient;
import person.Person;

public class Hospital {
	private String nameOfHospital;
	private ArrayList<Patient> patients;
	private ArrayList<Department> departments;

	public Hospital() {
		super();
	}

	public Hospital(String nameOfHospital) {
		super();
		this.nameOfHospital = nameOfHospital;
	}

	public String getNameOfHospital() {
		return nameOfHospital;
	}

	public void setNameOfHospital(String nameOfHospital) {
		this.nameOfHospital = nameOfHospital;
	}

	public void addPatient(String firstName, String lastName, Date dateOfBirth, String userName, String password) {
		patients.add(new Patient(firstName, lastName, dateOfBirth, userName, password));
	}

	public void getPatient(int index) {
		Person person = new Patient();

		for (Patient e : patients) {
			if (person.getId() == index) {
				System.out.println(e);
			}
		}
	}
}
