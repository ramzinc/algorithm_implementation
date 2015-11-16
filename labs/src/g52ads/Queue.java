package g52ads;

public class Queue implements Queue_inter
{
	public static final int capacity = 6;
	public  Object[] Q;
	private final int N  ;
	private int f = 0;// front 
	private int r =  0;// rear 

      public Queue()
        {
	      this(capacity);// instance of the size 
        }
     public Queue(int capacity)
           {
         	N = capacity;
	        Q = new Object[N];// array size of 5
	        }
     public int size()
            {
    	 if (r>f)
    		 return r - f;// size  left if rear is great 
    	     return N - f  + r;
            }
     
    public boolean isEmpty()
    {
    	return(r==f) ? true : false;// equal to zero
    }

public boolean isFull()
       {
	int diff = r - f;// pointers difference to check whether the circle is complete
	if(diff == -1 || diff == (N - 1))//front surpasses rear
		return true;
	return false;    //else
       }
public void  enqueue(Object num) throws QueueFullException
         {
	
	if(isFull())
	          {
		throw new QueueFullException("Queue is full");//exception string message
	          }else{
	        	  Q[r] = num;// insert item at the rear index
	          r= (r + 1) % N;//  increment absolute index
	         
	          }
	     }
public Object dequeue() throws QueueEmptyException
    {
	Object item;
	if (isEmpty())
	{
		throw new QueueEmptyException();
	}else 
	      {
		item = Q[f];
		Q[f]= null;// make the index entry  null
	      f = (f + 1)% N;// muv the index front forward relative to size
	      }
    return item;
    }
public void show()
{

	int x= size();
	for (int i=0;i<= x;i++)
	{
		System.out.println(Q[i]);
	}
	}


}
