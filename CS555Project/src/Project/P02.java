/*
 * This is the same file as P02
 * It is upload to github repository JermaineDing/CS555
 */
package Project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class P02 {

	public static void main(String[] args) throws FileNotFoundException {
		BufferedReader lineReader = new BufferedReader (new FileReader("Family Tree.ged"));
		String lineText = null;
		String [] tags = {"INDI", "NAME", "SEX", "BIRT", "DEAT", "FAMC", "FAMS", "FAM", "MARR",
				"HUSB", "WIFE", "CHIL", "DIV", "DATE", "HEAD", "TRLR", "NOTE"};
		try {
			while((lineText = lineReader.readLine()) != null){
				System.out.print("Line:");
				System.out.println(lineText);
				System.out.print("Level Number:");
				System.out.println(lineText.charAt(0));
				int flag = 0;
				for(int i=0; i<tags.length; i++){
					String s = tags[i];
					if(lineText.contains(s)){
						flag = 1;
						System.out.print("Tag Info:");
						System.out.println(s);
					}
					else{
						continue;
					}
				}
				if(flag == 0){
					System.out.print("Tag Info:");
					System.out.println("Invalid Tag");
				}
			}
		} catch (IOException e) {
			System.out.println("Exception happened!");
		}
	}

}

