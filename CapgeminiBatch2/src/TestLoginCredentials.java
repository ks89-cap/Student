
public class TestLoginCredentials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * LoginCredentials create object of it
		 */
		LoginCredentials login= new LoginCredentials();
		login.setUserId("Capgemini@gmail.com");
		login.setPassword("123456");
		String id_login=login.getUserId();
		System.out.println(id_login);
		String pass=login.getPassword();
		System.out.println(pass);
		

	}

}
