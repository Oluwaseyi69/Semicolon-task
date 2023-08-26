package Assignment.BankApp;

public class Account {
    private double amount;
    private double balance;
    private String accountNumber;
    private String accountName;
    private double newBalance;
    private String pin;

    public Account(String accountNumber, String accountName, String pin){
    this.accountNumber = accountNumber;
    this.accountName = accountName;
    this.pin = pin;

    }
    public double deposit(double amount){
        return (balance += amount);

    }
    public double withdraw(double amount, String pin) {
        return balance-= amount;

    }

    public double getBalance() {
        return balance;
    }

    public void updatePin(String oldPin, String newPin) {
        validatePin(oldPin);
        this.pin = newPin;
    }
    public void validatePin(String pin){
        boolean isNotCorrectPin = !this.pin.equals(pin);
        if(isNotCorrectPin){
            throw new IllegalArgumentException("Pin is not correct");
        }
    }



    public void balance(double balance) {
        this.balance = balance;
    }

//    public double getWithdrawal(double newBalance) {
//        newBalance = balance - amount;
//        return newBalance;
//    }

    public String getAccount() {
        return accountNumber + " " + accountName +" "+ pin;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
