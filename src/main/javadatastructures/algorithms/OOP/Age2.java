package javadatastructures.algorithms.OOP;


// Overloading with  constructor parameters
public class Age2 {
	
	public double a;
	
	public Age2( double _a) {
		
		
		a=_a;
	}
	
	public Age2(int year, int month) {
		
		a= year + month/12;
	}
	
	public double getAge() {
		
		return a;
	}

}
