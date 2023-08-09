package Assignment;

import java.util.Locale;
import java.util.Scanner;

public class Password {
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Password password = new Password();
        password.passwordLenght();

//        password.method();

    }
    public void passwordLenght() {
        System.out.println("Enter eight characters long password ");
        String password = input.next();
        if(password.length() >= 8) {
            capitalLetter();
        }
        else passwordLenght();
        }
    public void capitalLetter(){
        System.out.println("Enter a password with capital letter");
        String password = input.next();
        if(password.matches("^[^A-Z]*[A-Z][^A-Z]*$")){
            character();
        }
        else {
            capitalLetter();
        }
    }

    public void character(){
        System.out.println("Your password should contain special character: ");
        String password = input.next();
//        if(password.matches("[0-9A-Za-z]*[@#%$]{1}[0-9A-Za-z]*")){
//            number();
        if(password.matches("[0-9A-Za-z]*[@#%$]{1}[0-9A-Za-z]*")){
            number();
        }
    }
    public void number(){
        System.out.println("Your password should contain a number: ");
        String password = input.next();
        if(password.matches("[0-9A-Za-z]*[@#%$]{1}[0-9A-Za-z]*")){
            System.out.println("Valid Password");
        }
        else{
            System.out.println("Invalid Password");
        }
    }


}
