package Data;

import java.util.*;

//class for individual
public class Individual {

	// the info list for individual
	private String id;
	private String name;
	private String givenName;
	private String surName;
	private char sex;
	private String birthDate;
	private String deathDate;
	private char deceased;

	// get id method
	public String getId() {
		return id;
	}

	// set id
	public void setId(String id) {
		this.id = id;
	}

	// get sex
	public char getSex() {
		return sex;
	}

	// set sex
	public void setSex(char sex) {
		this.sex = sex;
	}

	// get name
	public String getName() {
		return name;
	}

	// set name
	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getDeathDate() {
		return deathDate;
	}

	public void setDeathDate(String deathDate) {
		this.deathDate = deathDate;
	}

	public char getDeceased() {
		return deceased;
	}

	public void setDeceased(char deceased) {
		this.deceased = deceased;
	}
}
