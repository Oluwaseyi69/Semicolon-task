package MBTI;

import java.util.Arrays;
import java.util.Scanner;

public class PersonalityTest {
    private static final String[] eiResponse = new String[6];
    private static final String[] snResponse = new String[5];
    private static final String[] tfResponse = new String[5];
    private static final String[] jpResponse = new String[5];

    private static String collectedResult = "";
    public static void main(String[] args) {
        PersonalityTest personalityTest = new PersonalityTest();
        personalityTest.name();
        System.out.println("Response");

    }

    int counterAEI ;
    int counterBEI = 0;
    int counterASN = 0;
    int counterBSN = 0;
    int counterATF = 0;

    int counterBTF= 0;
    int counterAJP = 0;
    int counterBJP = 0;

    public void name(){
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your name: ");
        String userInput = scan.next();
        if(userInput.equals(userInput)){
            eiResponse[0] = userInput;
            questionOne();
        }
        else {
            questionOne();
        }
    }

    public void questionOne() {

        Scanner scan = new Scanner(System.in);
        System.out.print("""
                1)
                A. Expend Energy, Enjoy Groups
                B. Conserve Energy, Enjoy one -on-one:\s""");
        String userInput = scan.next();
        if (userInput.equalsIgnoreCase("a")){
            eiResponse[1] = " A. Expend Energy, Enjoy Groups";
            counterAEI++; questionTwo();
        }
        else if (userInput.equalsIgnoreCase("b")){
            eiResponse[1] = "B. Conserve Energy, Enjoy one -on-one";
            counterBEI++; questionTwo();
        }
        else {
            System.out.println("Invalid choice.");
            questionOne();
        }
    }

