/*5. Consider an example of book shop which sells books & video tapes. It’s modeled by Book & 
Tape classes. These two classes are inherited from the abstract class called Media. The Media 
class has common data members such as title & publication. The Book class has data 
member for storing a no. of pages in a book & Tape class has the playing time in a tape. Each 
class will have method such as read ( ) & show ( ). Write a program that models this class 
hierarchy & processes objects using reference to base class only.
*/

package assignment5;

abstract class Media{
	String title,publication;
	abstract void show();
}
class Book extends Media{
	int pages;
	void read(String title, String publication,int pages){
		super.title=title;
		super.publication=publication;
		this.pages=pages;
	}
	void show(){
		System.out.println("title:"+this.title+"\npublication:"+this.publication+"\npages:"+this.pages);
	}
	
}
class Tape extends Media{
	int time;
	void read(String title, String publication, int time){
		super.title=title;
		super.publication=publication;
		this.time=time;
	}
	void show(){
		System.out.println("title:"+this.title+"\npublication:"+this.publication+"\ntime:"+this.time);
	}
	
}
public class pr5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1=new Book();
		b1.read("title1","publicatoin1",20);
		b1.show();
		
		Tape t1=new Tape();
		t1.read("title2", "publication2",30);
		t1.show();
	}

}



//title:title1
//publication:publicatoin1
//pages:20
//title:title2
//publication:publication2
//time:30