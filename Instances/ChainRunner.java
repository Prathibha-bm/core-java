class ChainRunner{
	
	public static void main(String[] args){
		Chain ref1=new Chain(1, "Gold", "Cable", "Golden",20.0, 15.5, "Tanishq",false, 60000, "Lobster Clasp");
		Chain ref2=new Chain(2, "Silver", "Rope", "Silver",18.5, 10.2, "Malabar",false, 15000, "Spring Ring");
		Chain ref3=new Chain(3, "Alloy", "Box", "Rose Gold",22.0, 12.8, "PC Jeweller",true, 9000, "Toggle Clasp");
		
		
ref1.showMethod();//non static method called  by reference
ref2.showMethod();
ref3.showMethod();

	}

}