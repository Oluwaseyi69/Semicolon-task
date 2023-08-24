package Assignment.ChapterThree;

public class CommissionCalculator {
    private int amount;
    private double commission;
    public void itemSold(double amount){
        commission = amount + 200 + (0.09 * amount);
    }

    public double getCommission(double commission) {
        return commission;
    }
}
