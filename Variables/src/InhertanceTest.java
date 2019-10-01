
public class InhertanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C1 obj1=new C1();
		obj1.m1();
		obj1.m2();
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		
		C2 obj2= new C2();
	}
}
	class C1
	{
	   
		int a=1;
		int b=2;
		
		void m1()
		{
			System.out.println("m1 is method");
		}
		
		void m2()
		{
			System.out.println("m1 is also method ");
		}
	}
	
	

class C2 extends C1 
{
	
}
