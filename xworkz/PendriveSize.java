class PendriveSize{
	public static void main(String[] args){
		
		
		String brand="Samsung";
		int size=Pendrive.getSizeByBrand(brand);
		System.out.println("size for Pendrive is : "+size);
		
		
		size=Pendrive.getSizeByBrand("Sandisk");
		System.out.println("size for Pendrive is : "+size);
		
		size=Pendrive.getSizeByBrand("hp");
		System.out.println("size for Pendrive is : "+size);
		
		size=Pendrive.getSizeByBrand("KingStone");
		System.out.println("size for Pendrive is : "+size);
		
		size=Pendrive.getSizeByBrand("Sony");
		System.out.println("size for Pendrive is : "+size);
		
		size=Pendrive.getSizeByBrand("Transend");
		System.out.println("size for Pendrive is : "+size);
		
		size=Pendrive.getSizeByBrand("Laptop");
		System.out.println("size for Pendrive is : "+size);
		
		
		
		
	}
	
}
	