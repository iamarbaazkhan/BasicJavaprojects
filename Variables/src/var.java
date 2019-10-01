
public class var {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                
		Dog obj1= new Dog();
		obj1.bark();
		obj1.walk();
		
		Dog obj2=new Dog("b","c");
	    System.out.println(obj2.breed);
	}
}

class Dog {
	
     String breed;
     String color;
     
     Dog(String b,String c)
     {
    	 breed=b;
    	 color=c;
     }

     Dog()
     {
    	 
     }


  void bark(){
	   System.out.println("hello ");
  }
  
  void walk(){
	  System.out.println("wassup");
  }
}