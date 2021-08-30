/*
 Given an array of integers, return a new array such that each element at index i of the new array is the product of all 
 the numbers in the original array except the one at i.
 
 Found solution: Create two arrays 
 Such that 	X = input array
 			A = {x0,A0 *x1,A1 *x2 ... An-1 * xn}
			B = {xn, B0  *xn-1, ..... Bn-1 * x0}
			
 */


package DailyCoding;
import java.util.*;

public class solve26_8_21 {
	
	public static int[] getInputArray() {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Array size:");

		int arraySize = myObj.nextInt();
		int[] array = new int[arraySize];
		//FILL ARRAY
		for(int  pos = 0; pos < arraySize; pos++)
		{
			array[pos] = myObj.nextInt();
		}
		return array;
	}
	
	
	public static int[] calculateArray(int[] array){
		int[] powerArray = new int[array.length];
		
		int pos = 0;
		for(int x : array)
		{
			if(pos == 0)
			{
				powerArray[pos] = x;
			}
			else {
				powerArray[pos] = x * powerArray[pos-1];
			}
			pos++;
		}
		return powerArray;
	}
	
	public static int[] calculateArrayReverse(int[] array) {
		int[] powerArrayReverse = new int[array.length];
		
		boolean first = true;
		for(int pos = array.length - 1; pos >= 0; pos--) {
			if(first) {
				powerArrayReverse[pos] = array[pos];
				first = false;
			}
			else {
				powerArrayReverse[pos] = array[pos] * powerArrayReverse[pos+1];
			}

		}
		return powerArrayReverse;
	}
	
	
	public static int[] solvedArray(int[] arrayNormal, int[] arrayReverse) {
		int max = arrayNormal.length;
		int[] solvedArray = new int[max];
		
		for(int pos = 0; pos < solvedArray.length; pos++) {
			if(pos == 0 ) {
				solvedArray[0] = arrayReverse[1];
			}
			else if(pos == solvedArray.length -1) {
				solvedArray[solvedArray.length-1] = arrayNormal[solvedArray.length-2];
			}
			else {
				solvedArray[pos] = arrayNormal[pos-1] * arrayReverse[pos+1];
			}
		}
		
		
		return solvedArray;
		
	}
	
	
	public static void main(String[] args) {
		
		int[] array = getInputArray();
		System.out.println("Normal power Array:" + Arrays.toString(calculateArray(array)));
		System.out.println("Reversed power Array:" + Arrays.toString(calculateArrayReverse(array)));
		System.out.println("Solved power Array:" + Arrays.toString(solvedArray(calculateArray(array),calculateArrayReverse(array))));
		
	}
	
	

}
