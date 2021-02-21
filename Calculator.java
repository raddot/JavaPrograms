import java.util.*;

public class Calculator {
	public static void main(String[] args)
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		float number1,number2;
		System.out.println("Enter number1 ->");
		number1 = sc.nextFloat();
		
		System.out.println("Enter number2 ->");
		number2 = sc.nextFloat();
		
		System.out.println("You have entered numbers ->");
		System.out.println("Number1 is -> "+number1);
		System.out.println("Number2 is -> "+number2);
		
		do
		{
			System.out.println("Enter your choice ->");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Modulus Operation");
			System.out.println("6. Exit");
			choice = sc.nextInt();
			switch(choice)
			{
				case 1 :
					System.out.println("Addition of numbers is -> "+ (number1 + number2));
					break;
				case 2 :
					System.out.println("Subtraction of numbers is -> "+ (number1 - number2));
					break;
				case 3:
					System.out.println("Multiplication of numbers is -> "+(number1 * number2));
					break;
				case 4 :
					System.out.println("Division of numbers is ->"+(number1 / number2));
					break;
				case 5 :
					System.out.println("Modulus of two numbers is ->"+(number1 % number2));
					break;
				case 6 :
					return;
			}
		}
		while(choice!=0);
	}
}
