package gradingProject;

public class grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declare and initialize the necessary variables.
		int testScores[] = {75, 95, 85, 55, 65, 70};
		double testWeights[] = {0.10, 0.20, 0.25, 0.25, 0.10, 0.10};
		int assignmentScores[] = {55, 65, 65, 60, 55, 50};
		double assignmentWeights[] = {0.05, 0.10, 0.15, 0.25, 0.25, 0.20};
		double testTotal = 0;
		double assignTotal = 0;		
		double testMult = 0;
		double assignMult = 0;
		double testSum = 0;
		double testAvg = 0;
		double masterAvg = 0;
		
		//Loop to get the weighted test averages.
		for(int i=0;i < testScores.length; i++)
		{
			testMult = (testScores[i] * testWeights[i]);
			testTotal += testMult;
			testSum += testTotal;
			testAvg = testSum / 6;
			
		}
		
		System.out.println("The weighted test score average is: " + testAvg);
		
		//Loop to get the weighted assignment averages.
		for(int j=0;j < assignmentScores.length; j++)
		{
			assignMult = (assignmentScores[j] * assignmentWeights[j]);
			assignTotal += assignMult;
		}
		
		System.out.println("The weighted assignment score average is: " + assignTotal);
		
		//Get the master average
		masterAvg = ((testAvg + assignTotal)/2);
		
		System.out.println("Master Average: " + masterAvg);
	}

}