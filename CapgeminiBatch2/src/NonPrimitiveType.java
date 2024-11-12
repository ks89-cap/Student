
public class NonPrimitiveType {
	public static void main(String[] args) {
		/*
		 * 1)Create an object of NonPrimitive DataType
		 * Class_name Reference_Name= new Class_Name();
		 * 
		 * 2)create an object of String class
		 *class_name reference_name="value"; //String Literals 
		 */
		
		String training_session="Capgemini";
		String location= new String("BENGALORE");
		System.out.println(location);
		System.out.println(training_session);
		System.out.println("------------------------");
		
		//Concatenate
		String result=training_session+""+location;
		System.out.println(result);
		
		
	}

}
