class KeyChainRunner{
	
	void runner(KeyChain keyChain){
		
		if (keyChain!=null){
			System.out.println("valid");
			
		}
		
		else{
			System.out.println("Invalid");
		}
		
		keyChain.info();
	}
}


