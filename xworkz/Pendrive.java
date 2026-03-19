class Pendrive{
	static int getSizeByBrand(String brand){
		System.out.println("Get Size in gb By Brand  : "+brand);
			
			
			if ("Sandisk"==brand)
			{
				System.out.println("Size:256gb");
				return 256;
			}
			
			if ("hp"==brand)
			{
				System.out.println("Size:128gb");
				return 256;
			}
			
			if ("KingStone"==brand)
			{
				System.out.println("Size:1000gb");
				return 1000;
			}
			
			if ("Sony"==brand)
			{
				System.out.println("Size:64gb");
				return 64;
			}
			
			if ("Transend"==brand);
			{
				System.out.println("Size:32gb");
				return 32;
			}
		else{
				System.out.println("*****Not Found*****");
				return 0;
			}
		
		}
		
		
	}

