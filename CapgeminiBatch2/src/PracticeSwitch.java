
public class PracticeSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=3;
		String level="";
		switch(i)
		{
		case 1:level="Beginner";
		System.out.println("it is beginner");
		break;
		case 2:level="Intermediate";
		System.out.println("it is Intermediate");
		break;
		case 3:level="Expert";
		System.out.println("it is Expert");
		break;
		default:
			System.out.println("invalid");
		
		}
		System.out.println(level);
	}

}
