package Assignment;

import java.util.Objects;
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
//        System.out.println("Response");

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
                A. Facts, things, "what iS"		 \s
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
        System.out.println("Based on your choices you are :"+ collectedResult);



        if(Objects.equals(collectedResult, "ESTJ")){
            System.out.println("""
                    ESTJ\s
                    An Executive (ESTJ) is someone with the Extraverted, Observant, Thinking, and Judging personality traits. 
                    They lead by example demonstrating dedication and purposeful honesty, and an utter rejection of laziness and cheating, especially in work.
                     They are Dedicated,Strong-willed,Direct and Honest, lastly they are Loyal, Patient and Reliable.
                    """);
        }
        if(Objects.equals(collectedResult, "ESTP")){
            System.out.println("""
                    \s
                    ESTP 
                    They are known as Entrepreneur,They always have an impact on their immediate surroundings – 
                    the best way to spot them at a party is to look for the whirling eddy of people flitting about them as they move from group to group.
                    They are Bold, Rational and Practical, Original, Direct and Sociable.
                    """);
        }
        if(Objects.equals(collectedResult, "ESFJ")){
            System.out.println("""
                    \s
                    ESFJ
                    These set of person are with the Extraverted, Observant, Feeling, and Judging personality traits.
                    These set of people re warm, loyal people who want to feel trusted and valued.
                    They have Strong Practical Skills, Strong Sense of Duty, Very Loyal and Good at Connecting with Others. 
                    However they are reluctant to innovate or improvise and often Too Needy                                                                      
                    """);
        }
        if(Objects.equals(collectedResult, "ENTP")){
            System.out.println("""
                    \s
                    ENTP 
                    They are called the debaters:
                    Debaters rarely pass up a good opportunity to learn something new, especially abstract concepts. This information isn’t usually absorbed for any planned purpose as with dedicated studying, people with the Debater personality type just find it fascinating.
                    Debaters have tremendously flexible minds, and are able to shift from idea to idea without effort, drawing on their accumulated knowledge to prove their points, or their opponents’, as they see fit.
                    When given a chance to combine these traits to examine an interesting problem, Debaters can be truly impressive in their enthusiasm and energy, having no qualms with putting in long days and nights to find a solution. They are quick thinkers, excellent brainstormers,Nothing is quite as enjoyable to Debaters as analyzing problems from every angle to find the best solutions.\s
                    Their confidence, quick thought and ability to connect disparate ideas in novel ways create a style of communication that is charming, even entertaining, and informative at the same time.
                    Being so rational, Debaters often misjudge others feelings and push their debates well past others’ tolerance levels.
                    People with this personality type don’t really consider emotional points to be valid in such debates either, which magnifies the issue tremendously.
                    The same flexibility that allows Debaters to come up with such original plans and ideas makes them readopt perfectly good ones far too often, or to even drop them entirely as the initial excitement wanes and newer thoughts come along. 
                    Boredom comes too easily for Debaters, and fresh thoughts are the solution, though not always a helpful one.
                    Debater personalities lose interest, often with the consequence of their plans never seeing the light of day
                    """);
        }
        if(Objects.equals(collectedResult, "ENTJ")){
            System.out.println("""
                    ENTJ                                        
                    They are known as the commanders, they see inefficiency not just as a problem in its own right, but as something that pulls time and energy away from all their future goals, an elaborate sabotage consisting of irrationality and laziness. 
                    They trust their abilities, make known their opinions, and believe in their capacities as leaders. 
                    They dont give up when the going gets tough.                                        
                    They exemplify the difference between moment-to-moment crisis management and navigating the challenges and steps of a bigger plan, and are known for examining every angle of a problem and not just resolving momentary issues, but moving the whole project forward with their solutions.               
                    These qualities combine to create individuals who are able to inspire and invigorate others, who people actually want to be their leaders, and this in turn helps Commanders to accomplish their often ambitious goals that could never be finished alone.                                        
                    Sometimes all this confidence and willpower can go too far, and Commanders are all too capable of digging in their heels, trying to win every single debate and pushing their vision, and theirs alone.              
                    All this bluster, alongside the assumed supremacy of rationalism, makes Commanders distant from their own emotional expression and sometimes downright scornful of others’. 
                    Their obsession with efficiency and unwavering belief in the merits of rationalism, especially professionally, makes Commanders incredibly insensitive in pursuing their goals, dismissing personal circumstances, sensitivities, and preferences as irrational and irrelevant.
                    """);
        }
        if(Objects.equals(collectedResult, "ISTJ")){
            System.out.println("""
                    ISTJ                                       
                    These people are known as the logisticians, Honest and Direct, Strong-willed and Dutiful, Very Responsible.
                    word is a promise, and a promise means everything. Logisticians would rather run themselves into the ground with extra days and lost sleep than fail to deliver the results they said they would. Loyalty is a strong sentiment for Logistician personalities, and they fulfill their duties to the people and organizations they’ve committed themselves to.                                     
                    Much like Analyst personality types, Logisticians are proud repositories of knowledge, though the emphasis is more on facts and statistics than concepts and underlying principles.\s """);
        }
        if(Objects.equals(collectedResult, "INFP")){
            System.out.println("""
                  INFP Strengths
                  
                  They are known as the mediators don’t just care about other people in an abstract sense. These personalities can actually feel another person’s emotions, from joy and elation to sorrow and regret. Because of this sensitivity, Mediators tend to be thoughtful and kindhearted, and they hate the idea of hurting anyone, even unintentionally.                  
                  They feel called to share the good things in their lives, give credit where it’s due, and uplift the people around them. 
                  These personalities want to contribute to a world where every voice is heard and no one’s needs go unmet. 
                  They also have high level of tolerant and accepting, they try not to judge anyone else’s beliefs, lifestyles, or decisions.\s                  
                  This is a personality type that prefers compassion to fault-finding, and many Mediators feel empathy even for those who have done wrong. Because they’re so accepting, Mediators often become confidants for their friends and loved ones – and occasionally for total strangers.                  
                  Mediators love to see things from unconventional perspectives. Few things give them more pleasure than allowing their minds to wander through all sorts of ideas and possibilities and daydreams. It’s no wonder, then, that many Mediators are drawn to creative pursuits\s                  
                  Nothing in this world is perfect – and that can be a difficult truth for Mediators to accept.
                  People with this personality type can be hopeless romantics, with rose-colored visions of what their lives should be like. This can set Mediators up for disappointment when reality inevitably falls short of their dreams.
                  People with this personality type crave alone time, but they’re also vulnerable to loneliness. They long to feel accepted and well-liked, but they hate the idea of pretending to be anyone but their authentic selves.
                                                                                                                                                                                                           """);
        }
        if(Objects.equals(collectedResult, "INFJ")){
            System.out.println("""
                    INFJ {Advocates}
                    Advocates aren’t exactly like everyone else – and that’s a wonderful thing.
                    People with this personality type embrace their creative side, always on the lookout for opportunities to express themselves and think outside the box.
                    These personalities are insightful.\s
                    They are highly principled, they want to use their strengths for the greater good, and they rarely lose sight of how their words and actions might affect others.\s
                    Advocates’ perfectionism and reserve leave them with few options for letting off steam, When it comes to the issues that are near and dear to them, people with this personality type can become defensive or dismissive.
                    They may find it difficult to open up and be vulnerable about their struggles, not wanting to burden someone else with their issues.
                    """);
        }
        if(Objects.equals(collectedResult, "INTJ")){
            System.out.println("""
                    INTJ Personalities
                    They can reframe nearly any challenge as an opportunity to hone their rational thinking skills and expand their knowledge, They are architects pride themselves on the power of their minds. Rather than half-baked assumptions, they base their conclusions on research and analysis, which gives them the conviction that they need to stand up for their ideas, even in the face of disagreement.
                    They can imagine few things more frustrating than allowing arbitrary rules or conventions to stand in the way of their success.For these personalities, conformity is more or less synonymous with mediocrity. Creative and self-motivated, Architects strive to do things their own way.\s
                    They are Skeptical by nature, Architects are especially drawn to offbeat or contrarian points of view. And if the facts prove them wrong, they are generally happy to revise their opinions.Without Architects, the world would be a far less interesting place. This personality type’s rebellious streak is responsible for some of history’s most unconventional ideas and inventions. Even in their everyday lives, Architects force the people around them to consider new (and sometimes startling) ways of looking at things.
                    These personalities tend to have a great deal of self-control, particularly when it comes to thoughts and feelings. When the people in their lives fail to match their level of restraint
                    Architects’ relentless rationality can lead to frustration in their social lives. Their efforts to defy expectations may leave them feeling isolated or disconnected from other people.\s
                    """);
        }
        if(Objects.equals(collectedResult, "INTP")){
            System.out.println("""
                    INTP Personalities
                    They are called the logicians. Logicians analyze everything that they come across, from research data to the behavior of the people around them. This gives them a knack for spotting unexpected patterns and connections that other personality types might overlook. They are driven by curiosity and an intense desire to learn everything that they can.
                    When inspiration strikes, Logicians go all in on their newfound interest, learning everything that they can. Logicians care about the truth. Rather than taking comfort in ideology or received ideas, they want to understand what’s really going on beneath the surface of things. As a result, they can be relied upon to combat bias and misinformation, even when it isn’t easy to do so – and they expect other people to be honest with them in return
                    Logicians can get lost in their own train of thought, even when they’re with other people. When these personalities finally resurface with something to say, they may find that the conversation has moved on without them. This can cause them to feel disconnected from other people, especially in large social gatherings.                                        
                    People with this personality type see rationality as the key to a better, happier world. At times, they may underestimate the importance of such irrational values as emotion, compassion, etiquette, and tradition. As a result, they may inadvertently come across as insensitive or unkind, even though their intentions are generally good.
                    Logicians can’t help but imagine how things could be better than they already are. These personalities are constantly on the lookout for problems to solve, topics to learn, and new ways to approach things.
                    They want to get things done, which makes them a perfectionist but their quest for perfection can get in the way. At times, these personalities may get so lost in analyzing various options that they never reach a decision. They may also give up on projects that don’t match the ideal vision in their mind.
                    """);
        }
        if(Objects.equals(collectedResult, "ENFJ")){
            System.out.println("""
                    ENFJ 
                    A ENTJ (ENFJ) is a person with the Extraverted, Intuitive, Feeling, and Judging personality traits. 
                    These warm, forthright types love helping others, and they tend to have strong ideas and values. 
                    They back their perspective with the creative energy to achieve their goals.
                    ENTJs feel called to serve a greater purpose in life. 
                    Thoughtful and idealistic, these personality types strive to have a positive impact on other people and the world around them. 
                    They rarely shy away from an opportunity to do the right thing, even when doing so is far from easy.
                    They are born leaders, which explains why these personalities can be found among many notable politicians, coaches, and teachers. 
                    Their passion and charisma allow them to inspire others not just in their careers but in every arena of their lives, including their relationships. Few things bring ENTJs a deeper sense of joy and fulfillment than guiding friends and loved ones to grow into their best selves.
                    ENTJs tend to be vocal about their values, including authenticity and altruism. When something strikes them as unjust or wrong, they speak up. But they rarely come across as brash or pushy, as their sensitivity and insight guide them to speak in ways that resonate with others.
                    People with this personality type are devoted altruists, ready to face slings and arrows in order to stand up for the people and ideas that they believe in. 
                    This strength of conviction bolsters ENTJs’ innate leadership skills, particularly their ability to guide people to work together in service of the greater good.
                    """);
        }
        if(Objects.equals(collectedResult, "ENFP")){
            System.out.println("""
                    A ENFP is someone with the Extraverted, Intuitive, Feeling, and Prospecting personality traits.\s 
                    These people tend to embrace big ideas and actions that reflect their sense of hope and goodwill toward others. 
                    Their vibrant energy can flow in many directions.
                    It doesn’t interest me what you do for a living. I want to know what you ache for – and if you dare to dream of meeting your heart’s longing.
                    ENFPs (ENFPs) are true free spirits – outgoing, openhearted, and open-minded. With their lively, upbeat approach to life, they stand out in any crowd. But even though they can be the life of the party, ENFPs don’t just care about having a good time. These personality types run deep – as does their longing for meaningful, emotional connections with other people.
                    Friendly and outgoing, ENFPs are devoted to enriching their relationships and their social lives. But beneath their sociable, easygoing exteriors, they have rich, vibrant inner lives as well. Without a healthy dose of imagination, creativity, and curiosity, a ENFP simply wouldn’t be a ENFP.
                    In their unique way, ENFPs can be quite introspective. They can’t help but ponder the deeper meaning and significance of life – even when they should be paying attention to something else. These personalities believe that everything – and everyone – is connected, and they live for the glimmers of insight that they can gain into these connections.
                    ENFPs are independent and creative, always on the lookout for the magic and meaning in everyday life.
                    When something sparks their imagination, ENFPs can show an enthusiasm that is nothing short of infectious. These personalities radiate a positive energy that draws in other people, and ENFPs may find themselves being held up by their peers as a leader or guru. But once the initial bloom of inspiration wears off, ENFPs can struggle with self-discipline and consistency, losing steam on projects that once meant so much to them.
                    Seeking Joy
                    ENFPs are proof that seeking out life’s joys and pleasures isn’t the same as being shallow. Seemingly in the blink of an eye, people with this personality type can transform from impassioned idealists to carefree figures on the dance floor.
                    ENFP personalities are capable of intense thought and feeling – and also of kicking back and having a good time.
                    Even in moments of fun, ENFPs want to connect emotionally with others. Few things matter more to these personality types than having genuine, heartfelt conversations with the people they cherish. ENFPs believe that everyone deserves to express their feelings, and their empathy and warmth create spaces where even the most timid spirits can feel comfortable opening up.""");
        }
        if(Objects.equals(collectedResult, "ESFP")){
            System.out.println("""
                    An ESFP\s
                    ESFP is a person with the Extraverted, Observant, Feeling, and Prospecting personality traits. These people love vibrant experiences, engaging in life eagerly and taking pleasure in discovering the unknown. They can be very social, often encouraging others into shared activities.
                    If anyone is to be found spontaneously breaking into song and dance, it is the ESFP personality type. ESFPs get caught up in the excitement of the moment, and want everyone else to feel that way, too. No other personality type is as generous with their time and energy as ESFPs when it comes to encouraging others, and no other personality type does it with such irresistible style.
                    Living with Passion
                    ESFPs love the spotlight, and all the world’s a stage. Many famous people with the ESFP personality type are indeed actors, but they love putting on a show for their friends too, chatting with a unique and earthy wit, soaking up attention and making every outing feel a bit like a party. Utterly social, ESFPs enjoy the simplest things, and there’s no greater joy for them than just having fun with a good group of friends.
                    It’s not just talk either – ESFPs have the strongest aesthetic sense of any personality type. From grooming and outfits to a well-appointed home, ESFP personalities have an eye for fashion. Knowing what’s attractive the moment they see it, ESFPs aren’t afraid to change their surroundings to reflect their personal style. ESFPs are naturally curious, exploring new designs and styles with ease.
                    Though it may not always seem like it, ESFPs know that it’s not all about them – they are observant, and very sensitive to others’ emotions. People with this personality type are often the first to help someone talk out a challenging problem, happily providing emotional support and practical advice. However, if the problem is about them, ESFPs are more likely to avoid a conflict altogether than to address it head-on. ESFPs usually love a little drama and passion, but not so much when they are the focus of the criticisms it can bring.
                    A Spontaneous Spirit
                    The biggest challenge ESFPs face is that they are often so focused on immediate pleasures that they neglect the duties and responsibilities that make those luxuries possible. 
                    Complex analysis, repetitive tasks, and matching statistics to real consequences are not easy activities for ESFPs. 
                    They’d rather rely on luck or opportunity, or simply ask for help from their extensive circle of friends. It is important for ESFPs to challenge themselves to keep track of long-term things like their retirement plans or sugar intake – there won’t always be someone else around who can help to keep an eye on these things.
                    ESFPs recognize value and quality, which on its own is a fine trait. In combination with their tendency to be poor planners though, this can cause them to live beyond their means, and credit cards are especially dangerous. More focused on leaping at opportunities than in planning out long-term goals, ESFPs may find that their inattentiveness has made some activities unaffordable.
                    There’s nothing that makes ESFPs feel quite as unhappy as realizing that they are boxed in by circumstance, unable to join their friends.
                    ESFPs are welcome wherever there’s a need for laughter, playfulness, and a volunteer to try something new and fun – and there’s no greater joy for ESFP personalities than to bring everyone else along for the ride. ESFPs can chat for hours, sometimes about anything but the topic they meant to talk about, and share their loved ones’ emotions through good times and bad. If they can just remember to keep their ducks in a row, they’ll always be ready to dive into all the new and exciting things the world has to offer, friends in tow.""");
        }
        if(Objects.equals(collectedResult, "ISFJ")){
            System.out.println("""
                    ISFJ
                    A ISFJ () is someone with the Introverted, Observant, Feeling, and Judging personality traits. These people tend to be warm and unassuming in their own steady way. They’re efficient and responsible, giving careful attention to practical details in their daily lives.
                    Love only grows by sharing. You can only have more for yourself by giving it away to others.
                    BRIAN TRACY
                    In their unassuming, understated way, ISFJs help make the world go round. Hardworking and devoted, people with this personality type feel a deep sense of responsibility to those around them. ISFJs can be counted on to meet deadlines, remember birthdays and special occasions, uphold traditions, and shower their loved ones with gestures of care and support. But they rarely demand recognition for all that they do, preferring instead to operate behind the scenes.
                    This is a capable, can-do personality type, with a wealth of versatile gifts. Though sensitive and caring, ISFJs also have excellent analytical abilities and an eye for detail. And despite their reserve, they tend to have well-developed people skills and robust social relationships. ISFJs are truly more than the sum of their parts, and their varied strengths shine in even the most ordinary aspects of their daily lives.
                    ISFJs are true altruists, meeting kindness with kindness-in-excess and engaging with the work and people they believe in with enthusiasm and generosity.
                    The Gift of Loyalty
                    Among ISFJs’ most distinctive traits is loyalty. Rare is the ISFJ who allows a friendship or relationship to fade away from lack of effort. Instead, they invest a great deal of energy into maintaining strong connections with their loved ones – and not just by sending “How are you doing?” texts. People with this personality type are known for dropping everything and lending a hand whenever a friend or family member is going through a hard time.
                    ISFJs tend to feel most energized and effective when they’re showing up for someone who needs their help.
                    ISFJs’ sense of loyalty doesn't stop with their nearest and dearest – it often extends to their communities, their employers, and even family traditions. But the intensity of their commitment and desire to serve can have its downsides. Other people may take advantage of ISFJs’ helpful, hardworking nature, leaving them feeling burned out and overworked. And ISFJs may feel guilty or stressed when they contemplate changes – even necessary changes – to themselves, their relationships, or the way they’ve done things in the past.
                    The Highest of Standards
                    For ISFJs, “good enough” is rarely good enough. People with this personality type can be meticulous to the point of perfectionism. They take their responsibilities personally, consistently going above and beyond and doing everything that they can to exceed others’ expectations.
                    ISFJ personalities are known for their humility, and they rarely seek the spotlight.
                    But what happens when ISFJs’ efforts go unnoticed or unappreciated? While ISFJs tend to underplay their accomplishments, that doesn’t mean that they don’t enjoy recognition – or that they’re fine with being taken for granted. Unless they learn to stand up for themselves, ISFJs may find themselves quietly losing their enthusiasm and motivation, eventually becoming resentful toward the people who just don’t seem to appreciate them.
                    Showing Up for Others – and Themselves
                    Although they’re Introverted, ISFJs have a deeply social nature. Thanks to their ability to remember the details of other people’s lives, ISFJs have a special talent for making their friends and acquaintances feel seen, known, and cherished. Few personality types can match ISFJs’ ability to choose just the right gift for any occasion, whether large or small.
                    Dedicated and thoughtful, ISFJs find great joy in helping those around them build stable, secure, and happy lives. It may not be easy for people with this personality type to show up for themselves in the way that they show up for other people, but when they do, they often find themselves with even more energy and motivation to do good in the world.
                    """);
        }
        if(Objects.equals(collectedResult, "ISFP")){
            System.out.println("""
                    An ISFP is a person with the Introverted, Observant, Feeling, and Prospecting personality traits. They tend to have open minds, approaching life, new experiences, and people with grounded warmth. Their ability to stay in the moment helps them uncover exciting potentials.
                    I change during the course of a day. I wake and I’m one person, and when I go to sleep I know for certain I’m somebody else.
                    ISFPs are true artists – although not necessarily in the conventional sense. For this personality type, life itself is a canvas for self-expression. From what they wear to how they spend their free time, ISFPs act in ways that vividly reflect who they are as unique individuals.                                        
                    And every ISFP is certainly unique. Driven by curiosity and eager to try new things, people with this personality often have a fascinating array of passions and interests. With their exploratory spirits and their ability to find joy in everyday life, ISFPs can be among the most interesting people you’ll ever meet. The only irony? Unassuming and humble, ISFPs tend to see themselves as “just doing their own thing,” so they may not even realize how remarkable they really are.
                    The Beauty of an Open Mind
                    ISFPs embrace a flexible, adaptable approach to life. Some personality types thrive on strict schedules and routines – but not ISFPs. ISFPs take each day as it comes, doing what feels right to them in the moment. And they make sure to leave plenty of room in their lives for the unexpected – with the result that many of their most cherished memories are of spontaneous, spur-of-the-moment outings and adventures, whether by themselves or with their loved ones.
                    This flexible mindset makes ISFPs remarkably tolerant and open-minded. These personalities genuinely love living in a world filled with all kinds of people – even people who disagree with them or choose radically different lifestyles. It’s no surprise, then, that ISFPs are unusually open to changing their minds and rethinking their opinions. If any personality type believes in giving something (or someone) a second chance, it’s ISFPs.
                    ISFPs want to live in a world where they – and everyone else – have the freedom to live as they see fit, without judgment.
                    That said, ISFPs’ go-with-the-flow mentality can have its downsides. People with this personality type may struggle to set long-term plans – let alone stick with them. As a result, ISFPs tend to have a pretty cloudy view of their ability to achieve their goals, and they often worry about letting other people down. ISFPs may find that adding a little structure to their lives goes a long way toward helping them feel more capable and organized – without quashing their independent spirits.
                    Living in Harmony
                    In their relationships, ISFPs are warm, friendly, and caring, taking wholehearted enjoyment in the company of their nearest and dearest. But make no mistake: this is an Introverted personality type, meaning that ISFPs need dedicated alone time to recharge their energy after socializing with others. This alone time is what allows ISFPs to reestablish a sense of their own identity – in other words, to reconnect with who they truly are.
                    """);
        }
        if(Objects.equals(collectedResult, "ISTP")){
            System.out.println("""
                   
                    ISTP is someone with the Introverted, Observant, Thinking, and Prospecting personality traits. They tend to have an individualistic mindset, pursuing goals without needing much external connection. They engage in life with inquisitiveness and personal skill, varying their approach as needed.
                    I wanted to live the life, a different life. I didn’t want to go to the same place every day and see the same people and do the same job. I wanted interesting challenges.
                    ISTPs love to explore with their hands and their eyes, touching and examining the world around them with cool rationalism and spirited curiosity. People with this personality type are natural Makers, moving from project to project, building the useful and the superfluous for the fun of it, and learning from their environment as they go. Often mechanics and engineers, ISTPs find no greater joy than in getting their hands dirty pulling things apart and putting them back together, just a little bit better than they were before.
                    ISTPs explore ideas through creating, troubleshooting, trial and error and first-hand experience. They enjoy having other people take an interest in their projects and sometimes don’t even mind them getting into their space. Of course, that’s on the condition that those people don’t interfere with ISTPs’ principles and freedom, and they’ll need to be open to ISTPs returning the interest in kind.
                    ISTPs enjoy lending a hand and sharing their experience, especially with the people they care about, and it’s a shame they’re so uncommon, making up only about five percent of the population. ISTP women are especially rare, and the typical gender roles that society tends to expect can be a poor fit – they’ll often be seen as tomboys from a young age.
                    Dare to Differ
                    While their mechanical tendencies can make them appear simple at a glance, ISTPs are actually quite enigmatic. Friendly but very private, calm but suddenly spontaneous, extremely curious but unable to stay focused on formal studies, ISTP personalities can be a challenge to predict, even by their friends and loved ones. ISTPs can seem very loyal and steady for a while, but they tend to build up a store of impulsive energy that explodes without warning, taking their interests in bold new directions.
                    Rather than some sort of vision quest though, ISTPs are merely exploring the viability of a new interest when they make these seismic shifts.
                    ISTPs’ decisions stem from a sense of practical realism, and at their heart is a strong sense of direct fairness, a “do unto others” attitude, which really helps to explain many of ISTPs’ puzzling traits. Instead of being overly cautious though, avoiding stepping on toes in order to avoid having their toes stepped on, ISTPs are likely to go too far, accepting likewise retaliation, good or bad, as fair play.
                    The biggest issue ISTPs are likely to face is that they often act too soon, taking for granted their permissive nature and assuming that others are the same. They’ll be the first to tell an insensitive joke, get overly involved in someone else’s project, roughhouse and play around, or suddenly change their plans because something more interesting came up.
                    Defying the Rules
                    ISTPs will come to learn that many other personality types have much more firmly drawn lines on rules and acceptable behavior than they do – they don’t want to hear an insensitive joke, and certainly wouldn’t tell one back, and they wouldn’t want to engage in horseplay, even with a willing party. If a situation is already emotionally charged, violating these boundaries can backfire tremendously.
                    ISTPs have a particular difficulty in predicting emotions, but this is just a natural extension of their fairness, given how difficult it is to gauge ISTPs’ emotions and motivations. However, their tendency to explore their relationships through their actions rather than through empathy can lead to some very frustrating situations. People with the ISTP personality type struggle with boundaries and guidelines, preferring the freedom to move about and color outside the lines if they need to.
                    Finding an environment where they can work with good friends who understand their style and unpredictability, combining their creativity, sense of humor and hands-on approach to build practical solutions and things, will give ISTPs many happy years of building useful boxes – and admiring them from the outside.
                    """);
        }
        System.exit(01);









    }




}

