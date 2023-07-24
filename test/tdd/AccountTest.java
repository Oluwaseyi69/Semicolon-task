package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void canDepositAccountTest() {
        Account estherAccount = new Account("2345");
        int currentBalance = estherAccount.getBalance("2345");
        assertEquals(0, currentBalance);
        //when
        estherAccount.deposit(5000);
        //check
        currentBalance = estherAccount.getBalance("2345");
        assertEquals(5000, currentBalance);


    }

    @Test
    public void canDepositTwiceTest() {
        Account estherAccount = new Account("4455");
        estherAccount.deposit(3000);
        int currentBalance = estherAccount.getBalance("4455");
        assertEquals(3000, currentBalance);

        estherAccount.deposit(3000);

        currentBalance = estherAccount.getBalance("4455");
        assertEquals(6000, currentBalance);
    }

    @Test
    public void canDepositNegativeTest() {
        Account estherAccount = new Account("5566");
        estherAccount.deposit(1000);
        int currentBalance = estherAccount.getBalance("5566");
        assertEquals(1000, currentBalance);
        estherAccount.deposit(-2000);
        currentBalance = estherAccount.getBalance("5566");
        assertEquals(1000, currentBalance);


    }

    @Test
    public void canWithdrawTest() {
        Account estherAccount = new Account("6677");
        estherAccount.deposit(5000);
        int currentAccount = estherAccount.getBalance("6677");
        assertEquals(5000, currentAccount);
        estherAccount.withdraw("6677" , 3000);
        currentAccount = estherAccount.getBalance("6677");
        assertEquals(2000, currentAccount);

    }

    @Test
    public void canWithdrawMoreThanBalanceTest() {
        Account estherAccount = new Account("6677");
        estherAccount.deposit(5000);
        int currentAccount = estherAccount.getBalance("6677");
        assertEquals(5000, currentAccount);
        estherAccount.withdraw("6677" , 7000);
        currentAccount = estherAccount.getBalance("6677");
        assertEquals(5000, currentAccount);

    }


}
