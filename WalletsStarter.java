class WalletsStarter
{
	public static void main(String[] args)
	{
		System.out.println("Starting main in WalletsStarter");
		Wallets wallet=new Wallets();
		System.out.println("Wallets brand :"+wallet.brand);
		System.out.println("Wallets material :"+wallet.material);
		System.out.println("Wallets width :"+wallet.width);
		System.out.println("Wallets noOfCompartments :"+wallet.noOfCompartments);
		
		Wallets wallet1=new Wallets("SunShopping");
		System.out.println("Wallets1 brand :"+wallet1.brand);
		System.out.println("Wallets1 material :"+wallet1.material);
		System.out.println("Wallets1 width :"+wallet1.width);
		System.out.println("Wallets1 noOfCompartments :"+wallet1.noOfCompartments);
		
		Wallets wallet2=new Wallets("gullak","plastic");
		System.out.println("Wallets2 brand :"+wallet2.brand);
		System.out.println("Wallets2 material :"+wallet2.material);
		System.out.println("Wallets2 width :"+wallet2.width);
		System.out.println("Wallets2 noOfCompartments :"+wallet2.noOfCompartments);
		
		Wallets wallet3=new Wallets("Wildhorn","Rubber",150);
		System.out.println("Wallets3 brand :"+wallet3.brand);
		System.out.println("Wallets3 material :"+wallet3.material);
		System.out.println("Wallets3 width :"+wallet3.width);
		System.out.println("Wallets3 noOfCompartments :"+wallet3.noOfCompartments);
		
		Wallets wallet4=new Wallets("Poilice","Jute",130.0,8);
		System.out.println("Wallets4 brand :"+wallet4.brand);
		System.out.println("Wallets4 material :"+wallet4.material);
		System.out.println("Wallets4 width :"+wallet4.width);
		System.out.println("Wallets4 noOfCompartments :"+wallet4.noOfCompartments);
		System.out.println("Ending main in WalletStarter");
    
  }
  
}