package basics.queues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QueueUsingFixedArray implements Queue_interface {
	public static int capacity, front, rear;
	public static int[] queueBin;

	public static void main(String subhani[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter capacity=(#elements+1):");
		capacity = Integer.parseInt(br.readLine());
		queueBin = new int[capacity];

		int choice, data;

		QueueUsingFixedArray queue = new QueueUsingFixedArray();
		do {
			System.out.println("\n****************************\n\t1.Enqueue\n\t" + "2.Dequeue\n\t" + "3.Front\n\t"
					+ "4.isEmpty\n\t" + "5.isFull\n\t" + "6.size\n\t" + "7.printQueue\n\t" + "8.clearQueue\n\t"
					+ "9.exit\n****************************" + "enter choice:");

			choice = Integer.parseInt(br.readLine());
			switch (choice) {
			case 1:// Enqueue
				System.out.println("enter data to push:");
				data = Integer.parseInt(br.readLine());
				queue.enqueue(data);
				break;
			case 2:// Dequeue
				queue.dequeue();
				break;
			case 3:// Front
				queue.front();
				break;
			case 4:// isEmpty
				System.out.println(queue.isEmpty());
				break;
			case 5:// isFull
				System.out.println(queue.isFull());
				break;
			case 6:// size
				queue.size();
				break;
			case 7:// printQueue
				queue.printQueue();
				break;
			case 8:// clearQueue
				queue.clearQueue();
				break;
			case 9:// exit
				System.out.println("bye bye..");
				System.exit(0);
				break;
			default:
				System.out.println("Choose correct choice..");
				break;
			}
		} while (choice != 9);

	}

	@Override
	public void enqueue(int data) {
		if (isFull())
			System.out.println("Queue is Full");
		else {
			rear = (rear + 1) % capacity;
			queueBin[rear] = data;
		}
	}

	@Override
	public void dequeue() {
		if (isEmpty())
			System.out.println("Queue is Empty.");
		else {
			front = (front + 1) % capacity;
			System.out.println("Dequeued:" + queueBin[front]);
		}
	}

	@Override
	public void front() {
		if (isEmpty())
			System.out.println("Queue is Empty.");
		else
			System.out.println("Front:" + queueBin[(front + 1) % capacity]);
	}

	@Override
	public boolean isEmpty() {
		return front == rear;
	}

	@Override
	public boolean isFull() {
		return (rear + 1) % capacity == front;
	}

	@Override
	public void size() {
		if (isEmpty())
			System.out.println("Queue is Empty.");
		else
			System.out.println("#elements:" + (rear - front) % capacity);
	}

	@Override
	public void printQueue() {
		if (isEmpty())
			System.out.println("Queue is Empty.");
		else {
			for (int i = (front + 1) % capacity; i <= rear % capacity; i++)
				System.out.print(" " + queueBin[i] + "  |");
		}
	}

	@Override
	public void clearQueue() {
		queueBin = new int[capacity];
		front = 0;
		rear = 0;
	}
}