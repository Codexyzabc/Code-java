/*4. The annual examination results of N students are tabulated as follows:
 Roll No. Subject 1 Subject 2 Subject 3 
 
 …..
…..
 
 Write a program to read the data and determine the following:
(a) Total marks obtain by each student
(b) The highest marks in each subject and the roll no of the student who secured it 
(c) The student who obtained the highest total marks

*
*doubt if same marks for 2 then what ask?
*/
package assignment3;

import java.util.*;


class Student{
	int rollno;
	int sub1;
	int sub2;
	int sub3;
	public Student(int rollno,int sub1,int sub2,int sub3) {
		this.rollno=rollno;
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
	}
	public int getTotalMarks() {
		return this.sub1+this.sub2+this.sub3;
	}
	
	
}


public class pr4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of students: ");
		int size=sc.nextInt();
		
		Student stu[]=new Student[size];
		
		for(int i=0;i<stu.length;i++) {
			System.out.println("Enter the roll of student "+(i+1)+": ");
			int roll=sc.nextInt();
			System.out.println("Enter marks for sub1 ");
			int sub1=sc.nextInt();
			System.out.println("Enter marks for sub2 ");
			int sub2=sc.nextInt();
			System.out.println("Enter marks for sub3 ");
			int sub3=sc.nextInt();
			
			
			stu[i]=new Student(roll,sub1,sub2,sub3);
		}
		
		
		for(int i=0;i<size;i++) {
			System.out.println("Total Marks obtained by roll "+(i+1)+" is "+ stu[i].getTotalMarks());
		}
		
		
		int maxsub1=stu[0].sub1;
		int maxsub2=stu[0].sub2;
		int maxsub3=stu[0].sub3;
		int maxroll1=stu[0].rollno;
		int maxroll2=stu[0].rollno;
		int maxroll3=stu[0].rollno;
		
		
		
		for(int i=1;i<stu.length;i++) {
			if(stu[i].sub1>maxsub1) {
				maxsub1=stu[i].sub1;
		        maxroll1=stu[i].rollno;
			}
		}
		System.out.println("Max mark on sub1 is obtained by roll "+maxroll1+" is " + maxsub1);
		
		
		for(int i=1;i<stu.length;i++) {
			if(stu[i].sub2>maxsub2) {
				maxsub2=stu[i].sub1;
		        maxroll2=stu[i].rollno;
			}
		}
		System.out.println("Max mark on sub2 is obtained by roll "+maxroll2+" is " + maxsub2);
		
		for(int i=1;i<stu.length;i++) {
			if(stu[i].sub3>maxsub3) {
				maxsub3=stu[i].sub1;
		        maxroll3=stu[i].rollno;
			}
		}
		System.out.println("Max mark on sub3 is obtained by roll "+maxroll3+" is " + maxsub3);
		
		
		
		int hightotalmark=stu[0].getTotalMarks();
		int rollhightotal=stu[0].rollno;
		for(int i=1;i<stu.length;i++) {
			if(stu[i].getTotalMarks()>hightotalmark) {
				hightotalmark=stu[i].getTotalMarks();
				rollhightotal=stu[i].rollno;
			}
		}
		System.out.println("Highest total mark is "+ hightotalmark + " obtained by "+rollhightotal);
	}
	
}
/*OUTPUT 
Enter the number of students: 
4
Enter the roll of student 1: 
1
Enter marks for sub1 
88
Enter marks for sub2 
96
Enter marks for sub3 
68
Enter the roll of student 2: 
2
Enter marks for sub1 
88
Enter marks for sub2 
87
Enter marks for sub3 
86
Enter the roll of student 3: 
3
Enter marks for sub1 
74
Enter marks for sub2 
75
Enter marks for sub3 
96
Enter the roll of student 4: 
4
Enter marks for sub1 
88
Enter marks for sub2 
96
Enter marks for sub3 
77
Total Marks obtained by roll 1 is 252
Total Marks obtained by roll 2 is 261
Total Marks obtained by roll 3 is 245
Total Marks obtained by roll 4 is 261
Max mark on sub1 is obtained by roll 1 is 88
Max mark on sub2 is obtained by roll 1 is 96
Max mark on sub3 is obtained by roll 4 is 88
Highest total mark is 261 obtained by 2
*/