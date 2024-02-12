/*1. Design the Stack Using Generic Class that can contain any type of data. Implement the insertion,
deletion, peek function. */

import java.util.*;

class GenericStack<T>{
    public int top=-1;
    public int size;
    public Object[] array;

    public GenericStack(int size){
        this.size=size;
        this.array=new Object[size];

    }

    public boolean isFull(){
        return top==size-1;
    }
    public boolean isEmpty(){
        return top==-1;
    }

    public void push(T data){
        if(isFull()){
            System.out.println("Stack Overflows!!");
        }
        else{
            top=top+1;
            array[top]=data;
            System.out.println(data+" is pushed successfully");

        }
    }
    public T pop(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return null;
        }
        else{
             T val = (T)array[top];
             top=top-1;
             return val;
        }

    }

    public T peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;

        }
        else{
             T val = (T)array[top];
             return val;

        }
    }



}

public class Problem1 {

     public static void main(String[] args) {
        GenericStack<Integer> stack1= new GenericStack<>(5);
        GenericStack<String> stack2= new GenericStack<>(5);


        stack1.push(5);
        stack1.push(7);
        stack1.push(8);
        Integer poppeditem=stack1.pop();
        if(poppeditem!=null){
            System.out.println("popped item is "+ poppeditem);
        }
        Integer peekeditem=stack1.peek();
        if(peekeditem!=null){
            System.out.println("peeked item is "+ peekeditem);
        }
        

        stack2.push("sougota");
        stack2.push("subrata");
        stack2.push("subham");
        
        String poppeditem1=stack2.pop();
        if(poppeditem1!=null){
            System.out.println("popped item is "+ poppeditem1);
        }
        String peekeditem1=stack2.peek();
        if(peekeditem1!=null){
            System.out.println("peeked item is "+ peekeditem1);
        }

     }
}


/*5 is pushed successfully
7 is pushed successfully
8 is pushed successfully
popped item is 8
peeked item is 7
sougota is pushed successfully
subrata is pushed successfully
subham is pushed successfully
popped item is subham
peeked item is subrata
PS D:\Heritage(MCA)\Java\Assign(me)\generics>  */