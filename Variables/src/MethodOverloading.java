
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A1 obj1=new A1();
		obj1.m1(22);
		obj1.m1(2.099);
	}
}

	
	class A1{
		 void m1(int a)
		 {
			 System.out.println("value"+a);
		 }
		 
		 void m1(double a)
		 {
			 System.out.println("value"+a);
		 }
	}

