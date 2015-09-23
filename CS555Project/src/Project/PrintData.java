package Project;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import Data.Individual;
import Project.ProcessData;

public class PrintData {
	public static void main(String args[]) throws IOException {
		ProcessData ged = new ProcessData(); 
		ged.readFile("My Family.ged"); 
	//	System.out.println("Individuals Info:");
	//	ged.print_individual();
	//	System.out.println();
	//	System.out.println("Family Info:");
	//	ged.print_family();
		
		
		Vector<String> s = new Vector<String>();
		s.add("Individuals Info:");
		s.addAll(ged.print_individual());
		PrintWriter writer = new PrintWriter("the-file-name.txt", "UTF-8");
		while(s.size()>0)
		{
		    writer.write(s.firstElement());
		    writer.println();
		    s.removeElementAt(0);
		}
		s.add("");
		s.add("Family Info");
		s.addAll(ged.print_family());
		while(s.size()>0)
		{
		    writer.write(s.firstElement());
		    writer.println();
		    s.removeElementAt(0);
		}
		writer.close();
		
		
		
	}
}
