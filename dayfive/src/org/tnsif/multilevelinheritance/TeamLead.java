package org.tnsif.multilevelinheritance;
//child class2
//parent class2

public class TeamLead extends Manager {
	private String leadName;
	private int empID;
	private String ProjectName;
	
	//getter setter
	public String getLeadName() {
		return leadName;
		
	}
	public void setLeadName(String leadName) {
		this.leadName = leadName;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getProjectName() {
		return ProjectName;
	}
	public void setProjectName(String projectName) {
		ProjectName = projectName;
	}
	@Override
	public String toString() {
		return "TeamLead [leadName=" + leadName + ", empID=" + empID + ", ProjectName=" + ProjectName + ", toString()="
				+ super.toString() + "]";
	//parameterized constructor	
	}
	public TeamLead(String deptName,String name,String leadName, int empID, String projectName) {
		super(deptName,name,empID);
		this.leadName = leadName;
		this.empID = empID;
		this.ProjectName = projectName;
	}
	

}
