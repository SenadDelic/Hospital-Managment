package room;

import java.util.ArrayList;

import hospital.Department;
import person.Patient;

public class BolesnickaSoba extends Room {
    private int numberOfBeds;
    private ArrayList<Patient> listOfPatient;

    public BolesnickaSoba() {
    }

    public BolesnickaSoba(int roomNumber, Department department, int numberOfBeds) {
        super(roomNumber, department);
        this.numberOfBeds = numberOfBeds;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    ArrayList<Patient> getListOfPatient() {
        return listOfPatient;
    }

    void addToListOfPatient(Patient patient) {
        if (numberOfBeds >= listOfPatient.size())
            listOfPatient.add(patient);
    }

    public int getNumberOfPatient(ArrayList<Patient> patients) {
        return patients.size();
    }

    void removeFromListOfPatient(int index) {
        listOfPatient.remove(index);
    }
}