package MultilevelInheritance;

public class TeamMember extends TeamLead
{
	
	private int size;
	private int duration;
	
	

	public int getSize() {
		return size;
	}



	public void setSize(int size) {
		this.size = size;
	}



	public int getDuration() {
		return duration;
	}



	public void setDuration(int duration) {
		this.duration = duration;
	}



	public TeamMember(String deptname, String name, int empID,String LeadName,String ProjectName, int size,int duration) {
		super(deptname, name, empID,LeadName,ProjectName);
		this.size=size;
		this.duration=duration;
	}



	@Override
	public String toString() {
		return "TeamMember [size=" + size + ", duration=" + duration + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
