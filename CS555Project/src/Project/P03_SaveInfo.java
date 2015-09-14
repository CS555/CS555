package Project;

import Data.Family;
import Data.Individual;
import java.io.*;
import java.util.*;

public class P03_SaveInfo {

	List<Individual> individuals = new ArrayList<Individual>();
	List<Family> families = new ArrayList<Family>();

	// get arguments
	private String getArguments(String[] parseLine) {
		String arguments = "";
		for (int i = 2; i < parseLine.length; i++) {
			arguments = arguments + " " + parseLine[i];
		}
		return arguments.trim();
	}

	// get id
	private String getId(String Id) {
		return Id.replace("@", "");
	}

	// read from a file
	public void readFile(String file) throws IOException {

		FileInputStream fileInput = null;
		BufferedReader bufferRead = null;

		try {

			fileInput = new FileInputStream(file);
			bufferRead = new BufferedReader(new InputStreamReader(fileInput));
			System.out.println();

			String line = null;
			boolean isObject = false;
			Individual ind = null;
			Family fam = null;

			while ((line = bufferRead.readLine()) != null) {
				String[] parseLine = (line.split("\\s+"));// split the string
				int level = Integer.valueOf(parseLine[0]); // def for the value
				String tag = parseLine[1]; // def for tag
				String arguments = (parseLine.length > 2) ? getArguments(parseLine) : null;
				if (level == 0) {
					if ("INDI".equals(arguments)) {
						ind = new Individual();
						if (ind != null) {
							ind.setId(getId(tag));
							individuals.add(ind);
							isObject = true; // it's an individual or a family
						}
					} else if ("FAM".equals(arguments)) {
						fam = new Family();
						if (fam != null) {
							families.add(fam);
							fam.setId(getId(tag));
							isObject = true;
						}
					} else {
						isObject = false;
					}
				}
				if (isObject) {
					if ("NAME".equals(tag)) {
						ind.setName(arguments);
					}
					else if ("HUSB".equals(tag)) {
						fam.setHusband(getId(arguments));
					}
					else if ("WIFE".equals(tag)) {
						fam.setWife(getId(arguments));
					} else if ("SEX".equals(tag)) {
						ind.setSex(arguments.charAt(0));
					} else if ("DEAT".equals(tag)) {
						ind.setDeceased(arguments.charAt(0));
					}
				}
			}

		} catch (FileNotFoundException ex) {
			System.out.println("File is not found!");
		}
	}

	// get the info for individuals
	public String getIndividual(String id) {
		if (individuals != null && !individuals.isEmpty()) {															
			for (int i = 0; i < individuals.size(); i++) {
				Individual individualObject = individuals.get(i);
				if (individualObject.getId().equals(id)) { 
					return individualObject.getName(); 
				}
			}
		}
		return "No Individual Error!";
	}

	// print ID,name,in order
	public void print_individual() {
		if (individuals == null || individuals.isEmpty()) {
			System.out.println("No individuals!");
		} else {
			for (int i = 0; i < individuals.size(); i++) {
				Individual individualObject = individuals.get(i);
				System.out.println("ID: @" + individualObject.getId() + "@");
				System.out.println("Name: " + individualObject.getName());
				System.out.println();
			}
		}
	}

	// print Family ID and Husband,wife in order
	public void print_family() {

		if (families == null || families.isEmpty()) {
			System.out.println("No families!");
		} else {
			for (int i = 0; i < families.size(); i++) {
				Family familyObject = families.get(i);
				System.out.println("ID:@" + familyObject.getId() + "@");
				System.out.println("Husband: " + getIndividual(familyObject.getHusband()));
				System.out.println("Wife: " + getIndividual(familyObject.getWife()));
				System.out.println();
			}
		}
	}

}
