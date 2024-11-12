//WRONG CODE

import java.util.HashSet;

public class HashSetExample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs= new HashSet<>();
		hs.add("Java");
		hs.add("c#");
		hs.add("Python");
		hs.add("Ruby");
		hs.add("Java");
		hs.add("Python");

		System.out.println(hs);
		Object[] array = hs.toArray();
		boolean a=false;
		

	
		for(int i=0;i<array.length;i++)
			
		{
			System.out.println(array[i]);
			for(int j=i+1;j<array.length;j++)
				
			{
				if(array[i]==array[j])
				{
					System.out.println("dupliactes found"+array[i]);
					a=true;
					

				}
				
				
			}
			
		}
		if(a==false)
		{
			System.out.println("no duplicates found:");
		}
		}

  

	}


