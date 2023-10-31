class RocketStarter {
  
  public static void main(String[] args)
  {
    
    System.out.println("starting main in RocketStarter");
    
    Rocket rocket=new Rocket();
    System.out.println("Rocket name  is :" +rocket.name);
    System.out.println("Rocket propellants  is :" +rocket.propellants);
    System.out.println("Rocket energy  is :" +rocket.energy);
    System.out.println("Rocket volume  is :" +rocket.volume);
    
    Rocket rocket1=new Rocket("Trailblazer");
    System.out.println("Rocket1 name  is :" +rocket.name);
    System.out.println("Rocket1 propellants  is :" +rocket.propellants);
    System.out.println("Rocket1 energy  is :" +rocket.energy);
    System.out.println("Rocket1 volume  is :" +rocket.volume);
    
    Rocket rocket2=new Rocket("Trailblazer","solid");
    System.out.println("Rocket2 name  is :" +rocket2.name);
    System.out.println("Rocket2 propellants  is :" +rocket2.propellants);
    System.out.println("Rocket2 energy  is :" +rocket2.energy);
    System.out.println("Rocket2 volume  is :" +rocket2.volume);
    
    Rocket rocket3=new Rocket("Trailblazer","solid","thermal");
    System.out.println("Rocket3 name  is :" +rocket3.name);
    System.out.println("Rocket3 propellants  is :" +rocket3.propellants);
    System.out.println("Rocket3 energy  is :" +rocket3.energy);
    System.out.println("Rocket3 volume  is :" +rocket3.volume);
    
    Rocket rocket4=new Rocket("Trailblazer","solid","thermal",2000);
    System.out.println("Rocket4 name  is :" +rocket4.name);
    System.out.println("Rocket4 propellants  is :" +rocket4.propellants);
    System.out.println("Rocket4 energy  is :" +rocket4.energy);
    System.out.println("Rocket4 volume  is :" +rocket4.volume);
    
    
  }
  
}