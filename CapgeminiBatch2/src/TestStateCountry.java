
public class TestStateCountry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		State st= new DisplayStateCountry(); // CALL THE CLASS WHICH CONTAINS THE METHOD TO PRINT THE VALUE
		String State = st.getCountryName("Capgemini");
		String Country= st.getStateName("Telengana");
		System.out.println(State);
System.out.println(Country);
		
	}

}
