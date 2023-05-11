package cse12pa4student;

import java.util.List;
import static cse12pa4mysteries.Mysteries.*;
import runtime.*;

public class Measure {


	public static String measurementsToCSV(List<Measurement> toConvert) {
		/** TODO **/
		return null;
	}
	
	/* Add any helper methods you find useful */
	public static List<Measurement> measure(String[] toRun, int startN, int stopN){
		//List<Measurment> measures = new ArrayList<Measurment>();
		for(String s : toRun) {
			char c = s.charAt(0);
			for(int i = startN; i <= stopN; i++) {
				long start = System.nanoTime();
				mystery(c, i);
				long end = System.nanoTime();
				Measurement m = new Measurement(s, i, end - start);
			}
		}
		return null;
	}
	
	public static void mystery(char ch, int val) {
		switch(ch) {
		case 'A':
			mysteryA(val);
			return;
		case 'B':
			mysteryB(val);
			return;
		case 'C':
			mysteryC(val);
			return;
		case 'D':
			mysteryD(val);
			return;
		case 'E':
			mysteryE(val);
			return;
		case 'F':
			mysteryF(val);
			return;
		}
	}
		
}
