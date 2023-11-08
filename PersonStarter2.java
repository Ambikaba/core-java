class PersonStarter2{
	public static void main(String[] nnn){
		System.out.println("Starting main");
		Email[] email= new Email[4];
		
		email[0]=new Email("email.com",171,"anusha","Raj");
		email[1]=new Email("gmail.com",177,"Vani","Ved");
		email[2]=new Email("yahoo.com",717,"Ram","leela");
		email[3]=new Email("facebook.com",771,"adarsh","arun");
		
		Person2 person = new Person2("Alok",email);
		person.displayInfo();
		
		System.out.println("Ending main");
	}
}