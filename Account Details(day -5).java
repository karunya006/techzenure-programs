/**program to display  Account Details
 * since  2023 (day 5)
 * 
 */
package nums;

public class Account {
	private long acno;
	private String name;
	private float bal;
	
	public Account(long acno, String name, float bal) {
		this.acno=acno;
		this.name=name;
		this.bal=bal;
		
	}
	public void deposit(float amt) {
		this.bal +=amt;
		System.out.println("Rs."+amt+" Credite | Balance :" + this.bal);
		
	}
	public void withdraw(float amt) {
		if(this.bal>= amt) {
			this.bal =this.bal -amt;
			System.out.println("Rs."+amt+" Debited | Balance :" + this.bal);
			
			
		}else {
			System.out.println("Error insufficient balance");
			
		}
	}
	public void getBalance() {
		System.out.println("AC NO: " + this.acno + " | NAME: " + this.name + " |BALANCE: " + this.bal)	;
		}
	

}
