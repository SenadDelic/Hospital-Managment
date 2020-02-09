package room;

import hospital.Department;

enum Svrha {
	DayRoom,
	DeliveryRoom,
	Dispensary,
	EmergencyRoom
	}

public class SpecijalnaSoba extends Room {
	Svrha svrha;
	
	public SpecijalnaSoba() {}
	
	public SpecijalnaSoba(int roomNumber, Department department, Svrha svrha) {
		super(roomNumber, department);
		this.svrha = svrha;
	}
	
	
	
}
