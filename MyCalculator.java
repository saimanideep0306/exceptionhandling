package calculator;
public class MyCalculator {
	public long power(int p, int n)
	{
		try
		{
			if(p==0 || n==0)
			{
				throw new Nutralvalue("Dont give P AND N values as zero");
			
			}
		}
		catch(Nutralvalue e) {
			System.out.println(e.getMessage());
		}
		try
		{
			if (p<0 || n<0)
			{
				throw new Nagitivevalue("Dont give P AND N values as -ve ");
			}
		}
		
		catch(Nagitivevalue q) {
			System.out.println(q.getMessage());
		}
		
		return (long) Math.pow(p,n);
		
	}
public static void main(String args[])
{
	MyCalculator value=new MyCalculator();
	System.out.println("p^n"+value.power(2,5));
}
}
