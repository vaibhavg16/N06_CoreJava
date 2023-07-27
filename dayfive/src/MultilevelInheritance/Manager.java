package MultilevelInheritance;

public class Manager 
{
	//private members
	private String deptname;
	private String name;
	private int empID;
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	@Override
	public String toString() {
		return "Manager [deptname=" + deptname + ", name=" + name + ", empID=" + empID + ", toString()="
				+ super.toString() + "]";
	}
	public Manager(String deptname, String name, int empID) {
		super();
		this.deptname = deptname;
		this.name = name;
		this.empID = empID;
	}
	
	
}
