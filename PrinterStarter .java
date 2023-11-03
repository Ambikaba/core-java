class PrinterStarter {
  
  public static void main(String[] args)
  {
    
    System.out.println("starting main in PrinterStarter");
    
    Printer printer=new Printer();
    System.out.println("Printer name  is :" +printer.name);
    System.out.println("Printer type  is :" +printer.type);
    System.out.println("Printer noofpages  is :" +printer.noofpages);
    System.out.println("Printer sides  is :" +printer.sides);
    System.out.println("Printer quality  is :" +printer.quality);
    
    Printer printer1=new Printer("epson");
    System.out.println("Printer1 name  is :" +printer1.name);
    System.out.println("Printer1 type  is :" +printer1.type);
    System.out.println("Printer1 noofpages  is :" +printer1.noofpages);
    System.out.println("Printer1 sides  is :" +printer1.sides);
    System.out.println("Printer1 quality  is :" +printer1.quality);
    
    Printer printer2=new Printer("epson","color");
    System.out.println("Printer2 name  is :" +printer2.name);
    System.out.println("Printer2 type  is :" +printer2.type);
    System.out.println("Printer2 noofpages  is :" +printer2.noofpages);
    System.out.println("Printer2 sides  is :" +printer2.sides);
    System.out.println("Printer2 quality  is :" +printer2.quality);
    
    Printer printer3=new Printer("epson","color",5);
    System.out.println("Printer3 name  is :" +printer3.name);
    System.out.println("Printer3 type  is :" +printer3.type);
    System.out.println("Printer3 noofpages  is :" +printer3.noofpages);
    System.out.println("Printer3 sides  is :" +printer3.sides);
    System.out.println("Printer3 quality  is :" +printer3.quality);
    
    
    Printer printer4=new Printer("epson","color",5,"one side");
    System.out.println("Printer4 name  is :" +printer4.name);
    System.out.println("Printer4 type  is :" +printer4.type);
    System.out.println("Printer4 noofpages  is :" +printer4.noofpages);
    System.out.println("Printer4 sides  is :" +printer4.sides);
    System.out.println("Printer4 quality  is :" +printer4.quality);
    
    Printer printer5=new Printer("epson","color",5,"one side","standard");
    System.out.println("Printer5 name  is :" +printer5.name);
    System.out.println("Printer5 type  is :" +printer5.type);
    System.out.println("Printer5 noofpages  is :" +printer5.noofpages);
    System.out.println("Printer5 sides  is :" +printer5.sides);
    System.out.println("Printer5 quality  is :" +printer5.quality);
    
    System.out.println("ending main in PrinterStarter");
    
    
  }
  
}