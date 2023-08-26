package Assignment.BankApp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountTest {
    @Test
    public void testThatMoneyCanBeDeposited(){
        Account account = new Account("1", "accountName","pin");
        account.deposit(5_000);
        double balance = account.getBalance();
        assertEquals(5_000.0,balance,0.0);
    }
    @Test
    public void testToCheckBalanceWithWrongPin(){
        Account account = new Account("1", "accountName","pin");
        account.updatePin("pin", "newPin");
    }
    @Test
    public void testThatMoneyWithdrawal(){
        Account account = new Account("1", "accountName","pin");
        account.deposit(5000);
        double balance = account.getBalance();
        assertEquals(5000,balance,0.0);
        account.withdraw(3000,"pin");
        double newBalance = account.getBalance();
        assertEquals(2000,newBalance,0.0);

    }
}
