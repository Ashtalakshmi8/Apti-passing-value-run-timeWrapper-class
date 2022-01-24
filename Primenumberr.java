class Primenumberr{
	public static void main (String[]args){
		int value =0;
		for (int i=0;i<args.length;i++)//not prime //
		{
		int number=Integer.parseInt(args[i]);
			for (int j=2;j<=number /2;j++)//this for prime//
			{
				if (number %2==0)
				{
					System.out.println("not prime number "+number );
					value=1;
					break;
				
				}
			}
					if (value==0)
					{
					System.out.println("prime number "+number );
			
					}	
			
		}
		
	}
}
//first check given no ex. if no is 8 den (8-1)=7 line no 6