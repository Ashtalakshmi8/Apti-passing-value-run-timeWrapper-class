class Stringtochar{
	public static void main (String[]args)
	{
		for(int i=0;i<args.length;i++)
		{
			String f =args[i];
			for(int index=0;index<f.length();index++)
			{
			char ch=f.charAt(index);
			System.out.println("\t"+ch);
		}
	}
}
}
	
		