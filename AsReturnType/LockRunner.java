class LockRunner{

	public static void main(String... args){
	
		Locker refLocker=new Locker();	
		
		Lock ref=refLocker.lockingSystem();
		
	    ref.display();
}
}