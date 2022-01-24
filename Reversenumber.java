class Reversenumber{
public static void main(String[]arg){
int rev=0;
int value=Integer.parseInt(args[0]);


for(;no!=0;no=no/10)
{
	rem=no%10;
	rev=rem+rev*10;
}
	System.out.println (rev);

}

}