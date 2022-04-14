package javadatastructures.algorithms.array;

public class MatrixDemo {

	public static void main(String[] args) {
	
		int intMatrix [][]= {{1,0}, {0,1}};
		
		int [][] intMatrix2= new int [2][2];
		
		for (int i = 0; i < intMatrix2.length; i++) {
			
			for (int j = 0; j < intMatrix2[i].length; j++) {
				
				intMatrix2[i][j]=i+j;
				
				System.out.println(intMatrix[i][j] + " ");
			
				
			//System.out.println("["+i+" ,"+j+"]");
			}
			System.out.println();
		}
		

	}

}
