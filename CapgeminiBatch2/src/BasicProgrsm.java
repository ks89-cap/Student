
public class BasicProgrsm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar= {25,30,35,50,65};
		int search_element=35;
		boolean res=false;
		for(int i=0;i<ar.length;i++)
		{
			if(search_element==ar[i])
			{
			System.out.println("element is at index :" +i);
			res=true;
			break;
		}
		}
 

	if(res==false)
	{
		System.out.println("element not found");
	}

}
}
