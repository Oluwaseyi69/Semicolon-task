package Assignment.ChapterFour;

public class TaxCollector {
    private double earning;
    private double total;
    private double taxRate;

    public void totalTax(double earning) {
     if (earning <= 30_000){
         taxRate = 0.15 * earning;
     } else if (earning > 30_000) {
         taxRate = 0.20 * earning;
     }
    }

    public double getTaxCollector(double taxRate) {
        return taxRate;
    }
}
