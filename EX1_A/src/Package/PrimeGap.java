package Package;
import java.util.Scanner;
public class PrimeGap {
	public static boolean IsPrime(int num)
	{
		for (int i = 2; i < num; i++) 
		{
			if(num%i==0)
				{return false;}	
		}
		return true;
	}

	public static void main(String[] args) 
	{
		System.out.println("Please enter a number and a gap");
		Scanner scan= new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		for (int i = 2; i <n; i++) 
		{
			if(IsPrime(i)&&IsPrime(i+m))
			{
				if(i+m<n)
					{System.out.print("("+i+","+(i+m)+")");}
			}
			
		}
		scan.close();
	}
}
