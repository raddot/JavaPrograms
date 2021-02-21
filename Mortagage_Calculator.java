import java.text.NumberFormat;
import java.util.*;

public class Mortagage_Calculator {
	public static void main(String[] args)
	{
		int principal=0,numberOfPayments=0;
		float roi,monthlyInterest=0;
		byte years;
		double mortagage;
		final byte MONTHS_IN_YEAR = 12;
		final byte PERCENT = 100;
		
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter principal -> ");
			principal = sc.nextInt();
			if(principal >= 1000 && principal <= 1_000_000)
			{
				break;
			}
			else
			{
				System.out.println("Please enter a value between 1000 and 1000000");
			}
		}
		while(true)
		{
			System.out.println("Enter Rate of Interest -> ");
			roi = sc.nextFloat();
			if(roi >= 1 && roi <= 30)
			{
				monthlyInterest = (roi)/PERCENT/MONTHS_IN_YEAR;
				break;
			}
			else
			{
				System.out.println("Enter a value between 1 and 30");
			}
		}
		
		while(true)
		{
			System.out.println("Enter time period (in years) ->");
			years = sc.nextByte();
			if(years >= 1 && years <= 30)
			{
				numberOfPayments = years * MONTHS_IN_YEAR;
				break;
			}
			else
			{
				System.out.println("Please enter the value between 1 and 30");
			}
		}
		
		mortagage = principal * (monthlyInterest * Math.pow(1+ monthlyInterest, numberOfPayments))/(Math.pow(1+monthlyInterest, numberOfPayments)-1);
		
		String mortagage_formatted = NumberFormat.getCurrencyInstance().format(mortagage);
		System.out.println("Mortagage -> "+mortagage_formatted);
	}
}
