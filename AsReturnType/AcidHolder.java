class AcidHolder{
	
	public Acid acidInfo(){
		
		System.out.println("Running a method with class as return type");
		
		Acid refAcid=new Acid();
		
		refAcid.name="Hydrochloric Acid";
		refAcid.phLevel=1;
		refAcid.isCorrosive=true;
	
		return refAcid;
		
		}
}


class AcidRunner{

	public static void main(String... args){
	
		AcidHolder refAcidHolder=new AcidHolder();	
		Acid ref=refAcidHolder.acidInfo();
	    ref.display();
}
}