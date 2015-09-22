package Data;

import java.util.*;

//class for family
public class Family {

	private String id;
	private String husband;
	private String wife;
	private String type;
	private String weddingDate;
	private String divorceDate;

	public String getId() {

		return id;

	}

	// store the identifier
	public void setId(String id) {
		this.id = id;
	}

	// get type
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	// return husband
	public String getHusband() {
		return husband;
	}

	// store husband
	public void setHusband(String husband) {
		this.husband = husband;
	}

	//return wife
	public String getWife() {
		return wife;
	}
	//store wife
	public void setWife(String wife) {
		this.wife = wife;
	}
	
	//return wedding date
	public String getWeddingDate(){
		return weddingDate;
	}
	
	//get wedding date
	public void setWeddingDate(String wdate){
		this.weddingDate = wdate;
	}
	
	//return divorce date
	public String getDivorceDate(){
		return divorceDate;
	}
		
	//get wedding date
	public void setDivorceDate(String ddate){
		this.divorceDate = ddate;
	}
	

}
