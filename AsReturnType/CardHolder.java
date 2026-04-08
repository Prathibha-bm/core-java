class CardHolder{
	
	public Card cardInfo(){
		
		System.out.println("Running a method with class as return type");
		
		Card refCard=new Card();
		
		refCard.type="CreditCard";
		refCard.no=123456789;
		refCard.validityInYears=5;
	
		return refCard;
		
		}
}