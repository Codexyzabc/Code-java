/*4. An educational institution wishes to maintain a database of its employees. The database is 
divided into a number of classes whose hierarchical relationships are shown below. Write all 
the classes and defines the methods to create the database and retrieve individual information 
as and when needed.
 Write a driver program to test the classes.
Staff (code, name)
Teacher (subject, publication) is a Staff
Officer (grade) is a Staff
Typist (speed) is a Staff
RegularTypist (remuneration) is a Typist
CasualTypist (daily wages) is a Typist.*/

package assignment5;

class Staff{
	int code;
	String name;
	public Staff(int code, String name){
		this.code=code;
		this.name=name;
	}
	public void display(){
		System.out.println("code is "+this.code);
		System.out.println("name is "+this.name);
	}
}
class Teacher extends Staff{
	String subject;
	String publication;
	public Teacher(int code,String name,String subject, String publication){
		super(code, name);
		this.subject=subject;
		this.publication=publication;
		
	}
	public void display(){
		super.display();
		System.out.println("subkect is " +this.subject);
		System.out.println("pubication is "+this.publication);
	}
	
}
class Officer extends Staff{
	String grade;
	public Officer(int code,String name,String grade){
		super(code,name);
		this.grade=grade;
	}
	public void display(){
		super.display();
		System.out.println("Grade is "+ grade);
	}
}
class Typist extends Staff{
	double speed;
	public Typist(int code,String name,double speed){
		super(code,name);
		this.speed=speed;
	}
	public void display(){
		super.display();
		System.out.println("speed is"+ this.speed);
	}
}
class RegularTypist extends Typist{
	double remunaration;
	public RegularTypist(int code,String name,double speed, double remunaration){
		super(code,name,speed);
		this.remunaration=remunaration;
	}
	public void display(){
		super.display();
		System.out.println("remunaration is"+ remunaration);
	}
	
}
class CasualTypist extends Typist{
	double dailywages;
	public CasualTypist(int code,String name,double speed, double dailywages){
		super(code,name,speed);
		this.dailywages=dailywages;
	}
	public void display(){
		super.display();
		System.out.println("dailywages is"+ dailywages);
	}
}







public class pr4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t=new Teacher(11,"arnab","english","D.Sons");
		Officer o=new Officer(14,"sohom","A");
		RegularTypist r=new RegularTypist(22,"mira",12.2,500);
		CasualTypist c=new CasualTypist(27,"abisek",12.5,100);
		
		t.display();
		o.display();
		r.display();
		c.display();
		
		
		

	}

}


/*OUTPUT 
code is 11
name is arnab
subkect is english
pubication is D.Sons
code is 14
name is sohom
Grade is A
code is 22
name is mira
speed is12.2
remunaration is500.0
code is 27
name is abisek
speed is12.5
dailywages is100.0
*/