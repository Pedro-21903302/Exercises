package DailyCoding;

public class solve29_8_21 {
	
	
	public static class pair {
		int a;
		int b;
		
		pair(int a, int b)
		{
			this.a = a;
			this.b = b;
		}
	}

	public static pair cons(int a , int b)
	{
		pair solve = new pair(a,b);
		return solve;
	}
	
	public static int car(pair a)
	{
		return a.a;
	}
	
	public static int cdr(pair a)
	{
		return a.b;
	}
	public static void main(String[] args)
	{
		System.out.println(car(cons(3, 4)));
		System.out.println(cdr(cons(3, 4)));
	}
}
