import java.util.HashSet;
public class Employee {
	int id,salary;
    String emp_name,department;
	public Employee(int id, int salary, String emp_name, String department) {
		super();
		this.id = id;
		this.salary = salary;
		this.emp_name = emp_name;
		this.department = department;
	}
    public void display_details()
    {
  	  System.out.println(id);
  	  System.out.println(salary);
  	  System.out.println(emp_name);
  	  System.out.println(department);
    }    
}
 class HashSet2 
{
	public static void main(String[] args) 
	{
		HashSet<Employee> set = new HashSet<Employee>();
		Employee e1 = new Employee(1234,30000,"yogi","analyst");
		set.add(e1);
		for(Employee e:set){  
		    e.display_details();
		    }  
	}
}

	


