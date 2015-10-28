package Project;

public class Helper {
	public int transfMon(String mon) {
		if(mon.equals("JAN"))
			return 1;
		else if(mon.equals("FEB"))
			return 2;
		else if(mon.equals("MAR"))
			return 3;
		else if(mon.equals("APR"))
			return 4;
		else if(mon.equals("MAY"))
			return 5;
		else if(mon.equals("JUN"))
			return 6;
		else if(mon.equals("JUL"))
			return 7;
		else if(mon.equals("AUG"))
			return 8;
		else if(mon.equals("SEP"))
			return 9;
		else if(mon.equals("OCT"))
			return 10;
		else if(mon.equals("NOV"))
			return 11;
		else
			return 12;
	}
}
