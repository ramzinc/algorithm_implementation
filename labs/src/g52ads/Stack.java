package g52ads;



public class Stack {
	int top = -1;
	int size = 7;
	int [] stack = new int[size];

	
  public static void main(String[] args)
	  {
	  	  
		
	         Stack v = new Stack();
	         v.push(10);
	         v.push(5);
	         v.push(15);
	         v.pop();
	         
	         
	         
	         
	  } 

         	public  void pop()
	            {
      		        if( top >= 0)// check that array has items  
      	            	{
      		        	 
      		             System.out.print(stack[top]);//print the digit popped
      		             top--;	    		
      			
      		            }else
      	           		System.out.println("stack empty ");
		
	             }


            public  void push (int element)
               {
	               if(top !=size -1)// check if array is full
	                 {
	            	    top++;// increase index to postion of array
		                stack[top] = element;// assign the element to the cuurent position in array
		                System.out.println(stack[top]);
		              }
	               else
		             System.out.println("System full");
	   
               }        

       public void peek()
       {// print the array list till the index 
    	   for (int i = 0;i <= top ;i++)
    	   {
    		   System.out.println(stack[i]);
    	   }
       }
}


