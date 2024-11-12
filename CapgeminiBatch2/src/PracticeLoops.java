
public class PracticeLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Display odd numbers from 1 to 100*/
		System.out.println("odd numbers between 1 and 100:");
		/*for(int i=1;i<=100;i++)
		{
			if(i%2!=0)
			{
				System.out.print(i+ "");
			}*/
		
		int i=1;
		/*while(i<=100)
		{
			if(i%2!=0)
			{
				System.out.print(i+ ","+" ");
			}
			i++;
		}*/
	/*	do
		{
			if(i%2!=0)
			{
				System.out.print(i+ ","+" ");
			}
			i++;
		}while(i<=100);
		*/
		int sum=0;
		/*for(i=1;i<=100;i++)
		{
			if(i%2!=0)
			{
				sum+=i;
				
			}
			i++;
			
		}
		System.out.println(sum);
		*/
		
		/*while(i<=100)
		{
			if(i%2!=0)
			{
				sum+=i;
				
			}
			i++;
		}
		System.out.println(sum);	*/
		
		do {
			if(i%2!=0)
			{
				sum+=i;
				
			}
			i++;
			
		}
		while(i<=100);
		System.out.println(sum);    
		
		
		
		

	}

}
