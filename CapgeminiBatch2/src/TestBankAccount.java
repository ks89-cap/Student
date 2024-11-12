
public class TestBankAccount {

	public static void main(String[] args) {
		
		/*
		 * LoginCredentials login= new LoginCredentials();
		login.setUserId("Capgemini@gmail.com");
		login.setPassword("123456");
		String id_login=login.getUserId();
		System.out.println(id_login);
		String pass=login.getPassword();
		System.out.println(pass);
		 */
		// TODO Auto-generated method stub
		//TestBankAccount acc= new TestBankAccount();
		BankAccount bank= new BankAccount();
		bank.setAccnt_no(123456678);
		bank.setBalance(5000);
		Integer b_acc= bank.getAccnt_no();
		Integer bal= bank.getBalance();
		System.out.println(b_acc);
		System.out.println(bal);

	

	}

}
