package ProjectManagement.Model;

public class Project {
	public String projectID;
	public String projOrgName;
	public String projRequirement;
	public String projManager;
	public String solutionArchitect;
	public String dateOfReceivingProj;
	public String expectedCompletionDate;
	
	
	
	public String getProjectID() {
		return projectID;
	}
	public void setProject_ID(String projectID) {
		this.projectID = projectID;
	}
	public String getprojOrgName() {
		return projOrgName;
	}
	public void setprojOrgName(String projOrgName) {
		this.projOrgName = projOrgName;
	}
	public String getprojRequirement() {
		return projRequirement;
	}
	public void setProj_Requirement(String proj_Requirement) {
		this.projRequirement = proj_Requirement;
	}
	public String getprojManager() {
		return projManager;
	}
	public void setprojManager(String projManager) {
		this.projManager = projManager;
	}
	public String getsolutionArchitect() {
		return solutionArchitect;
	}
	public void setsolutionArchitect(String solutionArchitect) {
		this.solutionArchitect = solutionArchitect;
	}
	public String getdateOfReceivingProj() {
		return dateOfReceivingProj;
	}
	public void setdateOfReceivingProj(String dateOfReceivingProj) {
		this.dateOfReceivingProj = dateOfReceivingProj;
	}
	public String getexpectedCompletionDate() {
		return expectedCompletionDate;
	}
	public void setexpectedCompletionDate(String expectedCompletionDate) {
		this.expectedCompletionDate = expectedCompletionDate;
	}	
}
