class LockerRunner{
	
	public static void main(String[] args){
		Locker ref1=new Locker(101, "Home", "Steel", "Grey",50.5, true, "Godrej",3, 45.0,true);
		Locker ref2=new Locker(102, "Bank", "Iron", "Black",120.0, false, "SecureSafe",6, 120.5,true);
		Locker ref3=new Locker(103, "Office", "Alloy", "White",80.0, true, "Yale",4, 60.3,false);
		
		
ref1.showMethod(); //non static method called  by reference
ref2.showMethod();
ref3.showMethod();

}

}