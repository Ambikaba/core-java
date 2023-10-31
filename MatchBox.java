class MatchBox {
  
  String brand;
  double length;
  int noofstick;
  String type;
  double cost;
  double weight;
  char size;

 MatchBox()
 {
   
   System.out.println("MatchBox created");
   
 }
 
 MatchBox(String brand)
 {
   this.brand=brand;
   System.out.println("the brand is passed as argument");
   
 }
 
 MatchBox(String brand,double length)
 {
   
   this.brand=brand;
   this.length=length;
   System.out.println("the brand and length passed as argument");
   
 }
 
 MatchBox(String brand,double length,int noofstick)
 {
   
    this.brand=brand;
    this.length=length;
    this.noofstick=noofstick;
   System.out.println("the brand,length and noofstick passed as argument");
   
 }
 
 MatchBox(String brand,double length,int noofstick,String type)
 {
   
    this.brand=brand;
    this.length=length;
    this.noofstick=noofstick;
    this.type=type;
   System.out.println("the brand,length,noofstick and type passed as argument");
   
 }
 
  MatchBox(String brand,double length,int noofstick,String type,double cost)
 {
   
    this.brand=brand;
    this.length=length;
    this.noofstick=noofstick;
    this.type=type;
    this.cost=cost;
   System.out.println("the brand,length,noofstick,type and cost passed as argument");
   
 }
 
  MatchBox(String brand,double length,int noofstick,String type,double cost,double weight)
 {
   
    this.brand=brand;
    this.length=length;
    this.noofstick=noofstick;
    this.type=type;
    this.cost=cost;
    this.weight=weight;
   System.out.println("the brand,length,noofstick,type,cost and weight passed as argument");
   
 }
 
  MatchBox(String brand,double length,int noofstick,String type,double cost,double weight,char size)
 {
   
    this.brand=brand;
    this.length=length;
    this.noofstick=noofstick;
    this.type=type;
    this.cost=cost;
    this.weight=weight;
    this.size=size;
   System.out.println("the brand,length,noofstick,type,cost,weight and size passed as argument");
   
 }
 
}