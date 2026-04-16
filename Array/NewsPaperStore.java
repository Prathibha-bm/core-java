class NewsPaperStore{
 
NewsPaper[] newsPapers=new NewsPaper[100];

int index=0;
 
//Save method
void save(NewsPaper newsPaper){

		if(newsPaper!= null){

			if(this.index < this.newsPapers.length){

				System.out.println("newsPaper is not null we can store info");

				this.newsPapers[this.index] = newsPaper;
				System.out.println("newsPaper stored in index: "+this.index);
			
				this.index++;
			}
			else{
				System.out.println("Array is full");
			}
		}

		else{
			System.out.println(" Newspaper cannot be null");
		}
	}
	
	
	
	

/*void saveAll(NewsPaper[] allNewsPaper){
		if(allNewsPaper!= null){

			for(int start=0;start<allNewsPaper.length;start++){
				save(allNewsPaper[start]);
			}
		}
			
		else{
			System.out.println("Newspapers cannot be null");
		}
	
	}
*/
	
	//search metgod by name
void findByName(String name){
	
	if (name!=null){
		boolean found=false;
		
		
		for(int start=0;start<this.index;start++){

        if (this.newsPapers[start]!= null  && this.newsPapers[start].name!=null) {
			
			 if(name ==this.newsPapers[start].name){
				 System.out.println("Name found in index:"+start);
				 this.newsPapers[start].info();
				 found=true;
				 break;
		}
		
		}
		}
		if(!found){
			System.out.println("No matching newsPaper found");
		}
	}
		
		
	else{
		System.out.println("\n Name is null give a name...");
	}
	
	
}

//display method (all)
void display(){
			System.out.println("\n Not null we can do display operation");
				
			for(NewsPaper np:this.newsPapers){

				if(np!= null){
				  np.info();
				}
				else{
					System.out.println("Element is null");
				}
		  }  
	} 

	
	//search paperQuality by name 
void findPaperQualityByName(String name){	
	if (name!=null){
	
		for(int start=0;start<this.index;start++){

        if (this.newsPapers[start]!= null  && this.newsPapers[start].name!=null) {
			
			 if(name ==this.newsPapers[start].name){
				 System.out.println("\nRunning findPaperQualityByName:");
				 System.out.println("Name found at index:"+start);
				  
				  char quality=this.newsPapers[start].paperQuality;
				  System.out.println("Quality is : "+ quality);
		 }
		
		}
	
	
	else{
			System.out.println("No matching newsPaper found");
		}
		}
	
	}	
	else{
		System.out.println("\n Name is null give a name...");
		
	}
	
	
}


//search number of pages by name and headEditor
int findNoOfPagesByNameAndHeadEditor(String name,String headEditor){
	if (name!=null && headEditor!=null){
		
		for(int start=0;start<this.index;start++){

         if (this.newsPapers[start]!= null && this.newsPapers[start].name!= null  && this.newsPapers[start].headEditor!=null) {
			
			 if(name ==this.newsPapers[start].name &&  headEditor==this.newsPapers[start].headEditor){
				  System.out.println("\nRunning findNoOfPagesByNameAndHeadEditor: ");
				 System.out.println("Name found at index:"+start);
				  
				  int noOfPages=this.newsPapers[start].noOfPages;
				  System.out.println("noOfPages are: "+ noOfPages);
				  return noOfPages;
		 }
		
		}
		
		
	
	else{
			System.out.println("No matching newsPaper found");
		}
		
		}
	
	}	
	else{
		System.out.println("\nplease provide input");
		
	}

return 0;	
}




//updating language by name
 void updateLangByName(String name,Language newLang){
	
	if (name!=null && newLang!=null){
		
	
		for(int start=0;start<this.index;start++){

        if (this.newsPapers[start]!= null  && this.newsPapers[start].name!=null && this.newsPapers[start].lang!=null) {
			
			 if(name ==this.newsPapers[start].name){
				 System.out.println("\nRunning updateLangByName:");
				 System.out.println("Name found at index:"+start);
				 System.out.println("\nBefore updating: ");
				 newsPapers[start].info();
				  
				  this.newsPapers[start].lang=newLang;
				  Language updatedLang=this.newsPapers[start].lang;
				  System.out.println("Updated Languge is : "+ updatedLang);
				  System.out.println("\nAfter updating: ");
				  newsPapers[start].info();
		 }
		
		}
	
	
	else{
			System.out.println("No match found");
		}
		}
	
	}	
	else{
		System.out.println("\nplease provide input");
		
	}
	


	}
	
	
	
	
	
//updating color,noOfImages and Size by name ,height, and weight
void updateInkColorAndNoOfImagesAndFontSizeByNameAndHeightAndWeight (Color inkColor,int noOfImages,int fontSize,String name,double height,double weight){
	
	if (name!=null && height!=0.0 && weight!=0.0 &&  inkColor!=null && noOfImages!=0  && fontSize!=0){
		
	
		for(int start=0;start<this.index;start++){

			if (this.newsPapers[start]!= null  && this.newsPapers[start].name!=null && this.newsPapers[start].heightInCm!=0.0 &&  this.newsPapers[start].weightInGrams!=0.0 &&  this.newsPapers[start].inkColor!=null &&  this.newsPapers[start].noOfImages!=0 &&  this.newsPapers[start].fontSize!=0) {
			
				if(name ==this.newsPapers[start].name && height==this.newsPapers[start].heightInCm && weight==this.newsPapers[start].weightInGrams){
				 System.out.println("\nRunning updateInkColorAndNoOfImagesAndFontSizeByNameAndHeightAndWeight :");
				 System.out.println("Name found at index:"+start);
				 System.out.println("\nBefore updating: ");
				 newsPapers[start].info();
				  
				  //updating color
				  this.newsPapers[start].inkColor=inkColor;
				  Color updatedColor=this.newsPapers[start].inkColor;
				  System.out.println("\nUpdated color is : "+ updatedColor);
				  
				  
				  //updating number of images
				  this.newsPapers[start].noOfImages=noOfImages;
				  int updatedNoOfImages=this.newsPapers[start].noOfImages;
				  System.out.println("\nUpdated number of images is : "+ updatedNoOfImages);
				  
				  //updating number of fontSize
				  this.newsPapers[start].fontSize=fontSize;
				  int updatedFontSize=this.newsPapers[start].fontSize;
				  System.out.println("\nUpdated fontSize is : "+ updatedFontSize);
				  
				  System.out.println("\nAfter updating color,noOfImages and fontSize : ");
				  newsPapers[start].info();
		 }
		
		}
	
	
	else{
			System.out.println("No matching newsPaper found");
		}
		}
	
	}	
	else{
		System.out.println("\nInput is null.");
		
	}
	
	
}



//replacing by address

void replaceByPrintHouseAddress(String printHouseAddress,NewsPaper newsPaper){
	
	if (printHouseAddress!=null && newsPaper!=null){
		
	
		for(int start=0;start<this.index;start++){

        if (this.newsPapers[start]!= null  && this.newsPapers[start].printHouseAddress!=null) {
			
			 if(printHouseAddress==this.newsPapers[start].printHouseAddress){
				 System.out.println("\nRunning replaceByPrintHouseAddress:");
				 System.out.println("found at index:"+start);
				 System.out.println("\nBefore replacing: ");
				 newsPapers[start].info();
				  
				  this.newsPapers[start]=newsPaper;
				  
				  NewsPaper np=this.newsPapers[start];
				  System.out.println("Replaced newsPaper is : "+ np);
				  System.out.println("\nAfter replacing: ");
				  newsPapers[start].info();
		 }
		
		}
	
	
	else{
			System.out.println("No matching newsPaper found");
		}
		}
	
	}	
	else{
		System.out.println("\n address is null  .");
		
	}
	


	}


}


	
	