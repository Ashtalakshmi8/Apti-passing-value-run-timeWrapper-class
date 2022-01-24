class Fact{
	public static void main (String[]args)
	{
		int begning =Integer.parseInt(args[0]);
		int stop =Integer.parseInt(args[1]);
		
		int fact=1;
		for(;begning<=stop;begning++){
			for(int i=1;i<=begning;i++){
				
				fact=fact*i;
			}
			
			System.out.println("fact of "+ begning+"is"+ fact);
			fact=1;
		}
	}
	
		
		}
		
			
		
	