package csa12pa4mysteries;
/* 
 * DO NOT MODIFY
 * Class definition to assist in measuring method execution time 
 */



public class Measurement {
	public final String name;               //name of mystery method
	public final int valueOfN;              //input value to method
	public final long nanosecondsToRun;     //execution time in ns
	
	/* Constructor */
	public Measurement(String name, int valueOfN, long nanosecondsToRun) {
		this.name = name;
		this.valueOfN = valueOfN;
		this.nanosecondsToRun = nanosecondsToRun;
	}

	@Override
	public String toString() {
		return  "\nMeasuring:\t" + name +
				"\nInput value:\t" + valueOfN +
				"\nTime taken:\t" + nanosecondsToRun + "ns\n";
	}
}
