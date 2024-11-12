
public class Dept_Constr extends Company_Constr{
int dept_id;
String dept_name;

	public Dept_Constr(int dept_id, String dept_name)
	{
		this.dept_id=dept_id;
		this.dept_name= dept_name;	
	}
	public Dept_Constr()
	{
		super();
	}

}
