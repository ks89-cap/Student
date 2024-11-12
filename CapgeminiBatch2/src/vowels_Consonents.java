
public class vowels_Consonents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Automation Testing using Selenium and Java ";
		int vowel=0;
		int consonent=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a' ||s.charAt(i)=='A'||s.charAt(i)=='e'||s.charAt(i)=='E'|| s.charAt(i)=='i'||s.charAt(i)=='I'|| s.charAt(i)=='o'||s.charAt(i)=='O'|| s.charAt(i)=='u'||s.charAt(i)=='O')
			{
				vowel++;
			}
			else {
				consonent++;
			}
			
		}
		System.out.println("count of vowel: "+vowel);
		System.out.println("count of consonent: "+ consonent);
		

	}

}
