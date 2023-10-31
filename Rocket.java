class Rocket {
  
  String name;
  String propellants;
  String energy;
  double volume;
  
  Rocket()
  {
    
     System.out.println("rocket created");
     
  }
  
  Rocket(String name)
  {
    super();
    this.name=name;
    System.out.println("the name is passed as argument: " +name);
    
  }
  
  Rocket(String name,String propellants)
  {
    super();
    this.name=name;
    this.propellants=propellants;
    System.out.println("the name and propellants  is passed as argument: " +name+","+propellants);
    
  }
  
   Rocket(String name,String propellants,String energy)
  {
    super();
    this.name=name;
    this.propellants=propellants;
    this.energy=energy;
    System.out.println("the name,propellants and energy is passed as argument: " +name+","+propellants+","+energy);
    
  }
  
  Rocket(String name,String propellants,String energy,double volume)
  {
    super();
    this.name=name;
    this.propellants=propellants;
    this.energy=energy;
    this.volume=volume;
    System.out.println("the name,propellants,energy and volume is passed as argument: " +name+","+propellants+","+energy+","+volume);
    
  }
  
} 