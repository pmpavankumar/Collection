package day13;


import java.util.*;

class Employee implements Comparable<Employee>
{
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Employee o) {
		if(id==o.id)
			return 0;
		
		else if(id<o.id)
			return 1;
		
		return -1;
	}
	
	
	
	
}
public class UserDefinedType {

	public static void main(String[] args) {
		ArrayList<Employee>emp=new ArrayList<Employee>();
		emp.add(new Employee(30,"sachin"));
		emp.add(new Employee(2,"sam"));
		emp.add(new Employee(16,"sarita"));
		
		System.out.println(emp);

		for(Employee e:emp)
		{
			System.out.println("id "+e.id+" "+"name "+e.name);
		}
		
		Collections.sort(emp);
		

		for(Employee e:emp)
		{
			System.out.println("id "+e.id+" "+"name "+e.name);
		}
		
		
		
	}

}
