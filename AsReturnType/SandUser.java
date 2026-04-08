class SandUser{
	
	public Sand sandInfo(){
		
		System.out.println("Running a method with class as return type");
		
		Sand refSand=new Sand();
		
		refSand.type="River Sand";
		refSand.weight=50;
		refSand.color="Brown";
	
		return refSand;
		
		}
}