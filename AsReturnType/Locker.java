class Locker{
	
	public Lock lockingSystem(){
		
		System.out.println("Running a method with class as return type ");
		
		Lock refLock=new Lock();
		
		refLock.noOfLock=4;
		refLock.isSafe=true;
		refLock.price=6500;
	
		return refLock;
		
		}
}