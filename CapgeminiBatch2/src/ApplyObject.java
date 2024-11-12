
public class ApplyObject {

	@SuppressWarnings({ "unlikely-arg-type", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create onj of APPLYOBJECT CLASS
		ApplyObject obj= new ApplyObject();
		ApplyAbstract abs= new ApplyAbstract();
		boolean sts= obj.equals(abs);
		System.out.println("are they same: "+sts);
		System.out.println("======================");
		Class name_class=obj.getClass();
		Class name_class1=abs.getClass();

		System.out.println("class is: "+name_class);
		System.out.println("class is: "+name_class1);
		System.out.println("============================================");
		int hash_code= obj.hashCode();
		int hash_code1= abs.hashCode();
		System.out.println("hash code value of ApplyAbstract is::"+hash_code1);
		System.out.println("hash code value of ApplyObject is::"+hash_code);
		System.out.println("==============================================");
		String String_obj=obj.toString();
		String String_abs= abs.toString();
		System.out.println(" Convert obj to string is: "+ String_obj);
		System.out.println(" Convert obj to string is: "+ String_abs);


		







	}

}
