package basics.stacks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StackUsingFixedArrays implements Stack_interface {

	public static int capacity;
	public static int top = -1;
	public static int[] stackBin;

	public StackUsingFixedArrays() {
		super();
	}

	public static void main(String subhani[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter capacity:");
		capacity = Integer.parseInt(br.readLine());
		stackBin = new int[capacity];

		int choice, data;

		StackUsingFixedArrays stack = new StackUsingFixedArrays();
		do {
			System.out.println("\n****************************\n\t1.Push\n\t" + "2.Pop\n\t" + "3.Top\n\t"
					+ "4.isEmpty\n\t" + "5.isFull\n\t" + "6.size\n\t" + "7.printStack\n\t" + "8.clearStack\n\t"
					+ "9.exit\n****************************" + "enter choice:");

			choice = Integer.parseInt(br.readLine());
			switch (choice) {
			case 1:// Push
				System.out.println("enter data to push:");
				data = Integer.parseInt(br.readLine());
				stack.push(data);
				break;
			case 2:// Pop
				stack.pop();
				break;
			case 3:// Top
				stack.top();
				break;
			case 4:// isEmpty
				System.out.println(stack.isEmpty());
				break;
			case 5:// isFull
				System.out.println(stack.isFull());
				break;
			case 6:// size
				stack.size();
				break;
			case 7:// printStack
				stack.printStack();
				break;
			case 8:// clearStack
				stack.clearStack();
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
	public void push(int data) {
		if (isFull()) {
			System.out.println("Stack is Full.");
		} else {
			stackBin[++top] = data;
		}
	}

	@Override
	public void pop() {
		if (isEmpty()) {
			System.out.println("Stack is Empty.");
		} else {
			System.out.println("popped:" + stackBin[top]);
			top--;
		}
	}

	@Override
	public void top() {
		if (isEmpty()) {
			System.out.println("Stack is Empty.");
		} else {
			System.out.println("Top:" + stackBin[top]);
		}
	}

	@Override
	public boolean isEmpty() {
		return (top < 0);
	}

	@Override
	public boolean isFull() {
		return (top + 1 == capacity);
	}

	@Override
	public void size() {
		System.out.println("size:" + (top + 1));
	}

	@Override
	public void printStack() {
		if (isEmpty())
			System.out.println("Stack is Empty.");
		else {
			for (int i = top; i >= 0; i--)
				System.out.println("|\t" + stackBin[i] + "\t|\n-----------------\n");
		}
	}

	@Override
	public void clearStack() {
		stackBin = new int[capacity];
		top = -1;
	}
}
