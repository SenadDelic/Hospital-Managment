package room;

import hospital.Department;

enum Purpose {
    DayRoom,
    DeliveryRoom,
    Dispensary,
    EmergencyRoom
}

public class SpecialRooms extends Room {
    Purpose purpose;

    public SpecialRooms() {
    }

    public SpecialRooms(int roomNumber, Department department, Purpose purpose) {
        super(roomNumber, department);
        this.purpose = purpose;
    }
}
