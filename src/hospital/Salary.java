package hospital;

public class Salary {
	private double salary;

	public Salary(){
		salary = 1000;
	}
	
	public Salary(double salary){
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
