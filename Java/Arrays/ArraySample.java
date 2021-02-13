import java.util.*;

class ArraySample {
	
	public static void main (String[] args) 
	{
		int[] arr= new int[5];
		System.out.println("Add a value: ");
	    	Scanner in = new Scanner(System.in);
		int inputNum;
		try {
			inputNum = in.nextInt();

			System.out.println("Inserting values...");
			for (int i = 0; i < arr.length; i++)
			{
				arr[i] = inputNum;
				System.out.println("arr["+i+"]="+arr[i]);
			}
		}
		catch (NumberFormatException ex) {
			//Don't break my code, jerk!
			
		}
		
	}			
}
