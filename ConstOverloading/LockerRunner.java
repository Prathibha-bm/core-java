class LockerRunner{
	
	public static void main(String[] args){
		Locker ref1=new Locker();
		Locker ref2=new Locker(102);
		Locker ref3=new Locker("Office", "Alloy");
		Locker ref4=new Locker("White",80.0, true);
		Locker ref5=new Locker("Yale",4, 60.3,false);
		
		
ref1.showMethod(); //non static method called  by reference
ref2.showMethod();
ref3.showMethod();
ref4.showMethod();
ref5.showMethod();

}

}