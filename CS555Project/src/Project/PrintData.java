package Project;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;

public class PrintData {
	public static void main(String args[]) throws IOException {
		
		// read GEDCOM file in local
		ProcessData ged = new ProcessData(); 
		ged.readFile("My Family.ged"); 
		
		// output result for sprint 1 and sprint 2 to output.txt file
		Vector<String> s = new Vector<String>();
		s.add("Individuals Info:");
		s.addAll(ged.print_individual());
		PrintWriter writer = new PrintWriter("Output.txt", "UTF-8");
		while(s.size()>0)
		{
		    writer.write(s.firstElement());
		    writer.println();
		    s.removeElementAt(0);
		}
		s.add("");
		s.add("");
		s.add("");
		s.add("Family Info");
		s.addAll(ged.print_family());
		while(s.size()>0)
		{
		    writer.write(s.firstElement());
		    writer.println();
		    s.removeElementAt(0);
		}			
		System.out.println("Result is printed to Output.txt file.");
		writer.close();		
	}
}
