class LocketRunner{

public static void main(String[] args){

Locket instance1=new Locket();
Locket instance2=new Locket("Silver");
Locket instance3=new Locket("Round", "Rose Gold");
Locket instance4=new Locket(10.0, 2.0,true);
Locket instance5=new Locket("PC Jeweller", "Cable Chain", true, 103);

instance1.show();
instance2.show();
instance3.show();
instance4.show();
instance5.show();
}

}