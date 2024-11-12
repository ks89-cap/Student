import java.util.Scanner;

public class SampleAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 */
		int i=1;
		while(i<=5)
		{
			System.out.println("gemini");
			i++;
		}
		System.out.println("=======================");
		for(i=0;i<=5;i++)
		{
			System.out.println("hello");
		}
		System.out.println("=======================");
		Scanner sc= new Scanner(System.in);
		System.out.println("enter no:");

		int n=sc.nextInt(); //takes in the inputted value
		sc.close();
		for(int k=1;k<=n;k++)
		{
			System.out.println("good");
		}

		

	}

}
