package tdd.practice;

public class CreditLimitCalculator {
    public int startBalance;
    public int newBalance;
    public int charges;
    public int credits;

    public int creditLimits;

    public CreditLimitCalculator(){

    }
    public int newBalance(int startBalance, int charges,int credits){
        newBalance = startBalance + charges - credits;
        return newBalance;
    }
    public int creditLimits(){
        if(newBalance > credits) {
            return creditLimits;
        }
        else {
            return 0;
        }
    }
}
