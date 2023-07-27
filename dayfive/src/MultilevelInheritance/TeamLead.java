package MultilevelInheritance;
// child class 1 and parent class
public class TeamLead extends Manager{
// pri data memb
	private String LeadName;
	private String ProjectName;
	
	// getter and setter
	public String getLeadName() {
		return LeadName;
	}


	public void setLeadName(String leadName) {
		LeadName = leadName;
	}


	public String getProjectName() {
		return ProjectName;
	}


	public void setProjectName(String projectName) {
		ProjectName = projectName;
	}


	public TeamLead(String deptname, String name, int empID,String LeadName,String ProjectName) {
		super(deptname, name, empID);
		this.LeadName=LeadName;
		this.ProjectName=ProjectName;
		
	}

	
	@Override
	public String toString() {
		return "TeamLead [LeadName=" + LeadName + ", ProjectName=" + ProjectName + ", toString()=" + super.toString()
				+ "]";
	}	
}
