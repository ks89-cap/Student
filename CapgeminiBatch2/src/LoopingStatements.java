
public class LoopingStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Looping statements
		 * while(expression)//true
		 * {
		 *  statement
		 * }
		 * 
		 * do{
		 * statement
		 * }
		 * while(expression)
		 */
	//int n=5;
		/*while(i<=5)
		{
			//System.out.print(i);
			System.out.println("selenium java");
			i++; //increment
		}*/
		/*do
		{
			System.out.println("selenium java");
			i++;
		}while(i<=5);
*/
		/*for(int i=1; i<=n;i++)
		{
			//System.out.println(i);
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");	
			}
			System.out.println(" ");
		}*/
	
		/*
		 * Jumping statements in java
		 * RETURN
		 * BREAK
		 * CONTINUE
		 * */
	for(int i=1;i<=5;i++)
	{
		if(i==3)
		{
			continue;
		}
		System.out.println(i);
	}
	}

}
