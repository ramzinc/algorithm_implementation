package g52ads;
import java.util.Random;
import java.security.SecureRandom;

public class Bubble_sort {
	public static int  size = 10 ;

	public static void main (String [] args )
	{
		//Bubble_sort sort = new Bubble_sort();// class constructor 
	
		String list = new String() ;
		list = rand_gen();
	//	 System.out.print("\nsorted list " + list );	
		char [] tempArray = new char[size];// create a temp array t hold the xters		
		//for(int k=1;k < list.length()-1  ; k++)
		for (int count = 1; count < list.length()-1;count++)
		{
			for (int i =0 ; i < list.length()-2;i++)
			{
			
		  tempArray[i] = new Character(list.charAt(i));// get the random characters into an array 
                                      //	 System.out.print(tempArray);	
		  int y,j;
		 y =(int) tempArray[i]; // convert the characters to ascii by typecasting 
		 j=  (int)tempArray[i + 1];// get the next character in the array
	//	System.out.print(y);
		//System.out.print("\n"+j);
		// tempArray[i]= (char)swap(y,j); // typecast int to respective ascii char
		 //System.out.print(tempArray[i]);
			
			tempArray[i]=(char)swap(y,j);
			} 
		                    //	list = String.valueOf(tempArray);
		
		
		
		
		}
		//list = String.valueOf(tempArray[i]);
		
		System.out.print("unsorted list " + rand_gen());  
    		System.out.print("\nsorted list " + list );		

		
	
	
	
	}
	
               	public static int  swap (int x, int y)
                   {
	                   if (x > y)
		                  return x;
                            	 else
	                           return y;
                   }



   public static String rand_gen()
         {
	   StringBuilder ans = new StringBuilder();
	   Random rand = new SecureRandom();
	   String rand_list = "abcddefghijklmnopqrstuvwxyz0123456789@!&%ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    int rand_len = 10;
          for (int x = 0 ; x <= rand_len-1 ; x++)
          {
        	   ans = ans.append(rand_list.charAt(rand.nextInt(rand_list.length())));
          }
          String ans2 = ans.toString();
          //System.out.print(ans2 );	test
	      return ans2;
         }





















}

