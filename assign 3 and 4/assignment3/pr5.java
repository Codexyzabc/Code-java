/*5. Define a class Account to represent a bank account. Include the following members. 
Instance Variable: Name of the depositor, Account number, Account type, Balance amount in 
the account.
Method: To assign initial values, To deposit an amount, To withdraw an amount after checking 
the balance, To display name and balance. 
Write a program to test the program for a given number of customers. The program should be 
able to search any customer if the account number is provided*/

package assignment3;

import java.util.*;

class Account{
	private String depo;
	private int accno;
	private String acctype;
	private double balance;
	
	
	public Account(String depo,int accno,String acctype,double balance) {
		this.depo=depo;
		this.accno=accno;
		this.acctype=acctype;
		this.balance=balance;
	}
	
	public void depoAmount(double amount) {
		if(amount>0) {
			this.balance=this.balance+amount;
			System.out.println(amount+ " is deposited in the account successfully");
		}
		else {
			System.out.println("Unsuccessful");
		}
	}
	
	public void withdrawAmount(double amount) {
		if(amount>0) {
			if(amount<=this.balance) {
				this.balance=this.balance-amount;
				System.out.println(amount +" is withdrawn successfully ");
			}
			else {
		}
	}
		else {
			System.out.println("Unsuccessful");
		}	
   }
    public void displayNameBal() {
    	System.out.println("Name of account holder is "+ this.depo +" and balance is "+this.balance);
    }
    public int getAccno() {
    	return accno;
    }
    
    
}
public class pr5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of customers: ");
		int num=sc.nextInt();
		
		Account acc[]=new Account[num];
		
		for(int i=0;i<acc.length;i++) {
			System.out.println("Enter the name of customer: ");
			String name=sc.next();
			
			//sc.nextLine();
			
			System.out.println("Enter the account number: ");
			int accno=sc.nextInt();
			System.out.println("Enter the account type: ");
			String acctype=sc.next();
			//sc.nextLine();
			
			System.out.println("Enter the balance in account ");
		    double bal=sc.nextDouble();
			
			
			//sc.nextLine();
			acc[i]=new Account(name,accno,acctype,bal);
			
			
		}
		
		
		System.out.println("Enter the account number to search the respective customer: ");
		int searaccno=sc.nextInt();
		Account acc1=null;
		
		
		for(int i=0;i<acc.length;i++) {
			if(acc[i].getAccno()==searaccno) {
				acc1=acc[i];
				System.out.println("Customer is Found with acc no: "+searaccno);
				flag=1;
			}
			
		}
		if(flag==0) {
			System.out.println("Customer not found with "+searaccno+" number");
		}
		
				
		if(flag==1) {
			
				while(true) {
				System.out.println("press 1 to deposit: ");
				System.out.println("press 2 to withdraw");
				System.out.println("press 3 to show name and balance");
				System.out.println("press 4 to quit");
				System.out.println("Enter the choice: ");
				int choice=sc.nextInt();
				
				switch(choice) {
				case 1:
					System.out.println("Enter the amount to deposit: ");
					double amount=sc.nextDouble();
					
					acc1.depoAmount(amount);
				     break;
				case 2:
					System.out.println("Enter the amount to withdraw ");
					double withdraw=sc.nextDouble();
					
					acc1.withdrawAmount(withdraw);
					break;
				case 3: 
					acc1.displayNameBal();
					break;
				case 4:
					System.exit(0);
				default:
					System.out.println("wrong choice given ");
				}
			}	
          }
		
					
				
		
		
		
		
		
		

	}

}
/*OUTPUT
Enter the number of customers: 
4
Enter the name of customer: 
sam
Enter the account number: 
1102
Enter the account type: 
savings
Enter the balance in account 
1000
Enter the name of customer: 
ram
Enter the account number: 
1124
Enter the account type: 
demat
Enter the balance in account 
1233
Enter the name of customer: 
soham
Enter the account number: 
1148
Enter the account type: 
trading
Enter the balance in account 
3566
Enter the name of customer: 
suman
Enter the account number: 
1266
Enter the account type: 
loan
Enter the balance in account 
7800
Enter the account number to search the respective customer: 
1148
Customer is Found with acc no: 1148
press 1 to deposit: 
press 2 to withdraw
press 3 to show name and balance
press 4 to quit
Enter the choice: 
1
Enter the amount to deposit: 
560
560.0 is deposited in the account successfully
press 1 to deposit: 
press 2 to withdraw
press 3 to show name and balance
press 4 to quit
Enter the choice: 
2
Enter the amount to withdraw 
650
650.0 is withdrawn successfully 
press 1 to deposit: 
press 2 to withdraw
press 3 to show name and balance
press 4 to quit
Enter the choice: 
3
Name of account holder is soham and balance is 3476.0
press 1 to deposit: 
press 2 to withdraw
press 3 to show name and balance
press 4 to quit
Enter the choice: 
4
*/