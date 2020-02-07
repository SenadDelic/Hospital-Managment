package room;

enum Svrha {
	DayRoom,
	DeliveryRoom,
	Dispensary,
	EmergencyRoom
	}

public class SpecijalnaSoba extends Room {
	Svrha svrha;
	
	public SpecijalnaSoba() {}
	
	public SpecijalnaSoba(int rooomNumber, Department department, Svrha svrha) {
		super(rooomNumber, department);
		this.svrha = svrha;
	}
	
	
	
}
