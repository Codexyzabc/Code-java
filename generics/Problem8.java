/*8. Write a program to create a thread using a lambda expression. */

public class Problem8 {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  Runnable t1=()->{
   System.out.println("running");
  };
  Thread t=new Thread(t1);
  t.start();
 }

}

/*running */