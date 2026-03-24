class LipsticBrand{
	
	public static void main(String[] args){
		
		String brandName1="MAC Cosmetics ";
		String brandName2="L'Oréal Paris ";
		String brandName3="Huda Beauty";
		String brandName4="Lakmé ";
		String brandName5="Swiss Beauty";
		String brandName6="Nykaa Cosmetics";
		String brandName7="Revlon ";
		String brandName8="Plum Goodness";
		String brandName9="Kay Beauty";
		String brandName10="Ellay18";


			String[] brandsName={brandName1,brandName2,brandName3,brandName4,brandName5,brandName6,brandName7,brandName8,brandName9,brandName10};
			
			brandsName[3]="Dazler";
			
			for(int lipstic=0;lipstic<=9;lipstic++){
			System.out.println(brandsName[lipstic]);
			}
			
			System.out.println("\n Reverse :\n");
			
			for(int lipstic=9;lipstic>=0;lipstic--){
			System.out.println(brandsName[lipstic]);
			}
			
			
			String item2=brandsName[26];	
		}
	
}