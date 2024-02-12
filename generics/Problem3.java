/*3. Write a Generic Method that can perform the sorting of any type of data. */

class Sorting<T extends Comparable<T>>{
    T arr[];
    Sorting(T arr[]){
        this.arr=arr;
    }

    public void sort(){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j].compareTo(arr[j+1])>0){
                    T temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
    }

    public void display(){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }


}

public class Problem3 {

    public static void main(String[] args) {

        Integer arr[]={1,4,7,4,3,2,10};
        Sorting<Integer> sort=new Sorting<>(arr);
        sort.sort();
        System.out.println("Interger array is ");
        sort.display();

        System.out.println();

        String str[]={"abc","abs","aqo","abb"};
        Sorting<String> sort1=new Sorting<>(str);
        sort1.sort();
        System.out.println("String array is ");
        sort1.display();


    }
}



/*Interger array is 
1 2 3 4 4 7 10
String array is
abb abc abs aqo */