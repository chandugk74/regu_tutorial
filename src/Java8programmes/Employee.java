package Java8programmes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Employee {
	
	String name;
	int salary;

	

	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [ getName()=" + getName() + ", getSalary()="
				+ getSalary() + "]";
	}

	public static void main(String[] args) {
		
		List<Employee> list= new ArrayList<Employee>();
		
		list.add(new Employee("Amit",15000));
		list.add(new Employee("Sankar",25000));
		list.add(new Employee("Krishna",40000));
		
		List<Employee> listSorted= new ArrayList<Employee>();
		
		//sorting on Aescending order by name
				Comparator<Employee> NameCommparator = Comparator.comparing(Employee::getName);
				listSorted = list.stream().sorted(NameCommparator).collect(Collectors.toList());
//				listSorted = list.stream().sorted(NameCommparator.reversed()).collect(Collectors.toList());
				System.out.println("Aescending order by name:" + listSorted);

		//sorting on Aescending order by salary
			//	Comparator<Employee> SalaryCommparator = Comparator.comparing(Employee::getSalary);
			//	listSorted = list.stream().sorted(SalaryCommparator).collect(Collectors.toList());
//				listSorted = list.stream().sorted(SalaryCommparator.reversed()).collect(Collectors.toList());
				System.out.println("Aescending order by salary:" + listSorted);
		
		

	}

}
