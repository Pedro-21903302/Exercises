package DailyCoding;
import java.util.*;

public class solve26_8_21 {
	
	public static int[] getInputArray() {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Array size:");

		int arraySize = myObj.nextInt();
		int[] array = new int[arraySize];
		for(int  pos = 0; pos < arraySize; pos++)
		{
			array[pos] = myObj.nextInt();
		}
		return array;
	}
	
	
	public static int[] calculateArray(int[] array){
		int[] powerArray = new int[array.length];
		
		boolean first = true;
		int pos = 0;
		for(int x : array)
		{
			if(first)
			{
				powerArray[pos] = x;
				first = false;
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
