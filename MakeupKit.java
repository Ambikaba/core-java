class MakeupKit {
  
  String name;
  int items;
  double weight;
  double cost;
  
  MakeupKit()
  {
    
     System.out.println("MakeupKit created");
     
  }
  
  MakeupKit(String name)
  {
    super();
    this.name=name;
    System.out.println("the name is passed as argument: " +name);
    
  }
  
  MakeupKit(String name,int items)
  {
    super();
    this.name=name;
    this.items=items;
    System.out.println("the name and items  is passed as argument: " +name+","+items);
    
  }
  
   MakeupKit(String name,int items,double weight)
  {
    super();
    this.name=name;
    this.items=items;
    this.weight=weight;
    System.out.println("the name,items and weight is passed as argument: " +name+","+items+","+weight);
    
  }
  
  MakeupKit(String name,int items,double weight,double cost)
  {
    super();
    this.name=name;
    this.items=items;
    this.weight=weight;
    this.cost=cost;
    System.out.println("the name,items,weight and cost is passed as argument: " +name+","+items+","+weight+","+cost);
    
  }
  
} 