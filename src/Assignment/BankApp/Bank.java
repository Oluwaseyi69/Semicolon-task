package Assignment.BankApp;


//import tdd.Account;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    public String findAccount;
    private List<Account>accounts = new ArrayList<>();

    public void register(String firstName, String lastName, String pin) {
      String accountName = firstName +" "+ lastName;
      Account newAccount = new Account(generateAccountNumber(),accountName,pin);
      accounts.add(newAccount);
    }

    private String generateAccountNumber() {
        return accounts.size()+1 + "";
    }
    public Account findAccount(String accountNumber){
        for(Account account: accounts){
            if(account.getAccountNumber().equals(accountNumber)){
                return account;
            }
        }
        throw new IllegalStateException("Input a valid Account");

    }

    public void deposit(int amount, String accountNumber) {
        findAccount(accountNumber).deposit(amount);
    }

    public double checkBalance(String accountNumber, String pin) {
        return findAccount(accountNumber).getBalance();
    }

    public double toWithdraw(int amount, String accountNumber, String pin) {
        findAccount(accountNumber).withdraw(amount,pin);
        return checkBalance(accountNumber,pin);
    }

    public void transfer(double amount, String fromAccount, String toAccount, String pin) {
        Account senderAccount = findAccount("1");
        senderAccount.withdraw(amount,pin);

        Account receiverAccount = findAccount("2");
        receiverAccount.deposit(amount);
    }


//    public void deposit(String accountNumber,int amount) {
//        accounts.
//    }
}
