package basics.queues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import basics.stacks.SLLNode;

public class QueueUsingSLL implements Queue_interface {
	int length;
	SLLNode front, rear;

	public static void main(String subhani[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int choice, data;

		QueueUsingSLL queue = new QueueUsingSLL();
		do {
			System.out.println("\n****************************\n\t1.Enqueue\n\t" + "2.Dequeue\n\t" + "3.Front\n\t"
					+ "4.isEmpty\n\t" + "5.size\n\t" + "6.printQueue\n\t" + "7.clearQueue\n\t"
					+ "8.exit\n****************************" + "enter choice:");

			choice = Integer.parseInt(br.readLine());
			switch (choice) {
			case 1:// enqueue
				System.out.println("enter data to push:");
				data = Integer.parseInt(br.readLine());
				queue.enqueue(data);
				break;
			case 2:// dequeue
				queue.dequeue();
				break;
			case 3:// Top
				queue.front();
				break;
			case 4:// isEmpty
				System.out.println(queue.isEmpty());
				break;
			case 5:// size
				queue.size();
				break;
			case 6:// printQueue
				queue.printQueue();
				break;
			case 7:// clearQueue
				queue.clearQueue();
				break;
			case 8:// exit
				System.out.println("bye bye..");
				System.exit(0);
				break;
			default:
				System.out.println("Choose correct choice..");
				break;
			}
		} while (choice != 8);

	}

	@Override
	public void enqueue(int data) {
		SLLNode newNode = new SLLNode(data);
		if (isEmpty()) {
			front = rear = newNode;
		} else {
			rear.setNext(newNode);
			rear = newNode;
		}
		length++;
	}

	@Override
	public void dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is Empty.");
		} else {
			SLLNode temp = front;
			if (front.getNext() != null) {
				front = temp.getNext();
				temp.setNext(null);
			} else {
				front = rear = null;
			}
		}
		length--;
	}

	@Override
	public void front() {
		if (isEmpty())
			System.out.println("Queue is Empty.");
		else
			System.out.println("Front:" + front.getData());
	}

	@Override
	public boolean isEmpty() {
		return (length == 0);
		// return front==null
		// return rear==null
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public void size() {
		System.out.println("Size:" + length);
	}

	@Override
	public void printQueue() {
		if (isEmpty()) {
			System.out.println("Stack is Empty.");
		} else {
			SLLNode temp = front;
			while (temp != null) {
				System.out.print(" " + temp.getData() + " |");
				temp = temp.getNext();
			}
		}
	}

	@Override
	public void clearQueue() {
		front = null;
		rear = null;
		length = 0;
	}
}
