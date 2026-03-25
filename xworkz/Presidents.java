class Presidents{
	
	public static void main(String[] args){
		String[] countries = {"India", "United States", "France", "Russia", "China", "Brazil", "Germany", "Italy","South Korea", "Indonesia", "Turkey", "Argentina", "Mexico", "Egypt", "Nigeria","Philippines", "Ukraine", "Bangladesh", "Sri Lanka", "Nepal", "UAE", "Israel","Iran", "Kenya", "Colombia", "Chile", "Peru", "Singapore", "Vietnam", "South Africa", "Pakistan", "Afghanistan", "Iraq", "Saudi Arabia", "Thailand", "Malaysia", "Japan", "Canada", "Australia", "New Zealand", "Spain", "Portugal","Netherlands", "Belgium", "Sweden", "Norway", "Denmark", "Finland", "Poland","Czech Republic", "Greece", "Hungary", "Austria", "Switzerland", "Ireland","Iceland", "Romania", "Bulgaria", "Croatia", "Serbia", "Slovakia","Slovenia", "Estonia", "Latvia", "Lithuania"};
			for (int person=0;person<countries.length;person++)
			{
			    String[] members= Country.getPresidentsByCountry(countries[person]);
				
				
				if (members != null) {
					for(int ing=0;ing<members.length;ing++){
						
					System.out.println(members[ing]);
			}

			}
			}
	}
}

