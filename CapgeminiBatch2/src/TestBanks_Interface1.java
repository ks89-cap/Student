
public class TestBanks_Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * cerate an obj of axis and HDFC
		 */
		Axis axis= new Axis();
		int rate_interest=axis.rateOfInterest();
		System.out.println("ri::"+rate_interest);
		System.out.println("====================================");
		//sysout(b.pi);
		//sysout(b.comp_name);
		HDFC hdfc= new HDFC();
		int rate_interest_hdfc= hdfc.rateOfInterest();
		System.out.println("ri ::"+ rate_interest_hdfc);
		

	}

}
