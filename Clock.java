class Clock {
  
  double volume;
  double width;
  double height;
  double format;
  
  Clock()
  {
    
     System.out.println("clock created");
     
  }
  
  Clock(double volume)
  {
    super();
    this.volume=volume;
    System.out.println("the volume is passed as argument: " +volume);
    
  }
  
  Clock(double volume,double width)
  {
    super();
    this.volume=volume;
    this.width=width;
    System.out.println("the volume is passed as argument: " +volume+","+width);
    
  }
  
   Clock(double volume,double width,double height)
  {
    super();
    this.volume=volume;
    this.width=width;
    this.height=height;
    System.out.println("the volume is passed as argument: " +volume+","+width+","+height);
    
  }
  
  Clock(double volume,double width,double height,double format)
  {
    super();
    this.volume=volume;
    this.width=width;
    this.height=height;
    this.format=format;
    System.out.println("the volume is passed as argument: " +volume+","+width+","+height+","+format);
    
  }
  
} 