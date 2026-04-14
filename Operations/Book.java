class Book{

String[] names=new String[5];
int index=0;


  void saveBookName(String name){
		  
	
	
		 
		if(name!=null){
	
				if (this.index<this.names.length){
					System.out.println("\nBook name is not null we can save");
					
					this.names[this.index]=name;
					System.out.println("Book name "+name+" is saved in index: "this.index);
				    this.index++;
	           }
			   else{
				   System.out.println("\nArray sizes is full ");
			   }
			   
		}

	   else{
		System.out.println("\nBook name is null we cannot save");
	   }
		
  }


  
 void searchBook(String bookName){
	boolean found=false;
	
	
	if(bookName!=null){
		
		for(String temp:this.names){
			if (bookName==temp){
				System.out.println("\nBook name is found: at index "+this.index);
				found=true;
				 break;
			}
		}
			
	        if(!found)
			{
				
			 System.out.println("\nBook name is not found");
		
		    }
		}
	
	else{
		System.out.println("\nBook name is null");
	}
			
		
 }
}