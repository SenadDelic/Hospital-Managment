package room;

public abstract class Room {
	private int roomNumber;
	private Department department;
	
	public Room(){
	}
	
	public Room(int roomNumber, Department department){
		this.roomNumber = roomNumber;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
}
