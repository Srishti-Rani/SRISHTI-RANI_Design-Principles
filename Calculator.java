package calculator;
class Calculator
{
	double a,b,result;
	char operation;
	Calculator(double a,double b, char operation)
	{
		this.a = a;
		this.b = b;
		this.operation = operation;
	}
	private double add(double a,double b)
	{
		return a+b;
	}
	private double sub(double a,double b)
	{
		return a-b;
	}
	private double mult(double a,double b)
	{
		return a*b;
	}
	private double div(double a,double b)
	{
		return a/b;
	}
	public double calculate()
	{
		switch(operation)
		{
			case '+':
				result = add(a,b);
				break;
			case '-':
				result = sub(a,b);
				break;
			case '*':
				result = mult(a,b);
				break;
			case '/':
				result = div(a,b);
				break;
				// operator doesn't match any case constant (+, -, *, /)
			default:
				System.out.printf("Error! operator is not correct");
				//return 0;
		}
		System.out.printf("%.1f %c %.1f = %.1f\n", a, operation, b, result);
		return 0;
	}
}