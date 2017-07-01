package prob1;

import java.util.*;

/**
 * 
 */
public class Manager extends Employee {

    /**
     * Default constructor
     */
    public Manager() {
    }

    /**
     * 
     */
    private List<Project> projectList;


    public List<Project> getProjectList() {
		return projectList;
	}

	public void setProjectList(List<Project> projectList) {
		this.projectList = projectList;
	}

	/**
     * @return
     */
    public Integer caculateCompletedWork(String project, String sprintID) {
        // TODO implement here
    	if(this.projectList == null || this.projectList.isEmpty() == true) return 0;
    	Integer complete = 0;
    	Integer estimate = 0;
    	Sprint temp = null;
    	for(Project p: this.projectList){
    		if(p.getName() == project) {
    			for(Release r: p.getReleaseList()){
    				for(Sprint s: r.getSprintList()){
    					if(s.getSid() == sprintID) {
    						temp = s;
    						break;
    					}
    				}
    			}
    		}
    		
    	}
    	for(Feature f : temp.getFeatureList()){
    		complete += f.getCompletedEffort();
    		estimate +=f.getEstimateEffort();
    	}
        return (complete/estimate)*100; //percent
    }

    /**
     * @return
     */
    public Integer caculatedRemainingWork(String project, String sprintID) {
    	 // TODO implement here
    	if(this.projectList == null || this.projectList.isEmpty() == true) return 0;
    	Integer remaining = 0;
    	Integer estimate = 0;
    	Sprint temp = null;
    	for(Project p: this.projectList){
    		if(p.getName() == project) {
    			for(Release r: p.getReleaseList()){
    				for(Sprint s: r.getSprintList()){
    					if(s.getSid() == sprintID) {
    						temp = s;
    						break;
    					}
    				}
    			}
    		}
    		
    	}
    	for(Feature f : temp.getFeatureList()){
    		remaining += f.getEstimateEffort() - f.getCompletedEffort();
    		estimate +=f.getEstimateEffort();
    	}
        return (remaining/estimate)*100; //percent
    }

}