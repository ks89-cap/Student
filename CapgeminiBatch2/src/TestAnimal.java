
public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Cat ct= new Cat();
		ct.eat();
		ct.roam();
		ct.sleep();
		ct.sound();
System.out.println("=======================");
Dog dg= new Dog();
dg.eat();
dg.roam();
dg.sleep();
dg.sound();
*/
		//POLYMORPHIC REFERENCES
		
		Animal[] a= new Animal[2];
		a[0]= new Dog();
		a[1]= new Cat();
		for(int i=0;i<a.length;i++)
		{
			a[i].eat();
			a[i].sleep();
			a[i].sound();
		}

	}

}
