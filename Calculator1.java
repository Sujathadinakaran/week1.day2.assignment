package week1.day2.assignment;

public class Calculator1 
{
	//Declare variables within Methods
	//Addition Method
	public int add(int num1, int num2, int num3)
	{
		return(num1+num2+num3);
	}
	//Subtraction Method
	public int diff(int num1, int num2) 
	{
		return(num1-num2);
	}
	//Multiplication Method
	public double mul(double num1, double num2)
	{
		return(num1*num2);
	}
	//Division Method
	public float div(float num1, float num2)
	{
		if (num1!=0)
			return(num1/num2);
		else
			return 0;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//No Operation required
	}
}
