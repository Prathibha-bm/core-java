class FarmHouseRun{

public static void main(String[] args){

FarmHouseChild instance1=new FarmHouseChild();

instance1.display(123);
instance1.display("Coconut Farming");
instance1.display("Ram","Chikkamagaluru");
instance1.display("Coconut Farming","Ram","Chikkamagaluru");
instance1.display("My Farm","Coconut Farming","Ram","Chikkamagaluru");





FarmHouseChild instance2=new FarmHouseChild();
instance2.display(213);
instance2.display("Aracnut Farming");
instance2.display("Lalith","Mysuru");
instance2.display("Aracnut Farming","Lalith","Mysuru");
instance2.display("Lalith Farmhouse","Aracnut Farming","Lalith","Mysuru");
}
}