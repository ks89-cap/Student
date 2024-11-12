
public class Test_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Document doc = new Document();
		boolean sts= doc.search("Capgemini");
		System.out.println(sts);
		System.out.println("========================");
		WebApp web= new WebApp();
		boolean sos= web.search("hello");
		System.out.println(sos);



	}

}
