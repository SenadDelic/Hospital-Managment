package person;

import hospital.Appoitment;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends Employe {
    private ArrayList<Patient> listOfPatients;
    private boolean isHeadDoctor;
    private ArrayList<Appoitment> listOfAppointments;

    public Doctor() {
        this.isHeadDoctor = false;
    }

    public Doctor(String firstName, String lastName, Date dateOfBirth, String userName, String password) {
        super(firstName, lastName, dateOfBirth, userName, password);
        this.isHeadDoctor = false;
    }

    public boolean isHeadDoctor() {
        return isHeadDoctor;
    }

    public void setHeadDoctor(boolean headDoctor) {
        isHeadDoctor = headDoctor;
    }

    public ArrayList<Patient> getListOfPatients() {
        return listOfPatients;
    }

    public ArrayList<Appoitment> getListOfAppointments() {
        return listOfAppointments;
    }

    void addAppointment(Appoitment appoitment) {
        listOfAppointments.add(appoitment);
    }

    void updateAppointment(int index, Appoitment appoitment) {
        listOfAppointments.add(index, appoitment);
    }

    void deleteAppointment(int index) {
        if (index > 0 && index < listOfAppointments.size())
            listOfAppointments.remove(index);
        else
            System.out.println("Sta ti je baa...");
    }
}
