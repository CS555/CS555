package Project;

import java.io.*;
import Project.P03_SaveInfo;

public class P03_PrintInfo {
	public static void main(String args[]) throws IOException {
		P03_SaveInfo ged = new P03_SaveInfo(); 
		ged.readFile("Family Tree_Git.ged"); 
		System.out.println("Individuals Info:");
		ged.print_individual();
		System.out.println();
		System.out.println("Family Info:");
		ged.print_family();
	}
}
