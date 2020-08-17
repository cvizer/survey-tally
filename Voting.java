package YourVoteCounts;
import java.util.*;

public class Voting extends Questions {

    public static final String PASSWORD = "monkey";

    public Voting(int questionID, String question, String answerOne, String answerTwo, String answerThree, String answerFour) {
        super(questionID, question, answerOne, answerTwo, answerThree, answerFour);
    }

    public static String getPassword() {
        return PASSWORD;
    }

    // Create methods to print each survey question
    public static void displayQuestion(Voting q) {
        System.out.println(q.getQuestionID() + ": " + q.getQuestion());
        System.out.println();
    }

    public static void displayAnswerOne(Voting q) {
        System.out.println("[ 1 ] " + q.getAnswerOne());
    }

    public static void displayAnswerTwo(Voting q) {
        System.out.println("[ 2 ] " + q.getAnswerTwo());
    }

    public static void displayAnswerThree(Voting q) {
        System.out.println("[ 3 ] " + q.getAnswerThree());
    }

    public static void displayAnswerFour(Voting q) {
        System.out.println("[ 4 ] " + q.getAnswerFour());
    }

    public static boolean validatePassword(String p) {
        if(getPassword() == p) {
            return true;
        } else {
            return false;
        }
    }

    public static void vdisplayQ1(ArrayList Q1) {
        int answerOne = 0;
        int answerTwo = 0;
        int answerThree = 0;
        int answerFour = 0;
        for(int i = 0; i < Q1.size(); i++) {
            String x = Q1.get(i).toString();
            int y = Integer.parseInt(x);
            if(y == 1) {
                answerOne++;
            } else if(y == 2) {
                answerTwo++;
            } else if(y == 3) {
                answerThree++;
            } else {
                answerFour++;
            }
        }
        System.out.println("---------------");
        System.out.println("Results for question one: ");
        System.out.println("");
        System.out.println("Answer one: " + answerOne);
        System.out.println("Answer two: " + answerTwo);
        System.out.println("Answer three: " + answerThree);
        System.out.println("Answer four: " + answerFour);
    }

    public static void vdisplayQ2(ArrayList Q2) {
        int answerOne = 0;
        int answerTwo = 0;
        int answerThree = 0;
        int answerFour = 0;
        for(int i = 0; i < Q2.size(); i++) {
            String x = Q2.get(i).toString();
            int y = Integer.parseInt(x);
            if(y == 1) {
                answerOne++;
            } else if(y == 2) {
                answerTwo++;
            } else if(y == 3) {
                answerThree++;
            } else {
                answerFour++;
            }
        }
        System.out.println("---------------");
        System.out.println("Results for question two: ");
        System.out.println("");
        System.out.println("Answer one: " + answerOne);
        System.out.println("Answer two: " + answerTwo);
        System.out.println("Answer three: " + answerThree);
        System.out.println("Answer four: " + answerFour);
    }

    public static void vdisplayQ3(ArrayList Q3) {
        int answerOne = 0;
        int answerTwo = 0;
        int answerThree = 0;
        int answerFour = 0;
        for(int i = 0; i < Q3.size(); i++) {
            String x = Q3.get(i).toString();
            int y = Integer.parseInt(x);
            if(y == 1) {
                answerOne++;
            } else if(y == 2) {
                answerTwo++;
            } else if(y == 3) {
                answerThree++;
            } else {
                answerFour++;
            }
        }
        System.out.println("---------------");
        System.out.println("Results for question three: ");
        System.out.println("");
        System.out.println("Answer one: " + answerOne);
        System.out.println("Answer two: " + answerTwo);
        System.out.println("Answer three: " + answerThree);
        System.out.println("Answer four: " + answerFour);
    }

    public static void vdisplayQ4(ArrayList Q4) {
        int answerOne = 0;
        int answerTwo = 0;
        int answerThree = 0;
        int answerFour = 0;
        for(int i = 0; i < Q4.size(); i++) {
            String x = Q4.get(i).toString();
            int y = Integer.parseInt(x);
            if(y == 1) {
                answerOne++;
            } else if(y == 2) {
                answerTwo++;
            } else if(y == 3) {
                answerThree++;
            } else {
                answerFour++;
            }
        }
        System.out.println("---------------");
        System.out.println("Results for question four: ");
        System.out.println("");
        System.out.println("Answer one: " + answerOne);
        System.out.println("Answer two: " + answerTwo);
        System.out.println("Answer three: " + answerThree);
        System.out.println("Answer four: " + answerFour);
    }

    public static void vdisplayQ5(ArrayList Q5) {
        int answerOne = 0;
        int answerTwo = 0;
        int answerThree = 0;
        int answerFour = 0;
        for(int i = 0; i < Q5.size(); i++) {
            String x = Q5.get(i).toString();
            int y = Integer.parseInt(x);
            if(y == 1) {
                answerOne++;
            } else if(y == 2) {
                answerTwo++;
            } else if(y == 3) {
                answerThree++;
            } else {
                answerFour++;
            }
        }
        System.out.println("---------------");
        System.out.println("Results for question five: ");
        System.out.println("");
        System.out.println("Answer one: " + answerOne);
        System.out.println("Answer two: " + answerTwo);
        System.out.println("Answer three: " + answerThree);
        System.out.println("Answer four: " + answerFour);
    }






}
