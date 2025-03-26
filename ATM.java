public class ATM{
public static void main(String[]args){
	double balance = 1000.00;
	double withdraw = 1500.00;
	try{
	    if(balance<withdraw){
		throw new Exception("Insufficient Balance");
	}
	balance-= withdraw;
	System.out.println("Withdrawal successful\n Remaining balance:" + balance);
}catch(Exception e){
System.out.println("Error:" + e.getMessage());
		}
	    }
} 
