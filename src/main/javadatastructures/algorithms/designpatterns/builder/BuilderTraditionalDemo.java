package javadatastructures.algorithms.designpatterns.builder;

import javadatastructures.algorithms.designpatterns.builder.traditional.CheapComputerBuilder;
import javadatastructures.algorithms.designpatterns.builder.traditional.Computer;
import javadatastructures.algorithms.designpatterns.builder.traditional.ComputerDirector;
import javadatastructures.algorithms.designpatterns.builder.traditional.ExpensiveComputerBuilder;

public class BuilderTraditionalDemo {

	public static void main(String[] args) {

		ComputerDirector computerDirector = new ComputerDirector(new CheapComputerBuilder());
		computerDirector.setComputerBuilder(new CheapComputerBuilder());
		computerDirector.buildComputer();
		Computer computer = computerDirector.getComputer();
		System.out.println(computer);

		computerDirector.setComputerBuilder(new ExpensiveComputerBuilder());
		computerDirector.buildComputer();
		computer = computerDirector.getComputer();
		System.out.println(computer);

	}

}
