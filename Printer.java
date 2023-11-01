class Printer {
  
  String name;
  String type;
  int noofcopies;
  String sides;
  String quality;
  
  Printer()
  {
    this("epson","color",5,"one side","standard");
     System.out.println("printer created");
     
  }
  
  Printer(String name)
  {
    
    this.name=name;
    System.out.println("the name is passed as argument: " +name);
    
  }
  
  Printer(String name,String type)
  {
    
    this(name);
    this.type=type;
    System.out.println("the name  and type is passed as argument: " +name+","+type);
    
  }
   
   Printer(String name,String type,int noofcopies)
  {
    
    this(name,type);
    this.noofcopies=noofcopies;
    System.out.println("the name,type and noofcopies is passed as argument: " +name+","+type+","+noofcopies);
    
  }
   
  
  Printer(String name,String type,int noofcopies,String sides)
  {
    
    this(name,type,noofcopies);
    this.sides=sides;
    System.out.println("the name,type noofcopies and sides are passed as argument: " +name+","+type+","+noofcopies+","+sides);
    
  }
  
  Printer(String name,String type,int noofcopies,String sides,String quality)
  {
    
    this(name,type,noofcopies,sides);
    this.quality=quality;
    System.out.println("the name,type noofcopies sides and quality are passed as argument: " +name+","+type+","+noofcopies+","+sides+","+quality);
    
  }
  
}