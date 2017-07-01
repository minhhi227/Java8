package prob1;

import java.util.*;

/**
 * 
 */
public class Release {

    /**
     * Default constructor
     */
    public Release() {
    }

    /**
     * 
     */
    private String rid;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private Date releaseDate;

    /**
     * 
     */
    private Double version;

    /**
     * 
     */
    private List<Sprint> sprintList;
    

	public List<Sprint> getSprintList() {
		return sprintList;
	}

	public void setSprintList(List<Sprint> sprintList) {
		this.sprintList = sprintList;
	}

	public String getRid() {
		return rid;
	}

	public void setRid(String rid) {
		this.rid = rid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public Double getVersion() {
		return version;
	}

	public void setVersion(Double version) {
		this.version = version;
	}




}