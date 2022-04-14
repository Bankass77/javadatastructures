package javadatastructures.algorithms.tutorials.sealed.copy;

import javadatastructures.algorithms.tutorials.interfaces.Gender;

public non-sealed class Engineer extends Human{

	public Engineer(String name, int age, float height) {
		super(name, age, height);
		
	}

	
	public Engineer(String name, int age, float height, Gender gender) {
		
		super(name, age, height, gender);
	}
	
}
