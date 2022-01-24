//swapping of 2 num by different methods//
class Swappingg{
	public static void main(String[]args){
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		
		System.out.println("a before swapping values are..."+"\t   "+a);
		System.out.println("b before swapping values are..."+"\t   "+b);
		

		a=a+b;//10+20+30//
		b=a-b;//30-20-10//
		a=a-b;//30-10+20//
		System.out.println("  ter swapping values are..."+"\t   "+a);//
		System.out.println("b swapping values are..."+"\t   "+b);
		
		
	}
}
		