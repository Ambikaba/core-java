class Showroom {
  
  String name;
  String location;
  int noofbrands;
  int pincode;
  double area;
  int floor;
  String facing;
  String city;

 Showroom()
 {
   
   System.out.println("Showroom created");
   
 }
 
 Showroom(String name)
 {
   this.name=name;
   System.out.println("the name is passed as argument");
   
 }
 
 Showroom(String name,String location)
 {
   
   this.name=name;
   this.location=location;
   System.out.println("the name and location passed as argument");
   
 }
 
 Showroom(String name,String location,int noofbrands)
 {
   
    this.name=name;
    this.location=location;
    this.noofbrands=noofbrands;
   System.out.println("the name,location and noofbrand passed as argument");
   
 }
 
 Showroom(String name,String location,int noofbrands,int pincode)
 {
   
    this.name=name;
    this.location=location;
    this.noofbrands=noofbrands;
    this.pincode=pincode;
   System.out.println("the name,location,noofbrand and pincode passed as argument");
   
   
 }
 
   Showroom(String name,String location,int noofbrands,int pincode,double area)
 {
   
    this.name=name;
    this.location=location;
    this.noofbrands=noofbrands;
    this.pincode=pincode;
    this.area=area;
   System.out.println("the name,location,noofbrands,pincode and area passed as argument");
   
   
 }
 
 Showroom(String name,String location,int noofbrands,int pincode,double area,int floor)
 {
   
    this.name=name;
    this.location=location;
    this.noofbrands=noofbrands;
    this.pincode=pincode;
    this.area=area;
    this.floor=floor;
   System.out.println("the name,location,noofbrands,pincode,area and floor passed as argument");
   
   
 }
 
 
  Showroom(String name,String location,int noofbrands,int pincode,double area,int floor,String facing)
 {
   
    this.name=name;
    this.location=location;
    this.noofbrands=noofbrands;
    this.pincode=pincode;
    this.area=area;
    this.floor=floor;
    this.facing=facing;
   System.out.println("the name,location,noofbrands,pincode,area,floor and facing passed as argument");
   
   
 }
 
 Showroom(String name,String location,int noofbrands,int pincode,double area,int floor,String facing,String city)
 {
   
    this.name=name;
    this.location=location;
    this.noofbrands=noofbrands;
    this.pincode=pincode;
    this.area=area;
    this.floor=floor;
    this.facing=facing;
    this.city=city;
   System.out.println("the name,location,noofbrands,pincode,area,floor,facing and city passed as argument");
   
   
 }
 
}