class DiamondHolder{
	
	public Diamond diamondInfo(){
		
		System.out.println("Running a method with class as return type");
		
		Diamond refDiamond=new Diamond();
		
		refDiamond.clarity="VVS1";
		refDiamond.carat=2;
		refDiamond.isNatural=true;
	
		return refDiamond;
		
		}
}