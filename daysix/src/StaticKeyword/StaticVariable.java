package StaticKeyword;
class Employee
{
	int empid;
	String name;
	private static String companyname="Godse NexTech";
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static String getCompanyname() {
		return companyname;
	}
	public static void setCompanyname(String companyname) {
		Employee.companyname = companyname;
	}
	
	void display()
	{
		System.out.println("Employee Id is: "+this.getEmpid()+"\n"+"Employee Name is: "+this.name+"\n"+"Company Name is: "+Employee.companyname);
	}
}
// driver class
public class StaticVariable 
{
	public static void main(String[] args) 
	{
		Employee e=new Employee();
		e.setEmpid(1);
		e.setName("vaibhav");
		e.display();
		
		Employee e1=new Employee();
		e1.setEmpid(2);
		e1.setName("suchita");
		e1.display();
		
		Employee e2=new Employee();
		e2.setEmpid(3);
		e2.setName("chintamani");
		e2.display();
	}

}
