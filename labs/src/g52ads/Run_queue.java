package g52ads;

public class Run_queue {
public static void main (String[] args)
       {
	Queue_inter queue = new Queue();
	queue.enqueue(10);
	queue.enqueue(5);
	queue.enqueue(15);
	queue.enqueue(23);
	System.out.println("No. of elements "+ queue.size());
	System.out.println("Element to be removed "+ queue.dequeue());
	
    queue.show();
    queue.enqueue(7);
    queue.show();
    System.out.println(queue.dequeue());
    queue.enqueue(32);
    queue.show();
    queue.enqueue(45);
    queue.show();  
	}
}
