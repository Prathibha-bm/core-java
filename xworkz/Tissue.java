class Tissue{
	static double getPriceByThickness(double thickness){
		System.out.println("Price of tissue paper based on the thickness in Grams per Square Meter (mgs) : "+thickness);
			
			
			if (thickness==10.8)
			{
				System.out.println("Price:80");
				return 80.0;
			}
			
			if (thickness==18.6)
			{
				System.out.println("Price:100");
				return 100.34;
			}
			
			if (thickness==19.4)
			{
				System.out.println("Price:110");
				return 110.0;
			}
			
			if (thickness==20.34)
			{
				System.out.println("Price:120");
				return 120.0;
			}
			
			if (thickness==19.7)
			{
				System.out.println("Price:110");
				return 130.3;
			}
			
			if (thickness==19.9)
			{
				System.out.println("Price:110");
				return 110.0;
			}
			
			if (thickness==19.34)
			{
				System.out.println("Price:140");
				return 110.4;
			}
			
			if (thickness==19.56)
			{
				System.out.println("Price:110");
				return 140.7;
			}
			
			if (thickness==17.4)
			{
				System.out.println("Price:110");
				return 170.3;
			}
			
			if (thickness==13.5)
			{
				System.out.println("Price:110");
				return 100.3;
			}
			
			if (thickness==14.4)
			{
				System.out.println("Price:110");
				return 70.4;
			}
			
			if (thickness==13.4)
			{
				System.out.println("Price:110");
				return 100.43;
			}
			
		System.out.println("*****Not Found*****");
		return -10;
		}
		
	}

