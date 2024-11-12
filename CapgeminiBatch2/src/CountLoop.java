
public class CountLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=0;
		int i=1;
		/*for(i=1; i<=100; i++)
		{
			if(i%2==0)
			{
				count++;
			}
			
		}System.out.println(count);    */
		
		/*while(i<=100)
		{
			if(i%2==0)
			{
				count++;
			}
			i++;
		}
		System.out.println(count);   */
		
		do {
			if(i%2==0)
			{
				count++;
			}
			i++;
		}while(i<=100);
		System.out.println(count);  
		
		
		

	} 
		

}
