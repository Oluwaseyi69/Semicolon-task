package tdd;

public class Account {
    private int balance;
    private String pinCode;
    private String accountNumber;
    private String accountName;

    public Account(String accountNumber, String accountName,String pinCode) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.pinCode = pinCode;
    }

    public int getBalance(String pin) {
        if (pin.equals(pinCode)) {
            return balance;
        } else {
            return 0;
        }
    }

    public void withdraw(String pinNum, int amount) {
        if (amount > balance) {
            return;

        }
        if (pinNum.equals(pinCode) ) {
            balance = balance - amount;
        }

        }
        public void deposit ( int amount) {
        if (amount > 0) {
            balance = balance + amount;
        }


    }
}