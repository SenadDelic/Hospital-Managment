package hospital;

import java.util.Date;

import person.Patient;
import room.Room;

public class Appointment {
	public Patient patient;
	public Date dateOfAppointment;
	public Room room;
	public boolean isDone;
	public Department department;

	public Appointment() {
		super();
	}

	public Appointment(Patient patient, Date dateOfAppointment, Room room) {
		super();
		this.patient = patient;
		this.dateOfAppointment = dateOfAppointment;
		this.room = room;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Date getDateOfAppointment() {
		return dateOfAppointment;
	}

	public void setDateOfAppointment(Date dateOfAppointment) {
		this.dateOfAppointment = dateOfAppointment;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public boolean isDone() {
		return isDone;
	}

	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Appointment [patient=" + patient + ", dateOfAppointment=" + dateOfAppointment + ", room=" + room
				+ ", isDone=" + isDone + "]";
	}

}
