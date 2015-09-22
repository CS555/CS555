package Project;

import java.io.*;
import Project.ProcessData;

public class PrintData {
	public static void main(String args[]) throws IOException {
		ProcessData ged = new ProcessData(); 
		ged.readFile("My Family.ged"); 
		System.out.println("Individuals Info:");
		ged.print_individual();
		System.out.println();
		System.out.println("Family Info:");
		ged.print_family();
	}
}
