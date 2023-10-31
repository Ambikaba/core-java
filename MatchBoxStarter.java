class MatchBoxStarter {

public static void main(String[] args)
{

System.out.println("starting main in MatchBoxstarter");

MatchBox matchbox = new MatchBox();
System.out.println("MatchBox brand is :" +matchbox.brand);
System.out.println("MatchBox length is :" +matchbox.length);
System.out.println("MatchBox noofstick is :" +matchbox.noofstick);
System.out.println("MatchBox type is :" +matchbox.type);
System.out.println("MatchBox cost is :" +matchbox.cost);
System.out.println("MatchBox weight is :" +matchbox.weight);
System.out.println("MatchBox size is :" +matchbox.size);


MatchBox matchbox1 = new MatchBox("korg");
System.out.println("MatchBox1 brand is :" +matchbox1.brand);
System.out.println("MatchBox1 length is :" +matchbox1.length);
System.out.println("MatchBox1 noofstick is :" +matchbox1.noofstick);
System.out.println("MatchBox1 type is :" +matchbox1.type);
System.out.println("MatchBox1 cost is :" +matchbox1.cost);
System.out.println("MatchBox1 weight is :" +matchbox1.weight);
System.out.println("MatchBox1 size is :" +matchbox1.size);

MatchBox matchbox2= new MatchBox("korg",5);
System.out.println("MatchBox2 brand is :" +matchbox2.brand);
System.out.println("MatchBox2 length is :" +matchbox2.length);
System.out.println("MatchBox2 noofstick is :" +matchbox2.noofstick);
System.out.println("MatchBox2 type is :" +matchbox2.type);
System.out.println("MatchBox2 cost is :" +matchbox2.cost);
System.out.println("MatchBox2 weight is :" +matchbox2.weight);
System.out.println("MatchBox2 size is :" +matchbox2.size);

MatchBox matchbox3= new MatchBox("korg",5,25);
System.out.println("MatchBox3 brand is :" +matchbox3.brand);
System.out.println("MatchBox3 length is :" +matchbox3.length);
System.out.println("MatchBox3 noofstick is :" +matchbox3.noofstick);
System.out.println("MatchBox3 type is :" +matchbox3.type);
System.out.println("MatchBox3 cost is :" +matchbox3.cost);
System.out.println("MatchBox3 weight is :" +matchbox3.weight);
System.out.println("MatchBox3 size is :" +matchbox3.size);

MatchBox matchbox4 = new MatchBox("korg",5,25,"wood");
System.out.println("MatchBox4 brand is :" +matchbox4.brand);
System.out.println("MatchBox4 length is :" +matchbox4.length);
System.out.println("MatchBox4 noofstick is :" +matchbox4.noofstick);
System.out.println("MatchBox4 type is :" +matchbox4.type);
System.out.println("MatchBox4 cost is :" +matchbox4.cost);
System.out.println("MatchBox4 weight is :" +matchbox4.weight);
System.out.println("MatchBox4 size is :" +matchbox4.size);

MatchBox matchbox5 = new MatchBox("korg",5,25,"wood",50);
System.out.println("MatchBox5 brand is :" +matchbox5.brand);
System.out.println("MatchBox5 length is :" +matchbox5.length);
System.out.println("MatchBox5 noofstick is :" +matchbox5.noofstick);
System.out.println("MatchBox5 type is :" +matchbox5.type);
System.out.println("MatchBox5 cost is :" +matchbox5.cost);
System.out.println("MatchBox5 weight is :" +matchbox5.weight);
System.out.println("MatchBox5 size is :" +matchbox5.size);

MatchBox matchbox6 = new MatchBox("korg",5,25,"wood",50,40);
System.out.println("MatchBox6 brand is :" +matchbox6.brand);
System.out.println("MatchBox6 length is :" +matchbox6.length);
System.out.println("MatchBox6 noofstick is :" +matchbox6.noofstick);
System.out.println("MatchBox6 type is :" +matchbox6.type);
System.out.println("MatchBox6 cost is :" +matchbox6.cost);
System.out.println("MatchBox6 weight is :" +matchbox6.weight);
System.out.println("MatchBox6 size is :" +matchbox6.size);

MatchBox matchbox7 = new MatchBox("korg",5,25,"wood",50,40,'s');
System.out.println("MatchBox7 brand is :" +matchbox7.brand);
System.out.println("MatchBox7 length is :" +matchbox7.length);
System.out.println("MatchBox7 noofstick is :" +matchbox7.noofstick);
System.out.println("MatchBox7 type is :" +matchbox7.type);
System.out.println("MatchBox7 cost is :" +matchbox7.cost);
System.out.println("MatchBox7 weight is :" +matchbox7.weight);
System.out.println("MatchBox7 size is :" +matchbox7.size);

System.out.println("ending main in MatchBoxstarter");

}

}