package tdd;

public class Account {
    private int balance;
    private String pinCode;

    public Account(String pinCode) {
        this.pinCode = pinCode;
    }

    //comment
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