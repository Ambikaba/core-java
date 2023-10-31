class MakeupKitStarter {
  
  public static void main(String[] args)
  {
    
    System.out.println("starting main in MakeupKitStarter");
    
    MakeupKit makeupkit=new MakeupKit();
    System.out.println("MakeupKit name  is :" +makeupkit.name);
    System.out.println("MakeupKit items  is :" +makeupkit.items);
    System.out.println("MakeupKit weight  is :" +makeupkit.weight);
    System.out.println("MakeupKit cost  is :" +makeupkit.cost);
    
    MakeupKit makeupkit1=new MakeupKit("Eyeshadow palette");
    System.out.println("MakeupKit1 name  is :" +makeupkit1.name);
    System.out.println("MakeupKit1 items  is :" +makeupkit1.items);
    System.out.println("MakeupKit1 weight  is :" +makeupkit1.weight);
    System.out.println("MakeupKit1 cost  is :" +makeupkit1.cost);
    
    MakeupKit makeupkit2=new MakeupKit("Eyeshadow palette",10);
    System.out.println("MakeupKit2 name  is :" +makeupkit2.name);
    System.out.println("MakeupKit2 items  is :" +makeupkit2.items);
    System.out.println("MakeupKit2 weight  is :" +makeupkit2.weight);
    System.out.println("MakeupKit2 cost  is :" +makeupkit2.cost);
    
    MakeupKit makeupkit3=new MakeupKit("Eyeshadow palette",10,750);
    System.out.println("MakeupKit3 name  is :" +makeupkit3.name);
    System.out.println("MakeupKit3 items  is :" +makeupkit3.items);
    System.out.println("MakeupKit3 weight  is :" +makeupkit3.weight);
    System.out.println("MakeupKit3 cost  is :" +makeupkit3.cost);
    
    MakeupKit makeupkit4=new MakeupKit("Eyeshadow palette",10,750,1000);
    System.out.println("MakeupKit4 name  is :" +makeupkit4.name);
    System.out.println("MakeupKit4 items  is :" +makeupkit4.items);
    System.out.println("MakeupKit4 weight  is :" +makeupkit4.weight);
    System.out.println("MakeupKit4 cost  is :" +makeupkit4.cost);
    
    System.out.println("ending main in MakeupKitStarter");
    
    
  }
  
}