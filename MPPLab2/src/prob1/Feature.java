package prob1;

import java.util.*;

/**
 * 
 */
public class Feature {

    /**
     * Default constructor
     */
    public Feature() {
    }

    /**
     * 
     */
    private String fid;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private Integer estimateEffort;

    /**
     * 
     */
    private Integer completedEffort;

    /**
     * 
     */
    private Date dueDate;

	public String getFid() {
		return fid;
	}

	public void setFid(String fid) {
		this.fid = fid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getEstimateEffort() {
		return estimateEffort;
	}

	public void setEstimateEffort(Integer estimateEffort) {
		this.estimateEffort = estimateEffort;
	}

	public Integer getCompletedEffort() {
		return completedEffort;
	}

	public void setCompletedEffort(Integer completedEffort) {
		this.completedEffort = completedEffort;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}



}