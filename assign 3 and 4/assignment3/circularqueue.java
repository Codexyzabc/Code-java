import java.util.*;

class CircularQueue {
    int rear;
    int front;
    int size;
    int queueArray[];

    public CircularQueue(int size) {
        this.rear = -1;
        this.front = -1;
        this.size = size;
        this.queueArray = new int[size];
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return (rear + 1) % size == front;
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue overflows!");
            return;
        }
        if (isEmpty()) {
            front = 0;
        }
        rear = (rear + 1) % size;
        queueArray[rear] = data;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue underflows");
            return -1; // Indicate empty queue
        }
        int value = queueArray[front];
        if (front == rear) { // Only one element was present
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }
        return value;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Elements are:");
        int i = front;
        while (true) {
            System.out.print(queueArray[i] + " ");
            if (i == rear) {
                break;
            }
            i = (i + 1) % size;
        }
        System.out.println();
    }
}

public class pr2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of queue: ");
        int size = sc.nextInt();
        CircularQueue queue = new CircularQueue(size);
        int choice;

        do {
            System.out.println("Press 1 for insertion");
            System.out.println("Press 2 for deletion");
            System.out.println("Press 3 to display");
            System.out.println("Press 4 to quit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter value to insert: ");
                    int value = sc.nextInt();
                    queue.enqueue(value);
                    break;
                case 2:
                    int val = queue.dequeue();
                    if (val != -1) {
                        System.out.println("Deleted element is: " + val);
                    }
                    break;
                case 3:
                    queue.display();
                    break;
                case 4:
                    System.out.println("Quitting the system");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        sc.close();
    }
}
