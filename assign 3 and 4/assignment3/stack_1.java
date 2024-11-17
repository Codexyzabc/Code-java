/*1. Create a class Stack that declares a stack and the methods to perform push ( ), pop ( ) and 
display( ) operations on the stack. Create two stacks and write a menu-driven program to 
perform operations on the two stacks. Whenever the number of elements in the two stacks 
becomes equal, a message should automatically be generated displaying the number of elements 
in each stack.
*/
package assignment3;


import java.util.Scanner;

class Stack1 {
    int top;
    int stackArray[];
    int maxsize = 100;

    public Stack1() {
        this.stackArray = new int[maxsize];
        this.top = -1;
    }

    public boolean isFull() {
        return top == maxsize - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full, can't push elements.");
        } else {
            top = top + 1;
            stackArray[top] = data; // pre-increment then push
            System.out.println(data + " is pushed successfully");
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is already empty, can't pop.");
        } else {
            int var = stackArray[top];
            top = top - 1; // post-decrement
            System.out.println(var + " is the popped element");
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Elements are: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }

    public int getSize() {
        return top + 1;
    }

    public static boolean checkEqual(Stack1 stack1, Stack1 stack2) {
        if (stack1.getSize() == stack2.getSize()) {
            System.out.println("Number of elements in each stack is equal.");
            System.out.println("Stack 1 size: " + stack1.getSize());
            System.out.println("Stack 2 size: " + stack2.getSize());
            return true;
        }
        return false;
    }
}

public class pr1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack1 stack1 = new Stack1();
        Stack1 stack2 = new Stack1();

        while (true) {
            System.out.println();
            System.out.println("Press 1 to insert into stack1");
            System.out.println("Press 2 to insert into stack2");
            System.out.println("Press 3 to pop from stack1");
            System.out.println("Press 4 to pop from stack2");
            System.out.println("Press 5 to display stack1");
            System.out.println("Press 6 to display stack2");
            System.out.println("Press 7 to exit");
            System.out.println("Enter the choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the element to insert: ");
                    int data = sc.nextInt();
                    stack1.push(data);
                    Stack1.checkEqual(stack1, stack2);
                    break;
                case 2:
                    System.out.println("Enter the element to insert: ");
                    int data1 = sc.nextInt();
                    stack2.push(data1);
                    Stack1.checkEqual(stack1, stack2);
                    break;
                case 3:
                    stack1.pop();
                    Stack1.checkEqual(stack1, stack2);
                    break;
                case 4:
                    stack2.pop();
                    Stack1.checkEqual(stack1, stack2);
                    break;
                case 5:
                    stack1.display();
                    break;
                case 6:
                    stack2.display();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong Choice: ");
            }
        }
    }
}
/* OUTPUT 
  Press 1 to insert into stack1
Press 2 to insert into stack2
Press 3 to pop from stack1
Press 4 to pop from stack2
Press 5 to display stack1
Press 6 to display stack2
Press 7 to exit
Enter the choice: 
1
Enter the element to insert: 
2
2 is pushed successfully

Press 1 to insert into stack1
Press 2 to insert into stack2
Press 3 to pop from stack1
Press 4 to pop from stack2
Press 5 to display stack1
Press 6 to display stack2
Press 7 to exit
Enter the choice: 
1
Enter the element to insert: 
3
3 is pushed successfully

Press 1 to insert into stack1
Press 2 to insert into stack2
Press 3 to pop from stack1
Press 4 to pop from stack2
Press 5 to display stack1
Press 6 to display stack2
Press 7 to exit
Enter the choice: 
1
Enter the element to insert: 
4
4 is pushed successfully

Press 1 to insert into stack1
Press 2 to insert into stack2
Press 3 to pop from stack1
Press 4 to pop from stack2
Press 5 to display stack1
Press 6 to display stack2
Press 7 to exit
Enter the choice: 
1
Enter the element to insert: 
5
5 is pushed successfully

Press 1 to insert into stack1
Press 2 to insert into stack2
Press 3 to pop from stack1
Press 4 to pop from stack2
Press 5 to display stack1
Press 6 to display stack2
Press 7 to exit
Enter the choice: 
2
Enter the element to insert: 
2
2 is pushed successfully

Press 1 to insert into stack1
Press 2 to insert into stack2
Press 3 to pop from stack1
Press 4 to pop from stack2
Press 5 to display stack1
Press 6 to display stack2
Press 7 to exit
Enter the choice: 
2
Enter the element to insert: 
6
6 is pushed successfully

Press 1 to insert into stack1
Press 2 to insert into stack2
Press 3 to pop from stack1
Press 4 to pop from stack2
Press 5 to display stack1
Press 6 to display stack2
Press 7 to exit
Enter the choice: 
2
Enter the element to insert: 
9
9 is pushed successfully

Press 1 to insert into stack1
Press 2 to insert into stack2
Press 3 to pop from stack1
Press 4 to pop from stack2
Press 5 to display stack1
Press 6 to display stack2
Press 7 to exit
Enter the choice: 
2
Enter the element to insert: 
6
6 is pushed successfully
Number of elements in each stack is equal.
Stack 1 size: 4
Stack 2 size: 4

Press 1 to insert into stack1
Press 2 to insert into stack2
Press 3 to pop from stack1
Press 4 to pop from stack2
Press 5 to display stack1
Press 6 to display stack2
Press 7 to exit
Enter the choice: 
5
Elements are: 
2 3 4 5 

Press 1 to insert into stack1
Press 2 to insert into stack2
Press 3 to pop from stack1
Press 4 to pop from stack2
Press 5 to display stack1
Press 6 to display stack2
Press 7 to exit
Enter the choice: 
6
Elements are: 
2 6 9 6 

Press 1 to insert into stack1
Press 2 to insert into stack2
Press 3 to pop from stack1
Press 4 to pop from stack2
Press 5 to display stack1
Press 6 to display stack2
Press 7 to exit
Enter the choice: 
3
5 is the popped element

Press 1 to insert into stack1
Press 2 to insert into stack2
Press 3 to pop from stack1
Press 4 to pop from stack2
Press 5 to display stack1
Press 6 to display stack2
Press 7 to exit
Enter the choice: 
4
6 is the popped element
Number of elements in each stack is equal.
Stack 1 size: 3
Stack 2 size: 3

Press 1 to insert into stack1
Press 2 to insert into stack2
Press 3 to pop from stack1
Press 4 to pop from stack2
Press 5 to display stack1
Press 6 to display stack2
Press 7 to exit
Enter the choice: 
7
 */



