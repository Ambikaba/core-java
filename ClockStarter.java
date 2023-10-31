class ClockStarter {
  
  public static void main(String[] args)
  {
    
    System.out.println("starting main in ClockStarter");
    
    Clock clock=new Clock();
    System.out.println("clock volume  is :" +clock.volume);
    System.out.println("clock width  is :" +clock.width);
    System.out.println("clock height  is :" +clock.height);
    System.out.println("clock format  is :" +clock.format);
    
    Clock clock1=new Clock(25);
    System.out.println("clock1 volume  is :" +clock1.volume);
    System.out.println("clock1 width  is :" +clock1.width);
    System.out.println("clock1 height  is :" +clock1.height);
    System.out.println("clock1 format  is :" +clock1.format);
    
    Clock clock2=new Clock(25,173);
    System.out.println("clock2 volume  is :" +clock2.volume);
    System.out.println("clock2 width  is :" +clock2.width);
    System.out.println("clock2 height  is :" +clock2.height);
    System.out.println("clock2 format  is :" +clock2.format);
    
    Clock clock3=new Clock(25,173,171);
    System.out.println("clock3 volume  is :" +clock3.volume);
    System.out.println("clock3 width  is :" +clock3.width);
    System.out.println("clock3 height  is :" +clock3.height);
    System.out.println("clock3 format  is :" +clock3.format);
    
    Clock clock4=new Clock(25,173,171,24);
    System.out.println("clock4 volume  is :" +clock4.volume);
    System.out.println("clock4 width  is :" +clock4.width);
    System.out.println("clock4 height  is :" +clock4.height);
    System.out.println("clock4 format  is :" +clock4.format);
    
  }
  
}