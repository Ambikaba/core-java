class KeyboardStarter {

public static void main(String[] args)
{

System.out.println("starting main in keyboardstarter");

Keyboard keyboard = new Keyboard();
System.out.println("keyboard brand is :" +keyboard.brand);
System.out.println("keyboard color is :" +keyboard.color);
System.out.println("keyboard noofkeys is :" +keyboard.noofkeys);
System.out.println("keyboard type is :" +keyboard.type);
System.out.println("keyboard cost is :" +keyboard.cost);


Keyboard keyboard1 = new Keyboard("intel");
System.out.println("keyboard1 brand is :" +keyboard1.brand);
System.out.println("keyboard1 color is :" +keyboard1.color);
System.out.println("keyboard1 noofkeys is :" +keyboard1.noofkeys);
System.out.println("keyboard1 type is :" +keyboard1.type);
System.out.println("keyboard1 cost is :" +keyboard1.cost);

Keyboard keyboard2 = new Keyboard("intel","black");
System.out.println("keyboard2 brand is :" +keyboard2.brand);
System.out.println("keyboard2 color is :" +keyboard2.color);
System.out.println("keyboard2 noofkeys is :" +keyboard2.noofkeys);
System.out.println("keyboard2 type is :" +keyboard2.type);
System.out.println("keyboard2 cost is :" +keyboard2.cost);

Keyboard keyboard3 = new Keyboard("intel","black",101);
System.out.println("keyboard3 brand is :" +keyboard3.brand);
System.out.println("keyboard3 color is :" +keyboard3.color);
System.out.println("keyboard3 noofkeys is :" +keyboard3.noofkeys);
System.out.println("keyboard3 type is :" +keyboard3.type);
System.out.println("keyboard3 cost is :" +keyboard3.cost);

Keyboard keyboard4 = new Keyboard("intel","black",101,"wired");
System.out.println("keyboard4 brand is :" +keyboard4.brand);
System.out.println("keyboard4 color is :" +keyboard4.color);
System.out.println("keyboard4 noofkeys is :" +keyboard4.noofkeys);
System.out.println("keyboard4 type is :" +keyboard4.type);
System.out.println("keyboard4 cost is :" +keyboard4.cost);

Keyboard keyboard5 = new Keyboard("intel","black",101,"wired",2000);
System.out.println("keyboard5 brand is :" +keyboard5.brand);
System.out.println("keyboard5 color is :" +keyboard5.color);
System.out.println("keyboard5 noofkeys is :" +keyboard5.noofkeys);
System.out.println("keyboard5 type is :" +keyboard5.type);
System.out.println("keyboard5 cost is :" +keyboard5.cost);

System.out.println("ending main in keyboardstarter");
}

}