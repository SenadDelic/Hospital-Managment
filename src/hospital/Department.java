package hospital;

import java.util.ArrayList;

import person.Doctor;
import person.Nurse;
import room.Room;

public class Department {
	
	private String nameOfDepartment;
	private ArrayList<Room> rooms;
	private ArrayList<Doctor> listOfDoctors;
	private ArrayList<Nurse> listOfNurses;
	private ArrayList<Appointment> pending;
	private ArrayList<Appointment> done;

	public Department() {
	}
	
	public Department(String nameOfDepartment) {
		this.nameOfDepartment = nameOfDepartment;
	}
	
	public String getNameOfDepartment() {
		return nameOfDepartment;
	}
	
	public void setNameOfDepartment(String name) {
		this.nameOfDepartment = name;
	}
	
	public void addRooms(int index, Room rooms) {
		if (index < 0 || index > rooms.size()) {
			System.out.println("ERROR: INDEX NONEXISTENT!");
		}
		else {
			rooms.add(index, rooms);
		}
	}
}
