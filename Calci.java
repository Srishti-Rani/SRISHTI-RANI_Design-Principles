package calculator;
import calculator.*;
import java.util.*;
import java.lang.*;
class Calci
{
	public static void main(String[] args)
	{
		
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the numbers : ");
		int num1 = ob.nextInt();
		int num2 = ob.nextInt();
		System.out.println("Enter an operator (+, -, *, /) : ");
        	char operation = ob.next().charAt(0);
		Calculator obj = new Calculator(num1,num2,operation);
		obj.calculate();
	}
}