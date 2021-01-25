package atm;
import java.util.Scanner;

class atm{
public static void main(String[] args){

float withdraw;
float balance=100;
float deposite;

System.out.println("\n---------------------------- ATM simulator ----------------------------");

Scanner in=new Scanner(System.in);
	 
do {
	
System.out.println("Choose an option \n 1. Cash Withdrwal \n 2. Deposite \n 3. Show balance \n 4. exit\n");

int option = in.nextInt();

switch(option){
case 1:
	System.out.println("Please enter amount to withdraw: ");
	withdraw = in.nextInt();
	if(withdraw > balance || withdraw ==0 ){
	System.out.println("Insufficient funds \n");
	}
	else{
	balance = balance - withdraw;
	System.out.println(withdraw +".Rs has been withdrawn and balance is Rs."+ balance+"\n");
	}
	break;

case 2:
	System.out.println("Please enter amount to be deposited: ");
	deposite = in.nextInt();
	balance = balance + deposite;
	System.out.println(deposite+".Rs has been deposited and balance is Rs."+balance+"\n");
	break;

case 3:
	System.out.println("Current balance is Rs. "+balance+"\n");
	break;
	
case 4:
	System.out.println("Thank you for using our service ! \n");
	break;
	
default:
	System.out.println("Invalid option:\n\n");
	break;

}
}
while(true);

}
}
