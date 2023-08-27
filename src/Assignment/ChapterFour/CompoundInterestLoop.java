package Assignment.ChapterFour;

public class CompoundInterestLoop {
    public static void main(String[] args) {
        double principal = 1000;
        double rate = 0.05;
        for(int year = 1; year <=10; year++){
            double amount =principal * Math.pow(1+rate, year);
            System.out.printf("%d%,20.2f%n",year,amount);

        }
    }
}
