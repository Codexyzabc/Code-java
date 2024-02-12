//Create a private inner class that implements a public interface. Write a method that
//returns a reference to an instance of the private inner class, up cast to the interface. Show
//that the inner class is completely hidden by trying to downcast to it.


package assignment7;
public class Prob3{
 public interface Inf{
  void method();
 }
 private class Inner implements Inf{
  public void method(){
   System.out.println("from public interface");
  }
  void innerFunc() {
   System.out.println("this is from inner class");
  }
 }
 public Inf returnFnc() {
  return new Inner();
 }
 
 public void applyUpcasting() {
  Inf obj1=returnFnc();
  obj1.method();
  
 }
 public static void main(String []args) {
  Prob3 obj1=new Prob3();
  obj1.applyUpcasting();
 }
}