package assignment6;

//Write a Java class called CountAndPrintArgs to print the number of arguments passed on
//the command-line as well as the 1st letter of the arguments. For example, if the command
//line arguments are: �Mango Cucumber Apple� then the output will be
//No. of arguments � 3 MCA
public class Problem2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("the number of arguments:"+args.length+"\t");
		for (int i=0;i<args.length;i++){
			System.out.print(args[i].charAt(0));
		}

	}

}
//the number of arguments:3	MCA

