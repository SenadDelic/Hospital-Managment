package person;

import hospital.Appointment;
import hospital.Department;
import hospital.Diagnose;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends Employe {
    private ArrayList<Patient> listOfPatients;
    private ArrayList<Appointment> listOfAppointments;
    private boolean isHeadDoctor;

    public Doctor() {
        this.isHeadDoctor = false;
    }

    public Doctor(String firstName, String lastName, Date dateOfBirth, String userName, String password) {
        super(firstName, lastName, dateOfBirth, userName, password);
        this.isHeadDoctor = false;
        listOfPatients = new ArrayList<Patient>();
        listOfAppointments = new ArrayList<Appointment>();
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

    public ArrayList<Appointment> getListOfAppointments() {
        return listOfAppointments;
    }

    void addAppointment(Appointment appointment) {
        listOfAppointments.add(appointment);
    }

    void updateAppointment(int index, Appointment appointment) {
        listOfAppointments.add(index, appointment);
    }

    void deleteAppointment(int index) {
        if (index > 0 && index < listOfAppointments.size())
            listOfAppointments.remove(index);
        else
            System.out.println("Sta ti je baa...");
    }
    
    void deleteAppointment(Appointment appointment) {
        listOfAppointments.remove(appointment);
    }

    void resolveAppointment(int index, String nameOfDiagnose, String comment) {
       Appointment tempAppoitment =  listOfAppointments.get(index);
       Patient tempPatient= tempAppoitment.getPatient();
       Department tempDepartment = tempAppoitment.getDepartment();
       
       tempAppoitment.setDone(true);
       tempPatient.addDiagnose(new Diagnose(nameOfDiagnose, comment, this));
       tempDepartment.addDoneAppointment(tempAppoitment);
       deleteAppointment(tempAppoitment);
    }
}