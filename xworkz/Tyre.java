class Tyre{
	static double getPriceByBrandAndSize(String brand,int size){
		System.out.println("Price of tyre based on Brand and Size : "+"Brand: "+brand+" , Size: "+ size);
			
			
			if (brand=="Apollo" && size==12)
			{
				System.out.println("Price:8000");
				return 8000.0;
			}
			
			if (brand=="Apollo" && size==13)
			{
				System.out.println("Price:9000");
				return 9000.0;
			}
			
			if (brand=="Apollo" && size==14)
			{
				System.out.println("Price10000");
				return 10000.60;
			}
			
			if (brand=="Apollo" && size==15)
			{
				System.out.println("Price12000");
				return 12000.60;
			}
			
			if (brand=="MRF" && size==12)
			{
				System.out.println("Price:12000");
				return 12000.0;
			}
			
			if (brand=="MRF" && size==13)
			{
				System.out.println("Price:13000");
				return 13000.0;
			}
			
			if (brand=="MRF" && size==14)
			{
				System.out.println("Price:14000");
				return 14000.0;
			}
			
			
			if (brand=="MRF" && size==15)
			{
				System.out.println("Price:15000");
				return 15000.50;
			}
			
			
			if (brand=="CEAT" && size==15)
			{
				System.out.println("Price:15000");
				return 15000.04;
			}
			
			if (brand=="CEAT" && size==14)
			{
				System.out.println("Price:18000");
				return 18000.03;
			}
			if (brand=="CEAT" && size==13)
			{
				System.out.println("Price:13000");
				return 13000.23;
			}
			if (brand=="CEAT" && size==12)
			{
				System.out.println("Price:10000");
				return 10000.0;
			}
			
			if (brand=="CEAT" && size==11)
			{
				System.out.println("Price:9000");
				return 9000.0;
			}
		System.out.println("*****Not Found*****");
		return -10000;
		}
		
	}
	

