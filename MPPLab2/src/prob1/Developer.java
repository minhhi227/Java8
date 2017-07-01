package prob1;

import java.util.*;

/**
 * 
 */
public class Developer extends Employee {

    /**
     * Default constructor
     */
    public Developer() {
    }

    private List<Feature> featureAssigned;
    

	public List<Feature> getfeatureAssigned() {
		return featureAssigned;
	}




	public void setfeatureAssigned(List<Feature> featureAssigned) {
		this.featureAssigned = featureAssigned;
	}

	
    /**
     * @return
     */
    public Integer estimateWork(String feature) {
        // TODO implement here
    	Integer estimate = 0;
    	if(this.featureAssigned == null || this.featureAssigned.isEmpty()==true){
    		return 0;
    	}
   
        for(Feature f : this.featureAssigned){
        	if(f.getName() == feature) return f.getEstimateEffort();
        }
    	
        return null;
    	
    }

    /**
     * 
     */
    public void updateWork(String feature,int spendWork) {
        // TODO implement here
    	Integer estimate = 0;
    	if(this.featureAssigned == null || this.featureAssigned.isEmpty()==true){
    		return ;
    	}
   
        for(Feature f : this.featureAssigned){
        	if(f.getName() == feature) f.setEstimateEffort(spendWork);
        }
    }

}