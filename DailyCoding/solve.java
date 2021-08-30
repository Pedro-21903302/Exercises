/*
Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
 */

package DailyCoding;

import java.util.*;


public class solve {
	public static void main(String[] args)
	{
		
		int[] testArray = {10,15,3,7};
		
		//getting k such that a + b = k
		Scanner myScanner = new Scanner(System.in);
		int k = myScanner.nextInt();
		
		
		//Creating a hashmap, because hashmap has the lowest acess complexity
		//Looking for a number that equals == a - k
		HashSet<Integer> numbersHash = new HashSet<Integer>();
		
		if(contains(testArray,numbersHash,k)) {
			System.out.println("Contains");
		}
		else
		{
			System.out.println("Doesnt contain");
		}
		
	}
	
	public static boolean contains(int[] numbersArray,HashSet<Integer> numbersHash, int number) 
	{
		for(int s : numbersArray)
		{
			//Check if the hashmap as a - k
			//Else add the current number to the hash
			if(numbersHash.contains(number - s))
			{
				return true;
			}
			else
			{
				numbersHash.add(s);
			}
		}
		return false;
	}
	
}
