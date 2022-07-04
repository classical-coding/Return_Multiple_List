
public class Employee {
	private int employeeId;
	private String name;
	private double salary;
	private String gender;
	public Employee(int employeeId, String name, double salary, String gender) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + ", gender=" + gender
				+ "]";
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
