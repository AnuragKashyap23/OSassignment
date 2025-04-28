import java.util.Scanner;

class CreditLimitCalc{
	private int accNumber;
	private int initialBalance;
	private int expenses;
	private int totalCredits;
	private int creditLimit;
	
	public CreditLimitCalc() {
		this.accNumber=0;
		this.expenses=0;
		this.initialBalance=0;
		this.totalCredits=0;
		this.creditLimit=creditLimit;
	}
	public CreditLimitCalc(int accNumber, int initialBalance, int expenses, int totalCredits, int creditLimit) {
		this.accNumber=accNumber;
		this.initialBalance=initialBalance;
		this.expenses=expenses;
		this.totalCredits=totalCredits;
		this.creditLimit=creditLimit;
	}
	
	public void setAccNumber(int accNumber) {
		this.accNumber=accNumber;
	}
	public int getAccNumber() {
		return accNumber;
	}
	public void setInitialBalance(int initialBalance) {
		this.initialBalance=initialBalance;
	}
	public int getInitialBalance() {
		return initialBalance;
	}
	public void setExpense(int expenses) {
		this.expenses=expenses;
	}
	public int getExpense() {
		return expenses;
	}
	public void setTotalCredits(int totalCredits ) {
		this.totalCredits=totalCredits;
	}
	public int getTotalCredits() {
		return totalCredits;
	}
	
	public void setCreditLimit(int creditLimit) {
		this.creditLimit=creditLimit;
	}
	public int getCreditLimit() {
		return creditLimit;
	}
	
	
	public int newBalance() {
		int newBal = expenses-(initialBalance+totalCredits)
		return newbal;
	}
	
	public void creditMessage() {
		int newBalance= newBalance();
		if (newBalance>creditLimit) {
			System.out.println("Credit Limit Exceeded");
		}
	}
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Number: ");
		int accNumber = sc.nextInt();
		System.out.println("Enter Balance at the beginning of the month: ");
		int initialBalance=sc.nextInt();
		System.out.println("Enter Total charges of all items: ");
		int expenses = sc.nextInt();
		System.out.println("Enter Total credits applied: ");
		int totalCredits= sc.nextInt();
		System.out.println("Allowed credit limit: ");
		int creditLimit= sc.nextInt();
		
	}
	
}


public class Assign3 {
	public static void main(String[] args) {
		CreditLimitCalc c = new CreditLimitCalc();
		c.accept();
		System.out.println(c.newBalance());
		c.creditMessage();
	}
}









