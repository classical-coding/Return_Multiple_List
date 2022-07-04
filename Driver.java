import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		
		Employee emp1 = new Employee(100, "Jeet", 15000.89, "Male");
		Employee emp2 = new Employee(101, "Kaushik", 18000.20, "Male");
		Employee emp3 = new Employee(102, "Arpita", 21000.15, "Female");
		Employee emp4 = new Employee(103, "Ram", 25000.00, "Male");
		Employee emp5 = new Employee(104, "Laxmi", 45000.21, "Female");
		
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		
		Map<String, List<Employee>> outputMap= empList.stream()
				.collect(Collectors.groupingBy(Employee::getGender));
		
		System.out.println("Output Map: ");
		outputMap.forEach((k,v)->{
			System.out.println(k+" : "+v);
		});
	}

}
