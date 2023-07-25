package OOPs_concepts;
//program to demonstrate class and object
public class EmployeeExecuter 
{

	public static void main(String[] args) 
	{
		// object creation
		Employee e=new Employee();
		e.empID=123;
		e.empName="vaibhav godse";
		e.salary=20000;
		e.department="computer department";

		// method calling
		e.display();
		
	}

}
