package prob1;

import java.util.*;

/**
 * 
 */
public class Sprint {

    /**
     * Default constructor
     */
    public Sprint() {
    }

    /**
     * 
     */
    private String sid;

    /**
     * 
     */
    private Date dueDate;


    private List<Feature> featureList;
    

	public List<Feature> getFeatureList() {
		return featureList;
	}




	public void setFeatureList(List<Feature> featureList) {
		this.featureList = featureList;
	}




	public String getSid() {
		return sid;
	}




	public void setSid(String sid) {
		this.sid = sid;
	}




	public Date getDueDate() {
		return dueDate;
	}




	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}


}