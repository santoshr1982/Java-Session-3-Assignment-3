package Random.Numbers;

import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {

	int iN;										//Declaration of variables.
	public void RandomNos(int iB)
	{
		iN = iB;								//Declaration of variables.
		Random R = new Random();
		for(int i=0; i<=iN -1; i++)				// for loop to control the range of random numbers generated.
		{
			
			System.out.println(R.nextInt(iN));	// Creating random numbers.
			
		}
	}
	
	public static void main(String[] args) {
	
		int iA;									//Declaration of variables.
		Scanner sC = new Scanner(System.in);	//Declaration of object for input.
		
		System.out.println("Enter the range of random numbers required:"); //Printing the request for range.
		iA = sC.nextInt();													// Accepting input.
		
		RandomNumbers Rn = new RandomNumbers();		// Creating an object for class.
		Rn.RandomNos(iA);							// Calling method from class.
	
	}

}
