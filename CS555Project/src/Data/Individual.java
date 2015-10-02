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

	// get id 
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

	// get family name
	public String getSurName() {
		return surName;
	}

	// set family name
	public void setSurName(String surName) {
		this.surName = surName;
	}

	// get first name
	public String getGivenName() {
		return givenName;
	}

	// set first name
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	// get birth date
	public String getBirthDate() {
		return birthDate;
	}

	// set birth date
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	// get death date
	public String getDeathDate() {
		return deathDate;
	}

	// set death date
	public void setDeathDate(String deathDate) {
		this.deathDate = deathDate;
	}

	// judge whether a people has died or not
	public char getDeceased() {
		return deceased;
	}

	public void setDeceased(char deceased) {
		this.deceased = deceased;
	}
}
