class Wallets
{
	String brand;
	String material;
	double width;
	int noOfCompartments;
	
	Wallets()
	{
		this("BagIt","leather",100,6);
	}
	Wallets(String brand)
	{
		super();
		this.brand=brand;
		System.out.println("String is passed as constuctor parameter"+brand);
	}
	Wallets(String brand,String material)
	{
		super();
		this.brand=brand;
		this.material=material;
		System.out.println("String,String is passed as constuctor parameter"+brand+","+material);
	}
	Wallets(String brand,String material,double width)
	{
		super();
		this.brand=brand;
		this.material=material;
		this.width=width;
		System.out.println("String,String,double is passed as constuctor parameter"+brand+","+material+","+width);
	}
	Wallets(String brand,String material,double width,int noOfCompartments)
	{
		super();
		this.brand=brand;
		this.material=material;
		this.width=width;
		this.noOfCompartments=noOfCompartments;
		System.out.println("String,String,double ,int is passed as constuctor parameter"+brand+","+material+","+width+","+noOfCompartments);
	}
}


