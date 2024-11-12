
public class Document implements Search_Interface {

	@Override
	public boolean search(String value) {
		// TODO Auto-generated method stub
		return value.contains("Capgemini");
	}
	

}