    public void questionTwo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                2)
                A. Interpret literally.
                B. Look for meaning and possibilities:\s""");
        String userInput = scan.next();
        if (userInput.equalsIgnoreCase("a")){
            snResponse[0] ="A. Interpret literally.";
            counterASN++; questionThree();
        }
        else if (userInput.equalsIgnoreCase("b")) {
            snResponse[0] = "B. Look for meaning and possibilities";
            counterBSN++; questionThree();
        }
        else {
            System.out.println("Invalid choice.");
        }
        questionTwo();
    }

    public void questionThree() {
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                3)
                A. Logical, thinking, questioning.\s
                B. Empathetic, feeling, accommodating: \s""");
        String userInput = scan.next();
        if (userInput.equalsIgnoreCase("a")){
            tfResponse[0] = "A. Logical, thinking, questioning.";
            counterATF++; questionFour();
        }
        else if (userInput.equalsIgnoreCase("b")){
            tfResponse[0] = "B. Empathetic, feeling, accommodating:";
            counterBTF++; questionFour();
        }
        else {
            System.out.println("Invalid choice.");
        }
        questionThree();
    }

    public void questionFour() {
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                4)
                A. Organized, orderly: \s
                B. Flexible, adaptable: \s""");
        String userInput = scan.next();
        if (userInput.equalsIgnoreCase("a")){
            jpResponse[0] = "A. Organized, orderly";
            counterAJP++; questionFive();
        }
        else if (userInput.equalsIgnoreCase("b")){
            jpResponse[0] = "B. Flexible, adaptable";
            counterBJP++; questionFive();
        }
        else {
            System.out.println("Invalid choice.");
        }
        questionFour();
    }

    public void questionFive() {
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                5)
                A. More outgoing, think out loud: \s
                B. More reserved, think to yourself: \s""");
        String userInput = scan.next();
        if (userInput.equalsIgnoreCase("a")){
            eiResponse[2] = "A. More outgoing, think out loud";
            counterAEI++; questionSix();
        }
        else if (userInput.equalsIgnoreCase("b")){
            eiResponse[2] = "B. More reserved, think to yourself";
            counterBEI++; questionSix();
        }
        else {
            System.out.println("Invalid choice.");
        }
        questionFive();
    }

    public void questionSix() {
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                6)
                A. Practical, realistic, experiential: \s
                B. Imagination, innovative, theoretical: \s""");
        String userInput = scan.next();
        if (userInput.equalsIgnoreCase("a")){
            snResponse[1] = "A. Practical, realistic, experiential";
            counterASN++; questionSeven();
        }
        else if (userInput.equalsIgnoreCase("b")){
            snResponse[1] = "B. Imagination, innovative, theoretical:";
            counterBSN++; questionSeven();
        }
        else {
            System.out.println("Invalid choice.");
        }
        questionSix();
    }

    public void questionSeven() {
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                7)
                A. Candid, straight forward, frank: \s
                B. Tactful, kind, encouraging: \s""");
        String userInput = scan.next();
        if (userInput.equalsIgnoreCase("a")){
            tfResponse [1] = " A. Candid, straight forward, frank";
            counterATF++; questionEight();
        }
        else if (userInput.equalsIgnoreCase("b")){
            tfResponse [1] = "B. Tactful, kind, encouraging:";
            counterBTF++; questionEight();
        }
        else {
            System.out.println("Invalid choice.");
        }
        questionSeven();
    }

    public void questionEight() {
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                8)
                A. Plan, schedule: \s
                B. Unplanned, spontaneous: \s""");
        String userInput = scan.next();
        if (userInput.equalsIgnoreCase("a")){
            jpResponse [1] = "A. Plan, schedule";
            counterAJP++; questionNine();
        }
        else if (userInput.equalsIgnoreCase("b")){
            jpResponse [1] = "B. Unplanned, spontaneous:";
            counterBJP++; questionNine();
        }
        else {
            System.out.println("Invalid choice.");
        }
        questionEight();
    }

    public void questionNine() {
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                9)
                A. Seek many tasks, public activities, interaction with others: \s
                B. Seek private, solitary activities with quiet to concentrate: \s""");
        String userInput = scan.next();
        if (userInput.equalsIgnoreCase("a")){
            eiResponse [3] =  "A. Seek many tasks, public activities, interaction with others";
            counterAEI++;  questionTen();
        }
        else if (userInput.equalsIgnoreCase("b")){
            eiResponse [3] = "B. Seek private, solitary activities with quiet to concentrate ";
            counterBEI++; questionTen();
        }
        else {
            System.out.println("Invalid choice.");
        }
        questionNine();
    }

    public void questionTen() {
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                10)
                A. Standard, usual, conventional.: \s
                B. Different, novel, unique: \s""");
        String userInput = scan.next();
        if (userInput.equalsIgnoreCase("a")){
            snResponse[2] = "A. Standard, usual, conventional";
            counterASN++; questionEleven();
        }
        else if (userInput.equalsIgnoreCase("b")){
            snResponse[2] ="B. Different, novel, unique:";
            counterBSN++; questionEleven();
        }
        else {
            System.out.println("Invalid choice.");
        }
        questionTen();
    }
//continue from here
    public void questionEleven() {
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                11)
                A. Firm, tend to criticize, hold the line: \s
                B. Gentle, tend to appreciate, conciliate: \s""");
        String userInput = scan.next();
        if (userInput.equalsIgnoreCase("a")){
            tfResponse[2] = "A. Firm, tend to criticize, hold the line";
            counterATF++; questionTwelve();
        }
        else if (userInput.equalsIgnoreCase("b")){
            tfResponse[2] = "B. Gentle, tend to appreciate, conciliate: ";
            counterBTF++; questionTwelve();
        }
        else {
            System.out.println("Invalid choice.");
        }
        questionEleven();
    }

    public void questionTwelve() {
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                12)
                A. Regulated, structured: \s
                B. Easygoing, live and let live: \s""");
        String userInput = scan.next();
        if (userInput.equalsIgnoreCase("a")){
            jpResponse[2] = "A. Regulated, structured";
            counterAJP++; questionThirteen();
        }
        else if (userInput.equalsIgnoreCase("b")){
            jpResponse[2] = "B. Easygoing, live and let live:";
            counterBJP++; questionThirteen();
        }
        else {
            System.out.println("Invalid choice.");
        }
        questionTwelve();
    }

    public void questionThirteen() {
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                13)
                A. External, communicative, express yourself:  \s
                B. Internal, reticent, keep to yourself: \s""");
        String userInput = scan.next();
        if (userInput.equalsIgnoreCase("a")){
            eiResponse[4] = "A. External, communicative, express yourself";
            counterAEI++; questionFourteen();
        }
        else if (userInput.equalsIgnoreCase("b")){
            eiResponse[4] = "B. Internal, reticent, keep to yourself: ";
            counterBEI++; questionFourteen();
        }
        else {
            System.out.println("Invalid choice.");
        }
        questionThirteen();
    }
    public void questionFourteen() {
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                14)
                A. Focus on here-and-now:  \s
                B. Look to the future, global perspective, "big picture: \s""");
        String userInput = scan.next();
        if (userInput.equalsIgnoreCase("a")){
            snResponse[3] = "A. Focus on here-and-now ";
            counterASN++; questionFifteen();
        }
        else if (userInput.equalsIgnoreCase("b")){
            snResponse[3] = "B. Look to the future, global perspective big picture";
            counterBSN++; questionFifteen();
        }
        else {
            System.out.println("Invalid choice.");
        }
        questionFourteen();
    }
    public void questionFifteen() {
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                15)
                A. Tough minded, just. 	 \s
                B. Tender-hearted, merciful: \s""");
        String userInput = scan.next();
        if (userInput.equalsIgnoreCase("a")){
            tfResponse[3] = "A. Tough minded, just.";
            counterATF++; questionSixteen();
        }
        else if (userInput.equalsIgnoreCase("b")){
            tfResponse[3] = "B. Tender-hearted, merciful";
            counterBTF++; questionSixteen();
        }
        else {
            System.out.println("Invalid choice.");
        }
        questionFifteen();
    }
    public void questionSixteen() {
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                16)
                A. Preparation, plan ahead. \s
                B. Go with the flow, adapt as you go: \s""");
        String userInput = scan.next();
        if (userInput.equalsIgnoreCase("a")){
            jpResponse[3] = "A. Preparation, plan ahead. ";
            counterAJP++; questionSeventeen();
        }
        else if (userInput.equalsIgnoreCase("b")){
            jpResponse[3] = "B. Go with the flow, adapt as you go";
            counterBJP++; questionSeventeen();
        }
        else {
            System.out.println("Invalid choice.");
        }
        questionSixteen();
    }
    public void questionSeventeen() {
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                17)
                A. Active, initiate. 	 \s
                B. Reflective, deliberate: \s""");
        String userInput = scan.next();
        if (userInput.equalsIgnoreCase("a")){
            eiResponse [5]= "A. Active, initiate.";
            counterAEI++; questionEighteen();
        }
        else if (userInput.equalsIgnoreCase("b")){
            eiResponse[5] = "B. Reflective, deliberate";
            counterBEI++; questionEighteen();
        }
        else {
            System.out.println("Invalid choice.");
        }
        questionSeventeen();
    }
    public void questionEighteen() {
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                18)
                A. Facts, things, what iS		 \s
                B. Ideas, dreams, what could be, philosophical: \s""");
        String userInput = scan.next();
        if (userInput.equalsIgnoreCase("a")){
            snResponse[4] = "A. Facts, things, what is";
            counterASN++; questionNineteen();
        }
        else if (userInput.equalsIgnoreCase("b")){
            snResponse[4] = "B. Ideas, dreams, 'what could be', philosophical:";
            counterBSN++; questionNineteen();
        }
        else {
            System.out.println("Invalid choice.");
        }
        questionEighteen();
    }
    public void questionNineteen() {
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                19)
                A. Matter of fact, issue oriented	 \s
                B. Sensitive, people-oriented, compassionate: \s""");
        String userInput = scan.next();
        if (userInput.equalsIgnoreCase("a")){
            tfResponse[4] = "A. Matter of fact, issue oriented	";
            counterATF++; questionTwenty();
        }
        else if (userInput.equalsIgnoreCase("b")){
            tfResponse[4] = "B. Sensitive, people-oriented, compassionate:";
            counterBTF++; questionTwenty();
        }
        else {
            System.out.println("Invalid choice.");
        }
        questionNineteen();
    }
    public void questionTwenty() {
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                20)
                A. Control, govern.	 \s
                B. Latitude, freedom: \s""");
        String userInput = scan.next();
        if (userInput.equalsIgnoreCase("a")){
            jpResponse[4]= "A. Control, govern.	";
            counterAJP++; result();
        }
        else if (userInput.equalsIgnoreCase("b")){
            jpResponse[4] ="B. Latitude, freedom:";
             counterBJP++; result();
        }
        else {
            System.out.println("Invalid choice");
        }

    }
    public void result (){
        System.out.println("Hello"+ " "+ eiResponse[0]+ " " + "You selected" +  "\n" + eiResponse[1] + "\n" + eiResponse[2] + "\n" + eiResponse[3] + "\n"+ eiResponse[4] + "\n"+ eiResponse[5]);
        System.out.println("Number of A selected: " + " " + counterAEI + "\n" + "Number of B selected: " + " " + counterBEI);
        System.out.println(snResponse[0] + "\n" + snResponse[1] + "\n" + snResponse[2] + "\n"+ snResponse[3] + "\n"+ snResponse[4]);
        System.out.println("Number of A selected: " + " " + counterASN + "\n" + "Number of B selected: " + " " + counterBSN);
        System.out.println(tfResponse[0] + "\n" + tfResponse[1] + "\n" + tfResponse[2] + "\n"+ tfResponse[3] + "\n"+ tfResponse[4]);
        System.out.println("Number of A selected: " + " " + counterATF + "\n" + "Number of B selected: " + " " + counterBTF);
        System.out.println(jpResponse[0] + "\n" + jpResponse[1] + "\n" + jpResponse[2] + "\n"+ jpResponse[3] + "\n"+ jpResponse[4]);
        System.out.println("Number of A selected: " + " " + counterAJP + "\n" + "Number of B selected: " + " " + counterBJP);

        if(counterAEI > counterBEI){
            collectedResult+= "E";
        }
        else { collectedResult+= "I";
        }
        if(counterASN > counterBSN){
            collectedResult+= "S";
        }
        else { collectedResult+= "N";
        }
        if(counterATF > counterBTF){
            collectedResult+= "T";
        }
        else { collectedResult+= "F";
        }
        if(counterAJP > counterBJP){
            collectedResult+= "J";
        }
        else { collectedResult+= "P";
        }
        System.out.println(collectedResult);
    }

}

