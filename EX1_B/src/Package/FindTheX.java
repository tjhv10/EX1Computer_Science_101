package Package;

import java.util.Scanner;

public class FindTheX {

	public static void Findx(double a, double b,double c)
	{
		double d=b*b-4*a*c;
		if(a==0&&b==0&&c==0)
			System.out.println("X takes all value");
		else if(a==0&&b!=0)
		{
			System.out.println(-1*c/b);
		}
		if(d<0||a==0&&b==0&&c!=0)
		{
		  System.out.println("No solution");	
		}
		else if(d==0)
		{
			System.out.println(-1*b/2*a);
		}
		else
		{
			System.out.println((-b+ Math.sqrt(d) )/2*a+" "+(-b-Math.sqrt(d))/2*a);
		}
	}

	public static void main(String[] args) {
		int exitOrStay=1;
		Scanner scan = new Scanner(System.in);
		while(exitOrStay==1)
		{
		System.out.println("Please enter the numbers for the formula");
        double a=scan.nextDouble(),b=scan.nextDouble(),c=scan.nextDouble();
        Findx(a,b,c);
        System.out.println("If you want to do it again insert 1. If you want to exit insert 0.");
        exitOrStay= scan.nextInt();
		}
		scan.close();
	}

}
