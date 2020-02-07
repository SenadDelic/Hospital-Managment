package hospital;

import java.util.Date;

public class Diagnose {
	
	private String nameOfDiagnose;
	private String commentOfDiagnose;
	private Doctor doctor;
	private Date date = new Date();
	
	public Diagnose(String nameOfDiagnose, String commentOfDiagnose, Doctor doctor) {
		this.nameOfDiagnose = nameOfDiagnose;
		this.commentOfDiagnose = commentOfDiagnose;
		this.doctor = doctor;
	}
	public String getNameOfDiagnose() {
		return nameOfDiagnose;
	}
	public void setNameOfDiagnose(String nameOfDiagnose) {
		this.nameOfDiagnose = nameOfDiagnose;
	}
	public String getCommentOfDiagnose() {
		return commentOfDiagnose;
	}
	public void setCommentOfDiagnose(String commentOfDiagnose) {
		this.commentOfDiagnose = commentOfDiagnose;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	@Override
	public String toString() {
		return "Diagnose name: " + getNameOfDiagnose() + "\nComment: " + getCommentOfDiagnose() +
				 "Date: " + date + "Doctor: " + doctor.getFirstName() + " " + doctor.getLastName();
	}
}
