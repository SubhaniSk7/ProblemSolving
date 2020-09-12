package basics.queues;

public interface Queue_interface {
	
	public void enqueue(int data);

	public void dequeue();

	public void front();

	public boolean isEmpty();

	public boolean isFull();

	public void size();

	public void printQueue();

	public void clearQueue();
}
