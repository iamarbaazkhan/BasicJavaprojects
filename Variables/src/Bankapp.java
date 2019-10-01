import java.util.Scanner;

public class Bankapp {

	public static void main(String[] args) {

		  Bankaccount obj1 =new Bankaccount("100000","Arbaaz");
		  obj1.showMenu();
	
	}

}

class Bankaccount
{
	int balance;
	int previoustransaction;
	String customerid;
	String customername;
	
	Bankaccount(String cname,String cid)
	{
		customerid=cname;
		customername=cid;
	}
	
	void deposit(int amount)
	{
		if(amount!=0)
			balance =balance +amount;
		    previoustransaction=amount ;
	}
	
	void withdraw(int amount)
	{
	     if(amount!=0)
	     {
	    	 balance =balance-amount;
	    	 previoustransaction=-amount; 
	     }
	    	 
	}
	
	void getPreviousTransaction()
	{
		 if (previoustransaction >0)
		 {
			 System.out.println("Deposited:"+previoustransaction);
		 }
		 else if(previoustransaction<0)
		 {
			 System.out.println("Withdrawn:" +Math.abs(previoustransaction) );
		 }
		 else{
			 System.out.println("No transaction occured ");
		 }
	}
	
	void showMenu()
	{
		 char option='\0';
		 Scanner scanner= new Scanner(System.in);
		 
		 System.out.println("Welcome"+customername);
		 System.out.println("Your Id is "+customerid);
		 System.out.println("\n");
		 System.out.println("A:CheckBalance");
		 System.out.println("B:Deposit");
		 System.out.println("C:Withdraw");
		 System.out.println("D:Previous Transaction");
		 System.out.println("E:Exit");
		 
		 do 
		 {
			 System.out.println("=============================================");
			 System.out.println("Enter a option ");
			 System.out.println("=============================================");
			 option=scanner.next().charAt(0);
			 System.out.println("\n");
			 
			 switch(option)
			 {
			     
			 case 'A':
				 System.out.println("-----------------------");
				 System.out.println("balance=" +balance);
				 System.out.println("-----------------------");
				 System.out.println("\n");
				 break;
				 
			 case 'B':
				 System.out.println("------------------------");
				 System.out.println("Enter the amount to deposit:");
				 System.out.println("-------------------------");
				 int amount=scanner.nextInt();
				 deposit(amount);
				 System.out.println("\n");
				 break;
				 
			 case 'C':
				 System.out.println("-------------------------");
				 System.out.println("Enter the amount to withdraw");
				 System.out.println("--------------------------");
				 int amount2= scanner.nextInt();
				 withdraw(amount2);
				 System.out.println("\n");
				 break;
				 
			 case 'D':
				 System.out.println("----------------------------");
			      getPreviousTransaction();
			      System.out.println("---------------------------");
			      System.out.println("\n");
			      break;
			      
			      
			 case 'E':
			 System.out.println("***********************");
			 break;
			 
			 
			 }
		 }while(option!='E');{
			 
			 System.out.println("Thank you for using our services ");
		 }
		 
		 
		 
		 
	}
	
	
}