package prob1;

import java.util.*;

/**
 * 
 */
public class Project {

    /**
     * Default constructor
     */
    public Project() {
    }

    /**
     * 
     */
    private String pid;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private Date startDate;
    
    private List<Feature> featureList;
    

	public List<Feature> getFeatureList() {
		return featureList;
	}




	public void setFeatureList(List<Feature> featureList) {
		this.featureList = featureList;
	}

	
    private List<Release> releaseList;
    
	public List<Release> getReleaseList() {
		return releaseList;
	}

	public void setReleaseList(List<Release> releaseList) {
		this.releaseList = releaseList;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}






}