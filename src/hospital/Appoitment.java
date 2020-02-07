package hospital;

import java.util.Date;

import person.Patient;
import room.Room;

public class Appoitment {
	public Patient patient;
	public Date dateOfAppoitmentDate;
	public Room room;
	public boolean isDone;
	public Department department;

	public Appoitment() {
		super();
	}

	public Appoitment(Patient patient, Date dateOfAppoitmentDate, Room room) {
		super();
		this.patient = patient;
		this.dateOfAppoitmentDate = dateOfAppoitmentDate;
		this.room = room;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Date getDateOfAppoitmentDate() {
		return dateOfAppoitmentDate;
	}

	public void setDateOfAppoitmentDate(Date dateOfAppoitmentDate) {
		this.dateOfAppoitmentDate = dateOfAppoitmentDate;
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
		return "Appoitment [patient=" + patient + ", dateOfAppoitmentDate=" + dateOfAppoitmentDate + ", room=" + room
				+ ", isDone=" + isDone + "]";
	}

}
