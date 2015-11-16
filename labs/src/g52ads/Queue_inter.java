package g52ads;

public interface Queue_inter 
     {
	 
    
	public void enqueue (Object num) throws QueueFullException;
	
	public Object dequeue () throws QueueEmptyException;
	
	public boolean isEmpty();
	
	public boolean isFull();
	
	public void show();
	
	
	public int size();//return size
	
	
      }



