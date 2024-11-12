
public class TestATM {

	public static void main(String[] args) {
		ApplyAbstract result= new ApplyAbstract();
		int transaction_id=result.trans_id();
		System.out.println("traction id="+ transaction_id);
		System.out.println("============================");

		int withdraw_amt= result.withd_amt();
		System.out.println("withsraw amt="+ withdraw_amt);

		// TODO Auto-generated method stub

	}

}
