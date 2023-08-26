package Assignment.BankApp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BankTest {
   @Test
    public void bankCanRegisterAccount(){
    Bank bank = new Bank();
    bank.register ("Seyi","Banwo","pin");
    assertEquals(new Account("1","Seyi Banwo","pin").getAccount(),bank.findAccount("1").getAccount());
    bank.register ("Anu","Banwo","pin");
    assertEquals(new Account("2","Anu Banwo","pin").getAccount(),bank.findAccount("2").getAccount());

   }
   @Test
    public void testThatCanDepositIntoBank(){
       Bank bank = new Bank();
       bank.register ("Seyi","Banwo","pin");
       assertEquals(new Account("1","Seyi Banwo","pin").getAccount(),bank.findAccount("1").getAccount());
       bank.deposit(5000, "1");
       assertEquals(5000,bank.checkBalance("1","pin"), 0.0);
   }
   @Test
    public void testThatMoneyCanBeWithdrawn(){
       Bank bank = new Bank();
       bank.register ("Seyi","Banwo","pin");
       assertEquals(new Account("1","Seyi Banwo","pin").getAccount(),bank.findAccount("1").getAccount());
        bank.deposit(5000,"1");
       assertEquals(5000,bank.checkBalance("1","pin"), 0.0);
       bank.toWithdraw(3000,"1","pin");
        assertEquals(2000,bank.checkBalance("1","pin"),0.0);
   }
   @Test
    public void testToBeAbleToTransferFromOneAccountToAnother(){
       Bank bank = new Bank();
       bank.register("Seyi","Banwo","pin");
       bank.register("Segun","Banwo","pin");
       assertEquals(new Account("1","Seyi Banwo","pin").getAccount(),bank.findAccount("1").getAccount());
       assertEquals(new Account("2","Segun Banwo","pin").getAccount(),bank.findAccount("2").getAccount());
       bank.deposit(5_000, "1");
       assertEquals(5_000, bank.checkBalance("1", "pin"),0.0);
       bank.transfer(3000,"1", "2","pin");
//       bank.findAccount("2");


       assertEquals(2000,bank.checkBalance("1","pin"),0.0);
       assertEquals(3_000, bank.checkBalance("2", "pin"),0.0);



   }

}
