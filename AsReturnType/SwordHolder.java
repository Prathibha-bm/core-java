class SwordHolder{
	
	public Sword swordInfo(){
		
		System.out.println("Running a method with class as return type");
		
		Sword refSword=new Sword();
		
		refSword.material="Iron";
		refSword.length=120;
		refSword.isSharp=true;
	
		return refSword;
		
		}
}
