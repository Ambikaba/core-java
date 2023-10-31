class Keyboard {
  
  String brand;
  String color;
  int noofkeys;
  String type;
  double cost;

 Keyboard()
 {
   
   System.out.println("keyboard created");
   
 }
 
 Keyboard(String brand)
 {
   this.brand=brand;
   System.out.println("the brand is passed as argument");
   
 }
 
 Keyboard(String brand,String color)
 {
   
   this.brand=brand;
   this.color=color;
   System.out.println("the brand and color passed as argument");
   
 }
 
 Keyboard(String brand,String color,int noofkeys)
 {
   
    this.brand=brand;
    this.color=color;
    this.noofkeys=noofkeys;
   System.out.println("the brand,color and noofkeys passed as argument");
   
 }
 
 Keyboard(String brand,String color,int noofkeys,String type)
 {
   
    this.brand=brand;
    this.color=color;
    this.noofkeys=noofkeys;
    this.type=type;
   System.out.println("the brand,color,noofkeys and type passed as argument");
   
 }
 
  Keyboard(String brand,String color,int noofkeys,String type,double cost)
 {
   
    this.brand=brand;
    this.color=color;
    this.noofkeys=noofkeys;
    this.type=type;
    this.cost=cost;
   System.out.println("the brand,color,noofkeys,type and cost passed as argument");
   
 }
 
}