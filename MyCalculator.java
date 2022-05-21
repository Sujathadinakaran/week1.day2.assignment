package week1.day2.assignment;

public class MyCalculator {

	public static void main(String[] args) 
	{// TODO Auto-generated method stub
	//Create calc object to call the method
		
		Calculator1 calc = new Calculator1();
		System.out.println("Addition:" +calc.add(5, 6, 3));
		System.out.println("Subtraction:" +calc.diff(7, 4));
		System.out.println("Multiplication:" +calc.mul(5, 6));
		System.out.println("Division:" +calc.div(8.4f, 2.1f));
	}

}
