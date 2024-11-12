
public class StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String methods
		 * charAt()
		 * compareTo()=> 0,1-1
		 * concat()
		 * contains() - boolean value
		 */
		String Training_assign="capgemini";
		char name_char=Training_assign.charAt(0);
		System.out.println(name_char);
		System.out.println("===========================");
		for(int i=0;i<Training_assign.length();i++)
		{
			System.out.print(Training_assign.charAt(i)+" ");
			

			
		}System.out.print(" \n");
		System.out.println("===================================== ");
		//compare strings

		String s1="selenium java";
		String s2="selenium java";
		String s3="selenium python";
		int match_s1_s2= s1.compareTo(s2);
		System.out.println(match_s1_s2);
		System.out.println(" ");
		int match_s2_s3=s2.compareTo(s3);
		System.out.println(match_s2_s3);
		System.out.println(" ");

		int match_s1_s3=s1.compareTo(s3);
		System.out.println(match_s1_s3);
		System.out.println("=========================================");
		String con_string=s1.concat(s3);
		System.out.println(con_string);
		System.out.println("=========================================");
		if(s1.contains(s3))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("false");

		}
		//equals(obj anObj)
		String email1="kp@gmail.com";
		String email2="k@gmail.com";
		if(email1.equals(email2))
		{
			System.out.println("it is equal");
		}
		else
		{
			System.out.println("it is not equal");

		}
		System.out.println("=========================================");

		//format string in java
		String lan="java";
		String res_format= String.format("selenium:  %s", lan);
		System.out.println(res_format);
		System.out.println("=========================================");

		
		//hashcode
		int hashCode_language=lan.hashCode();
		System.out.println(hashCode_language);
		System.out.println("=========================================");

		
		//indexOf
		int index_Of_Lang=lan.indexOf('J');
		System.out.println(index_Of_Lang);
		System.out.println("=========================================");
		
		 //isEmpty
		if(lan.isEmpty())
		{
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		System.out.println("=========================================");
		
		//replace character using replace method
		String nw=lan.replace('j','M');
		System.out.println(nw);
		String mv="123_demo";
		String reg="^[0=9]";
		String new1=mv.replaceAll(reg,"");
		System.out.println(new1);
		System.out.println("=========================================");
		
		//substring java
		String training= "java and selenium";
		String data= training.substring(0,6);
		System.out.println(data);
		



			

	}

}
