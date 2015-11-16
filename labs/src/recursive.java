import java.util.Scanner;

public class recursive {
	
	public static void main (String[] args)
	{
	
	System.out.println("enter the factorial no.");
	Scanner digit = new Scanner (System.in);
	int num = digit.nextInt();
	int y = rec(num);
	 System.out.println("the no you require is  "+ y);
	}
	
   public static int rec (int x)
	   {
		 int y;
		int store= 1 ;
		int i;	
     if (x <= 0)
      
 	     y = 1;
 	
       else 
    	  store = x * rec(x-1);

    return store;
	   }

}
