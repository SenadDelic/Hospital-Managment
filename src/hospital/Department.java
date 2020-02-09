package hospital;

import java.util.ArrayList;
import java.util.Date;

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
        rooms = new ArrayList<>();
        listOfDoctors = new ArrayList<>();
        listOfNurses = new ArrayList<>();
        pending = new ArrayList<>();
        done = new ArrayList<>();
    }

    public Department(String nameOfDepartment) {
        this.nameOfDepartment = nameOfDepartment;
        rooms = new ArrayList<>();
        listOfDoctors = new ArrayList<>();
        listOfNurses = new ArrayList<>();
        pending = new ArrayList<>();
        done = new ArrayList<>();
    }

    public String getNameOfDepartment() {
        return nameOfDepartment;
    }

    public void setNameOfDepartment(String name) {
        this.nameOfDepartment = name;
    }

    public void addRooms(Room room) {
        this.rooms.add(room);
    }

    public void removeRoom(int index) {
        rooms.remove(index);
    }

    public void updateRoom(int index, Room room) {
        rooms.add(index, room);
    }

    public void addDoctor(String firstName, String lastName, Date dateOfBirth, String userName, String password) {
        listOfDoctors.add(new Doctor(firstName, lastName, dateOfBirth, userName, password));
    }

    public ArrayList<Doctor> getListOfDoctors() {
        return listOfDoctors;
    }

    public Doctor getDoctor(int index) {
        return listOfDoctors.get(index);
    }

    public void addNurse(String firstName, String lastName, Date dateOfBirth, String userName, String password) {
        listOfNurses.add(new Nurse(firstName, lastName, dateOfBirth, userName, password));
    }

    public ArrayList<Nurse> getListOfNurses() {
        return listOfNurses;
    }

    public Nurse getNurse(int index) {
        return listOfNurses.get(index);
    }
}
