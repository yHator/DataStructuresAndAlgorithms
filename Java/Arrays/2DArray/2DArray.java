import java.util.*;

class TwoDArray {
	
	public static void main (String[] args) 
	{
		int[][] arr= new int[2][2]; //2x2
		System.out.println("Add a value: ");
	    Scanner in = new Scanner(System.in);
		int inputNum;

		try 
        {
			inputNum = in.nextInt();

			System.out.println("Inserting values...");
			for (int row = 0; row < arr.length; row++)
			{
                for(int col = 0; col < arr[row].length; col++)
                {
                    arr[row][col] = inputNum--;
				    System.out.println("arr["+row+"]["+col+"]="+ arr[row][col]);
                }
			}
		}
		catch (NumberFormatException ex) 
        {
			//Don't break my code, jerk!
			
		}
		
	}			
}
