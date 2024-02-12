/*2. Design the Queue Using Generic Class that can contain any type of data. Implement the
insertion, deletion methods. */

import java.util.*;

class GenericQueue<T>{
    int rear=-1;
    int front=-1;
    int size;
    public Object array[];

    public GenericQueue(int size){
        this.size=size;
        this.array=new Object[size];

    }

    public boolean isFull(){
        return rear==size-1;

    }
    public boolean isEmpty(){
        if(rear==-1 && front ==-1){
            return true;
        }
        return false;
    }

    public void enQueue(T data){
         if(isFull()){
            System.err.println("Queue overflows!!");
         }
         else{
            if(front==-1){
                front=0;
            }
            rear=rear+1;
            array[rear]=data;
            System.out.println(data+" is inserted");

         }

    }

    public T deQueue(){
        if(isEmpty()){
            System.out.println("Queue Underflows!!");
            return null;
        }
        else{
            if(front>rear){
                rear=-1;
                front=-1;
            }
            T val= (T)array[front];
            front=front+1;
            return val;
        }

    }

}

public class Problem2 {

    public static void main(String[] args) {
        GenericQueue<Integer> q1= new GenericQueue<>(5);
        GenericQueue<String> q2= new GenericQueue<>(5);


        q1.enQueue(6);
        q1.enQueue(8);
        q1.enQueue(10);
        Integer del=q1.deQueue();
        if(del!=null){
            System.out.println("deleted element is "+del);
        }


        q2.enQueue("Sougota");
        q2.enQueue("Subham");
        q2.enQueue("Souvik");
        q2.enQueue("Raj");

        
        

        String st=q2.deQueue();
        if(st!=null){
             System.out.println("deleted element is "+st);
        }
    }
}




/*6 is inserted
8 is inserted
10 is inserted
deleted element is 6
Sougota is inserted
Subham is inserted
Souvik is inserted
Raj is inserted
deleted element is Sougota
PS D:\Heritage(MCA)\Java\Assign(me)\generics>  */