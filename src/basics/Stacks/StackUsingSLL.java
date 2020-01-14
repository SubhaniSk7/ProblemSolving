package basics.Stacks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StackUsingSLL implements Stack_interface {
	int length;
	SLLNode top;// head

	public static void main(String subhani[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StackUsingSLL stack = new StackUsingSLL();
		int choice, data;
		do {
			System.out.println("\n****************************\n\t1.Push\n\t" + "2.Pop\n\t" + "3.Top\n\t"
					+ "4.isEmpty\n\t" + "5.size\n\t" + "6.printStack\n\t" + "7.clearStack\n\t"
					+ "8.exit\n****************************" + "enter choice:");

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
			case 5:// size
				stack.size();
				break;
			case 6:// printStack
				stack.printStack();
				break;
			case 7:// clearStack
				stack.clearStack();
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
	public void push(int data) {
		SLLNode newNode = new SLLNode(data);
		newNode.setNext(top);
		top = newNode;
		length++;
	}

	@Override
	public void pop() {
		SLLNode temp = top;
		if (top == null)
			System.out.println("Stack is empty..");
		else if (top.getNext() != null) {
			top = temp.getNext();
			temp.setNext(null);
			length--;
		} else {
			top = null;
			length--;
		}
	}

	@Override
	public void top() {
		System.out.println("Top:" + top.getData());
	}

	@Override
	public boolean isEmpty() {
		return (length == 0);
	}

	@Override
	public void size() {
		System.out.println("size:" + length);
	}

	@Override
	public void printStack() {
		if (top == null) {
			System.out.println("Stack is Empty.");
		} else {
			SLLNode temp = top;
			while (temp != null) {
				System.out.println("|\t" + temp.getData() + "\t|\n-----------------");
				temp = temp.getNext();
			}
		}
	}

	@Override
	public void clearStack() {
		top = null;
		length = 0;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}
}
