import java.util.*;

public class FizzBuzz {
	public static void main(String[] args)
	{
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ->");
		number = sc.nextInt();
		if(number % 5 == 0 && number % 3 == 0)
		{
			System.out.println("FizzBuzz");
		}
		else if(number % 5 == 0)
		{
			System.out.println("Fizz");
		}
		else if(number % 3 == 0)
		{
			System.out.println("Buzz");
		}
		else
		{
			System.out.println(number);
		}
		
	}
}
