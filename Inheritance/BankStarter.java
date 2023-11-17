class BankStarter{

public static void main(String[] args)
{
System.out.println("starting of BankStarter");

    Bank bank=new Bank();
	  Bank bank1=new Manager();
	  Bank bank2=new Accountant();
	  Bank bank3= new Cashier();
	
	Manager manager=new Manager();
	Manager manager1=new Accountant();	
	Manager manager2=new Cashier();
	
	Accountant accountant=new Accountant();
  Accountant accountant1=new Cashier();
	
	Cashier cashier=new Cashier();


System.out.println("Ending of BankStarter");
}
}