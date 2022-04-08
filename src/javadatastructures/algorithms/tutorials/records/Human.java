package javadatastructures.algorithms.tutorials.records;

import javadatastructures.algorithms.tutorials.interfaces.Gender;

public record Human(String name, float height, int age, Gender gender) {

	public Human(String name, int age) {
		this(name, age, 0, null);
	}

	//private static final int LIFESPAN = 100;
	
	

}
