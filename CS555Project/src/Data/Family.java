package Data;

//class for family
public class Family {

	private String id;
	private String husband;
	private String wife;
	private String type;

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

}
