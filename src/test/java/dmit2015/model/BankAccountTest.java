package dmit2015.model;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class BankAccountTest {

	@Test
	public void testWithdrawDouble() {
		// Create a BankAccount object with a balance of $1000
		BankAccount account1 = new BankAccount();
		account1.setBalance(BigDecimal.valueOf(1000));
		//set annual Interest rate to 1.5%
		account1.setAnnualInterestRate(1.5);
		//monthly interest rate should be 0.00125
		assertEquals(0.00125,  account1.getMonthlyInterestRate(),0);
		//monthly interest amount should be $1.25
		assertEquals(1.25,  account1.getMonthlyInterest().doubleValue(),0);
		//Withdraw $1500
		account1.withdraw(1500);
		//the balance should be $1000
		assertEquals(1000.00,account1.getBalance().doubleValue(),0);
		//withdraw $200
		account1.withdraw(200);
		assertEquals(800.00, account1.getBalance().doubleValue(),0);
		//deposit $1200
		account1.deposit(1200);
		//balance should be $2000
		assertEquals(2000.00, account1.getBalance().doubleValue(),0);
		//add monthly interest to balance
		account1.addMonthlyInterest();
		assertEquals(2002.50,  account1.getBalance().doubleValue(),0);
	}
}
