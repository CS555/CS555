package Project;

import java.io.*;
import Project.P03_SaveInfo;

public class P03_PrintInfo {
	public static void main(String args[]) throws IOException {
		P03_SaveInfo gedcom = new P03_SaveInfo(); 
		gedcom.readFile("Family Tree_Git.ged"); 
		System.out.println("Individuals Info:");
		gedcom.print_individual();
		System.out.println();
		System.out.println("Family Info:");
		gedcom.print_family();
	}
}
