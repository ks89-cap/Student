
public class TestBank extends Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// test bank class is concrete clas as u may create obj of that class
		TestBank bank= new TestBank();
		bank.rateInterest();
	}

	@Override
	void rateInterest() {
		// TODO Auto-generated method stub
		System.out.println("Rate of intererst: 8%");
		
		
	}

}
