class Person{

static void details(String name,String[] email,String[] PhNo,String[] pgAddress,String[] homeAddress ){
	
			System.out.println("\nExecuting details");

			
			if(name!=null){
				System.out.println("The name is: "+name);
				
			}
			if(email!=null){
				for(int start=0;start<email.length;start++){
					System.out.println("email is :"+email[start]);
					
				}
					
				}
			if(PhNo!=null){
				for(int number=0;number<PhNo.length;number++){
					System.out.println("PhNo is :"+PhNo[number]);
					
				}
			}
			if(pgAddress!=null){
				for(int start=0;start<pgAddress.length;start++){
					System.out.println("pgAddress is :"+pgAddress[start]);
					
		
				}
			}
			
			if(homeAddress!=null){
				for(int start=0;start<homeAddress.length;start++){
					System.out.println("homeAddress is :"+homeAddress[start]);
					
					
				}
			}
			
			else{
			System.out.println("Invalid");	
			
			}
			
	
}
}