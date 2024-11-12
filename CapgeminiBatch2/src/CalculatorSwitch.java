import java.util.Scanner;

public class CalculatorSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner sc= new Scanner(System.in);
		System.out.println("enter the numbers");
		Integer num1=sc.nextInt();
		Integer num2=sc.nextInt();
		int num3= num1+num2;
		System.out.println("sum is:"+num3);
		sc.close();	
		*/
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the first num");
		Integer num1=sc.nextInt();
		System.out.println("enter the second num");
		Integer num2= sc.nextInt();
		System.out.println("enter the operator");
		String operator= sc.toString();
		switch(operator)
		{
		case "+":
			System.out.println("addition:"+ (num1+num2));
		break;
		case "-":
			System.out.println("Subtraction:"+ (num1-num2));
		break;
		case "*":
			System.out.println("Multiply:"+ (num1*num2));
		break;
		case "/":
			System.out.println("Divide:"+ (num1/num2));
		break;
		default:
			System.out.println("Try again");
		break;
		
		}
sc.close();
	}

}
