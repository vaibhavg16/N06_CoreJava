// Class and Object

// program to demonstrate class and object

package OOPs_concepts;

// class declaration
public class Employee 
{	
	// default data members
	int empID;
	String empName,department;
	float salary;
	
	void display()
	{
		System.out.println("Employee ID:"+empID+" \n "+"Employee Name:"+empName+"\n "+"Salary:"+salary+" \n"+"Department:"+department);
	}
}
