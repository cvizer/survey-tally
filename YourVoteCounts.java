package YourVoteCounts;
import java.util.*;

// This program asks users 5 survey questions. They can take the survey as many times as they want.
// It also keeps a tally of the answers.

public class YourVoteCounts {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Voting q1 = new Voting(1, "Who is the president of the United States?", "My mom", "George Bush", "Donald Trump", "Kanye West");
        Voting q2 = new Voting(2, "What year is it right now?", "2000", "3074", "2012", "2020");
        Voting q3 = new Voting(3, "What is your favorite type of pizza?", "Pineapple", "Pepperoni", "Cheese", "Tuna");
        Voting q4 = new Voting(4, "What language do you speak?", "Pig Latin", "French", "English", "Spanish");
        Voting q5 = new Voting(5, "Which country do you want to visit?", "Poland", "Canada", "Brazil", "Australia");
        boolean isTrue = true;
        int round = 0;
        //create arrayList for each question:
        ArrayList<Integer> Q1 = new ArrayList<Integer>();
        ArrayList<Integer> Q2 = new ArrayList<Integer>();
        ArrayList<Integer> Q3 = new ArrayList<Integer>();
        ArrayList<Integer> Q4 = new ArrayList<Integer>();
        ArrayList<Integer> Q5 = new ArrayList<Integer>();

        mainMenu();
        while (isTrue) {
            System.out.println("Select [1, 2, or 999]");
            String userInput = s.nextLine();

            if (userInput.equals("1")) {
                round++;
                System.out.println("");
                Voting.displayQuestion(q1);
                Voting.displayAnswerOne(q1);
                Voting.displayAnswerTwo(q1);
                Voting.displayAnswerThree(q1);
                Voting.displayAnswerFour(q1);
                System.out.println("");
                System.out.println("Select: ");
                int selectionOne = s.nextInt();

                System.out.println("");
                Voting.displayQuestion(q2);
                Voting.displayAnswerOne(q2);
                Voting.displayAnswerTwo(q2);
                Voting.displayAnswerThree(q2);
                Voting.displayAnswerFour(q2);
                System.out.println("");
                System.out.println("Select: ");
                int selectionTwo = s.nextInt();

                System.out.println("");
                Voting.displayQuestion(q3);
                Voting.displayAnswerOne(q3);
                Voting.displayAnswerTwo(q3);
                Voting.displayAnswerThree(q3);
                Voting.displayAnswerFour(q3);
                System.out.println("");
                System.out.println("Select: ");
                int selectionThree = s.nextInt();

                System.out.println("");
                Voting.displayQuestion(q4);
                Voting.displayAnswerOne(q4);
                Voting.displayAnswerTwo(q4);
                Voting.displayAnswerThree(q4);
                Voting.displayAnswerFour(q4);
                System.out.println("");
                System.out.println("Select: ");
                int selectionFour = s.nextInt();

                System.out.println("");
                Voting.displayQuestion(q5);
                Voting.displayAnswerOne(q5);
                Voting.displayAnswerTwo(q5);
                Voting.displayAnswerThree(q5);
                Voting.displayAnswerFour(q5);
                System.out.println("");
                System.out.println("Select: ");
                int selectionFive = s.nextInt();
                tallyQone(Q1, selectionOne, round);
                tallyQtwo(Q2, selectionTwo, round);
                tallyQthree(Q3, selectionThree, round);
                tallyQfour(Q4, selectionFour, round);
                tallyQfive(Q5, selectionFive, round);
                System.out.println("");
                mainMenu();
            }
            else if(userInput.equals("2")) {
                Voting.vdisplayQ1(Q1);
                Voting.vdisplayQ2(Q2);
                Voting.vdisplayQ3(Q3);
                Voting.vdisplayQ4(Q4);
                Voting.vdisplayQ5(Q5);
                System.out.println("");
                mainMenu();
            }

            else if (userInput.equals("999")) {
                isTrue = false;
                break;
            }

        }
    }

    public static void mainMenu() {
        System.out.println("=============================");
        System.out.println("Your Vote Counts Survey!");
        System.out.println("=============================");
        System.out.println("");
        System.out.println("");
        System.out.println("[ 1 ] Start Survey");
        System.out.println("[ 2 ] Tally Votes");
        System.out.println("[ 999 ] Quit Survey");
        System.out.println("");
    }

    public static void tallyQone(ArrayList Q1, int selectionOne, int round) {
        Q1.add(selectionOne);
    }

    public static void tallyQtwo(ArrayList Q2, int selectionTwo, int round) {
        Q2.add(selectionTwo);
    }

    public static void tallyQthree(ArrayList Q3, int selectionThree, int round) {
        Q3.add(selectionThree);
    }

    public static void tallyQfour(ArrayList Q4, int selectionFour, int round) {
        Q4.add(selectionFour);
    }

    public static void tallyQfive(ArrayList Q5, int selectionFive, int round) {
        Q5.add(selectionFive);
    }


}
