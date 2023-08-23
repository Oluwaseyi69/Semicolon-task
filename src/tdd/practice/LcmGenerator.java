package tdd.practice;

public class LcmGenerator {
    public static void main(String[] args) {
        int a = 15;
        int b = 2;
        int lcm = lcm(a,b);
        System.out.println("LCM of "+a+ " " + "and" + " "+ b + " " + "=" +" "+ lcm);
    }
    public static int lcm(int a, int b){
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        int lcm = max;

        while (true){
            if(lcm % min == 0 && lcm % max == 0){
                break;
            }
            lcm+=max;
        }
        return lcm;
    }

}
