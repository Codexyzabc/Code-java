/*2. Create a class Queue to implement queue data structure with constructors. Define suitable 
methods for insertion & deletion of elements to & from the queue. Write a program for this, 
clearly specifying the overflow & underflow conditions. */


package assignment3;

import java.util.*;

class Queue1{
	int rear;
	int front;
	int size;
	int queuearray[];
	public Queue1(int size) {
		this.rear=-1;
		this.front=-1;
		this.size=size;
		this.queuearray=new int[size];		
	}
	
	public boolean isEmpty() {
		if(rear==-1 && front==-1) {
			return true;
		}
		return false;
		
	}
	public boolean isFull() {
		if(rear==size-1) {
			return true;
		}
		return false;
	}
	public void enqueue(int data) {
		if(isFull()) {
			System.out.println("Queue overflows!");
			return;
		}
		if(front==-1) {
			front=0;
		}
		rear=rear+1;
		queuearray[rear]=data;
	}
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue underflows");
			
		}
		if(front>rear) {
			rear=-1;
			front=-1;
		}
		int value=queuearray[front];
		front=front+1;
		return value;
		
	}
	public void display() {
		System.out.println("Elements are ");
		for(int i=front;i<=rear;i++) {
			System.out.print(queuearray[i]+ " ");
		}
		System.out.println();
	}
}


public class pr2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of queue: ");
		int size=sc.nextInt();
		Queue1 que=new Queue1(size);
		int choice;
		
		do {
			System.out.println("press 1 for insertion ");
			System.out.println("press 2 for deletion ");
			System.out.println("press 3 to display ");
			System.out.println("press 4 to quit ");
			System.out.println("Enter your choice ");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1: System.out.println("Enter value to insert ");
			        int value=sc.nextInt();
			        que.enqueue(value);
			        break;
			case 2: int val=que.dequeue();
			        System.out.println("Deleted element is "+ val);
			        break;
			case 3: que.display();
			        break;
			case 4: System.out.println("Quitting the system ");
			        System.exit(0);
			        break;
			default: 
				    System.out.println("Invalid choice!");
			}
			
		}while(choice!=4);
		
		
		
    sc.close();
	}

}


/* OUTPUT 
  Enter the size of queue: 
4
press 1 for insertion 
press 2 for deletion 
press 3 to display 
press 4 to quit 
Enter your choice 
1
Enter value to insert 
6
press 1 for insertion 
press 2 for deletion 
press 3 to display 
press 4 to quit 
Enter your choice 
1
Enter value to insert 
8
press 1 for insertion 
press 2 for deletion 
press 3 to display 
press 4 to quit 
Enter your choice 
1
Enter value to insert 
9
press 1 for insertion 
press 2 for deletion 
press 3 to display 
press 4 to quit 
Enter your choice 
1
Enter value to insert 
7
press 1 for insertion 
press 2 for deletion 
press 3 to display 
press 4 to quit 
Enter your choice 
1
Enter value to insert 
5
Queue overflows!
press 1 for insertion 
press 2 for deletion 
press 3 to display 
press 4 to quit 
Enter your choice 
3
Elements are 
6 8 9 7 
press 1 for insertion 
press 2 for deletion 
press 3 to display 
press 4 to quit 
Enter your choice 
2
Deleted element is 6
press 1 for insertion 
press 2 for deletion 
press 3 to display 
press 4 to quit 
Enter your choice 

3
Elements are 
8 9 7 
press 1 for insertion 
press 2 for deletion 
press 3 to display 
press 4 to quit 
Enter your choice 
4
Quitting the system 
*/
