
public class CheckInstance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckInstance name= new CheckInstance();
		System.out.println(name instanceof CheckInstance);
		String res= new String("Capgemini");
		boolean opt= res instanceof String;
		System.out.println(opt);
		String ipt= null;
		System.out.println(ipt instanceof String);
	}

}
