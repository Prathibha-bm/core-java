class ChainRunner{
	
	public static void main(String[] args){
		Chain ref1=new Chain();
		Chain ref2=new Chain(1);
		Chain ref3=new Chain("Box","Rose Gold");
		Chain ref4=new Chain( "Rose Gold",22.0, 12.8);
		Chain ref5=new Chain("PC Jeweller",true, 9000, "Toggle Clasp");

		
ref1.showMethod();//non static method called  by reference
ref2.showMethod();
ref3.showMethod();
ref4.showMethod();
ref5.showMethod();

	}

}