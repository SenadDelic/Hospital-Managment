package person;

import hospital.Appointment;
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

    void resolveAppointment() {
        Diagnose diagnose = new Diagnose();
        Appointment appointment = new Appointment();

        String nameOfDiagnose = diagnose.getNameOfDiagnose();
        String commentOnDiagnose = diagnose.getCommentOfDiagnose();
        Patient patient = appointment.getPatient();

        Diagnose diagnoseOfPatient = new Diagnose(nameOfDiagnose, commentOnDiagnose, this);
        patient.addDiagnose(diagnoseOfPatient);
    }
}
