class KeyChainRunner{
	
	void runner(KeyChain keyChain){
		
		if (keyChain!=null){
			System.out.println("valid");
			keyChain.info();
		}
		
		else{
			System.out.println("Invalid");
		}
		
		
	}
}


