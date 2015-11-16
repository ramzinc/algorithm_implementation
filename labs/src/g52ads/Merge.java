package g52ads;

import java.util.Arrays;


public class Merge {
	
	public static int [] s1 = new int[]{5,5,5,7,6};
	public  static int [] s2 = new int[]{7,5,7,6,5};
	
	public static void main(String [] args )
	{
		Merge meg = new Merge();// class costructor
		int[] l1;
		int[] l2;
		l1 = meg.sort(s1);
		l2 = meg.sort(s2);
		int [] list_new = new int [s1.length + s2.length];
		System.out.print(Arrays.toString(l2));
		//list_new = meg.merge(l1, l2);
		//System.out.print(list_new);
	  
	}
	
	
	public   int[] sort(int [] list)
	
	{
		int tmp,pass;
		for (int i = 0 ; i <= list.length -2 ; i ++)
		{
		 if(list[i] > list[i+1]){// check which element in the list is smaller ascending 
			 tmp = list[i];
			 list[i] = list[i+1];
		     list[i+1] = tmp;
		       }
		 else if (list[i]< list[i+1])
			 tmp = list[i];
		     
			 continue;
		 }
		return list;
	}
	
  public int[] merge(int[] left ,int [] right )
  {
	 int[] temp = new int [s1.length + s2.length];// combination of arrays  
	  int i = 0 ;// left pointer 
	  int j = 0 ;// right pointer
	  if (left.length != right.length)
		  System.out.print("the array lists are not equal");
	  
	  for (int x =0; x <= temp.length-2; x++ )
	  {
		  
		  if(left[i] < right[j])
		  {
			  temp[x]= left[i];// equate the temp to the smaller no.
		       i++;
		       
		  }else if (left[i]== right[j])
		     {
			  temp[x] = left[i];   // equate the temp to both posn 
			  
			  temp[x+1] = right[j];// equate the next posn to the second repetition
		      i++;
		      j++;
		      x=+1;// forward the for loop
		      }
		  else if(right[j] < left[i]){
			  temp[x] = right[j];
		      
		       j++;
		   } else if (i > left.length - 1){
			   temp[x]= right[j];
		         j++;}
		         else if (j > right.length-1)
		        	 temp[x] = left[i];
		             
	     
	  }
	  
	  return temp;
  }

}
