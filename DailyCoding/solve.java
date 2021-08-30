package DailyCoding;

import java.util.*;


public class solve {
	public static void main(String[] args)
	{
		Scanner myScanner = new Scanner(System.in);
		int k = myScanner.nextInt();
		
		int[] numbersArray = {10,15,3,7};
		HashSet<Integer> numbersHash = new HashSet<Integer>();
		
		if(contains(numbersArray,numbersHash,k)) {
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
