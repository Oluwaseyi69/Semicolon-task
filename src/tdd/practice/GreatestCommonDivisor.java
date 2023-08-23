package tdd.practice;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int a = 15;
        int b = 2;
        int lcm = lcm(a,b);
        int gcd = calculateGcd(a, b);

        System.out.print("The lcm:"+" "+lcm + " "+"The gcd: " + " "+ gcd);
    }
    public static int lcm(int a, int b){
        int gcd = calculateGcd(a, b);
        return (a * b) / gcd;
    }
    public static int calculateGcd(int a, int b){
        if(b == 0){
            return a;
        }
        return calculateGcd(b, a%b);
    }
}
