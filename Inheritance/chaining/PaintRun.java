class PaintRun{

public static void main(String[] args){

PaintChild instance1=new PaintChild();

instance1.display(123);
instance1.display("Acian");
instance1.display("Acian",3910);
instance1.display(3910);
instance1.display(123,3910);


PaintChild instance2=new PaintChild();

instance2.display(216);
instance2.display("Berger");
instance2.display("Berger",2394);
instance2.display(2394);
instance2.display(216,2394);
}
}