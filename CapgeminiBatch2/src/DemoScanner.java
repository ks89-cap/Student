import java.util.Scanner;

public class DemoScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Scanner class used in java
 * it is the part of java.util
 * converted into its type by using next() method
 * cntrl+shift+o ---> to import the package
 */
		/*Scanner sc= new Scanner(System.in);
		System.out.println("enter training loc");
		String name_loc=sc.next();
		System.out.println("location:"+name_loc);
		System.out.println("==============================");
		System.out.println("enter id of location:");
		Integer id_loc=sc.nextInt();
		System.out.println("id of location:"+id_loc);
		sc.close();		*/
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the numbers");
		Integer num1=sc.nextInt();
		Integer num2=sc.nextInt();
		int num3= num1+num2;
		System.out.println("sum is:"+num3);
		sc.close();		
	}

}
