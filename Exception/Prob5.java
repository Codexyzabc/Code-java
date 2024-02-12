/*5. Write a program that outputs the name of the capital of the country entered at the
command line. The program should throw a “NoMatchFoundException” when it fails to
print the capital of the country entered at the command line.*/


package Exception;

import java.util.Scanner;

class NoMatchFoundException extends Exception{
	NoMatchFoundException(String msg){
		super(msg);
	}
}
public class Prob5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name of the country:");
		String find=sc.nextLine();
		String countries[][]={{"india","delhi"},{"bangladesh","dhaka"},{"nepal","kathmandu"}};
		int flag=0;
		for(int i=0;i<countries.length;i++){
			if(countries[i][0].equals(find)){
				flag=1;
				System.out.println("The capital of "+countries[i][0]+" is:"+countries[i][1]);
				break;
			}
		}
		try{
			
			if(flag==0){
				throw new NoMatchFoundException("sorry! no data available according to country:"+find);
			}
		}
		catch(Exception e){
			System.out.println(e);
		}

	}

}
//enter the name of the country:
//usa
//exception.NoMatchFoundException: sorry! no data available according to country:japan
//enter the name of the country:
//india
//The capital of india is:delhi


