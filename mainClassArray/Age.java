class Age{

public static void main(String[] value){
	

//String[] value -is a string array which accepts command line arguments


int size=value.length; //size of the array(number of elements in array)



if (size==2){
	
	String name=value[0];// first element is name
	String age=value[1];//2nd element is age
	
	System.out.println("\n Argument length is acceptable :) "+"Size is =" +size);
	System.out.println("\nArray:"+value);
	
	
	 
	//Integer.valueOf(age) or Integer.parseInt(age) --type conversion methods 
	
	int convertedAge=Integer.valueOf(age);// age is converted into integer b/z in this array everything is considered as string .
   
	
		if(convertedAge>=18){
			System.out.println("\nEligible to vote");
		}
		else{
			System.out.println("\nNot eligible to vote");
		}
	}
else{
	System.out.println("\nArgument length is not acceptable :( \nplease provide 2 elements");

 }


}

}